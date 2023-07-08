package com.jsp.todolist.dao;

import com.jsp.todolist.dto.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDao {

    public List<Todo> getList();

    public Long add(Todo todo);

    public Todo get(Long id);

    public void update(Todo todo);

    public void delete(Long id);
}
