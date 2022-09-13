package com.ezy.implementations;

import com.ezy.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String playMusic() {
        return "music on bose..";
    }
}
