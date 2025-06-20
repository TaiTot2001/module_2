package ProductManagement;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product() {
    }

    public Product(String code, String name, double price, String manufacturer, String description) {
        this.setCode(code);
        this.setName(name);
        this.setPrice(price);
        this.setManufacturer(manufacturer);
        this.setDescription(description);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-14s %-14s %-10s", code, name, price, manufacturer, description);
    }
}
