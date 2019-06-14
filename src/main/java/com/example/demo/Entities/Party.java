package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "parties")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "party_id")
    private long id;
    @Column(name = "party_location")
    private  String location;
    @Column(name = "party_events")
    private String events;
    @Column(name = "party_date")
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date date;

    @ManyToMany
    @JoinTable(name = "people_parties",
            joinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id"))
    private Set<Person> people = new HashSet<Person>();

    public long getId() {
        return id;
    }

    public Party setId(long id) {
        this.id = id;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Party setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getEvents() {
        return events;
    }

    public Party setEvents(String events) {
        this.events = events;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Party setDate(Date date) {
        this.date = date;
        return this;
    }

    public Set<Person> getPeople() {
        return people;
    }

    public Party setPeople(Set<Person> people) {
        this.people = people;
        return this;
    }
}

