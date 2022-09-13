package com.ezy.implementations;

import com.ezy.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "moving on Michelin tyres..";
    }
}
