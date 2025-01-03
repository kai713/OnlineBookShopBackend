package com.kazakhi.onlinebookshop.repository;

import com.kazakhi.onlinebookshop.entity.Review;
import com.kazakhi.onlinebookshop.entity.Book;
import com.kazakhi.onlinebookshop.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Optional<Review> findByBookAndUser(Book book, Users user);
    void deleteByBookAndUser(Book book, Users user);
}

