package OOP_Lamp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LightElement le1 = new LightElement("Jaydenz", "blue", 10);
        LightElement le2 = new LightElement("Jaydeny", "blue", 10);
        LightElement le3 = new LightElement("Jaydenx", "blue", 10);
        LightElement le4 = new LightElement("Jaydenuwu", "blue", 10);
        LightElement le5 = new LightElement("Jaydenguam", "blue", 10);

        Lamp l1 = new Lamp(List.of(le1, le2, le3, le4),"black");
        l1.addElement(le5);

        le1.turnOn();
    }
}
