package p6;

import S5.g;
import a6.InterfaceC1668n;

/* loaded from: classes5.dex */
public final class l implements S5.g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f37955a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ S5.g f37956b;

    public l(Throwable th, S5.g gVar) {
        this.f37955a = th;
        this.f37956b = gVar;
    }

    @Override // S5.g
    public Object fold(Object obj, InterfaceC1668n interfaceC1668n) {
        return this.f37956b.fold(obj, interfaceC1668n);
    }

    @Override // S5.g
    public g.b get(g.c cVar) {
        return this.f37956b.get(cVar);
    }

    @Override // S5.g
    public S5.g minusKey(g.c cVar) {
        return this.f37956b.minusKey(cVar);
    }

    @Override // S5.g
    public S5.g plus(S5.g gVar) {
        return this.f37956b.plus(gVar);
    }
}
