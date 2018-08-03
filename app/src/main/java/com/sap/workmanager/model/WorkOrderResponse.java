
package com.sap.workmanager.model;

import android.databinding.ObservableArrayList;

import com.android.databinding.library.baseAdapters.BR;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkOrderResponse {

    @SerializedName("Sheet1")
    @Expose
    private ObservableArrayList<Sheet1> sheet1 = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WorkOrderResponse() {
    }

    /**
     * 
     * @param sheet1
     */
    public WorkOrderResponse(ObservableArrayList<Sheet1> sheet1) {
        super();
        this.sheet1 = sheet1;
    }

    public ObservableArrayList<Sheet1> getSheet1() {
        return sheet1;
    }

    public void setSheet1(ObservableArrayList<Sheet1> sheet1) {
        this.sheet1 = sheet1;
    }


    public int getBindingVeriable() {
        return BR.sheet;
    }
}
