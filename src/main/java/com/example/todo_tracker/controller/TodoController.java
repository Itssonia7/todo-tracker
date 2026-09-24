package com.example.todo_tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "Hello World! Welcome to the Todo Tracker API 🚀";
    }
}