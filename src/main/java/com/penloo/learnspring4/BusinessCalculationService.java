package com.penloo.learnspring4;

import org.springframework.beans.factory.annotation.Qualifier;
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
