package gq.cader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void test_Case() {
        App underwear = new App();
        System.out.println(underwear.poopFace());
        assertTrue(underwear.poopFace().contains("David Wilson"));

    }

    @Test
    public void test_myButt() {

        App underwear = new App();
        assertFalse(underwear.thisIsWhack());
    }
}
