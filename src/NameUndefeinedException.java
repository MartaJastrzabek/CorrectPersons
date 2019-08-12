public class NameUndefeinedException extends RuntimeException  {
    public NameUndefeinedException(String message) {
        super(message + " jest nullem lub ma mniej niż dwa znaki");
    }
}
