package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class GHappyTest {
    @ParameterizedTest(name = "str{0}, result={1}")
    @CsvSource({"xxggxxx, true", "ggxxxx, true", "xxxxxxgg, true"})
    public void twoGNormal(String str, boolean expectedResult) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "str{0}, result={1}")
    @CsvSource({"xxggxxgx, false", "gxxxggxgg, false", "xxgxxxxgg, false", "gxxxxxxxg, false"})
    public void fewGNotNormal(String str, boolean expectedResult) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
