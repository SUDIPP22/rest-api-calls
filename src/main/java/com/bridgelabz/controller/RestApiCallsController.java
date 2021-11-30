package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : To demonstrate the various HTTP methods with the help of REST Controller
 *
 * @author SUDIP PANJA
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-01
 */

@RestController
public class RestApiCallsController {

    @GetMapping(value = "/message")
    public String getMessage() {
        return "Hello From BridgeLabz";
    }
}
