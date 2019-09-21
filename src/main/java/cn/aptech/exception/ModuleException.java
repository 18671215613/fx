package cn.aptech.exception;

public class ModuleException extends RuntimeException {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ModuleException(int code) {
        this.code = code;
    }

    public ModuleException(String message, int code) {
        super(message);
        this.code = code;
    }

    public ModuleException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public ModuleException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public ModuleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
