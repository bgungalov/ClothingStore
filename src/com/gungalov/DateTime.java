package com.gungalov;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    private final String currentDateTime;

    public DateTime() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        this.currentDateTime = simpleDateFormat.format(new Date());
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }
}
