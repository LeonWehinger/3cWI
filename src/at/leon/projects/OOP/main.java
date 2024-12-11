package at.leon.projects.OOP;

public class main {

    public static void main(String[] args) {

        Car car1 = new Car("Porsche", 7, 140, 140, "P1234", "black", true);
        System.out.println(car1.getBrand());
        car1.setColor("blue");
        System.out.println(car1.getColor());
        System.out.println(car1.getFuelAmount());
        System.out.println(car1.getSerialNumber());
        System.out.println(car1.getColor());
        System.out.println(car1.getTrailer_hitch());
        car1.getRemainingRange();


    }

}
