package com.cybersurferweb.springesseeujali.util;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    public String formatLocalDateToDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
