package com.caysever.organization.service.controller;

import com.caysever.organization.service.client.employee.EmployeeServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {

    private static final Logger logger = LoggerFactory.getLogger(OrganizationController.class);
    private final EmployeeServiceClient employeeClient;

    public OrganizationController(EmployeeServiceClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    @GetMapping("/organization/{organizationId}/employee")
    public List<String> getOrganization(@PathVariable("organizationId") String organizationId) {
        logger.info("Organization service running for " + organizationId);
        return employeeClient.retrieveEmployeeByOrganization(organizationId);
    }
}