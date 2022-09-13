package com.ezy.implementations;

import com.ezy.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Going on with Bridgestone..";
    }
}
