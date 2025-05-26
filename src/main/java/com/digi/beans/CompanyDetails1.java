package com.digi.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company1")
public class CompanyDetails1 {

    @Value("${com.digi.name}")
    private String title;
    @Value("${com.digi.type}")
    private String type;
    @Value("${com.digi.location}")
    private String addrs1;

    @Override
    public String toString() {
        return "CompanyDetails1{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", addrs1='" + addrs1 + '\'' +
                '}';
    }
}
