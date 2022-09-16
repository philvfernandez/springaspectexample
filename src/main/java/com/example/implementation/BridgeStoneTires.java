package com.example.implementation;

import com.example.interfaces.Tires;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTires implements Tires {
    @Override
    public String rotate() {
        return "Vechile moving with the help of Bridgestone tires";
    }

    @Override
    public String stop() {
        return "Vechile stopped with the help of Bridgestone tires";
    }
}
