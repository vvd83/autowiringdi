package com.ezy.implementations;

import com.ezy.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String playMusic() {
        return "music from sony..";
    }
}
