package com.demo.requestheaderparser.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class RequestHeaderService {

    public Map<String, String> getRequestHeaderInfo(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("ipaddress", request.getHeader("host"));
        map.put("language", request.getHeader("accept-language"));
        map.put("software", request.getHeader("user-agent"));

        return map;
    }

}
