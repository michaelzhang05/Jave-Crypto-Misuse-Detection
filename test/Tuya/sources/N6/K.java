package n6;

import P5.g;
import i6.V0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class K implements V0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36246a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal f36247b;

    /* renamed from: c, reason: collision with root package name */
    private final g.c f36248c;

    public K(Object obj, ThreadLocal threadLocal) {
        this.f36246a = obj;
        this.f36247b = threadLocal;
        this.f36248c = new L(threadLocal);
    }

    @Override // P5.g.b, P5.g
    public Object fold(Object obj, X5.n nVar) {
        return V0.a.a(this, obj, nVar);
    }

    @Override // P5.g.b, P5.g
    public g.b get(g.c cVar) {
        if (AbstractC3159y.d(getKey(), cVar)) {
            AbstractC3159y.g(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // P5.g.b
    public g.c getKey() {
        return this.f36248c;
    }

    @Override // P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        if (AbstractC3159y.d(getKey(), cVar)) {
            return P5.h.f7994a;
        }
        return this;
    }

    @Override // P5.g
    public P5.g plus(P5.g gVar) {
        return V0.a.b(this, gVar);
    }

    @Override // i6.V0
    public void restoreThreadContext(P5.g gVar, Object obj) {
        this.f36247b.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f36246a + ", threadLocal = " + this.f36247b + ')';
    }

    @Override // i6.V0
    public Object updateThreadContext(P5.g gVar) {
        Object obj = this.f36247b.get();
        this.f36247b.set(this.f36246a);
        return obj;
    }
}
