package at.leon.projects.Handy;
import java.util.ArrayList;


public class Speicherkarte {
    private int capacityGB;
    private ArrayList <PhoneFile> fileList;
    public int filesSize;
    public int freeSpace;

    public Speicherkarte(int capacityGB) {
        this.capacityGB = capacityGB;
        this.fileList = new ArrayList<PhoneFile>();
        this.freeSpace = capacityGB;

    }

    public void addFile(PhoneFile phoneFile){
        this.fileList.add(phoneFile);
    }

    public void getFiles(){
        for (PhoneFile phoneFile: this.fileList){
            System.out.println("name: "+phoneFile.getName());
            System.out.println("size in GB: "+phoneFile.getSizeGB());
        }
    }

    public void getFreeSpace(int capacityGB, ArrayList<PhoneFile> fileList, int filesSize, int freeSpace){
        for (PhoneFile phoneFile: fileList){
            filesSize += phoneFile.getSizeGB();
        }
        freeSpace = capacityGB - filesSize;
        System.out.println("Free capacity: "+freeSpace);
    }


    public int getCapacityGB() {
        return capacityGB;
    }
}
