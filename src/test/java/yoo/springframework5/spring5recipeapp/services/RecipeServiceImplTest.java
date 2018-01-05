package yoo.springframework5.spring5recipeapp.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import yoo.springframework5.spring5recipeapp.domain.Recipe;
import yoo.springframework5.spring5recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    //need to have recipeService incidence
    RecipeServiceImpl recipeService;

    //need to have recipeRepository incidence
    @Mock
    RecipeRepository recipeRepository;

    //setUp method to provide recipeRepository incidence by Mockito instead of Jpa

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception {

        //make a list of recipes
        Recipe recipe1 = new Recipe();
        HashSet<Recipe> recipeData = new HashSet<>();
        recipeData.add(recipe1);

        //asking Mockito to return recipeData when recipeService.getRecipes() is called
        when(recipeService.getRecipes()).thenReturn(recipeData);

        Set recipes = recipeService.getRecipes();//= recipeData
        assertEquals(1, recipes.size());





    }

}