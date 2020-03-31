package mediator;

import colleagues.TrafficLightColleague;

import java.util.ArrayList;
import java.util.List;

public class TraficLightMediator implements TrafficLightMediatorImp{

    List<TrafficLightColleague> lights=new ArrayList<TrafficLightColleague>();



    @Override
    public void addTrafficLight(TrafficLightColleague TrafficLight) {
        this.lights.add(TrafficLight);
    }

    @Override
    public void turnGreenOn(TrafficLightColleague TrafficLight) {
        System.out.println("Turning on green of "+TrafficLight.getID());
        for(TrafficLightColleague tl:lights){
            if(tl.getID()==TrafficLight.getID())
                tl.turnOnGreen();
            else
                tl.turnOnRed();
        }

           }

    @Override
    public void turnRedOn(TrafficLightColleague TrafficLight) {
        for(TrafficLightColleague tl:lights){
            if(tl.getID()==TrafficLight.getID())
                tl.turnOnRed();
            else
                tl.turnOnGreen();
        }
    }


    @Override
    public void turnYellowOn(TrafficLightColleague TrafficLight) {
        for(TrafficLightColleague tl:lights){
            if(tl.getID()==TrafficLight.getID())
                tl.turnOnYellow();


    }
    }

    @Override
    public void turnGreenOff(TrafficLightColleague TrafficLight) {
        System.out.println("Turning on green off "+TrafficLight.getID());

        for(TrafficLightColleague tl:lights){
            if(tl.getID()==TrafficLight.getID())
                tl.turnOffGreen();
            else
                tl.turnOnGreen();
        }
    }

    @Override
    public void turnRedOff(TrafficLightColleague TrafficLight) {

        for(TrafficLightColleague tl:lights){
            if(tl.getID()==TrafficLight.getID())
                tl.turnOffRed();
            else
                tl.turnOnRed();
        }
    }

    @Override
    public void turnYellowOff(TrafficLightColleague TrafficLight) {
        for(TrafficLightColleague tl:lights){
            if(tl.getID()==TrafficLight.getID())
                tl.turnOnRed();
            else
                tl.turnOnGreen();
        }
    }
}
