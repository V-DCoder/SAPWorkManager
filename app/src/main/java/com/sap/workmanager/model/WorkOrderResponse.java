
package com.sap.workmanager.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WorkOrderResponse {

    @SerializedName("Sheet1")
    @Expose
    private List<Sheet1> sheet1 = null;

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
    public WorkOrderResponse(List<Sheet1> sheet1) {
        super();
        this.sheet1 = sheet1;
    }

    public List<Sheet1> getSheet1() {
        return sheet1;
    }

    public void setSheet1(List<Sheet1> sheet1) {
        this.sheet1 = sheet1;
    }

}
