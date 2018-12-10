package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Integer.valueOf;

public class TwoNumbersSumTest {

    @ParameterizedTest(name = "{0} : input ({1},{2}), result({3})")
    @CsvSource({"Primero, 1, 10, 11", "Primero, 5, 5, 10", "Primero, 6, 7, 13", "Primero, 10, 10, 20"})
    public void testTwoNumbersArray(String partition, String first, String second, String spected){

        ArrayList<Integer> firstL = chargeToList(first);
        ArrayList<Integer> secondL = chargeToList(second);

        TwoNumbersSum rNumberSum = new TwoNumbersSum();
        ArrayList <Integer> actual = rNumberSum.addTwoNumbers(firstL, secondL);

        Assertions.assertEquals(chargeToList(spected), actual);
    }

    private static ArrayList<Integer> chargeToList(String str){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            list.add(valueOf(c.toString()));
        }
        return list;
    }
}
