import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}

public class Ques3 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Abc", 200.0, "KKK"));
        list.add(new Product(2, "Agc", 210.0, "YYY"));
        list.add(new Product(3, "Hyc", 23.0, "YYY"));
        list.add(new Product(4, "Gtc", 21.0, "KKK"));
        list.add(new Product(5, "Yre", 123.0, "TTT"));

        //#1
        List<String> collect = list.stream()
                .filter(x -> x.getPrice() < 100)
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println(collect);


        //#2
        List<Product> collect1 = list.stream().map(
                product -> {
                    double discount = product.getPrice() * 0.80;
                    product.setPrice(Math.round(discount));
                    return product;
                }
        ).collect(Collectors.toList());

        System.out.println(collect1);

        //#3

        Double collect2 = list.stream()
                .mapToDouble(Product :: getPrice)
                .average()
                .getAsDouble();

        System.out.println(collect2);

        //#4
        Product product = list.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .findFirst()
                .get();
        
        //or
        Product product1 = list.stream()
                .min((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .get();

        System.out.println(product1);


    }
}
