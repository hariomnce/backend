package com.xrpl.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "transaction_req")
public class TransactionRequest {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  Long id;
    private String senderAddress;
    private String recipientAddress;
    //private long amount;
    private BigDecimal amount;

}
