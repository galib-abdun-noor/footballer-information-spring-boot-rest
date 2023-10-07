package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballer, Integer> {
}
