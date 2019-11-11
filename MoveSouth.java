package Command;

public class MoveSouth implements CommandInterface {
	private Player p;
	
	public MoveSouth() {
		this.p = p;
	}
	
	public void execute() {
		p.yCoord--;
	}
	
	public void undo() {
		p.yCoord++;
	}

}
