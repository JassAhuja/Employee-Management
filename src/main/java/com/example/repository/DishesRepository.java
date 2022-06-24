package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.domain.DishesDomain;
@Service
@Repository
public interface DishesRepository extends CrudRepository<DishesDomain, Integer> {

}
