package lecture_2;

public class SportsCar implements Car {
    private String model;
    String brand;
    boolean isEngineOn=false;
    int currspeed=0;
    int currGear=0;
    public SportsCar(String model,String brand){
        this.model=model;
        this.brand=brand;
    }
    @Override
    public void startEngine() {
        this.isEngineOn=true;
        System.out.println(brand + " " + model + " : Engine starts with a roar!");
    }

    @Override
    public void stopEngine() {
        this.isEngineOn=false;
        this.currspeed=0;
        this.currGear=0;
        System.out.println(brand + " " + model + " : Engine turned off.");
    }

    @Override
    public void accelerate() {
        if(!isEngineOn){
            System.out.println("Can't accelerate because engine is off");
            return;
        }
        currspeed+=20;
        System.out.println(brand + " " + model + " : Accelerating to " + currspeed + " km/h");
    }

    @Override
    public void brake() {
        currspeed-=20;
        if(currspeed<0){
            currspeed=0;
        }
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currspeed + " km/h");
    }

    @Override
    public void shiftGear(int gearno) {
        if(!isEngineOn){
            System.out.println("Can't change gears because engine is off");
            return;
        }
        this.currGear=gearno;
        System.out.println(brand + " " + model + " : Shifted to gear " + currGear);
    }
}
