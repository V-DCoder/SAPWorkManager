package com.sap.workmanager;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.sap.workmanager.adapters.AdapterWraper;
import com.sap.workmanager.adapters.FragmentPagerAdapter;
import com.sap.workmanager.databinding.ActivityMainBinding;
import com.sap.workmanager.model.Sheet1;
import com.sap.workmanager.model.WorkOrderResponse;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String FILE_NAME = "response.json";
    ActivityMainBinding binding;
    private String localFilePath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String json = null;
        String jsonLocal = null;
        try {
            if (createFile()) {
                jsonLocal = readFromLocalFile();
            }
            json = readFromAsset();

            WorkOrderResponse obj = parseResponse(jsonLocal);
            if (obj == null)
                obj = parseResponse(json);

            binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
            binding.setVariable(BR.workorder, obj);
            binding.setVariable(BR.activity, this);

            binding.tabs.setupWithViewPager(binding.viewPager);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private WorkOrderResponse parseResponse(String json) {
        WorkOrderResponse obj = null;
        try {
            obj = new Gson().fromJson(json, WorkOrderResponse.class);
            if (obj == null)
                return null;
            if (obj.getSheet1() == null)
                return null;
            if (obj.getSheet1().size() == 0)
                return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    private String readFromAsset() {

        String json = new String();


        try {
            InputStream inputStream = getAssets().open("workorders.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
            json = json.replace("\n", "");
            json = json.replace("\r", "");
        } catch (Exception e) {
            e.printStackTrace();
        }


        return json;
    }

    private String readFromLocalFile() {
        try {
            if (localFilePath == null)
                return null;
            if (localFilePath.length() < 1)
                return null;
            File localFile = new File(localFilePath);
            if (!localFile.exists())
                return null;
            InputStream fis = null;
            fis = new BufferedInputStream(new FileInputStream(localFile));
            int i;
            StringBuilder sb = new StringBuilder();
            while ((i = fis.read()) != -1)
                sb.append((char) i);

            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    private boolean createFile() {
        try {
            File dir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/SAP");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File jsonFile = new File(dir, FILE_NAME);
            if (!jsonFile.exists()) {
                jsonFile.createNewFile();
            }
            localFilePath = jsonFile.getAbsolutePath();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void onClick(Sheet1 sheet) {


        ArrayList<AdapterWraper> mlist = new ArrayList<>();
        if (sheet.getDetails() != null) {
            mlist.add(new AdapterWraper("Details", sheet.getDetails()));
        }
        if (sheet.getOperation() != null) {
            mlist.add(new AdapterWraper("Operation", sheet.getOperation()));
        }
        if (sheet.getComponents() != null) {
            mlist.add(new AdapterWraper("Components", sheet.getOperation()));
        }
        if (sheet.getObject() != null) {
            mlist.add(new AdapterWraper("Objects", sheet.getOperation()));
        }
        if (sheet.getAttachments() != null) {
            mlist.add(new AdapterWraper("Attachments", sheet.getOperation()));
        }

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(MainActivity.this.getSupportFragmentManager());
        binding.viewPager.setAdapter(null);
        binding.viewPager.setAdapter(adapter);
        adapter.setData(mlist);

        binding.titleId.setText(String.format(getString(R.string.work_order_id), sheet.getOrderNo()));
    }


}
