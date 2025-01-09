package at.leon.projects.OOP;


public class Battery {
    private float chargingStatus;
    private Remote remote;

    public Battery(float chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public float getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(float chargingStatus) {
        this.chargingStatus = chargingStatus;
    }


    public Remote getRemote() {
        return remote;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

}


