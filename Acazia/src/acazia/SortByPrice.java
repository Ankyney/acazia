package acazia;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        Double price = o1.getPrice() - o2.getPrice();
        if(price > 0){
            return -1;
        }else if(price < 0){
            return 1;
        }
        return 0;
    }
}
