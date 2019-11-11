package Command;

import java.util.ArrayList;

public class CommandInvoker implements CommandInterface {
	private ArrayList<CommandInterface> commandList = new ArrayList<CommandInterface>();
	
	public void addCommand(CommandInterface c) {
		commandList.add(c);
	}
	
	public void execute() {
		for (CommandInterface command: commandList) {
			command.execute();
		}
	}
	
	public void undo() {
		for (CommandInterface command: commandList) {
			command.execute();
		}
	}
}
