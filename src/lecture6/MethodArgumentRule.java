package lecture6;

public class MethodArgumentRule {
    static void main() {
        Parent p  = new Child();
        Client d=new Client(p);
        d.printMsg();
    }
}
