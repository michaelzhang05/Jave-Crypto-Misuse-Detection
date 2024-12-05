package x5;

import w5.InterfaceC4149a;

/* loaded from: classes5.dex */
public final class f implements e, InterfaceC4149a {

    /* renamed from: b, reason: collision with root package name */
    private static final f f40756b = new f(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f40757a;

    private f(Object obj) {
        this.f40757a = obj;
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
        return f40756b;
    }

    @Override // L5.a
    public Object get() {
        return this.f40757a;
    }
}
