package lecture6;

public class Client {
    // Client that passes a String msg as the client expects.

        private Parent p;

        public Client(Parent p) {
            this.p = p;
        }

        public void printMsg() {
            p.print("Hello");
        }


}
