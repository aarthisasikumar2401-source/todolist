package com.todolist.todolist.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="todolist")
public class Todolist {

    @Id
    private String id;

    private String name;

    private String todolist;

    public Todolist() {
    }

    public Todolist(String name){
        this.name=name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getTodolist(){
        return todolist;
    }

    public void setTodolist(String todolist){
        this.todolist=todolist;
    }
}
