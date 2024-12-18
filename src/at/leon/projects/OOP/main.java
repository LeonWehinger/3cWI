package at.leon.projects.OOP;

public class main {

    public static void main(String[] args) {

        Engine e1 = new Engine(Engine.TYPE.DIESEL, 120);
        RearMirror r1 = new RearMirror(100, RearMirror.POSITION.l);
        RearMirror r2 = new RearMirror(100, RearMirror.POSITION.r);
        RearMirror r3 = new RearMirror(90, RearMirror.POSITION.m);
        Tire t1 = new Tire(100, "black");
        Tire t2 = new Tire(100, "black");
        Tire t3 = new Tire(100, "black");
        Tire t4 = new Tire(100, "black");
        Car car1 = new Car("Porsche", 7, 140, 140, "P1234", "black", false, e1, t1);


        car1.addMirror(r1);
        car1.addMirror(r2);
        car1.addMirror(r3);
        car1.addTires(t2);
        car1.addTires(t3);
        car1.addTires(t4);

        System.out.println(car1.getBrand());
        car1.setColor("blue");
        System.out.println(car1.getColor());
        System.out.println(car1.getFuelAmount());
        System.out.println(car1.getSerialNumber());
        System.out.println(car1.getColor());
        System.out.println(car1.getTrailer_hitch());
        car1.getRemainingRange();
        e1.drive(50);
        System.out.println(car1.getMirrors().get(2).getPosition());
        System.out.println(car1.getMirrors().get(2).getSize());
        System.out.println(car1.getTires().get(0).getRimColor());





    }

}


