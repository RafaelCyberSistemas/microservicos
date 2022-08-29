package br.com.rafael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	Book findBookById(Long id);

}
