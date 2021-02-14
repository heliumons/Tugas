package com.upscale;

public class Pegawai {
    // attribute / variable
    private String name, fitNote;
    private float temp;
    private int sleepHour;

    // method
    public void setName(String name) {
        this.name = name;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setSleepHour(int sleepHour) {
        this.sleepHour = sleepHour;
    }

    // public void setFitNote(String fitNote) {
    // this.fitNote = fitNote;
    // }

    public String getName() {
        return this.name;
    }

    public float getTemp() {
        return this.temp;
    }

    public int getSleepHour() {
        return this.sleepHour;
    }

    // public String getUser() {
    // return this.fitNote;
    // }

}