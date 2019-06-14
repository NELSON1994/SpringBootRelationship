package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private long id;

    @ManyToOne
    @JoinColumn (name="person_id")
    @JsonBackReference
    private Person person;

    public long getId() {
        return id;
    }

    public Skills setId(long id) {
        this.id = id;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public Skills setPerson(Person person) {
        this.person = person;
        return this;
    }
}
