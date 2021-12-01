package com.bridgelabz.controller;

import com.bridgelabz.controller.dto.UserDto;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/message2")
    public String getMessageUsingQueryParameter
            (@RequestParam String firstName,
             @RequestParam String lastName) {
        return "Hello From BridgeLabz : " + firstName + " " + lastName;
    }

    @GetMapping(value = "/message3/{name}")
    public String getMessageUsingPathVariable
            (@PathVariable String name) {
        return "Hello : " + name + " from BridgeLabz";
    }

    @PostMapping(value = "/message4")
    public String getUserDetails(@RequestBody UserDto userDto) {
        return userDto.toString();
    }

    @PutMapping(value = "/message5/{firstName}")
    public String getMessageUsingPutRequest(
            @PathVariable String firstName,
            @RequestParam String lastName
    ) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
