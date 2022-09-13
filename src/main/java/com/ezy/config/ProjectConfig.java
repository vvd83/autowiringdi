package com.ezy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.ezy.implementations",
        "com.ezy.service", "com.ezy.aspect"})
@ComponentScan(basePackageClasses = {com.ezy.service.VehicleServices.class,
                com.ezy.beans.Vehicle.class})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
