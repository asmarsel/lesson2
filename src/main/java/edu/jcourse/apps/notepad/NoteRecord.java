package edu.jcourse.apps.notepad;

public class NoteRecord extends InfoAbout {

    private String note;

    @Override
    public void askData() {
        note = Notepad.askString("text: ");
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%s %s ", super.toString(), note);
    }

}
