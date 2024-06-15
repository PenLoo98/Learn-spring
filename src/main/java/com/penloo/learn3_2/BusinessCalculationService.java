package com.penloo.learn3_2;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
