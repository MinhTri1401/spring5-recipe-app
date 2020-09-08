package marine.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    public Long id;
    public String description;
    public BigDecimal amount;
    public UnitOfMeasureCommand unitOfMeasure;
}
