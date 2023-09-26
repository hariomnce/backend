package com.xrpl.service;

import com.xrpl.model.TransactionRequest;
import org.springframework.stereotype.Service;

@Service
public interface XrpSendService {

    void send(TransactionRequest request) throws Exception;
}
