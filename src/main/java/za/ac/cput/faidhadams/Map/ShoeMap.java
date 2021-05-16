package za.ac.cput.faidhadams.Map;

import java.util.*;

public class ShoeMap {
    private Map<Integer, Shoe> map;

    public ShoeMap(){

        map= new HashMap<>();
    }

    public ShoeMap(Map<Integer, Shoe> map){
        this.map = map;

    }

    public void add(int num, Shoe shoe){
        map.put(num,shoe);

    }

    public Shoe find(int num){

        return map.get(num);
    }

    public void remove(int num){
        map.remove(num);
    }
}
