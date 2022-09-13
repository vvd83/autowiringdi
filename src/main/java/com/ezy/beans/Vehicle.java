package com.ezy.beans;

import com.ezy.service.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        System.out.println("Creating vehicle bean now.. ");
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }
}
