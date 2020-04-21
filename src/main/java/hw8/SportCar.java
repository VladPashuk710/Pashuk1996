package hw8;

class SportCar extends Car {
    protected String maxSpeed;
    protected String engineVolume;
    protected String power;

    public SportCar(String mark, String yearOfIssue, String price, String complectation, String manufacturedCountry, String dateOfSale, String nameOfTheBuyer, String maxSpeed, String engineVolume, String power) {
        super(mark, yearOfIssue, price, complectation, manufacturedCountry, dateOfSale, nameOfTheBuyer);
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.power = power;
    }
}
