package lecture_2;

public class Main {
    static void main() {
        SportsCar myCar=new SportsCar("M4","BMW");
        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();

    }
}
