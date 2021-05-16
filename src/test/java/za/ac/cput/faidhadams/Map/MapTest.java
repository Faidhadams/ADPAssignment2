package za.ac.cput.faidhadams.Map;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.faidhadams.Map.Shoe;
import za.ac.cput.faidhadams.Map.ShoeMap;
import java.util.HashMap;
import java.util.Map;

public class MapTest extends TestCase{
    @Test
    public void testAdd() {
        Map<Integer, Shoe> map = new HashMap<>();
        ShoeMap function = new ShoeMap(map);
        Shoe shoe = new Shoe();

        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(1, shoe);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(shoe));
    }

    @Test
    public void testFind() {
        Map<Integer, Shoe> map = new HashMap<>();
        ShoeMap function = new ShoeMap(map);
        Shoe shoe = new Shoe();
        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(1,shoe);

        Shoe foundShoe = function.find(1);
        assertEquals(foundShoe,shoe);
        System.out.println(shoe.getBrand());
    }

    @Test
    public void testRemove() {
        Map<Integer, Shoe> map = new HashMap<>();
        ShoeMap function = new ShoeMap(map);
        Shoe shoe = new Shoe();
        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(1,shoe);

        function.remove(1);
        assertFalse(map.containsKey(1));
    }
}
