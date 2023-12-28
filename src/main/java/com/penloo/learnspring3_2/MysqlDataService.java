package com.penloo.learnspring3_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mysql")
class MysqlDataService implements DataService{
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
}
