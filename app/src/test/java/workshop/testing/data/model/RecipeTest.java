package workshop.testing.data.model;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class RecipeTest {
    @Test
    public void i_can_read_data_from_water (){
        //arrange
        InputStream inputStream = RecipeTest.class.getResourceAsStream("/recipes/water.txt");

        //act
        Recipe recipe = Recipe.readFromStream(inputStream);

        //assert
        assertNotNull(recipe);
        assertEquals("water", recipe.id);
        assertEquals("Water",recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.",recipe.description);


    }


}