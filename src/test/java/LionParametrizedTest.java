import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    @Mock
    Feline mockFeline;

    private final boolean hasMane;
    private final String sex;

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] haveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeMethodDefiniteSex() throws Exception {
        Lion lion = new Lion(sex, mockFeline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(actualResult, hasMane);
    }
}


