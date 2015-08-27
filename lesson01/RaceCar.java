package lesson01;

/**
 * Александр Козлов
 * 26.08.2015.
 */
public class RaceCar extends AbstractCar{
    RaceCar(){
        speed = 200;
    }



    @Override
    public float getEngineVolume() {
        return 3.5f;
    }


    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("I'm ready!!!");
    }
}
