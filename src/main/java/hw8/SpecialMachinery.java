package hw8;

class SpecialMachinery extends Car {
    protected String view;
    protected String weight;

    public SpecialMachinery(String mark, String yearOfIssue, String price, String complectation, String manufacturedCountry, String dateOfSale, String nameOfTheBuyer, String view, String weight) {
        super(mark, yearOfIssue, price, complectation, manufacturedCountry, dateOfSale, nameOfTheBuyer);
        this.view = view;
        this.weight = weight;
    }
}