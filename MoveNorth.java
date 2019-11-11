package Command;

public class MoveNorth implements CommandInterface {
	private Player p;
	
	public MoveNorth() {
		this.p = p;
	}
	
	public void execute() {
		p.yCoord++;
	}
	
	public void undo() {
		p.yCoord--;
	}
}
