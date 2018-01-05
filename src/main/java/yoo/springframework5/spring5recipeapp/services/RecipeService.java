package yoo.springframework5.spring5recipeapp.services;

import yoo.springframework5.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
