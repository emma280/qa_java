import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testGetKittensLion() throws Exception {
        int expectedResult = 1;
        Lion lion = new Lion("Самец", feline);

        Mockito.when(feline.getKittens()).thenReturn(expectedResult);
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetFoodLion() throws Exception {
    Lion lion = new Lion("Самка",feline);
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> expected = Arrays.asList("Животные","Птицы", "Рыба");
    List<String> actual = lion.getFood();
    Assert.assertEquals(expected, actual);
    }
}
