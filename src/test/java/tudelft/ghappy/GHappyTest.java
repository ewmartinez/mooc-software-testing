package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {


    @ParameterizedTest(name = "{0} : input({1}),result({2})")
    @CsvSource({
            //Ejemplos
            "'Ejemplos','xxggxx', True","'Ejemplos','xxgxx',False" ,"'Ejemplos','xxggyygxx',False"
            ,"'Ejemplos','gdgdgd', False"
            // No tiene happy g
            ,"'Ninguno','asdfsadf', False", "'Ninguno','',False"
            // Al menos 1
            ,"'Tiene','abXggZdx',True","'Tiene','aggasdgg',True","'Tiene','ggd',True"
            ,"'Tiene','ggdggdgdggdgsggd',False","'Tiene','gdgdggd',False"
            // Todos
            ,"'Todos','gg',True","'Todos','ggg',True","'Todos','gggggggg',True"
    })
    public void GHappyTest (String partition, String data, Boolean expected){
        GHappy m = new GHappy();
        Boolean actual = m.gHappy(data);
        if(expected)
            Assertions.assertTrue(actual);
        else
            Assertions.assertFalse(actual);

    }
}
