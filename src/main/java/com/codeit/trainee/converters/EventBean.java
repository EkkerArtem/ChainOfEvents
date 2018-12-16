package com.codeit.trainee.converters;

/**
 * JavaBean for storing data parsed from JSON document.
 *
 * @see <a href="https://drive.google.com/file/d/1FI3vPdp6Wc_FK78fB1Sb6cvtJs2oyc0u/edit">JSON document that is used.</a>
 */
class EventBean {
    private String eventName;
    private String time;

    public EventBean(String eventName, String time) {
        this.eventName = eventName;
        this.time = time;
    }

    String getEvent() {
        return eventName;
    }

    String getTime() {
        return time;
    }
}
