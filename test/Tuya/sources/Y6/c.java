package Y6;

/* loaded from: classes5.dex */
public abstract class c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f13243a;

    public c(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f13243a;
    }
}
