package acazia;

public class Category {
    private String name;
    private String tag;

    public Category(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
