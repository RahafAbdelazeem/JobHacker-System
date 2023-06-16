package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements  productprice {


    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid:" + id + ", productname:" + name + ",proodut catedory:" + category + ",productprice:" + price + "}";


    }


    public Product() {
    }

    List<Product> categoryproduct = new ArrayList<>();

    public List<Product> addDummyData() {

        Collections.addAll(categoryproduct, new Product(1, "lenovo", "Electronics", 184.83),
                new Product(2, "iphone", "Electronics", 12.66),
                new Product(3, "non nemo iure", "Grocery", 498.02),
                new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                new Product(5, "animi cum rem", "Games", 458.20),
                new Product(6, "Samsung", "Electronics", 146.52),
                new Product(7, "Harry Potter", "Books", 500),
                new Product(8, "Lord of the Rings", "Books", 1200),
                new Product(9, "voluptatem voluptas aspernatur", "Toys", 536.80),
                new Product(10, "animi cum rem", "Games", 458.20),
                new Product(11, "Dell", "Electronics", 123.65),
                new Product(12, "MacPro", "Electronics", 364.59),
                new Product(13, "CandyCrush", "Games", 34.96),
                new Product(14, "vel libero suscipit", "Toys", 14.36),
                new Product(15, "aspernatur rerum qui", " Books", 656.42),
                new Product(16, "Nike Shoes", "Shoes", 200.36),
                new Product(17, "Oliver", "BabyName", 300.56),
                new Product(18, "Barbie", "Toy", 400.49),
                new Product(19, "Adidas shoes", "Shoes", 500.64),
                new Product(20, "Poma Shoes", "shoes", 600.48),
                new Product(21, "consectetur cupiditate sunt", "Toys", 95.46),
                new Product(22, "itaque ea qui", "Baby", 677.78),
                new Product(23, "ut perferendis corporis", "Grocery", 302.19),
                new Product(24, "doloremque incidunt sed", "Games", 988.49),
                new Product(25, "To Kill a Mockingbird", "Books", 665.34),
                new Product(26, "LEGO", "Toys", 5547),
                new Product(27, "HB", "Electronics", 1006.35),
                new Product(28, "magnam adipisci voluptate", "Grocery", 366.13),
                new Product(29, "Race Master", "Games", 60314.48),
                new Product(30, "Stack Ball", "Games", 2000.36));


        return categoryproduct;
    }


    @Override
    public Product withPrice(double productprice) {
            if (this.price == productprice)
                return this;
            else
                return new Product(this.id, this.name, this.category, productprice);

    }

}

