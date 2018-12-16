package com.codeit.trainee;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * Main class, that is reading JSON and writing it to console as chronological chain of events.
 *
 * @see <a href="https://drive.google.com/file/d/1FI3vPdp6Wc_FK78fB1Sb6cvtJs2oyc0u/edit">JSON document that is used.</a>
 */
public interface ChronologicalChain {

    /**
     * Main method, that is reading JSON and writing it to console as chronological chain of events.
     *
     * @throws ParseException        that occurs when failed to parse a String that must be in Date format - mm:ss.
     * @throws InterruptedException  thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity. It can be thrown in this fragment of code {@code TimeUnit.SECONDS.sleep()}
     * @throws FileNotFoundException if there is no events.json file.
     */
    void start() throws ParseException, InterruptedException, FileNotFoundException;

}
