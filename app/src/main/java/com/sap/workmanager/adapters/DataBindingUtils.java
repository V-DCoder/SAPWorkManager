package com.sap.workmanager.adapters;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sap.workmanager.Utils;
import com.sap.workmanager.model.Sheet1;

public class DataBindingUtils {

    @BindingAdapter({"listItems", "itemLayout", "itemBindingVariableID","onItemClickListerActivity"})
    public static void setAdapter(RecyclerView rv, ObservableArrayList list, int layout, int variable, AppCompatActivity appCompatActivity) {
        if (rv.getAdapter() == null) {
            BaseAdapter adapter = new BaseAdapter(layout, variable, list,appCompatActivity);
            rv.setAdapter(adapter);

        }
    }

    @BindingAdapter({"dateSetter"})
    public static void setFormatedDate(TextView view, String date) {
        view.setText(Utils.getFormatedDate(date));
    }

}
