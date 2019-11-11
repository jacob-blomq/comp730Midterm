package Command;

import java.util.Random;

public class CommandMain {
	public static void main(String[] args) {
		Player p = new Player();
		CommandInvoker c = new CommandInvoker();
		Random rand = new Random();
		
		for (int i = 0; i < 50; i++) {
			int rand_num = rand.nextInt(4);
			if (rand_num == 1) {
				CommandInterface a = new MoveNorth();
				c.addCommand(a);			
			}
			if (rand_num == 2) {
				CommandInterface a = new MoveEast();
				c.addCommand(a);
			}
			if (rand_num == 3) {
				CommandInterface a = new MoveSouth();
				c.addCommand(a);
			}
			if (rand_num == 4) {
				CommandInterface a = new MoveWest();
				c.addCommand(a);
			}	
		}
		c.execute();
		System.out.println("Coordinates are: " + p.xCoord + " " + p.yCoord);
		c.undo();
		System.out.println("Undid coordinates are: " + p.xCoord + " " + p.yCoord);

	}
}
