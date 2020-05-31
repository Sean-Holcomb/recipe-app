package com.holcomb.sean.recipeapp.controllers;

import com.holcomb.sean.recipeapp.domain.Recipe;
import com.holcomb.sean.recipeapp.repositories.CategoryRepository;
import com.holcomb.sean.recipeapp.repositories.RecipeRepository;
import com.holcomb.sean.recipeapp.repositories.UnitOfMeasureRepository;
import com.holcomb.sean.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
public class IndexController {
private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
