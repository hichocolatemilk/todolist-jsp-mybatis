package com.jsp.todolist.controller;

import com.jsp.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/todo")
    public String todo(Model model) {
        model.addAttribute("todos", todoService.getList());
        return "todo";
    }
}
