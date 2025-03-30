package com.inventarios.librerias.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class Book {
    private Long id;
    @NotBlank(message = "El título no puede estar vacío")
    private String title;

    @NotBlank(message = "El autor no puede estar vacío")
    private String author;

    @Min(value = 0, message = "El stock no puede ser negativo")
    private int stock;

    private String editorial;
    private LocalDate publicationDate;


    // Constructor vacío
    public Book() {
    }

    // Constructor completo (opcional)
    public Book(Long id, String title, String author, String editorial, LocalDate publicationDate, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.publicationDate = publicationDate;
        this.stock = stock;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
