package q6;

/* renamed from: q6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3874i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient S5.g f38392a;

    public C3874i(S5.g gVar) {
        this.f38392a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f38392a.toString();
    }
}
