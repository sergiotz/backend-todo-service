package com.sergiotz.backend.controller;

import java.util.ArrayList;
import java.util.List;

import com.sergiotz.backend.model.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TaskController
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @GetMapping
    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();

        return tasks;            
    }
}