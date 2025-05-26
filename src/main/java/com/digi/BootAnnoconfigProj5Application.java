package com.digi;

import com.digi.beans.CompanyDetails;
import com.digi.beans.CompanyDetails1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootAnnoconfigProj5Application {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(BootAnnoconfigProj5Application.class, args);
        //get springbean class obj
        CompanyDetails company = context.getBean("company", CompanyDetails.class);
        System.out.println(company);

        System.out.println("---------------------------------------------------------------------------");
        CompanyDetails1 company1 = context.getBean("company1", CompanyDetails1.class);
        System.out.println(company1);

        //close container
        ((ConfigurableApplicationContext) context).close();
    }

}
