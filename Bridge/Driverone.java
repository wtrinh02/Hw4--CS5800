package Bridge;

public class Driverone {
 
    public static void main (String args[]){
        
        EmailChannel emailBitcoin = new EmailChannel(new BitcoinPayment());
        EmailChannel emailOnline = new EmailChannel(new OnlinePaymentNotification());
        EmailChannel emailCash = new EmailChannel(new CashOnDelivaryPayment());
        PushChannel pushBitcoin = new PushChannel(new BitcoinPayment());
        PushChannel pushOnline = new PushChannel(new OnlinePaymentNotification());
        PushChannel pushCash = new PushChannel(new CashOnDelivaryPayment());
        SmsChannel smsBitcoin = new SmsChannel(new BitcoinPayment());
        SmsChannel smsOnline = new SmsChannel(new OnlinePaymentNotification());
        SmsChannel smsCash = new SmsChannel(new CashOnDelivaryPayment());
        emailBitcoin.notifyPayment();
        emailOnline.notifyPayment();
        emailCash.notifyPayment();
        pushBitcoin.notifyPayment();
        pushOnline.notifyPayment();
        pushCash.notifyPayment();
        smsBitcoin.notifyPayment();
        smsOnline.notifyPayment();
        smsCash.notifyPayment();
    }
}
