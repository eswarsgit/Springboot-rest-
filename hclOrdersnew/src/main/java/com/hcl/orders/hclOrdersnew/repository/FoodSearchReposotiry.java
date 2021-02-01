package com.hcl.orders.hclOrdersnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.orders.hclOrdersnew.entity.Menu;


@Repository
public interface FoodSearchReposotiry extends JpaRepository<Menu, Long> {

	List<Menu> findByItemContains(String foodLike);

}
