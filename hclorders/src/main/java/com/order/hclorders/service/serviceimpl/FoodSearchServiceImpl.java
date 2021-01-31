package com.order.hclorders.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.hclorders.entity.Menu;
import com.order.hclorders.repository.FoodSearchReposotiry;
import com.order.hclorders.service.FoodSearchService;

@Service
public class FoodSearchServiceImpl implements FoodSearchService{

	@Autowired
	FoodSearchReposotiry foodRepo;
	@Override
	public List<Menu> getMenuList(String foodLike) {
		return foodRepo.findByItemContains(foodLike);// TODO Auto-generated method stub
		
	}

}
