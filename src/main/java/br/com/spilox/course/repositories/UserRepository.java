package br.com.spilox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spilox.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
