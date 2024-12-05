package t1;

/* loaded from: classes.dex */
public final class g extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final s1.c f9298a;

    public g(s1.c cVar) {
        this.f9298a = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f9298a));
    }
}
