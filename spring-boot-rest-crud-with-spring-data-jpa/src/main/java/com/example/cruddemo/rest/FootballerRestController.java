package com.example.cruddemo.rest;

import com.example.cruddemo.entity.Footballer;
import com.example.cruddemo.service.FootballerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FootballerRestController {

    private FootballerService footballerService;

    @Autowired
    public FootballerRestController(FootballerService theFootballerService){
        footballerService = theFootballerService;
    }

    // expose "/footballer" and return a list of footballer
    @GetMapping("/footballer")
    public List<Footballer> findAll(){
        return footballerService.findAll();
    }

    @GetMapping("/footballer/{footballerId}")
    public Footballer getFootballer(@PathVariable int footballerId){
        Footballer theFootballer = footballerService.findById(footballerId);

        if(theFootballer == null){
            throw new RuntimeException("Footballer id not found - " + footballerId);
        }

        return theFootballer;
    }

    // add mapping for POST /Footballer - add new Footballer

    @PostMapping("/footballer")
    public Footballer addFootballer(@RequestBody Footballer theFootballer){

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theFootballer.setId(0);

        Footballer dbFootballer = footballerService.save(theFootballer);

        return theFootballer;
    }

    // add mapping for PUT /footballers - update existing footballer

    @PutMapping("/footballer")
    public Footballer updateFootballer(@RequestBody Footballer theFootballer){
        Footballer dbFootballer = footballerService.save(theFootballer);

        return dbFootballer;
    }

    // add mapping for DELETE /footballer/{footballerId} - delete footballer

    @DeleteMapping("/footballer/{footballerId}")
    public String deleteFootballer(@PathVariable int footballerId){
        Footballer tempFootballer = footballerService.findById(footballerId);

        // throw exception if null

        if(tempFootballer == null){
            throw new RuntimeException("Footballer id not found - " + footballerId);
        }

        footballerService.deleteById(footballerId);

        return "Deleted footballer id - " + footballerId;
    }
}
