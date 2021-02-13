package com.upscale;

public class Pegawai {
    // attribute / variable
    private String name, user;
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

    // public void setFitNote(String user) {
    // this.user = user;
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
    // return this.user;
    // }

}