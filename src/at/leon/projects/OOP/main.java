package at.leon.projects.OOP;

public class main {

    public static void main(String[] args) {

        Engine e1 = new Engine(Engine.TYPE.DIESEL, 120);
        Car car1 = new Car("Porsche", 7, 140, 140, "P1234", "black", true, e1);


        System.out.println(car1.getBrand());
        car1.setColor("blue");
        System.out.println(car1.getColor());
        System.out.println(car1.getFuelAmount());
        System.out.println(car1.getSerialNumber());
        System.out.println(car1.getColor());
        System.out.println(car1.getTrailer_hitch());
        car1.getRemainingRange();
        e1.drive(50);

        RearMirror r1 = new RearMirror(100, RearMirror.POSITION.l);
        RearMirror r2 = new RearMirror(100, RearMirror.POSITION.r);
        RearMirror r3 = new RearMirror(90, RearMirror.POSITION.m);

        car1.addMirror(r1);
        car1.addMirror(r2);
        car1.addMirror(r3);

        ;

    }

}


