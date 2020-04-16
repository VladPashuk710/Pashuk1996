package Homework7_part2;

public class Order {
    String date = "16.04.2020";
    String time = "19:00";
    int id = 3;
}

class OrdinaryOrder extends Order {
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}

class ExpressOrder extends Order {
    String courier = "Dmytro";
    int daysToDeliver = (int) 16.04;

    public String toString() {
        return "ExpressOrder{" +
                "courier='" + courier + '\'' +
                ", daysToDeliver=" + daysToDeliver +
                '}';
    }
}

class InsuredOrder extends Order {
    String company = "ALS";
    double amount = 20000.600;

    public String toString() {
        return "InsuredOrder{" +
                "company='" + company + '\'' +
                ", amount=" + amount +
                '}';
    }
}

