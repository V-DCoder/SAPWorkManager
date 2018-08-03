
package com.sap.workmanager.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sheet1 {

    @SerializedName("Order_no")
    @Expose
    private String orderNo;
    @SerializedName("Order_type")
    @Expose
    private String orderType;
    @SerializedName("ord_Desc")
    @Expose
    private String ordDesc;
    @SerializedName("APRIO")
    @Expose
    private String aPRIO;
    @SerializedName("Ord_date")
    @Expose
    private String ordDate;
    @SerializedName("Start_date")
    @Expose
    private String startDate;
    @SerializedName("End_date")
    @Expose
    private String endDate;
    @SerializedName("Operation")
    @Expose
    private Operation operation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sheet1() {
    }

    /**
     * 
     * @param operation
     * @param startDate
     * @param ordDesc
     * @param orderNo
     * @param orderType
     * @param endDate
     * @param aPRIO
     * @param ordDate
     */
    public Sheet1(String orderNo, String orderType, String ordDesc, String aPRIO, String ordDate, String startDate, String endDate, Operation operation) {
        super();
        this.orderNo = orderNo;
        this.orderType = orderType;
        this.ordDesc = ordDesc;
        this.aPRIO = aPRIO;
        this.ordDate = ordDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.operation = operation;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrdDesc() {
        return ordDesc;
    }

    public void setOrdDesc(String ordDesc) {
        this.ordDesc = ordDesc;
    }

    public String getAPRIO() {
        return aPRIO;
    }

    public void setAPRIO(String aPRIO) {
        this.aPRIO = aPRIO;
    }

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

}
