package bs.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bs.BookStore.model.MyBook;

@Repository
public interface MybookRepository extends JpaRepository<MyBook,Long> {

}
