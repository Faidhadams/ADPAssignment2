package za.ac.cput.faidhadams.List;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.faidhadams.Collection.Shoe;
import za.ac.cput.faidhadams.Collection.ShoeCollection;
import java.util.ArrayList;

public class ListTest extends TestCase{
    @Test
    public void testAdd() {
        ArrayList<Shoe> list = new ArrayList<>();
        ShoeCollection function = new ShoeCollection(list);
        Shoe shoe = new Shoe();

        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(shoe);
        assertTrue(list.contains(shoe));
    }

    @Test
    public void testFind() {
        ArrayList<Shoe> list = new ArrayList<>();
        ShoeCollection function = new ShoeCollection(list);
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
        ArrayList<Shoe> list = new ArrayList<>();
        ShoeCollection function = new ShoeCollection(list);
        Shoe shoe = new Shoe();

        shoe.setBrand("Nike");
        shoe.setStyle("Air Jordan");
        function.add(shoe);

        function.remove(shoe);
        assertFalse(list.contains(shoe));
    }
}
