// The concrete class for set temperature command objects
public class SetTemperatureCommand implements Command {

    private AirConditioner ac;
    private int oldTemperature;
    private int newTemperature;

    public SetTemperatureCommand(AirConditioner ac, int newTemperature) {
        this.ac = ac;
        this.oldTemperature = ac.getTemperature();
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        ac.setTemperature(newTemperature);
        System.out.println("Air conditioner temperature is set to " + newTemperature + "°C.");
    }

    @Override
    public void undo() {
        ac.setTemperature(oldTemperature);
        System.out.println("Air conditioner temperature is set back to " + oldTemperature + "°C.");
    }
}
