package at.leon.projects.Handy;

public class PhoneFile {
    private int sizeGB;
    private String name;


    public PhoneFile(int sizeGB, String name) {
        this.sizeGB = sizeGB;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("The size of the '"+getName()+"' file is " +getSizeGB()+ " GB!");
    }


    public int getSizeGB() {
        return sizeGB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
