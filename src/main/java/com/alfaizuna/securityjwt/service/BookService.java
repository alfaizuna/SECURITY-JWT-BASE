package com.alfaizuna.securityjwt.service;

import com.alfaizuna.securityjwt.dao.entity.book.Book;
import com.alfaizuna.securityjwt.dao.repository.book.BookRepository;
import com.alfaizuna.securityjwt.dto.book.request.BookRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public void save(BookRequest request) {
        var book = Book.builder()
                .id(request.getId())
                .author(request.getAuthor())
                .isbn(request.getIsbn())
                .build();
        repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
