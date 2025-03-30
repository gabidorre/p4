package com.inventarios.librerias.service;

import com.inventarios.librerias.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final Map<Long, Book> bookStore = new HashMap<>();
    private long idCounter = 1;

    // Crear y guardar un libro
    public Book save(Book book) {
        book.setId(idCounter++);
        bookStore.put(book.getId(), book);
        return book;
    }

    // Obtener todos los libros
    public Collection<Book> findAll() {
        return bookStore.values();
    }

    // Obtener un libro por su ID
    public Book findById(Long id) {
        return bookStore.get(id);
    }

    // Actualizar un libro existente
    public Book update(Long id, Book updatedBook) {
        if (!bookStore.containsKey(id)) {
            return null;
        }
        updatedBook.setId(id);
        bookStore.put(id, updatedBook);
        return updatedBook;
    }

    // Eliminar un libro por ID
    public boolean delete(Long id) {
        return bookStore.remove(id) != null;
    }
}
