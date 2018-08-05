package com.sap.workmanager.model;

/**
 * Created by Varun Karhadkar on 05/08/2018.
 */

public class OperationDetails {
    private String  Oper_desc;
    private String  Oper_no;
    private String  End_date;
    private String  Wrk_cntr;
    private String  Start_date;


    public String getOper_desc() {
        return Oper_desc;
    }

    public void setOper_desc(String oper_desc) {
        Oper_desc = oper_desc;
    }

    public String getOper_no() {
        return Oper_no;
    }

    public void setOper_no(String oper_no) {
        Oper_no = oper_no;
    }

    public String getEnd_date() {
        return End_date;
    }

    public void setEnd_date(String end_date) {
        End_date = end_date;
    }

    public String getWrk_cntr() {
        return Wrk_cntr;
    }

    public void setWrk_cntr(String wrk_cntr) {
        Wrk_cntr = wrk_cntr;
    }

    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String start_date) {
        Start_date = start_date;
    }
}
