package Command;

import java.util.Stack;

public class Operator {
    String name;
    private Stack<Command> historyCommand = new Stack<>();

    public Operator(String name) {
        this.name = name;
    }

    public void writeCommand(Command сommand){
        historyCommand.push(сommand);
        сommand.executeCommand();
        System.out.println("Save command.");
    }

}
