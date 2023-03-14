package hw17;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private ProductType producttype;
    private double price;
    private  Boolean discountAdd;
    private LocalDate dateAdd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && producttype == product.producttype && Objects.equals(discountAdd, product.discountAdd) && Objects.equals(dateAdd, product.dateAdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producttype, price, discountAdd, dateAdd);
    }

    public Product(ProductType producttype, double price, Boolean discountAdd, LocalDate dateAdd) {
        this.producttype = producttype;
        this.price = price;
        this.discountAdd = discountAdd;
        this.dateAdd = dateAdd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producttype=" + producttype +
                ", price=" + price +
                ", discountAdd=" + discountAdd +
                ", dateAdd=" + dateAdd +
                '}';
    }

    public ProductType getProducttype() {
        return producttype;
    }

    public void setProducttype(ProductType producttype) {
        this.producttype = producttype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getDiscountAdd() {
        return discountAdd;
    }

    public void setDiscountAdd(Boolean discountAdd) {
        this.discountAdd = discountAdd;
    }

    public LocalDate getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDate dateAdd) {
        this.dateAdd = dateAdd;
    }
}
