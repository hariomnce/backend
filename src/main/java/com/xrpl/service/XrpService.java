//package com.xrpl.service;
//
//import org.springframework.stereotype.Service;
//import org.xrpl.xrpl4j.client.XrplClient;
//import org.xrpl.xrpl4j.client.faucet.FaucetClient;
//
//@Service
//public class XrpService {
//
//    private final XrplClient xrplClient;
//    private final FaucetClient faucetClient;
//
//    public XrpService(XrplClient xrplClient, FaucetClient faucetClient) {
//        this.xrplClient = xrplClient;
//        this.faucetClient = faucetClient;
//    }

//    public String getAccountBalance(String address){
//        Address xrplAddress=Address.of(address);
//        AccountInfoRequestParams requestParams=AccountInfoRequestParams.builder()
//                .account(xrplAddress)
//                .ledgerIndex("validated")
//                .build();
//
//        return "Balance for address " + address;
//    }
//}
