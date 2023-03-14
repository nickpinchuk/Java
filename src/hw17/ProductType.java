package hw17;

public enum ProductType {
    FRUIT("Fruit"),
    BOOK("Book"),
    PHONE("Phone"),
    PLATE("Plate"),
    MONITOR("Monitor");
    ProductType(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
