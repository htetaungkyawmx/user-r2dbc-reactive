package com.example.userr2dbcreactive.repository;

import com.example.userr2dbcreactive.entity.UserTransaction;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserTransactionRepository extends ReactiveCrudRepository<UserTransaction,Integer> {

}
