package com.cybersurferweb.springesseeujali.util;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public String formatLocalDateToDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
