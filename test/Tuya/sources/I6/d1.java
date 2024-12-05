package i6;

import P5.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d1 implements g.b, g.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f31755a = new d1();

    private d1() {
    }

    @Override // P5.g.b, P5.g
    public Object fold(Object obj, X5.n nVar) {
        return g.b.a.a(this, obj, nVar);
    }

    @Override // P5.g.b, P5.g
    public g.b get(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // P5.g
    public P5.g plus(P5.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // P5.g.b
    public g.c getKey() {
        return this;
    }
}
