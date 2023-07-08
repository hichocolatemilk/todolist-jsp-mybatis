package com.jsp.todolist.service;

import com.jsp.todolist.dto.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getList();

    public Long add(Todo todo);

    public Todo get(Long id);

    public void update(Todo todo);

    public void delete(Long id);
}
