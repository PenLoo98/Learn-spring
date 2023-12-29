package com.penloo.learnspring4_4;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Named
class BusinessService{
    private DataService dataService;
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}
@Named
class DataService{}

@Configuration
@ComponentScan
public class CDIApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(com.penloo.learnspring4_4.CDIApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
        catch (Exception exception){
        }
    }
}