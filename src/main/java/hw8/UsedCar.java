package hw8;

class UsedCar extends Car {
    protected String carMileage;
    protected String ownersName;

    public UsedCar(String mark, String yearOfIssue, String price, String complectation, String manufacturedCountry, String dateOfSale, String nameOfTheBuyer, String carMileage, String ownersName) {
        super(mark, yearOfIssue, price, complectation, manufacturedCountry, dateOfSale, nameOfTheBuyer);
        this.carMileage = carMileage;
        this.ownersName = ownersName;
    }
}
