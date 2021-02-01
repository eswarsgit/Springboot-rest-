package com.hcl.orders.hclOrdersnew.service;

import java.util.List;

import com.hcl.orders.hclOrdersnew.entity.Menu;


public interface FoodSearchService {

	List<Menu> getMenuList(String foodLike);

}
