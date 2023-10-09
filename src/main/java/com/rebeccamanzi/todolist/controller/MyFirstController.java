package com.rebeccamanzi.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller: recebe as requisições
// @Controller -> retorna templates
@RestController // para API
@RequestMapping("/firstRoute")
public class MyFirstController {

  @GetMapping("/")
  public String firstMessage() {
    return "Hello World";
  }
}
