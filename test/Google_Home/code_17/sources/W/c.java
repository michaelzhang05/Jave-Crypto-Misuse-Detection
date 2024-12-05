package w;

/* loaded from: classes3.dex */
public final class c implements InterfaceC4117b {

    /* renamed from: b, reason: collision with root package name */
    private static final c f40320b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f40321a;

    private c(Object obj) {
        this.f40321a = obj;
    }

    public static InterfaceC4117b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // L5.a
    public Object get() {
        return this.f40321a;
    }
}
