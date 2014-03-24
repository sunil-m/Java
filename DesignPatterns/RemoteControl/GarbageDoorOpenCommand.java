package RemoteControl;

public class GarbageDoorOpenCommand implements Command {
    
	GarbageDoor garbageDoor;
	
	public GarbageDoorOpenCommand(GarbageDoor garbageDoor) {
		this.garbageDoor = garbageDoor;
	}
	
	public void execute() {
        garbageDoor.up();
	}

}
