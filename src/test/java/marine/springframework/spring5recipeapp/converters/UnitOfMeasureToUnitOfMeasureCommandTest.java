package marine.springframework.spring5recipeapp.converters;

import marine.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;
import marine.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class UnitOfMeasureToUnitOfMeasureCommandTest {

    public static final String DESCRIPTION = "description";
    public static final Long LONG_VALUE = new Long(1L);

    UnitOfMeasureToUnitOfMeasureCommand converter;

    @BeforeEach
    void setUp() {
        converter = new UnitOfMeasureToUnitOfMeasureCommand();
    }
    @Test
    public void testNullObjectConvert() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObj() throws Exception {
        assertNotNull(converter.convert(new UnitOfMeasure()));
    }
    @Test
    void convert() throws Exception {
        //given
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(LONG_VALUE);
        uom.setDescription(DESCRIPTION);
        //when
        UnitOfMeasureCommand uomc = converter.convert(uom);

        //then
        assertEquals(LONG_VALUE, uomc.getId());
        assertEquals(DESCRIPTION, uomc.getDescription());
    }
}