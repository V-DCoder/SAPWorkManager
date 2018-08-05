package com.sap.workmanager.adapters;

import com.sap.workmanager.model.Operation;

/**
 * Created by Varun Karhadkar on 05/08/2018.
 */

public class AdapterWraper {

    private String title;
    private Operation operation;

    public AdapterWraper(String title, Operation operation) {
        this.title = title;
        this.operation = operation;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
