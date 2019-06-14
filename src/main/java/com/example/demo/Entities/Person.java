package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Level  level;

    @ManyToOne
    @JoinColumn(name="person_id")
    @JsonBackReference
    private Person person;


    @OneToMany(mappedBy = "person")
    private Set<Skills> skills = new HashSet<Skills>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable(name = "people_parties",
            joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"))
    private Set<Party> parties = new HashSet<Party>();

    public long getId() {
        return id;
    }

    public Person setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public Person setLevel(Level level) {
        this.level = level;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public Person setPerson(Person person) {
        this.person = person;
        return this;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public Person setSkills(Set<Skills> skills) {
        this.skills = skills;
        return this;
    }

    public Set<Party> getParties() {
        return parties;
    }

    public Person setParties(Set<Party> parties) {
        this.parties = parties;
        return this;
    }
}
