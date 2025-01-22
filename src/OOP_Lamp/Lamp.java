package OOP_Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> ElementList= new ArrayList<>();
    private String color;


    public Lamp(List<LightElement> elementList, String color) {
        this.ElementList = elementList;
        this.color = color;
    }



    public void turnALlOn(List<LightElement> elementList) {

        for (LightElement element : elementList) {
            element.turnOn();
        }
    }

    public void addElement(LightElement element) {
        ElementList.add(element);
    }




    public List<LightElement> getElementList() {
        return ElementList;
    }

    public void setElementList(List<LightElement> elementList) {
        this.ElementList = elementList;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
