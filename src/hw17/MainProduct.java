package hw17;

import java.awt.print.Book;
import java.time.LocalDateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static hw17.ProductType.*;

public class MainProduct implements Comparable<Product>{
    public static void main(String[] args) throws Exception {
        List<Product> products = fillProductList();
        System.out.println("Part 1");
        List<Product> bookPrice = products.stream()
                .filter(product -> product.getPrice() > 250)
                .toList();

        System.out.println("bookPrice = " + bookPrice);

        System.out.println("Part 2");

        List<Product> booksDiscount = products.stream()
                .filter(product -> product.getProducttype()== BOOK)
                .filter(product -> true == product.getDiscountAdd())
                .map(product -> new Product(product.getProducttype(), product.getPrice() * 0.9, product.getDiscountAdd(), product.getDateAdd()))
                .toList();

        System.out.println("booksDiscount = " + booksDiscount);

        System.out.println("Part 3");

        Product s = products.stream()
                .filter(product -> product.getProducttype() == BOOK)
                .sorted(Comparator.comparing(Product::getPrice))
                .findFirst()
                .orElseThrow(()-> new Exception("Product not found" + values()));

        System.out.println("s = " + s);

        System.out.println("Part 4");

        products.stream()
                .sorted(Comparator.comparing(Product::getDateAdd).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Part 5");

        double summedNewBook = products.stream()
                .filter(product -> product.getProducttype() == BOOK)
                .filter(product -> !product.getDateAdd().isBefore(LocalDate.of(2023, 01, 01)))
                .filter(product -> product.getPrice() <=75)
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("summedNewBook = " + summedNewBook);
    }




    private static List<Product> fillProductList() {
        List<Product> products = new ArrayList<>();
        Product product = new Product(BOOK,255, true, LocalDate.of(2021,2,13));
        products.add(product);
        product = new Product(BOOK,55, true, LocalDate.of(2023,1,4));
        products.add(product);
        product = new Product(PLATE,25, false, LocalDate.of(2022,4,22));
        products.add(product);
        product = new Product(BOOK,333, true, LocalDate.of(2021,1,4));
        products.add(product);
        product = new Product(BOOK,54, true, LocalDate.of(2023,1,4));
        products.add(product);
        product = new Product(BOOK,211, false, LocalDate.of(2021,2,11));
        products.add(product);
        product = new Product(PHONE,700, true, LocalDate.of(2020,3,4));
        products.add(product);
        product = new Product(MONITOR,560, true, LocalDate.of(2022,12,12));
        products.add(product);
        product = new Product(PHONE,1255, true, LocalDate.of(2022,9,14));
        products.add(product);
        product = new Product(FRUIT,55, false, LocalDate.of(2023,3,11));
        products.add(product);
        product = new Product(PLATE,25, true, LocalDate.of(2022,9,20));
        products.add(product);
        product = new Product(BOOK,70, true, LocalDate.of(2023,1,4));
        products.add(product);
        return  products;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
