package P0;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f7859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7860b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f7861c;

    /* renamed from: d, reason: collision with root package name */
    public final e f7862d;

    public e(Throwable th, d dVar) {
        e eVar;
        this.f7859a = th.getLocalizedMessage();
        this.f7860b = th.getClass().getName();
        this.f7861c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f7862d = eVar;
    }
}
