package lecture8;

public class StrategyDesignPattern {
    static void main() {
        Robot r1=new CompanionRobot(new NotFly(),new NotTalk(),new NormalWalk());
        r1.walk();
        r1.talk();
        r1.fly();
        r1.projection();
        System.out.println("-----------------");
        Robot r2=new Workerrobot(new NormalFly(),new NotTalk(),new NotWalk());
        r2.walk();
        r2.talk();
        r2.fly();
        r2.projection();
    }
}
