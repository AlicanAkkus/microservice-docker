package com.caysever.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class EmployeeController {

    @GetMapping("{organizationId}/employee")
    public List<String> retrieve(@PathVariable("organizationId") String organizationId) {
        return Stream.of("Alican", "Onur", "Lemi", "Burak")
                .map(emp -> organizationId.concat(":").concat(emp))
                .collect(Collectors.toList());
    }
}