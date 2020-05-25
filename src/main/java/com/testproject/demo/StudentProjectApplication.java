package com.testproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class StudentProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProjectApplication.class, args);
    }

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Africa/Nairobi")));
    }


}
