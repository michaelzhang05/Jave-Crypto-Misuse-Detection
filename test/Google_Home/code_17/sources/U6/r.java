package U6;

/* loaded from: classes5.dex */
public class r extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f10472a;

    public r(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10472a;
    }

    public r(String str, Throwable th) {
        super(str);
        this.f10472a = th;
    }
}
