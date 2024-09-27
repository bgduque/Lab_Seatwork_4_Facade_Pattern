import classes.TV;

import com.duque.Interfaces.HomeService;

import classes.Airconditioning;
import classes.Light;

public class HomeInterface {

    private HomeService tv = new TV();
    private HomeService light = new Light();
    private HomeService ac = new Airconditioning();

    public HomeInterface() {
        this.tv = new TV();
        this.light = new Light();
        this.ac = new Airconditioning();
    }

    public void turnOnAll() {
        tv.turnOn();
        light.turnOn();
        ac.turnOn();
    }

    public void turnOffAll() {
        tv.turnOff();
        light.turnOff();
        ac.turnOff();
    }

}