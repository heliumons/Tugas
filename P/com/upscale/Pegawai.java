package com.upscale;

class Pegawai {
    private String name;
    private float temp;
    private int sleepHour;

    public void setName(String name) {
        this.name = name;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setSleepHour(int sleepHour) {
        this.sleepHour = sleepHour;
    }

    public String getName() {
        return this.name;
    }

    public float getTemp() {
        return this.temp;
    }

    public int getSleepHour() {
        return this.sleepHour;
    }

}