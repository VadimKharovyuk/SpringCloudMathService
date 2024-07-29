package com.example.springcloud.controller;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MathService {
    private final Random random = new Random();
    private final int max = 10;

    public Questions getRandom() {
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Questions.builder()
                .question(a + " + " + b + " = ?")
                .answer(String.valueOf(a + b))
                .build();
    }

}
