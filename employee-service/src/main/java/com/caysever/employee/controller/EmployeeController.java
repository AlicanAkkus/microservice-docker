package com.caysever.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class EmployeeController {

    private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("{organizationId}/employee")
    public List<String> retrieve(@PathVariable("organizationId") String organizationId) {
        logger.info("Employee service running for " + organizationId);
        return Stream.of("Alican", "Onur", "Lemi", "Burak")
                .map(emp -> organizationId.concat(":").concat(emp))
                .collect(Collectors.toList());
    }
}