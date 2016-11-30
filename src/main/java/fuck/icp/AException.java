package fuck.icp;

/**
 * Created by THINK on 2016/11/30.
 */
public class AException extends RuntimeException {
    public AException() {
    }

    public AException(final String message) {
        super(message);
        printStackTrace();
    }
}
