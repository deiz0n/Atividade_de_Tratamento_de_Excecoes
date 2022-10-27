package model.Exception;

import java.io.Serial;

public class SaqueException extends RuntimeException {

    @Serial
    public static final long serialVersionUID = 1L;

    public SaqueException(String msg) {
        super(msg);
    }

}
