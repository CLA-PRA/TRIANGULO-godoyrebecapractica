package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Triangulo t;
    String valor;
    @BeforeAll public static void setUp() {
        t = new Triangulo();
    }


    @Test public void testVerifica() {
         assertTrue(t.verifica(2,2,2)=="Equilatero");
         assertTrue(t.verifica(2,2,3)=="Isosceles");
         assertTrue(t.verifica(2,3,4)=="Escaleno");
    }

}
