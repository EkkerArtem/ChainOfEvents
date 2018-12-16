package com.codeit.trainee.converters;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class that is putting array of EvenBeans to TreeMap, that is automatically sorting values by their Date keys.
 *
 * @see com.codeit.trainee.converters.EventBean
 */
public class Packer {

    /**
     * Method for putting array of EvenBeans to TreeMap, that is automatically sorting values by their Date keys.
     *
     * @return TreeMap with sorted EvenBeans.
     * @throws ParseException        that occurs when failed to parse a String that must be in Date format - mm:ss.
     * @throws FileNotFoundException if there is no events.json file.
     * @see com.codeit.trainee.converters.EventBean
     */
    public Map pack() throws ParseException, FileNotFoundException {
        Map<Date, String> sortedEventMap = new TreeMap<>();
        DateFormat dateFormat = new SimpleDateFormat("mm:ss");
        Parser parser = new Parser();
        EventBean[] data = parser.parse();

        for (EventBean eventBean : data) {
            sortedEventMap.put(new Date(dateFormat.parse(eventBean.getTime()).getTime()), eventBean.getEvent());
        }
        return sortedEventMap;
    }

}
