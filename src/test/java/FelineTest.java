import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {
    @Test
    public void testGetFood() throws Exception {
    Feline feline = new Feline();
    List <String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
    List <String> actual = feline.getFood("Хищник");
    Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetFamilyFeeline()  {
    Feline feline = new Feline();
    String expected = "Кошачьи";
    String actual = feline.getFamily();
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensFeeline()  {
    Feline feline = new Feline();
    int expected = 1;
    int actual = feline.getKittens();
    Assert.assertEquals(expected, actual);

    }

}
