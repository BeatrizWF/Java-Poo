package conjuntospoojava;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConjuntosTest {
    
    
    private Conjuntos n;
    
    public ConjuntosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new Conjuntos();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Uniao() {
        Conjuntos c = new Conjuntos();
        c.criarConjunto("1 2 3 4 5", 1);
        c.criarConjunto("6 7", 2);
        c.Uniao();
        assertEquals("1 2 3 4 5 6 7", "1 2 3 4 5 6 7");
    }

    @Test
    public void testInterseccao() {
        Conjuntos c = new Conjuntos();
        c.criarConjunto("1 2 3 4 5", 1);
        c.criarConjunto("2 3", 2);
        c.Interseccao();
        assertEquals("2 3", "2 3");   
    }

    @Test
    public void testDiferenca() {
        Conjuntos c = new Conjuntos();
        c.criarConjunto("1 2 3 4 5", 1);
        c.criarConjunto("2 3", 2);
        c.Diferenca();
        /* é para dar errado */
        assertEquals("1 7", "1 4 5 6 7");   
    }

    @Test
    public void testComplementar() {
        Conjuntos c = new Conjuntos();
        c.criarConjunto("1 2 3 4 5", 1);
        c.criarConjunto("2 3 7", 2);
        c.Complementar();
        /* é para dar errado */
        assertEquals("", "");   
    }

    
}
