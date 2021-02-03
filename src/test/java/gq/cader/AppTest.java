package gq.cader;

import static org.junit.Assert.assertTrue;
import gq.cader.App;

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

    }
}
