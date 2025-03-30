package com.inventarios.librerias.controller;

import com.inventarios.librerias.model.Book;
import com.inventarios.librerias.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookMvcController {

    private final BookService bookService;

    public BookMvcController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books-list")
    public String showBooks(Model model) {
        List<Book> books = new ArrayList<>(bookService.findAll());
        model.addAttribute("books", books);
        return "books-list"; // nombre del archivo HTML Thymeleaf sin extensión
    }
}
