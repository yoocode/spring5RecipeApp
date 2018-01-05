package yoo.springframework5.spring5recipeapp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

    //setup Category incidence
    private Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void getIdTest() throws Exception {
        Long testId = 4L;
        category.setId(testId);

        Assert.assertEquals(testId, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }

}