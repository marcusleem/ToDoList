package com.marcus.todolistt;

import java.util.Calendar;

public class ToDoItem {
    private String Title;
    private Calendar Date;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Calendar getDate() {
        return Date;
    }

    public void setDate(Calendar Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return Title + "\n" + Date;
    }
    public String getDateString() {
        String Calender = Date.get(Calendar.DAY_OF_MONTH) + "/" + Date.get(Calendar.MONTH) + "/" + Date.get(Calendar.YEAR);
        return Calender;
    }

    public ToDoItem(String Title, Calendar Date) {
        this.Title = Title;
        this.Date = Date;


    }

}