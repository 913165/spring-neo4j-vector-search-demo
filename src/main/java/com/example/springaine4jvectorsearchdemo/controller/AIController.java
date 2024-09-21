package com.example.springaine4jvectorsearchdemo.controller;

import com.example.springaine4jvectorsearchdemo.service.AIService;
import org.springframework.ai.document.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AIController {

    @Autowired
    AIService aiService;

    @GetMapping("/load")
    public String load() {
         aiService.loaddata();
         return "Data loaded";
    }

    @GetMapping("/search")
    public List<Document> search() {
        return aiService.search();
    }

}
