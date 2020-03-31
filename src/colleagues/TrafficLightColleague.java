package colleagues;

import mediator.TraficLightMediator;

public class TrafficLightColleague implements TrafficLightColleagueImp{

    private int ID;
    private Boolean green,red,yellow;

    public TrafficLightColleague(int ID, Boolean green, Boolean red, Boolean yellow) {
        this.ID = ID;
        this.green = green;
        this.red = red;
        this.yellow = yellow;
    }

    @Override
    public String toString() {
        return "TrafficLightColleague{" +
                "ID=" + ID +
                ", green=" + green +
                ", red=" + red +
                ", yellow=" + yellow +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Boolean getGreen() {
        return green;
    }

    public void setGreen(Boolean green) {
        this.green = green;
    }

    public Boolean getRed() {
        return red;
    }

    public void setRed(Boolean red) {
        this.red = red;
    }

    public Boolean getYellow() {
        return yellow;
    }

    public void setYellow(Boolean yellow) {
        this.yellow = yellow;
    }

    @Override
    public void setMediator(TraficLightMediator mediator) {

    }

    @Override
    public void turnOnGreen() {
        green=true;
        red=false;
        yellow=false;
    }

    @Override
    public void turnOnYellow() {
        green=false;
        red=false;
        yellow=true;
    }

    @Override
    public void turnOnRed() {
        green=false;
        red=true;
        yellow=false;
    }

    @Override
    public void turnOffGreen() {
        green=false;
        red=true;
        yellow=false;
    }

    @Override
    public void turnOffYellow() {
        green=false;
        red=true;
        yellow=false;
    }

    @Override
    public void turnOffRed() {
        green=true;
        red=false;
        yellow=false;
    }
}
