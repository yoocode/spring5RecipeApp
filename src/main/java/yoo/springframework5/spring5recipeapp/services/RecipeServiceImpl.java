package yoo.springframework5.spring5recipeapp.services;

import org.springframework.stereotype.Service;
import yoo.springframework5.spring5recipeapp.domain.Recipe;
import yoo.springframework5.spring5recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes(){
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator()
                .forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
