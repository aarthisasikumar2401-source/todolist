package com.todolist.todolist.controller;

import com.todolist.todolist.model.Todolist;
import com.todolist.todolist.service.TodolistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://65.0.205.19:8080")

@RestController
@RequestMapping("/todolist")
public class TodolistController {

    private final TodolistService todolistService;

    public TodolistController(TodolistService todolistService) {
        this.todolistService = todolistService;
    }
    @PostMapping
    public Todolist addTodolist(@RequestBody Todolist todolist) {
        return todolistService.addTodolist(todolist.getName());
    }
    @GetMapping
    public List<Todolist> getTodolists() {
        return todolistService.getAllTodolists();
    }
    @DeleteMapping("/{id}")
    public void deleteTodolist(@PathVariable String id) {
        todolistService.deleteTodolist(id);
    }
}
