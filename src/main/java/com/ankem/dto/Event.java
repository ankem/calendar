package com.ankem.dto;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;

public class Event {


    private Long id;
    private Long calendarId;
    @JsonFormat(shape = STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date endDate;
    @JsonFormat(shape = STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date startDate;
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Long calendarId) {
        this.calendarId = calendarId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Event(Long id, Long calendarId, Date endDate, Date startDate, String title) {
        this.id = id;
        this.calendarId = calendarId;
        this.endDate = endDate;
        this.startDate = startDate;
        this.title = title;
    }
}
