package w;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3837c implements InterfaceC3836b {

    /* renamed from: b, reason: collision with root package name */
    private static final C3837c f38937b = new C3837c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f38938a;

    private C3837c(Object obj) {
        this.f38938a = obj;
    }

    public static InterfaceC3836b a(Object obj) {
        return new C3837c(AbstractC3838d.c(obj, "instance cannot be null"));
    }

    @Override // I5.a
    public Object get() {
        return this.f38938a;
    }
}
