package edu.jcourse.apps.notepad;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReminderRecord extends AlarmRecord {

    private LocalDate reminder;

    @Override
    public void askData() {
        reminder = Notepad.askDate("reminder day: ");
        super.askData();
    }

    public LocalDate getReminder() { return reminder; }

    public void setReminder(LocalDate reminder) { this.reminder = reminder; }


    @Override
    public String toString() { return String.format("%s %s", super.toString(), reminder.format(Notepad.DAY_PATTERN)); }
}
