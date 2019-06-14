package com.example.demo.Repository;

import com.example.demo.Entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PartyRepository extends JpaRepository<Party,Long> {


 List  <Party> findAll();

    Party findOne(long id);
     void delete(long id);

}
