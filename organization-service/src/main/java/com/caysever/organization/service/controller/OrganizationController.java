package com.caysever.organization.service.controller;

import com.caysever.organization.service.client.EmployeeServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {

    private final EmployeeServiceClient employeeClient;

    public OrganizationController(EmployeeServiceClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    @GetMapping("/organization/{organizationId}/employee")
    public List<String> getOrganization(@PathVariable("organizationId") String organizationId) {
        return employeeClient.retrieveEmployeeByOrganization(organizationId);
    }
}