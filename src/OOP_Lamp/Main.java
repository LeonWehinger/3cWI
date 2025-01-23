package OOP_Lamp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LightElement le1 = new LightElement("Jaydenz", "blue", 0);
        LightElement le2 = new LightElement("Jaydeny", "blue", 0);
        LightElement le3 = new LightElement("Jaydenx", "blue", 0);
        LightElement le4 = new LightElement("Jaydenuwu", "blue", 0);
        LightElement le5 = new LightElement("Jaydenguam", "blue", 0);
        List<LightElement> elementlist = new ArrayList<LightElement>();

        Lamp l1 = new Lamp(elementlist,"black");
        l1.addElement(le1);
        l1.addElement(le2);
        l1.addElement(le3);
        l1.addElement(le4);
        l1.addElement(le5);

        le1.turnOn();
        l1.turnALlOn(elementlist);
        l1.getOverallPowerUsage(elementlist);
        l1.getNamesOfLightelements(elementlist);
    }
}
