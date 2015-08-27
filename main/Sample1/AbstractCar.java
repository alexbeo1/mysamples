package main.Sample1;


public abstract class AbstractCar implements Car {

    protected int speed = 100;


    public void getDescription() {
        out(getClass().getSimpleName() + " Speed: " + speed + " EngineVolume: " + getEngineVolume());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private void out(String str) {
        System.out.println(str);
    }


}
