package com.iot.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/requestmapping")
public class RequestController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(HttpServletRequest request, HttpServletResponse response,@RequestParam int id) throws Exception {
        return "testbind get";
    }
}
