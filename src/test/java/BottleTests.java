import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTests {

    Bottle bottle;

    @Before
    public void before () {
        bottle = new Bottle(100);
    }

    @Test
    public void hasVolume () {
        assertEquals( 100, bottle.volume);
    }

    @Test
    public void canDrink () {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void canEmpty () {
        assertEquals(0,0);
    }

    @Test public void canFill () {
        bottle = new Bottle(0);
        assertEquals(100, bottle.fill() );
    }
}
