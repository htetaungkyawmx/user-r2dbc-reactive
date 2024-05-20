package com.example.userr2dbcreactive.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@ToString
public class UserTransaction {
    @Id
    private Integer id;
    private Integer userId;
    private LocalDate transactionDate;

}
