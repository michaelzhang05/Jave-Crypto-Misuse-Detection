package rx.exceptions;

/* loaded from: classes2.dex */
public class OnErrorFailedException extends RuntimeException {
    public OnErrorFailedException(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    public OnErrorFailedException(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
