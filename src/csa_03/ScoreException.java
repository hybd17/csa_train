package csa_03;

public class ScoreException extends RuntimeException{
    public ScoreException() {
        super();
    }

    public ScoreException(String message) {
        super(message);
    }

    public ScoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreException(Throwable cause) {
        super(cause);
    }

    protected ScoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
