package com.order.hclorders.service;

import java.util.List;

import com.order.hclorders.entity.Menu;

public interface FoodSearchService {

	List<Menu> getMenuList(String foodLike);

}
