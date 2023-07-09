package com.jsp.todolist.service;

import com.jsp.todolist.dao.TodoDao;
import com.jsp.todolist.dto.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    private final TodoDao todoDao;

    @Override
    public List<Todo> getList() {
        return todoDao.getList();
    }

    @Override
    public Long add(Todo todo) {
        return todoDao.add(todo);
    }

    @Override
    public Todo get(Long id) {
        return todoDao.get(id);
    }



    @Override
    public void update(Todo todo) {
        todoDao.update(todo);
    }

    @Override
    public void delete(Long id) {
        todoDao.delete(id);
    }
}
