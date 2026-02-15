package com.todolist.todolist.service;

import com.todolist.todolist.model.Todolist;
import com.todolist.todolist.repository.TodolistRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistService(TodolistRepository todolistRepository){
        this.todolistRepository = todolistRepository;
    }
    public Todolist addTodolist(String name) {
        Todolist item = new Todolist();
        item.setName(name);
        return todolistRepository.save(item);
    }

    public List <Todolist> getAllTodolists(){
        return todolistRepository.findAll();
    }

    public void deleteTodolist(String id){
        todolistRepository.deleteById(id);
    }

}
