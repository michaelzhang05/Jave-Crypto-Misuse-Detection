package f1;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    private static final c f6584b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f6585a;

    private c(Object obj) {
        this.f6585a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // y4.a
    public Object get() {
        return this.f6585a;
    }
}
