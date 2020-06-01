package com.Accolite.AU.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Accolite.AU.model.Academic;

@Repository
public interface AcademicRepository extends CrudRepository<Academic,String> {

}
