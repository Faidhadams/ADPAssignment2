package za.ac.cput.faidhadams.Set;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class SetTest extends TestCase{
    @Test
    public void testAddToSet() {

        Set<Shoe> set = new HashSet<>();
        ShoeSet function = new ShoeSet(set);
        Shoe shoe = new Shoe();
        shoe.setBrand("Nike");
        function.add(shoe);

        assertTrue(set.contains(shoe));

    }

    @Test
    public void testFindInSet() {

        Set<Shoe> set = new HashSet<>();
        ShoeSet function = new ShoeSet(set);
        Shoe shoe = new Shoe();
        shoe.setBrand("Nike");
        function.add(shoe);


        Shoe foundShoe = function.find("Nike");
        assertEquals(foundShoe,shoe);
        System.out.println(shoe.getBrand());

    }

    @Test
    public void testRemoveFromSet() {

        Set<Shoe> set = new HashSet<>();
        ShoeSet function = new ShoeSet(set);
        Shoe shoe = new Shoe();
        shoe.setBrand("Nike");
        function.add(shoe);

        function.remove(shoe);
        assertFalse(set.contains(shoe));

    }
}
