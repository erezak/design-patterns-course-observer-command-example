// The concrete class for turn on TV command objects
public class TurnOnTVCommand implements Command {

    private TV tv;
  
    public TurnOnTVCommand(TV tv) {
      this.tv = tv;
    }
  
    @Override
    public void execute() {
      tv.turnOn();
    }
  
    @Override
    public void undo() {
      tv.turnOff();
    }
  }
  
