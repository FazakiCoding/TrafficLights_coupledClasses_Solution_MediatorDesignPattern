package colleagues;

import mediator.TraficLightMediator;

public interface TrafficLightColleagueImp {

    public void setMediator(TraficLightMediator mediator);
    public void turnOnGreen();
    public void turnOnYellow();
    public void turnOnRed();

    public void turnOffGreen();
    public void turnOffYellow();
    public void turnOffRed();
}
