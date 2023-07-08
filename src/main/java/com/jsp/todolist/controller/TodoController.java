package com.jsp.todolist.controller;

import com.jsp.todolist.dto.Todo;
import com.jsp.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo")
    public Long add(@RequestBody Todo todo){
        return todoService.add(todo);
    }

    @GetMapping("/todo/{id}")
    public Todo get(@PathVariable Long id){
        return todoService.get(id);
    }
    @GetMapping("/todo/getlist")
    public List<Todo> getlist(){
        return todoService.getList();
    }

    @DeleteMapping("/todo/{id}")
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }


}
