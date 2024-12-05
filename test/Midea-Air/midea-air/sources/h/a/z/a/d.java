package h.a.z.a;

import h.a.k;
import h.a.q;
import h.a.u;

/* compiled from: EmptyDisposable.java */
/* loaded from: classes2.dex */
public enum d implements h.a.z.c.b<Object> {
    INSTANCE,
    NEVER;

    public static void B(Throwable th, u<?> uVar) {
        uVar.b(INSTANCE);
        uVar.onError(th);
    }

    public static void n(k<?> kVar) {
        kVar.b(INSTANCE);
        kVar.a();
    }

    public static void o(q<?> qVar) {
        qVar.b(INSTANCE);
        qVar.a();
    }

    public static void r(Throwable th, q<?> qVar) {
        qVar.b(INSTANCE);
        qVar.onError(th);
    }

    @Override // h.a.z.c.f
    public void clear() {
    }

    @Override // h.a.x.c
    public void d() {
    }

    @Override // h.a.x.c
    public boolean f() {
        return this == INSTANCE;
    }

    @Override // h.a.z.c.c
    public int i(int i2) {
        return i2 & 2;
    }

    @Override // h.a.z.c.f
    public boolean isEmpty() {
        return true;
    }

    @Override // h.a.z.c.f
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // h.a.z.c.f
    public Object poll() throws Exception {
        return null;
    }
}
