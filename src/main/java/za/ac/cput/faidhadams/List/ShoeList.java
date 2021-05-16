package za.ac.cput.faidhadams.List;

import java.util.ArrayList;
import java.util.List;

public class ShoeList {
    private List<Shoe>list;

    public ShoeList(){

        list = new ArrayList<Shoe>(){};
    }

    public ShoeList(List<Shoe>list){

        this.list = list;
    }

    public void add(Shoe shoe){

        list.add(shoe);
    }

    public Shoe find(String shoeName){
        for(Shoe shoe: list){
            if (shoe.getBrand().equals(shoeName)){
                return shoe;
            }
        }
        return null;
    }

    public void remove(Shoe shoe){

        list.remove(shoe);
    }
}
