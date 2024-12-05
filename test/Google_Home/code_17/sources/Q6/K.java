package q6;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import l6.V0;

/* loaded from: classes5.dex */
public final class K implements V0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38374a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal f38375b;

    /* renamed from: c, reason: collision with root package name */
    private final g.c f38376c;

    public K(Object obj, ThreadLocal threadLocal) {
        this.f38374a = obj;
        this.f38375b = threadLocal;
        this.f38376c = new L(threadLocal);
    }

    @Override // S5.g.b, S5.g
    public Object fold(Object obj, InterfaceC1668n interfaceC1668n) {
        return V0.a.a(this, obj, interfaceC1668n);
    }

    @Override // S5.g.b, S5.g
    public g.b get(g.c cVar) {
        if (AbstractC3255y.d(getKey(), cVar)) {
            AbstractC3255y.g(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // S5.g.b
    public g.c getKey() {
        return this.f38376c;
    }

    @Override // S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        if (AbstractC3255y.d(getKey(), cVar)) {
            return S5.h.f9825a;
        }
        return this;
    }

    @Override // S5.g
    public S5.g plus(S5.g gVar) {
        return V0.a.b(this, gVar);
    }

    @Override // l6.V0
    public void restoreThreadContext(S5.g gVar, Object obj) {
        this.f38375b.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f38374a + ", threadLocal = " + this.f38375b + ')';
    }

    @Override // l6.V0
    public Object updateThreadContext(S5.g gVar) {
        Object obj = this.f38375b.get();
        this.f38375b.set(this.f38374a);
        return obj;
    }
}
