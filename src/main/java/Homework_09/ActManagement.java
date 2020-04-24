package Homework_09;

import Homework_09.hw9.Service;

public class ActManagement extends ServiceAct implements Service {

    public ActManagement(String s) {
        super(s);
    }

    public static void main(String[] args) {
        ActManagement act1 = (ActManagement) getAct("Act#1");
        act1.conclusionOfTheActByNumber("ReplacedOil");
    }

    public static Service getAct(String param) {
        return param.equals("ReplacedOil") ? new ServiceAct("Act #1\n Services:\n 1.Tyres - 300$\n 2.Disks - 150$\n Products:\n 1.Oil - 50$\n 2.ReplacedOil - 70$\n Worker: Boris\n Customer: Vlad") : new ActManagement("Act#1");
    }
}












