package mediator;

import colleagues.TrafficLightColleague;

public interface TrafficLightMediatorImp {

    public void addTrafficLight(TrafficLightColleague TrafficLight);

    public void turnGreenOn(TrafficLightColleague TrafficLight);
    public void turnRedOn(TrafficLightColleague TrafficLight);
    public void turnYellowOn(TrafficLightColleague TrafficLight);

    public void turnGreenOff(TrafficLightColleague TrafficLight);
    public void turnRedOff(TrafficLightColleague TrafficLight);
    public void turnYellowOff(TrafficLightColleague TrafficLight);

}
