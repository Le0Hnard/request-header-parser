package com.demo.requestheaderparser.controller;

import com.demo.requestheaderparser.dto.RequestHeaderDto;
import com.demo.requestheaderparser.service.RequestHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RequestHeaderController {

    @Autowired
    private RequestHeaderService requestHeaderService;

    @PostMapping("/api/whoami")
    public RequestHeaderDto getRequestHeaderInfo() {

    }

}
