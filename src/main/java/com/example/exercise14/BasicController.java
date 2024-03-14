package com.example.exercise14;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Date;


@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("/date-time")
    public OffsetDateTime currentDate(){
        return OffsetDateTime.now();
    }

}
