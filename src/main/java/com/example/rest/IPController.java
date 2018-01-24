/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/ip")
public class IPController {
    @RequestMapping(method = RequestMethod.GET)
    public String getIP() throws UnknownHostException {
        return Inet4Address.getLocalHost().getHostAddress();
    }
}
