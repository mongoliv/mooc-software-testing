package tudelft.caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "message{0}, shift{1}, result={2}")
    @CsvSource({"abc, 3, def", "xyz, 3, abc", "nnnn, 1, oooo"})
    public void simpleTest(String str, int shift, String expectedResult) {
        CaesarShiftCipher sha = new CaesarShiftCipher();
        String result = sha.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "message{0}, shift{1}, result={2}")
    @CsvSource({"abcK, 3, invalid", "1xyz2, 4, invalid", "hello, 1, ifmmp"})
    public void invalidMessageTest(String str, int shift, String expectedResult) {
        CaesarShiftCipher sha = new CaesarShiftCipher();
        String result = sha.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
