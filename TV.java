// The concrete class for TV objects
public class TV extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("TV is turned on.");
        setState(true);
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
        setState(false);
    }
}
