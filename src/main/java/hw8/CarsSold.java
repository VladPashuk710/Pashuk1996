package hw8;

abstract class CarsSold extends Car {

    public static void main(String[] args) {
        Car usedCar = new Car();
        Car sportCar = new Car();
        Car specialMachinery = new Car();
        Car Gelentwagen = new Car();

        usedCar.show("usedCar", "sportCar", "specialMachinery");
        sportCar.show("usedCar", "sportCar", "specialMachinery");
        specialMachinery.show("usedCar", "sportCar", "specialMachinery");
        Gelentwagen.add("Gelentwagen");

        System.out.println("usedCar");
        System.out.println("sportCar");
        System.out.println("specialMachinery");
        System.out.println("Gelentwagen");
    }
}
