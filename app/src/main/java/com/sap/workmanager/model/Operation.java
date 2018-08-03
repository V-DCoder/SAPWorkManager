
package com.sap.workmanager.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Operation {

    @SerializedName("Oper_no")
    @Expose
    private String operNo;
    @SerializedName("Oper_desc")
    @Expose
    private String operDesc;
    @SerializedName("Work_cntr")
    @Expose
    private String workCntr;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Operation() {
    }

    /**
     * 
     * @param workCntr
     * @param operNo
     * @param operDesc
     */
    public Operation(String operNo, String operDesc, String workCntr) {
        super();
        this.operNo = operNo;
        this.operDesc = operDesc;
        this.workCntr = workCntr;
    }

    public String getOperNo() {
        return operNo;
    }

    public void setOperNo(String operNo) {
        this.operNo = operNo;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    public String getWorkCntr() {
        return workCntr;
    }

    public void setWorkCntr(String workCntr) {
        this.workCntr = workCntr;
    }

}
