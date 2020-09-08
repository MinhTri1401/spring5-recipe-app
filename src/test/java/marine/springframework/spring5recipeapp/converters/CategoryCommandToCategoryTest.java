package marine.springframework.spring5recipeapp.converters;

import marine.springframework.spring5recipeapp.commands.CategoryCommand;
import marine.springframework.spring5recipeapp.domain.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
class CategoryCommandToCategoryTest {
    public static Long ID_VALUE = new Long(1L);
    public static final String DESCRIPTION = "description";
    CategoryCommandToCategory converter;

    @BeforeEach
    void setUp() {

    converter= new CategoryCommandToCategory();

    }

    @Test
    void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new CategoryCommand()));
    }

    @Test
    void convert() throws Exception {
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID_VALUE);
        categoryCommand.setDescription(DESCRIPTION);

        Category category=converter.convert(categoryCommand);

        assertEquals(category.getId(),ID_VALUE);
        assertEquals(category.getDescription(),DESCRIPTION);
    }
}