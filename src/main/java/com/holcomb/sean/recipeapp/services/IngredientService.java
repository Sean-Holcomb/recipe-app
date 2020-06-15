package com.holcomb.sean.recipeapp.services;

import com.holcomb.sean.recipeapp.commands.IngredientCommand;
import com.holcomb.sean.recipeapp.domain.Ingredient;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long id);
}
