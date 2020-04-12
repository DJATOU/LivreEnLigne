package ecole.bookStore.onlineBookstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ecole.bookStore.onlineBookstore.entity.BookCategory;


@RepositoryRestResource(collectionResourceRel="bookCateogry", path="book-category")
@CrossOrigin("*")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}