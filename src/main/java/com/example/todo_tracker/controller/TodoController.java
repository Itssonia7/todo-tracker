package com.example.todo_tracker.controller;

import com.example.todo_tracker.model.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    // In-memory list to store our todos across requests
    private List<Todo> todos = new ArrayList<>(List.of(
        new Todo(1L, "Learn Spring Boot basics", false),
        new Todo(2L, "Build an In-memory Todo tracker", false),
        new Todo(3L, "Push clean commits to GitHub", true)
    ));

    @GetMapping("/")
    public String home() {
        return "Hello World! Welcome to the Todo Tracker API 🚀";
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todos;
    }

    // New POST endpoint to add a todo
    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo) {
        todos.add(newTodo);
        return newTodo; // Returns the newly created todo back as JSON confirmation
    }

    // New DELETE endpoint to remove a todo by ID
    @DeleteMapping("/todos/{id}")
    public String deleteTodo(@PathVariable Long id) {
        boolean removed = todos.removeIf(todo -> todo.getId().equals(id));
        if (removed) {
            return "Todo with ID " + id + " deleted successfully!";
        }
        return "Todo with ID " + id + " not found!";
    }
}