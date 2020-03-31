import colleagues.TrafficLightColleague;
import mediator.TrafficLightMediatorImp;
import mediator.TraficLightMediator;

public class TrafficLightTest {

    public static void main(String[] args) {

        System.out.println("Welcome to traffic light program");
        System.out.println("Solution using Mediator design pattern");

        TrafficLightMediatorImp mediator=new TraficLightMediator();

        TrafficLightColleague t1=new TrafficLightColleague(1,true,false,false);
        TrafficLightColleague t2=new TrafficLightColleague(2,false,true,false);
        TrafficLightColleague t3=new TrafficLightColleague(3,false,true,false);

        mediator.addTrafficLight(t1);
        mediator.addTrafficLight(t2);
        mediator.addTrafficLight(t3);

        mediator.turnGreenOff(t1);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
