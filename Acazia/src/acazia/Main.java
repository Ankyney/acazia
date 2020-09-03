package acazia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Category> lsp = new ArrayList<>();
        lsp.add(new Category("tu lanh", "tl"));
        lsp.add(new Category("may tinh", "mt"));


        ArrayList<Product> sp = new ArrayList<>();
        sp.add(new Product("may tinh macbook", "mt", 36.1));
        sp.add(new Product("may tinh dell", "mt", 17.1));
        sp.add(new Product("may tinh asus", "mt", 16.1));
        sp.add(new Product("may tinh lenovo", "mt", 15.1));
        sp.add(new Product("tu lanh aaaa", "tl", 8.1));
        sp.add(new Product("tu lanh cici", "tl", 5.1));

        sp.add(new Product("tu lanh xxu", "tl", 9.8));
        sp.add(new Product("tu lanh ppip", "tl", 5.8));
        sp.add(new Product("tu lanh biii", "tl", 3.8));


        Scanner timsp = new Scanner(System.in);
        System.out.println("Hãy chọn tag bạn muốn hiển thị :");
        String tag = timsp.nextLine();
        if (tag.equalsIgnoreCase("mt")) {
            for (Product x : sp) {
                if (x.getCategoryTag().equalsIgnoreCase("mt")) {
                    x.xuat();
                    System.out.println();
                }
            }
        } else if (tag.equalsIgnoreCase("tl")) {
            for (Product x : sp) {
                if (x.getCategoryTag().equalsIgnoreCase("tl")) {

                    x.xuat();
                    System.out.println();
                }
            }

        } else {
            System.out.println("Không tìm thấy kết quả tương ứng");
        }

        System.out.println();
        System.out.println("-------------------------------------");

        System.out.println("Tất cả sản phẩm trước khi sắp xếp (không phải theo tags): ");
        for (Product x : sp) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Sắp xếp theo tên sản phẩm tăng dần (không phải theo tags):");
        Collections.sort(sp, new SortByName());//sắp xếp theo tiêu trí đc đưa ra trong phương thức
        for(Product x : sp){
            System.out.println(x);
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Sắp xếp theo giá sản phẩm giảm dần (không phải theo tags): ");
        Collections.sort(sp, new SortByPrice());//sắp xếp theo tiêu trí đc đưa ra trong phương thức
        for(Product x : sp){
            System.out.println(x);
        }

    }


}







