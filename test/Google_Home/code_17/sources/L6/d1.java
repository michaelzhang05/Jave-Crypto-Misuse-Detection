package l6;

import S5.g;
import a6.InterfaceC1668n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d1 implements g.b, g.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f34607a = new d1();

    private d1() {
    }

    @Override // S5.g.b, S5.g
    public Object fold(Object obj, InterfaceC1668n interfaceC1668n) {
        return g.b.a.a(this, obj, interfaceC1668n);
    }

    @Override // S5.g.b, S5.g
    public g.b get(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // S5.g
    public S5.g plus(S5.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // S5.g.b
    public g.c getKey() {
        return this;
    }
}
