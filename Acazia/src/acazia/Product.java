package acazia;

public class Product {
    private String name;
    private String categoryTag;
    private Double price;

    public Product(String name, String categoryTag, Double price) {
        this.name = name;
        this.categoryTag = categoryTag;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", categoryTag='" + categoryTag + '\'' +
                ", price=" + price +
                '}';
    }

    public void xuat(){
        System.out.printf("Tên : %s - Thể loại sp: %s - Đơn giá %s",name,categoryTag,price );
    }
}
