// The main method to test the code
public class Main {

    public static void main(String[] args) {
      // Create some appliance objects
      Light light = new Light();
      TV tv = new TV();
      AirConditioner ac = new AirConditioner();
  
      // Create some command objects
      TurnOnLightCommand turnOnLight = new TurnOnLightCommand(light);
      TurnOffLightCommand turnOffLight = new TurnOffLightCommand(light);
      TurnOnTVCommand turnOnTV = new TurnOnTVCommand(tv);
      TurnOffTVCommand turnOffTV = new TurnOffTVCommand(tv);
      SetTemperatureCommand setTemp25 = new SetTemperatureCommand(ac, 25);
      SetTemperatureCommand setTemp30 = new SetTemperatureCommand(ac, 30);
  
      // Create a remote control device object
      RemoteControlDevice remote = new RemoteControlDevice();
  
      // Add the commands to the remote control device
      remote.addCommand(turnOnLight);
      remote.addCommand(turnOffLight);
      remote.addCommand(turnOnTV);
      remote.addCommand(turnOffTV);
      remote.addCommand(setTemp25);
      remote.addCommand(setTemp30);
  
      // Add the remote control device as an observer to the appliances
      light.addObserver(remote);
      tv.addObserver(remote);
      ac.addObserver(remote);
  
      // Execute some commands using the remote control device
      remote.executeCommand(0); // turn on light
      remote.executeCommand(2); // turn on TV
      remote.executeCommand(4); // set temperature to 25°C
      remote.executeCommand(5); // set temperature to 30°C
      remote.undoCommand(); // undo the last command
  
      // Change the state of some appliances manually
      light.turnOff();
      tv.turnOff();
    }
  }
  