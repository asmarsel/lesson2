package edu.jcourse.apps.notepad;

public class PersonRecord extends InfoAbout {

    private String name;
    private String email;
    private String phoneNumber;

    @Override
    public void askData() {
        name = Notepad.askString("first name: ");
        email = Notepad.askString("email: ");
        phoneNumber = Notepad.askString("phone: ");
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() { return String.format("%s %s %s %s ", super.toString(), name, email, phoneNumber); }
}