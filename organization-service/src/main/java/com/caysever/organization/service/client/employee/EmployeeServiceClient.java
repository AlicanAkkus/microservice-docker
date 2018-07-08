package com.caysever.organization.service.client.employee;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee-service", fallback = EmployeeClientFallback.class)
public interface EmployeeServiceClient {

    @GetMapping("{organizationId}/employee")
    List<String> retrieveEmployeeByOrganization(@PathVariable("organizationId") String organizationId);
}