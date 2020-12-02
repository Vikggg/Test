
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import package2.Ship;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class SimpleTest {
    
    @Test
    public void getAllUsers() {
        
        Ship tanker = new Ship();
        
        assertEquals(10, tanker.getCount());
    }
}
