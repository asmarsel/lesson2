package edu.jcourse.apps.notepad;

import java.time.Instant;

public abstract class InfoAbout /*record*/ {

    private static int counter;
    private final int id;
    private final Instant createdAt;
    /* можно использовать "protected" вместо "private", тогда переменная доступна наследникам */


    public InfoAbout() {
        counter++;
        id = counter;
        createdAt = Instant.now();
    }

    public abstract void askData();

    public int getId() {
        return id;
    }

    public Instant getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return String.format("%d Created at: %s", id, createdAt);
    }
}
