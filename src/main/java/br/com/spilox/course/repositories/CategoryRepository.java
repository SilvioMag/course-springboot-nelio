package br.com.spilox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spilox.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
