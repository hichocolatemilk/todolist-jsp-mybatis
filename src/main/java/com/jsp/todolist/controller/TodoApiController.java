package com.jsp.todolist.controller;

import com.jsp.todolist.dto.Todo;
import com.jsp.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoApiController {

    private final TodoService todoService;

    @PostMapping("/api/todo")
    public Long add(@RequestBody Todo todo){
        return todoService.add(todo);
    }

    @GetMapping("/api/todo/{id}")
    public Todo get(@PathVariable Long id){
        return todoService.get(id);
    }
    @GetMapping("/api/todo/getlist")
    public List<Todo> getlist(){
        return todoService.getList();
    }


    @PutMapping("/api/todo/{id}")
    public void update( @PathVariable Long id, @RequestBody Todo todo){
        todo.setId(id);
        todoService.update(todo);
    }

    @DeleteMapping("/api/todo/{id}")
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }


}
