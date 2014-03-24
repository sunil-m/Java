package RemoteControl;

public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarbageDoor garbageDoor = new GarbageDoor();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		GarbageDoorOpenCommand garbageDoorOpenCommand = new GarbageDoorOpenCommand(garbageDoor);
		remote.setCommand(lightOnCommand);
		remote.buttonPressed();
		remote.setCommand(garbageDoorOpenCommand);
		remote.buttonPressed();
	}

}
