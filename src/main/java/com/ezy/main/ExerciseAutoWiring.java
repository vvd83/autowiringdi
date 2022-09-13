package com.ezy.main;

import com.ezy.beans.Vehicle;
import com.ezy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExerciseAutoWiring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("spring container created already");
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println(v.getVehicleServices().getSpeakers().playMusic());
        System.out.println(v.getVehicleServices().getTyres().rotate());
    }
}
