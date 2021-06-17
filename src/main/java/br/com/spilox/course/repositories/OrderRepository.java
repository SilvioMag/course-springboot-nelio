package br.com.spilox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spilox.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
