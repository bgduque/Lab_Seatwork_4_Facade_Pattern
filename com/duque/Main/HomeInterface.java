import classes.TV;
import classes.Airconditioning;
import classes.Light;

public class HomeInterface {

    public TV tv;
    public Light light;
    public Airconditioning airconditioning;

    public HomeInterface() {
        this.tv = new TV();
        this.light = new Light();
        this.airconditioning = new Airconditioning();
    }

    public void turnOnAll() {
        tv.turnOn();
        light.turnOn();
        airconditioning.turnOn();
    }

    public void turnOffAll() {
        tv.turnOff();
        light.turnOff();
        airconditioning.turnOff();
    }

}