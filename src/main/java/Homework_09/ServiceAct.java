package Homework_09;

import Homework_09.hw9.Service;

public class ServiceAct extends Product implements Service {
    int priceOfWork = 1200;
    int priceOfTyres = 300;
    int priceOfDisks = 150;
    String worker = "Boris";

    public ServiceAct(String s) {
        super();
    }

    public static void addAct() {
        System.out.println("Замена масла");
    }

    public static void closeAct() {
        System.out.println("Оплата");
    }

    public static void searchByWorker() {
        System.out.println("Boris");
    }

    public static void searchByCustomer() {
        System.out.println("Vlad");
    }

    public static void conclusionOfTheActByNumber(String newAct) {
        System.out.println("Act #1\n Services:\n 1.Tyres - 300$\n 2.Disks - 150$\n Products:\n 1.Oil - 50$\n 2.ReplacedOil - 70$\n Worker: Boris\n Customer: Vlad");
    }

    public void perform() {
    }
}
