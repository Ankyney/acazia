package acazia;



import java.util.Comparator;

public class SortByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        String sp1 = o1.getName().substring(o1.getName().lastIndexOf(" "));
        String sp2 = o2.getName().substring(o2.getName().lastIndexOf(" "));


        return sp1.compareTo(sp2);
    }

}
