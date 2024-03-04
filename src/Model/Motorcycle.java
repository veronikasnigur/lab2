package Model;

public class Motorcycle {
    private String brand;
    private String mark;
    private double price;

    public Motorcycle(String brand, String mark, double price) {
        this.brand = brand;
        this.mark = mark;
        this.price = price;
    }
    // Getters and Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getMark() { return mark; }
    public void setMark(String mark) { this.mark = mark; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

