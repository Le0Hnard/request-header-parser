package com.demo.requestheaderparser.controller;

import com.demo.requestheaderparser.service.RequestHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class RequestHeaderController {

    @Autowired
    private RequestHeaderService requestHeaderService;

    @GetMapping("/api/whoami")
    public Map<String, String> getRequestHeaderInfo(HttpServletRequest request) {
        return requestHeaderService.getRequestHeaderInfo(request);
    }

}
