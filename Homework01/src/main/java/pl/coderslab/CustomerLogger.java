package pl.coderslab;

public interface CustomerLogger {
    void log();
    void log(String operation, boolean success);

}
