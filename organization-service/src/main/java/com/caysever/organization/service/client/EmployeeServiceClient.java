package com.caysever.organization.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("employee-service")
public interface EmployeeServiceClient {

    @GetMapping("{organizationId}/employee")
    List<String> retrieveEmployeeByOrganization(@PathVariable("organizationId") String organizationId);
}