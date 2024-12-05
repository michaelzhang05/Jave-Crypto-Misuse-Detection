package I7;

/* loaded from: classes5.dex */
public class a extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f4607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, Throwable th) {
        super(str);
        this.f4607a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f4607a;
    }
}
