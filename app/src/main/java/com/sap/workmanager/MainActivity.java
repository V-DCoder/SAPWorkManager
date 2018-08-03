package com.sap.workmanager;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.sap.workmanager.databinding.ActivityMainBinding;
import com.sap.workmanager.model.WorkOrderResponse;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Gson gson = new Gson();
        String json = null;
        try {
            InputStream inputStream = getAssets().open("workorders.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
            json = json.replace("\n","");
            json = json.replace("\r","");

            WorkOrderResponse obj = gson.fromJson(json, WorkOrderResponse.class);
            obj.getSheet1();
            ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
            binding.setVariable(BR.workorder,obj);



        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
