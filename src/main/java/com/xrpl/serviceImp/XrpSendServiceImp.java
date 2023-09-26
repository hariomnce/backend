package com.xrpl.serviceImp;

import com.xrpl.model.TransactionRequest;
import com.xrpl.service.XrpSendService;
import org.xrpl.xrpl4j.client.XrplClient;
import org.xrpl.xrpl4j.model.transactions.Transaction;

public class XrpSendServiceImp implements XrpSendService {

    private final XrplClient xrplClient;

    public XrpSendServiceImp() {
        String testnetUrl="https://s.altnet.rippletest.net:51234/";
        xrplClient=new XrplClient(testnetUrl);
    }

    @Override
    public void send(TransactionRequest request) throws Exception {
        Transaction transaction=Transaction
    }
}
