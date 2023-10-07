package com.example.cruddemo.service;

import com.example.cruddemo.dao.FootballerRepository;
import com.example.cruddemo.entity.Footballer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FootballerServiceImpl implements FootballerService {

    private FootballerRepository footballerRepository;

    @Autowired
    public FootballerServiceImpl(FootballerRepository theFootballerRepository){
        footballerRepository = theFootballerRepository;
    }

    @Override
    public List<Footballer> findAll() {
        return footballerRepository.findAll();
    }

    @Override
    public Footballer findById(int theId) {
        Optional<Footballer> result = footballerRepository.findById(theId);

        Footballer theFootballer = null;

        if(result.isPresent()){
            theFootballer = result.get();
        }else{
            throw new RuntimeException("Did not find footballer id - "+theId);
        }

        return theFootballer;
    }

    @Override
    public Footballer save(Footballer theFootballer) {
        return footballerRepository.save(theFootballer);
    }

    @Override
    public void deleteById(int theId) {
        footballerRepository.deleteById(theId);
    }
}
