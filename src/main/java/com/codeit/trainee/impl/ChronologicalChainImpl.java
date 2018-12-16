package com.codeit.trainee.impl;

import com.codeit.trainee.ChronologicalChain;
import com.codeit.trainee.converters.Packer;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChronologicalChainImpl implements ChronologicalChain {

    public void start() throws ParseException, InterruptedException, FileNotFoundException {
        Packer packer = new Packer();
        Map<Date, String> map = packer.pack();
        DateFormat dateFormatFromJSON = new SimpleDateFormat("mm:ss");
        DateFormat dateFormatSeconds = new SimpleDateFormat("ss");
        DateFormat dateFormatMinutes = new SimpleDateFormat("mm");
        int startTime = 0;

        for (Map.Entry<Date, String> entry : map.entrySet()) {
            int eventTimeInSeconds = Integer.parseInt(dateFormatSeconds.format(entry.getKey())) + Integer.parseInt(dateFormatMinutes.format(entry.getKey())) * 60;
            TimeUnit.SECONDS.sleep(eventTimeInSeconds - startTime);
            startTime = eventTimeInSeconds;
            System.out.println(dateFormatFromJSON.format(entry.getKey()) + " " + entry.getValue());
        }
    }
}
