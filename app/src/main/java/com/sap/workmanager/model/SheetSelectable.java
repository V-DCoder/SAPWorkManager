package com.sap.workmanager.model;

/**
 * Created by Varun Karhadkar on 04/08/2018.
 */

public class SheetSelectable extends Sheet1 {

    boolean isSelected;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
