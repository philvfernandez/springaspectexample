package com.example.services;

import com.example.interfaces.LogAspect;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tires;
import com.example.model.Song;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleServices {

    private Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    private Speakers speakers;
    private Tires tires;

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        return tires.rotate();
    }

    public String applyBrake(boolean vehicleStarted) {
        return tires.stop();
    }

    public Tires getTires() {
        return tires;
    }

    @Autowired void setTires(Tires tires) {
        this.tires = tires;
    }
}
