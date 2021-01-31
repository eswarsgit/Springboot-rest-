package com.order.hclorders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.hclorders.entity.Menu;

@Repository
public interface FoodSearchReposotiry extends JpaRepository<Menu, Long> {

	List<Menu> findByItemContains(String foodLike);

}
