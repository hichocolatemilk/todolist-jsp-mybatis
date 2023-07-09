package com.jsp.todolist.service;

import com.jsp.todolist.dto.Todo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TodoService {
    public List<Todo> getList();

    public Long add(Todo todo);

    public Todo get(Long id);

    public void update(Todo todo);


    public void delete(Long id);

}
