package rx.exceptions;

/* loaded from: classes2.dex */
public final class OnCompletedFailedException extends RuntimeException {
    public OnCompletedFailedException(Throwable th) {
        super(th == null ? new NullPointerException() : th);
    }

    public OnCompletedFailedException(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }
}
