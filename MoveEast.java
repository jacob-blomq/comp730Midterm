package Command;

public class MoveEast implements CommandInterface {
	private Player p;
	
	public MoveEast() {
		this.p = p;
	}
	
	public void execute() {
		p.xCoord++;
	}
	public void undo() {
		p.xCoord--;
	}

}
