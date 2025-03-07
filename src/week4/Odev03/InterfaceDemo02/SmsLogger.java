package week4.Odev03.InterfaceDemo02;

public class SmsLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Sms log.");
    }
}
