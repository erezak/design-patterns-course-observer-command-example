// The class for remote control device objects

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteControlDevice implements Observer {

    private List<Command> commands; // a list of commands to execute
    private Stack<Command> history; // a stack of commands for undoing

    public RemoteControlDevice() {
        commands = new ArrayList<>();
        history = new Stack<>();
    }

    // The method to add a command to the list
    public void addCommand(Command command) {
        commands.add(command);
    }

    // The method to execute a command by its index in the list
    public void executeCommand(int index) {
        if (index >= 0 && index < commands.size()) {
            Command command = commands.get(index);
            command.execute();
            history.push(command);
        }
    }

    // The method to undo the last executed command
    public void undoCommand() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }

    // The method to update the display when an observable object changes its state
    @Override
    public void update(Observable observable) {
        if (observable instanceof Appliance) {
            Appliance appliance = (Appliance) observable;
            System.out.println("The state of " + appliance.getClass().getSimpleName() + " is "
                    + (appliance.getState() ? "on" : "off") + ".");
            if (appliance instanceof AirConditioner) {
                AirConditioner ac = (AirConditioner) appliance;
                System.out.println("The temperature of AirConditioner is " + ac.getTemperature() + "°C.");
            }
        }
    }
}
