package at.leon.projects.OOP;

import java.util.ArrayList;
import java.util.List;

public class remoteMain{

public static void main(String[] args) {

        Battery b1 = new Battery(5);
        Battery b2 = new Battery(100);
        Remote r1 = new Remote("black");

        r1.addBattery(b1);
        r1.addBattery(b2);


        System.out.println(r1.getColor());
        System.out.println(r1.getBatteryList().get(0).getChargingStatus());




    }
}

