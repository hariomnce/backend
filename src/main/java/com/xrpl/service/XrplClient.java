package com.xrpl.service;

import lombok.Value;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.xrpl.xrpl4j.client.JsonRpcClientErrorException;
import org.xrpl.xrpl4j.wallet.Wallet;
import org.xrpl.xrpl4j.wallet.WalletFactory;

@Service
public class XrplClient {

    private final SimpMessagingTemplate messagingTemplate;

    @Value("${xrpl.wss.url}")
    private String xrplWssUrl;

    public XrplClient(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public String createWallet() {
        WalletFactory walletFactory = WalletFactory.getInstance();
        Wallet wallet = walletFactory.fromRandomWalletGeneration().wallet();
        String seed = wallet.seed();
        System.out.println("New wallet created: " + seed);
        return seed;
    }

//    public void fundWallet(String seed) {
//        Wallet wallet = WalletFactory.getInstance().fromSeed(seed).wallet();
//
//        try {
//
//        } catch (JsonRpcClientErrorException e) {
//            e.printStackTrace();
//        }
//    }
}
