package com.example.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="football_players")
public class Footballer {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="club")
    private String club;

    @Column(name="position")
    private String position;

    // define constructors
    public Footballer(){

    }

    public Footballer(String name, String club, String position) {
        this.name = name;
        this.club = club;
        this.position = position;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    // define toString

    @Override
    public String toString() {
        return "Footballer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", club='" + club + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
