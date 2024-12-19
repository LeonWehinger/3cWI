package at.leon.projects.OOP;

import java.util.ArrayList;
import java.util.List;

public class remoteMain{

public static void main(String[] args) {

        Battery b1 = new Battery(100);
        Battery b2 = new Battery(100);

        Remote r1 = new Remote("black");
        r1.addBattery(b1);
        r1.addBattery(b2);


    r1.getBattery().get(0).getChargingStatus();
        r1.getBattery().get(1).getChargingStatus();
        r1.getColor();


    }
}

