package com.penloo.learn5;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// currency-service.url=
// currency-service.username=
// currency-service.key=

// properties를 사용하여 설정값을 가져올 수 있도록 하는 어노테이션
// prefix를 통해 설정값의 prefix를 지정할 수 있음
@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;

    // getter, setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
