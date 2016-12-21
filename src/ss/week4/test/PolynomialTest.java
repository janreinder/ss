package ss.week4.test;

import org.junit.Before;
import org.junit.Test;
import ss.week4.math.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class PolynomialTest {
    private double[] arrinput = new double[4];
    private Polynomial pol1;
    
    private static final double DELTA = 1e-15;
    private static final double CONSTANT_VALUE = Math.PI;
    
    @Before
    public void setUp() {
        for(int i = 0; i < 4; i++) {
            arrinput[i] = 2;
            //System.out.println(Double.toString(arrinput[i]));
        }
        
        pol1 = new Polynomial(arrinput);
        //System.out.println(pol1.toString());
    }

    @Test
    public void testApply() {
        assertEquals((2*arrinput.length), pol1.apply(1), DELTA);
        assertEquals(30, pol1.apply(2), DELTA);
        assertEquals(pol1.apply(-1), (2 + 2*(-1 + 1 + -1)), DELTA);
    }
    
    
    @Test
    public void testDerivative() {
        assertTrue(pol1.derivative() instanceof Polynomial);
        assertEquals(34, pol1.derivative().apply(2), DELTA);
        pol1.derivative();
        System.out.println(pol1.derivative().toString());
        //assertTrue(constant.derivative() instanceof Constant);
        //assertEquals(0.0, constant.derivative().apply(0), DELTA);
    }
    
    @Test
    public void testIntegrand() {
        assertTrue(pol1.integrand() instanceof Polynomial);
        assertEquals(73.5, pol1.integrand().apply(3), DELTA);
        
        pol1.integrand();
        System.out.println(pol1.integrand().toString());
    }
    
    
    
    
}