public abstract class Channel {

    protected Payment paymentType;

    abstract public void notify(Payment paymentType);
    
}
