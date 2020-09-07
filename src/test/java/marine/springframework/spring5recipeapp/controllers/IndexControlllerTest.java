package marine.springframework.spring5recipeapp.controllers;

import marine.springframework.spring5recipeapp.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class IndexControlllerTest {
    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    IndexControlller indexControlller;

    @BeforeEach
    void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        indexControlller= new IndexControlller(recipeService);
    }

    @Test
    void getIndexPage() throws Exception{
        String viewName = indexControlller.getIndexPage(model);
        assertEquals("index",viewName);
        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());
    }
}