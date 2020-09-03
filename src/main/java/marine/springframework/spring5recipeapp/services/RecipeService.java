package marine.springframework.spring5recipeapp.services;

import marine.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
