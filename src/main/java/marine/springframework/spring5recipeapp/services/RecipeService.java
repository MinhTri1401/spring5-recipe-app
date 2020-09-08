package marine.springframework.spring5recipeapp.services;

import marine.springframework.spring5recipeapp.commands.RecipeCommand;
import marine.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
