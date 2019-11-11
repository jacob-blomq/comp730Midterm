package Command;

public class MoveWest implements CommandInterface {
	private Player p;
	
	public MoveWest() {
		this.p = p;
	}

	public void execute() {
		p.xCoord--;
	}
	
	public void undo() {
		p.xCoord++;
	}
}
