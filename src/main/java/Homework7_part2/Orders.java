package Homework7_part2;

import java.util.ArrayList;

public class Orders {
    private static void show(Orders ordinaryOrder) {
    }

    public Orders(String ordinaryOrder) {
    }

    public static void main(String[] args) {
        ArrayList<Orders> orders = new ArrayList<Orders>();
        Orders order1 = new Orders("OrdinaryOrder");
        Orders order2 = new Orders("ExpressOrder");
        Orders order3 = new Orders("InsuredOrder");
        orders.add(new Orders("OrdinaryOrder"));
        orders.add(new Orders("ExpressOrder"));
        orders.add(new Orders("InsuredOrder"));
        show(new Orders("OrdinaryOrder"));
        show(new Orders("ExpressOrder"));
        show(new Orders("InsuredOrder"));
    }
}


