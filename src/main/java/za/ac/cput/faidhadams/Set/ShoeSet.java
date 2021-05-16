package za.ac.cput.faidhadams.Set;

import java.util.HashSet;
import java.util.Set;

public class ShoeSet {
    private Set<Shoe> set;

    public ShoeSet(){

        set= new HashSet<Shoe>(){};
    }

    public ShoeSet(Set<Shoe> set){

        this.set = set;

    }

    public void add(Shoe shoe){

        set.add(shoe);

    }

    public Shoe find(String brand){

        for(Shoe shoe: set){
            if (shoe.getBrand().equals(brand)){
                return shoe;
            }
        }
        return null;
    }

    public void remove(Shoe shoe){

        set.remove(shoe);
    }
}
