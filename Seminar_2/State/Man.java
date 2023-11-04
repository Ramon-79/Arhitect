package State;

public class Man {
    private String name;
    private ManStatement manStatement;
    private int pulse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public ManStatement getManStatement(){
        return this.manStatement;
    }

    public void setManStatement(ManStatement manStatement) {
        this.manStatement = manStatement;
    }


    public Man(String name, int pulse) {
        this.name = name;
        this.pulse = pulse;
    }


    public void changeState(ManStatement manStatement){
        this.manStatement = manStatement;
    }

    public static class StateRest extends ManStatement{

        public StateRest(Man Man) {
            super(Man);
            Man.pulse = 80;
            System.out.println("В состоянии покоя пульс равен: " + Man.pulse);
        }

        @Override
        public void manState() {
            System.out.println("Cосотяние покоя");
        }

    }

    public static class AverageLoad extends ManStatement{

        public AverageLoad(Man Man) {
            super(Man);
            Man.pulse += 20;
            System.out.println("При хотьбе пульс равен: " + Man.pulse);
        }

        @Override
        public void manState() {
            System.out.println("Hагрузка");
        }

    }

    public static class HighLoad extends ManStatement{

        public HighLoad(Man Man) {
            super(Man);
            Man.pulse += 70;
            System.out.println("При нагрузке пульс равен" + Man.pulse);
        }

        @Override
        public void manState() {
            System.out.println("Нагрузка");
        }
    }

}
