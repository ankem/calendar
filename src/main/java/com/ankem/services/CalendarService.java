package com.ankem.services;

import com.ankem.dao.CalendarDAO;
import com.ankem.dto.Calendar;
import com.ankem.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CalendarService {
    @Autowired
    private CalendarDAO calendarDAO;
    public List<Calendar> getCalenders() {
        return calendarDAO.getCalendarList();
    }

    public List<Event> getEventsByCalendar(Long id, Date startDate, Date endDate) {
        return calendarDAO.getEventsByCalendar(id, startDate, endDate);
    }
}
