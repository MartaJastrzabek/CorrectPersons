public class NameUndefeinedException extends Exception  {
    public NameUndefeinedException(String message) {
        super(message + " jest nullem lub ma mniej niż dwa znaki");
    }
}
