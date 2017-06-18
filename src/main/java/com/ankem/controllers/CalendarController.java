package com.ankem.controllers;

import com.ankem.dto.Calendar;
import com.ankem.dto.Event;
import com.ankem.services.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CalendarController {
    @Autowired
    private CalendarService service;

    @RequestMapping(value = "/calenders", method = GET)
    public List<Calendar> getCalendarList() {
        return service.getCalenders();
    }

    @RequestMapping(value = "/calenders/{id}/events", method = GET)
    public List<Event> getEvents(@PathVariable Long id,
                                 @DateTimeFormat(pattern = "yyyy-MM-dd")
                                 @RequestParam Date startDate,
                                 @DateTimeFormat(pattern = "yyyy-MM-dd")
                                 @RequestParam Date endDate) {
        return service.getEventsByCalendar(id, startDate, endDate);
    }
}
