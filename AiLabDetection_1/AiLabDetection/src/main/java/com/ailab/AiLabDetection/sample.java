package com.ailab.AiLabDetection;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class sample {
    public static void main(String[] args) {
        UUID uuid = Generators.timeBasedGenerator().generate();
    }
}