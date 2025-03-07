package week4.Odev03.InterfaceDemo02;

public class Main {
    public static void main(String[] args) {

        Logger smsLogger = new SmsLogger();
        Logger databaseLogger = new DatabaseLogger();

        smsLogger.log();
        databaseLogger.log();
    }
}
