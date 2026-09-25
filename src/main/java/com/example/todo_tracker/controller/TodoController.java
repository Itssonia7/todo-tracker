package com.example.todo_tracker.controller;

import com.example.todo_tracker.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "Hello World! Welcome to the Todo Tracker API 🚀";
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1L, "Learn Spring Boot basics", false));
        todos.add(new Todo(2L, "Build an In-memory Todo tracker",false));
        todos.add(new Todo(3L, "push clean commits to Github",true));
        return todos;
    }
}