package u5;

import t5.InterfaceC3795a;

/* loaded from: classes5.dex */
public final class d implements i, InterfaceC3795a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38569c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile i f38570a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f38571b = f38569c;

    private d(i iVar) {
        this.f38570a = iVar;
    }

    public static InterfaceC3795a a(I5.a aVar) {
        return b(j.a(aVar));
    }

    public static InterfaceC3795a b(i iVar) {
        if (iVar instanceof InterfaceC3795a) {
            return (InterfaceC3795a) iVar;
        }
        return new d((i) h.b(iVar));
    }

    public static i c(i iVar) {
        h.b(iVar);
        if (iVar instanceof d) {
            return iVar;
        }
        return new d(iVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj != f38569c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // I5.a
    public Object get() {
        Object obj = this.f38571b;
        Object obj2 = f38569c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38571b;
                    if (obj == obj2) {
                        obj = this.f38570a.get();
                        this.f38571b = d(this.f38571b, obj);
                        this.f38570a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
