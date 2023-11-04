package Decorator;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Auto model");
        TuningAuto AutoWrap = new TuningAuto(auto);

        System.out.println("Print parameter");
        printAutoSpecifications(auto);

        System.out.println();

        System.out.println("Print tuning");
        printAutoSpecifications(AutoWrap);
    }

    public static void printAutoSpecifications(Auto Auto) {
        System.out.println(Auto.getName());
        System.out.println("Мощность " + Auto.getPower());
        System.out.println("Скорость " + Auto.getSpeed());
    }
}
