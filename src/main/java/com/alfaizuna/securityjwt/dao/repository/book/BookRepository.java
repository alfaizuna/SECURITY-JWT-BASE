package com.alfaizuna.securityjwt.dao.repository.book;

import com.alfaizuna.securityjwt.dao.entity.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
