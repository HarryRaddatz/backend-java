package com.pseudohuery.backend_teste.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class Transaction {
    @Id
    private Long id;

    private Long clientId;

    private Long bankId;

    private String type;

}