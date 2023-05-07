// The concrete class for light objects
public class Light extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
        setState(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off.");
        setState(false);
    }
}
