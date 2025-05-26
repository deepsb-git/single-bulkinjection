package com.digi.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix ="com.digi")
@Data
public class CompanyDetails {

    private String name;
    private String type;
    private String location;



    @Override
    public String toString() {
        return "CompanyDetails{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
