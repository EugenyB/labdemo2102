package main;

public class Car {
    private int id;
    private String model;
    private int year;
    private int price;
    private String number;

    public Car(int id, String model, int year, int price, String number) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.number = number;
    }

    public Car(int id, String model, int year, int price) {
        this(id, model, year, price, "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }
}
