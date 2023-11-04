package Builder;


public class Main {
    public static void main(String[] args) {
        ParameterBuilder ParameterBuilder = new ParameterBuilder();
        ParameterBuilder.setName("auto");
        ParameterBuilder.setPower(111);
        ParameterBuilder.getResult();

        ParameterBuilder.setWeight(5555);
        ParameterBuilder.getResult();

        ParameterBuilder.setSpeed(888);
        ParameterBuilder.getResult();
    }
}
