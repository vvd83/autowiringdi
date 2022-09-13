package com.ezy.service;

import com.ezy.interfaces.Speakers;
import com.ezy.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private Tyres tyres;
    private Speakers speakers;

    @Autowired
    public VehicleServices(Tyres tyres, Speakers speakers) {
        this.tyres = tyres;
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }
}
