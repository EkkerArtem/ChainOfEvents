package com.codeit.trainee.converters;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Class that is parsing JSON document to array of EvenBeans.
 *
 * @see com.codeit.trainee.converters.EventBean
 */
class Parser {

    /**
     * Method that is parsing JSON to array of EventBeans.
     *
     * @return the array of the EventBeans.
     * @throws FileNotFoundException if there is no events.json file.
     * @see com.codeit.trainee.converters.EventBean
     */
    EventBean[] parse() throws FileNotFoundException {
        Gson gson = new Gson();
        EventBean[] data;
        data = gson.fromJson(new FileReader("events.json"), EventBean[].class);
        return data;
    }

}
