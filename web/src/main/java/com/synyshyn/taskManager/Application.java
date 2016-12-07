package com.synyshyn.taskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Ivan Synyshyn on 05.12.2016.
 */
@SpringBootApplication
@EnableScheduling
public class Application extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


        System.out.println("Service layer works");
        ServiceTest serviceTest = new ServiceTest();
        double result = serviceTest.count(12.2, 5.6, 8.0);
        System.out.println("Result of counting is: " + result);
        System.out.println("End of application");


    }
}
