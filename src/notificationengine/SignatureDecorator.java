package notificationengine;

public class SignatureDecorator extends INotificationDecorator{
    private String signature;
    public SignatureDecorator(INotification no,String sig) {
        super(no);
        this.signature=sig;
    }
    public String getContent(){
        return no.getContent() +  "\n-- " + signature + "\n\n";
    }
}
