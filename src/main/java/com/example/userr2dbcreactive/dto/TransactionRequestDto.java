package com.example.userr2dbcreactive.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.sql.In;

@Data
@ToString
public class TransactionRequestDto {
    private Integer userId;
    private Integer amount;
}
