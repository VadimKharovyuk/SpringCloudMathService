package com.example.springcloud.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/sections")
    public List<Questions> getQuestions() {
        List<Questions> questionsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            questionsList.add(mathService.getRandom());
        }
        return questionsList;
    }
}
