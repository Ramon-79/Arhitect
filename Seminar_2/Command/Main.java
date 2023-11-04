package Command;

public class Main {

    public static void main(String[] args) {
        Сontroller controller = new Сontroller("Controller");
        Operator operator = new Operator("Manager User");

        operator.writeCommand(controller.giveTheCommand());
        operator.writeCommand(controller.giveTheCommand());
    
    }

}
