package S5;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class a implements g.b {
    private final g.c key;

    public a(g.c key) {
        AbstractC3255y.i(key, "key");
        this.key = key;
    }

    @Override // S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) g.b.a.a(this, r8, interfaceC1668n);
    }

    @Override // S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // S5.g.b
    public g.c getKey() {
        return this.key;
    }

    @Override // S5.g.b, S5.g
    public g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // S5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
