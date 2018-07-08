package com.caysever.organization.service.client.employee;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EmployeeClientFallback implements EmployeeServiceClient {

    @Override
    public List<String> retrieveEmployeeByOrganization(String organizationId) {
        return Collections.emptyList();
    }
}