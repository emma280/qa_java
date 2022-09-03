import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void testGetSoundCat() {
    Cat cat = new Cat(feline);
    String expected = "Мяу";
    String actual = cat.getSound();
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodCat() throws Exception {

    Cat cat = new Cat(feline);
    Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> expected = Arrays.asList("Животные","Птицы", "Рыба");
    List<String> actual = cat.getFood();
    Assert.assertEquals(expected, actual);
    }
}
