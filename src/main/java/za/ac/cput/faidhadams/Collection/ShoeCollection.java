package za.ac.cput.faidhadams.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ShoeCollection {
        private Collection <Shoe> collection;

        public ShoeCollection(){

            collection = new ArrayList();
        }

        public ShoeCollection(ArrayList <Shoe> collection){
            this.collection = collection;

        }

        public void add(Shoe shoe){
            collection.add(shoe);

        }

        public Shoe find(String brand){
            for(Shoe shoe : collection){
                if (shoe.getBrand().equals(brand)){
                    return shoe;
                }
            }
            return null;
        }

        public void remove(Shoe id){

            collection.remove(id);
        }
}
