package football;

import java.util.ArrayList;

public class Refrigerator {

    public ArrayList<Beer> beerArr = new ArrayList<Beer>();

    public void AddBeer(Beer val){
        beerArr.add(val);
    }

    public Beer Remove(){
        if (beerArr.size() > 0){
            int i = beerArr.size()-1;
            Beer beerQty= beerArr.get(i);
            beerArr.remove(i);
            return beerQty;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}
