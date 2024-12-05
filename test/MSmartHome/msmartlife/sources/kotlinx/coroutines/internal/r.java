package kotlinx.coroutines.internal;

import kotlinx.coroutines.m0;

/* compiled from: Atomic.kt */
/* loaded from: classes2.dex */
public abstract class r {
    public abstract c<?> a();

    public final boolean b(r rVar) {
        c<?> a;
        c<?> a2 = a();
        return (a2 == null || (a = rVar.a()) == null || a2.f() >= a.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
