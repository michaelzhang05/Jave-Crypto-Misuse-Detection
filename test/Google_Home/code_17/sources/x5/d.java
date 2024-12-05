package x5;

import w5.InterfaceC4149a;

/* loaded from: classes5.dex */
public final class d implements i, InterfaceC4149a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40753c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile i f40754a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f40755b = f40753c;

    private d(i iVar) {
        this.f40754a = iVar;
    }

    public static InterfaceC4149a a(L5.a aVar) {
        return b(j.a(aVar));
    }

    public static InterfaceC4149a b(i iVar) {
        if (iVar instanceof InterfaceC4149a) {
            return (InterfaceC4149a) iVar;
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
        if (obj != f40753c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // L5.a
    public Object get() {
        Object obj = this.f40755b;
        Object obj2 = f40753c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f40755b;
                    if (obj == obj2) {
                        obj = this.f40754a.get();
                        this.f40755b = d(this.f40755b, obj);
                        this.f40754a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
