package com.holcomb.sean.recipeapp.repositories;

import com.holcomb.sean.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
