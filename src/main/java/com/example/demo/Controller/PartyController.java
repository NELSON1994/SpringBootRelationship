package com.example.demo.Controller;

import com.example.demo.Entities.Party;
import com.example.demo.Entities.Person;
import com.example.demo.Repository.PartyRepository;
import com.example.demo.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
//@RequestMapping("/parties")
public class PartyController {

    @Autowired
    private PartyRepository partyRepo;

    @Autowired
    private PersonRepository personRepo;

//    @GetMapping("/parties")
//    public ResponseEntity<List<Party>> getParties() {
//        return new ResponseEntity <List<Party>>( partyRepo.findAll());
//    }

    @GetMapping("/parties/{id}")
    public ResponseEntity<Party> getParty(@PathVariable long id) {
        Party party = partyRepo.findOne(id);

        if (party != null) {
            return new ResponseEntity<Party>(partyRepo.findOne(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/createParty")
    public ResponseEntity<?> addParty(@RequestBody Party party) {
        return new ResponseEntity<Party>(partyRepo.save(party), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteparty/{id}")
    public ResponseEntity<Void> deleteParty(@PathVariable long id) {
        partyRepo.delete(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

//    @RequestMapping(value = "/{id}/parties", method = RequestMethod.GET)
//    public ResponseEntity<Collection<Party>> getPersonParties(@PathVariable long id) {
//        Person person = personRepo.findOne(id);
//
//        if (person != null) {
//            return new ResponseEntity<Party>(person.getParties(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        }
//    }


}
