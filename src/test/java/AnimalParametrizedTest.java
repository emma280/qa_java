import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {

    private final String animalKind;
    private final List<String> animalFood;

    public AnimalParametrizedTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}

        };
    }

    @Test
    public void getFoodMethodDefiniteAnimalKindBranches() throws Exception {
        Animal animal = new Animal();
        assertEquals(animal.getFood(animalKind), animalFood);
    }

}
