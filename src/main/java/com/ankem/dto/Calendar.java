package com.ankem.dto;

public class Calendar {

    private Long calendarId;
    private String title;

    public Long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Long calendarId) {
        this.calendarId = calendarId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar(Long calendarId, String title) {
        this.calendarId = calendarId;
        this.title = title;
    }
}
