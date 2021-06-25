package br.com.spilox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spilox.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
