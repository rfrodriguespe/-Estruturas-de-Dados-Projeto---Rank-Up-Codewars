import static org.junit.Assert.*;
import org.junit.*;

public class PrimeDecompTest { 
    @Test
    public void testPrimeDecompOne() {
        int lst = 210;        
        assertEquals(
            "(2)(3)(5)(7)",
            kata5kyu.PrimeDecomp.factors(lst));
    }
}