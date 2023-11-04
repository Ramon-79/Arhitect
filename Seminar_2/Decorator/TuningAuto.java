package Decorator;

public class TuningAuto extends Auto{

    private Auto AutoOriginal;

    public TuningAuto(Auto auto) {

        super(auto.getName());
        this.AutoOriginal = auto;
    }

    @Override
    public String getName() {
        return AutoOriginal.getName() + " Upgrate ";
    }

    @Override
    public void setName(String name) {
        AutoOriginal.setName(name);
    }

    @Override
    public int getPower() {
        return AutoOriginal.getPower() + 100;
    }

    @Override
    public void setPower(int power) {
        AutoOriginal.setPower(power);
    }

    @Override
    public int getSpeed() {
        return AutoOriginal.getSpeed() + 20;
    }

    @Override
    public void setSpeed(int speed) {
        AutoOriginal.setSpeed(speed);
    }
}
