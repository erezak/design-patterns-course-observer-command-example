// The concrete class for turn off TV command objects
public class TurnOffTVCommand implements Command {

    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}

