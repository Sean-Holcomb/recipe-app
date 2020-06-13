package com.holcomb.sean.recipeapp.services;

import com.holcomb.sean.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
