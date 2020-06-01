package com.Accolite.AU.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Accolite.AU.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

}
