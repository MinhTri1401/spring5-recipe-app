package marine.springframework.spring5recipeapp.controllers;


import lombok.extern.slf4j.Slf4j;
import marine.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexControlller {

    private final RecipeService recipeService;

    public IndexControlller(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
