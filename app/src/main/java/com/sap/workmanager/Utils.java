package com.sap.workmanager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getFormatedDate(String str) {
        try {
            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format1.parse(str);
            return format2.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
