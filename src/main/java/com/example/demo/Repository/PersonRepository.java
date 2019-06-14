package com.example.demo.Repository;

import com.example.demo.Entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
    Person findOne(long id);
    Person findParties(long party_id);
}
