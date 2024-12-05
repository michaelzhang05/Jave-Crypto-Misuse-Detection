package u5;

import t5.InterfaceC3795a;

/* loaded from: classes5.dex */
public final class f implements e, InterfaceC3795a {

    /* renamed from: b, reason: collision with root package name */
    private static final f f38572b = new f(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f38573a;

    private f(Object obj) {
        this.f38573a = obj;
    }

    public static e a(Object obj) {
        return new f(h.c(obj, "instance cannot be null"));
    }

    public static e b(Object obj) {
        if (obj == null) {
            return c();
        }
        return new f(obj);
    }

    private static f c() {
        return f38572b;
    }

    @Override // I5.a
    public Object get() {
        return this.f38573a;
    }
}
