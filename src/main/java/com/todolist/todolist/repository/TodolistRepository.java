package com.todolist.todolist.repository;
import com.todolist.todolist.model.Todolist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodolistRepository extends MongoRepository<Todolist,String> {
}
