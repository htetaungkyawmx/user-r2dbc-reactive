package com.example.userr2dbcreactive.repository;

import com.example.userr2dbcreactive.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

}
