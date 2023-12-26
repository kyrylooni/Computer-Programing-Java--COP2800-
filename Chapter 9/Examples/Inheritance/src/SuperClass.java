public class SuperClass {

    public SuperClass() {
        super();
    }

    String objectMessage = "This is the original superclass message. ";

    public void getMessage() {
        System.out.println("This is the SUPERCLASS message: " + objectMessage);
    }

    public void setMessage(String newMessage) {
        this.objectMessage = newMessage;
    }

}
