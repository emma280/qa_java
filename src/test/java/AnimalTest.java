import com.example.Animal;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {


    @Test(expected = Exception.class)
    public void TestGetFood() throws Exception {
        Animal animal = new Animal();
        animal.getFood("dkgjdk");
    }

    @Test
    public void TestGetFamily()  {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected,actual);
    }
}

