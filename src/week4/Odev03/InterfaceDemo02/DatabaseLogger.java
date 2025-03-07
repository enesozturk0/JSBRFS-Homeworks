package week4.Odev03.InterfaceDemo02;

public class DatabaseLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Database log.");
    }
}
