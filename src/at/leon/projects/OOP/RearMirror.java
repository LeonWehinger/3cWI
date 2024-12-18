package at.leon.projects.OOP;

public class RearMirror {
    private int size;

    public enum POSITION {l, r, m}

    ;
    private POSITION position;

    public RearMirror(int size, POSITION position) {
        this.size = size;
        this.position = position;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public POSITION getPosition() {
        return position;
    }

    public void setPosition(POSITION position) {
        this.position = position;
    }
}
