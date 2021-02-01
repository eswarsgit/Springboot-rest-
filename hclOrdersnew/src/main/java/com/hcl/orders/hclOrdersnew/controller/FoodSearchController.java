package com.hcl.orders.hclOrdersnew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.orders.hclOrdersnew.entity.Menu;
import com.hcl.orders.hclOrdersnew.service.FoodSearchService;


@RestController
@RequestMapping("/ListMenu")
public class FoodSearchController {
	
	@Autowired
	FoodSearchService foodService;
	
	@GetMapping("")
	public List<Menu> getMenuList(@RequestParam String foodLike) {
	return foodService.getMenuList(foodLike);

}
}
