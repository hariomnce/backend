package com.xrpl.controller;

import com.xrpl.model.TransactionRequest;
import com.xrpl.service.XrpSendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XrpSendController {

    private final XrpSendService xrpSendService;

    public XrpSendController(XrpSendService xrpSendService) {
        this.xrpSendService = xrpSendService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody TransactionRequest request) throws Exception {
        xrpSendService.send(request);
        return ResponseEntity.ok("XRP sent successfully !");
    }
}
