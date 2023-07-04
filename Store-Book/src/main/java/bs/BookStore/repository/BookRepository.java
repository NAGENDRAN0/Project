package bs.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bs.BookStore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
