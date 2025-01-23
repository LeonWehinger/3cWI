package at.leon.projects.Vererbung;

import at.leon.projects.OOP.Engine;
import at.leon.projects.OOP.RearMirror;
import at.leon.projects.OOP.Tire;

import java.util.ArrayList;
import java.util.List;

public class MainTruck {
    public static void main(String[] args) {

        List<Tire> tires = new ArrayList<>();
        List<RearMirror> mirrors = new ArrayList<>();
        Engine e1 = new Engine(Engine.TYPE.DIESEL, 100);

        Truck t1 = new Truck(mirrors, tires, "Nejo",25,200,200,"Nejo187","black",false,e1,"Nejoleinchen");
        System.out.println(t1.getTrailer());












    }
}
