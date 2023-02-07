package es.uji.al342129.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    es.uji.al342129.test.Test miTest;

    @BeforeEach 
        // setup de las pruebas --> se ejecuta antes de cada test -->
        // asegura que es una instancia limpia i.e. que no tiene otros atributos asignados -->
        // se usa si lo necesito en todos los tests
    void setUp() {
        miTest = new es.uji.al342129.test.Test();
    }

    @AfterEach //despues de cada test -->
    void tearDown() {
       miTest = new es.uji.al342129.test.Test();
    }

    @Test
    void siempreUno() {
        miTest = new es.uji.al342129.test.Test();
        assertEquals(1, miTest.siempreUno());
    }
}