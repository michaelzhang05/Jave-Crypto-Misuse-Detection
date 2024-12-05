package rx.exceptions;

/* loaded from: classes2.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
