// The concrete class for air conditioner objects
public class AirConditioner extends Appliance {

    private int temperature; // in Celsius

    public AirConditioner() {
        super();
        temperature = 25;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void turnOn() {
        System.out.println("Air conditioner is turned on.");
        setState(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioner is turned off.");
        setState(false);
    }
}
