package com.example.cruddemo.service;

import com.example.cruddemo.entity.Footballer;

import java.util.List;

public interface FootballerService {
    List<Footballer> findAll();

    Footballer findById(int theId);

    Footballer save(Footballer theEmployee);

    void deleteById(int theId);
}
