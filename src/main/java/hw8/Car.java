package hw8;

public class Car {
    protected String mark;
    protected String yearOfIssue;
    protected String price;
    protected String complectation;
    protected String manufacturedCountry;
    protected String dateOfSale;
    protected String nameOfTheBuyer;

    public Car(String mark, String yearOfIssue, String price, String complectation, String manufacturedCountry, String dateOfSale, String nameOfTheBuyer) {
        this.mark = mark;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        this.complectation = complectation;
        this.manufacturedCountry = manufacturedCountry;
        this.dateOfSale = dateOfSale;
        this.nameOfTheBuyer = nameOfTheBuyer;
    }

    public Car() {
    }

    public void show(String usedCar, String sportCar, String specialMachinery) {
    }

    public void add(String gelentwagen) {
    }
}
