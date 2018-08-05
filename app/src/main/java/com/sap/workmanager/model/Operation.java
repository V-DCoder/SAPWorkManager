package com.sap.workmanager.model;

import android.databinding.ObservableArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sap.workmanager.BR;

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

    @SerializedName("Work_notes")
    @Expose
    private ObservableArrayList<String> work_notes;

    @SerializedName("WorkDetails")
    @Expose
    private ObservableArrayList<OperationDetails> WorkDetails;





    private int notesStrBidingId = BR.note_str;
    private int orderDetails = BR.orderDetails;

    /**
     * No args constructor for use in serialization
     */
    public Operation() {
    }

    /**
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

    public int getNotesOrderDetails() {
        return orderDetails;
    }

    public void setNotesOrderDetails(int orderDetails) {
        this.orderDetails = orderDetails;
    }

    public ObservableArrayList<OperationDetails> getWorkDetails() {
        return WorkDetails;
    }

    public void setWorkDetails(ObservableArrayList<OperationDetails> workDetails) {
        WorkDetails = workDetails;
    }

    public ObservableArrayList<String> getWork_notes() {
        return work_notes;
    }

    public void setWork_notes(ObservableArrayList<String> work_notes) {
        this.work_notes = work_notes;
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

    public int getNotesStrBidingId() {
        return notesStrBidingId;
    }

    public void setNotesStrBidingId(int notesStrBidingId) {
        this.notesStrBidingId = notesStrBidingId;
    }


}
