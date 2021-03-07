package com.upscale.tugas3.models;

import javax.persistence.*;

@Entity
@Table(name = "pegawai")
public class Pegawai {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pegawai_generator")
    @SequenceGenerator(name = "pegawai_generator", sequenceName = "pegawai_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String Name;
    @Column(name = "temp")
    private Float Temp;
    @Column(name = "sleephour")
    private Integer SleepHour;
    @Column(name = "fitnote")
    private String FitNote;

    public Pegawai() {

    }

    public Pegawai(Integer id, String Name, Float Temp, Integer SleepHour, String FitNote) {
        this.id = id;
        this.Name = Name;
        this.Temp = Temp;
        this.SleepHour = SleepHour;
        this.FitNote = FitNote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Float getTemp() {
        return Temp;
    }

    public void setAge(Float Temp) {
        this.Temp = Temp;
    }

    public Integer getSleepHour() {
        return SleepHour;
    }

    public void setSleepHour(Integer SleepHour) {
        this.SleepHour = SleepHour;
    }

    public String getFitNote() {
        return FitNote;
    }

    public void setFitNote(String FitNote) {
        this.FitNote = FitNote;
    }

    @Override
    public String toString() {
        return "Pegawai{" + "id=" + id + ", Name='" + Name + '\'' + ", Temp=" + Temp + ", SleepHour=" + SleepHour
                + ", FitNote=" + FitNote + '}';
    }
}
