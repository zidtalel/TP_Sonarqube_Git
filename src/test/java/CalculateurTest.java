import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateurTest {
    Calculateur calc = new Calculateur();

    @org.junit.jupiter.api.Test
     void testMultiply1() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = 5;
        b = 3;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : PPos \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
     void testMultiply2() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = 4;
        b = -3;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : PN \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
     void testMultiply3() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = -5;
        b = 2;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : NP\nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }
/*
    @ParameterizedTest
    @CsvFileSource(resources = "dataMul.csv", delimiter = ';', numLinesToSkip = 1)
    public void testMultiplyCSV(String a, String b, String c) {
        int x, y, resultatAttendu;
        String lineSep = "---------------------";
        int expectedResult;
        x = Integer.parseInt(a);
        y = Integer.parseInt(b);
        resultatAttendu = Integer.parseInt(c);
        assertEquals(resultatAttendu, calc.multiply(x, y));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply4() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = -2;
        b = -3;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply5() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = 7;
        b = 0;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply6() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = 0;
        b = 8;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply7() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = 0;
        b = -3;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply8() {
        int a, b, resultatAttendu;
        //Cas de test a et b positifs
        a = -3;
        b = 0;
        resultatAttendu = a * b;
        assertTrue(calc.multiply(a, b) == resultatAttendu,
                "\nCas de test : \nVariable a : " + a +
                        "\nVariable b : " + b + "\nRésultats attendus : "
                        + resultatAttendu + "\nRésultats obtenus : "
                        + calc.multiply(a, b));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/test/dataMul.csv", delimiter = ';', numLinesToSkip = 1)
    public void testMultiplyCSV(String a, String b, String c) {
        int x, y, resultatAttendu;
        String lineSep = "---------------------";
        int expectedResult;
        x = Integer.parseInt(a);
        y = Integer.parseInt(b);
        resultatAttendu = Integer.parseInt(c);
        assertEquals(resultatAttendu, calc.multiply(x, y));
    }

  */
}