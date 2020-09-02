package marine.springframework.spring5recipeapp.repositories;

import marine.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Recipe,Long> {
}
