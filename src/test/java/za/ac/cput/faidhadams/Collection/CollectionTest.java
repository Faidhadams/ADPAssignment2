package za.ac.cput.faidhadams.Collection;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;

public class CollectionTest extends TestCase{
    @Test
    public void testAdd() {
        ArrayList<Shoe> collection = new ArrayList<>();
        ShoeCollection function = new ShoeCollection(collection);
        Shoe shoe = new Shoe();

        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(shoe);
        assertTrue(collection.contains(shoe));
    }

    @Test
    public void testFind() {
        ArrayList<Shoe> collection = new ArrayList<>();
        ShoeCollection function = new ShoeCollection(collection);
        Shoe shoe = new Shoe();

        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(shoe);

        Shoe foundBrand = function.find("Nike");
        assertEquals(foundBrand,shoe);
        System.out.println(shoe.getBrand());
    }

    @Test
    public void testRemove() {
        ArrayList<Shoe> collection = new ArrayList<>();
        ShoeCollection function = new ShoeCollection(collection);
        Shoe shoe = new Shoe();

        shoe.setBrand("soap");
        shoe.setStyle("Drummond");
        function.add(shoe);

        function.remove(shoe);
        assertFalse(collection.contains(shoe));
    }
}
