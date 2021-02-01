package com.hcl.orders.hclOrdersnew.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.orders.hclOrdersnew.entity.Menu;
import com.hcl.orders.hclOrdersnew.repository.FoodSearchReposotiry;
import com.hcl.orders.hclOrdersnew.service.FoodSearchService;


@Service
public class FoodSearchServiceImpl implements FoodSearchService{

	@Autowired
	FoodSearchReposotiry foodRepo;
	@Override
	public List<Menu> getMenuList(String foodLike) {
		return foodRepo.findByItemContains(foodLike);// TODO Auto-generated method stub
		
	}

}
