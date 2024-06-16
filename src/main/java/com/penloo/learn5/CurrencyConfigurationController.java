package com.penloo.learn5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {
    // CurrencyServiceConfiguration.java 파일에서 가져온 설정값을 사용하기 위해 인스턴스 생성
    @Autowired
    private CurrencyServiceConfiguration configuration;

    // 가져온 인스턴스의 설정값을 반환하는 REST API
    // Course: id, name, author
    @RequestMapping("/currency-configurations")
    public CurrencyServiceConfiguration retrieveAllConfigurations(){
        return configuration;
    }
}
