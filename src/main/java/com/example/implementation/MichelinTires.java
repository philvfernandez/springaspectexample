package com.example.implementation;

import com.example.interfaces.Tires;

public class MichelinTires implements Tires {
    @Override
    public String rotate() {
        return "Vehicle moving with the help of Michelin tires";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin tires";
    }
}
