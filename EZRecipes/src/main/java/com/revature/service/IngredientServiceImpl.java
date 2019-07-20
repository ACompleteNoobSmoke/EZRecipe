package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.IngredientRepository;

@Service("ingredientService")
public class IngredientServiceImpl implements IngredientService {
	private IngredientRepository ingredientRepository;

	@Autowired
	public IngredientServiceImpl(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}
	public void setIngredientRepo(IngredientRepository ingredientRepository) {
		this.ingredientRepository=ingredientRepository;
	}
}
