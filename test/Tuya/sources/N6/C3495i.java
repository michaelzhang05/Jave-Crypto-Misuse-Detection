package n6;

/* renamed from: n6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3495i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient P5.g f36264a;

    public C3495i(P5.g gVar) {
        this.f36264a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f36264a.toString();
    }
}
