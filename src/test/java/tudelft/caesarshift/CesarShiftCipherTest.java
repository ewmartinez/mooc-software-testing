package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CesarShiftCipherTest {


    @ParameterizedTest(name = "{0} : input({1},{2}),result({3})")
    @CsvSource({
            //Validos
            "'Validos','abc', 3, 'def'", "'Validos','xyz', 3, 'abc'" ,"'Validos','hola', 5, 'mtqf'"
            , "'Validos','abc', 29, 'def'", "'Validos','xyz', 29, 'abc'" ,"'Validos','hola', 31, 'mtqf'"
            //Inválidos
            ,"'Invalidos','Abcxyz', 3, 'invalid'", "'Invalidos','abc xyz', 3, 'invalid'"
    })
    public void CesarShiftCipherTest(String partition, String input, int shift, String expected){
        CesarShiftCipher sc = new CesarShiftCipher();
        String current = sc.CesarShiftCipher(input, shift);

        Assertions.assertEquals(expected, current);

    }
}
