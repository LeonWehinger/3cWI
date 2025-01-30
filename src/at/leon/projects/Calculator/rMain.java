package at.leon.projects.Calculator;

public class rMain {
    public static void main(String[] args) {
        Rechner r = new Rechner();
        System.out.println(r.add(4,2));

        Wissenschaftlicher_Rechner r2 = new Wissenschaftlicher_Rechner();
        System.out.println(r2.sin(45));

        Wurzelrechner r3 = new Wurzelrechner();
        System.out.println(r3.sqrt(4));








    }
}
