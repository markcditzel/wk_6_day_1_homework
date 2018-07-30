import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTests {

    Calculator calculator;

    @Before
    public void before () {
        calculator = new Calculator(40, 10);
    }


    @Test
    public void canAdd (){
        assertEquals(50, calculator.add(), 0);
    }

    @Test
    public void canSubtract (){
        assertEquals(30, calculator.subtract(), 0);
    }

    @Test
    public void canDivide (){
        assertEquals(4, calculator.divide(), 0);
    }

    @Test
    public void canMultiply (){
        assertEquals(400, calculator.multiply(), 0);
    }



}
