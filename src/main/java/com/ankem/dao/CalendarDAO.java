package com.ankem.dao;

import com.ankem.dto.Calendar;
import com.ankem.dto.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static java.util.Calendar.DAY_OF_MONTH;

@Repository
public class CalendarDAO {
    String[] listOfCalendars = {"calendar1", "calendar2", "calendar3"};


    public List<Calendar> getCalendarList() {
        List<Calendar> calendars = new ArrayList<>();

        for (Long i = 0L; i < 3; i++) {
            calendars.add(new Calendar(i, listOfCalendars[i.intValue()]));
        }
        return calendars;
    }

    public List<Event> getEventsByCalendar(Long id, Date startDate, Date endDate) {
        List<Event> events = new ArrayList<>();
        GregorianCalendar startDayCal = new GregorianCalendar(startDate.getYear(), startDate.getMonth(), startDate.getDay());
        GregorianCalendar endDayCal = new GregorianCalendar(endDate.getYear(), endDate.getMonth(), endDate.getDay());
        for (Long i = 0l; startDayCal.before(endDayCal); i++) {
            events.add(new Event(i, id, startDayCal.getTime(), startDayCal.getTime(), "testing"));
            startDayCal.add(DAY_OF_MONTH, 1);
        }
        return events;
    }
}
