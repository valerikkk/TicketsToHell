package exceptions;

public class NoSuchCommandException extends Exception{
    @Override
    public String getMessage() {
        return "Какая-то из команд в скрипте инвалидная";
    }
}
