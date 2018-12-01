package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest(name = "{0} : input({1}),expected({2})")
    @CsvSource({
            // Tiene al menos 1 mirror
            "'Al menos 1','abXYZza','a'","'Al menos 1','abXYYZba','ab'"
            // Ninguno
            ,"'Ninguno','abXYZdx',''","'Vacío','',''"
            // Todos
            ,"'Todos','abXYXba','abXYXba'","'Todos','abXYYXba','abXYYXba'"
    })
    public void mirrorTest(String partition, String data, String expected){
        Mirror m = new Mirror();
        String actual = m.mirrorEnds(data);
        Assertions.assertEquals(expected, actual);
    }
}