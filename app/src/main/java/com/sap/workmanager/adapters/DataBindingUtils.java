package com.sap.workmanager.adapters;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.sap.workmanager.Utils;

public class DataBindingUtils {

    @BindingAdapter({"listItems", "itemLayout", "itemBindingVariableID"})
    public static void setAdapter(RecyclerView rv, ObservableArrayList list, int layout, int variable) {
        if (rv.getAdapter() == null) {
            BaseAdapter adapter = new BaseAdapter(layout, variable, list);
            rv.setAdapter(adapter);

        }
    }

    @BindingAdapter({"dateSetter"})
    public static void setFormatedDate(TextView view, String date) {
        view.setText(Utils.getFormatedDate(date));
    }
}
