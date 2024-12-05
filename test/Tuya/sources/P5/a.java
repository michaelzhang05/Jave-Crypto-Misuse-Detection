package P5;

import P5.g;
import X5.n;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a implements g.b {
    private final g.c key;

    public a(g.c key) {
        AbstractC3159y.i(key, "key");
        this.key = key;
    }

    @Override // P5.g.b, P5.g
    public <R> R fold(R r8, n nVar) {
        return (R) g.b.a.a(this, r8, nVar);
    }

    @Override // P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // P5.g.b
    public g.c getKey() {
        return this.key;
    }

    @Override // P5.g.b, P5.g
    public g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // P5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
