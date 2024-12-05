package i6;

import L5.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class P0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final C2839p f31725e;

    public P0(C2839p c2839p) {
        this.f31725e = c2839p;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return L5.I.f6487a;
    }

    @Override // i6.AbstractC2806E
    public void r(Throwable th) {
        Object d02 = s().d0();
        if (d02 instanceof C2804C) {
            C2839p c2839p = this.f31725e;
            s.a aVar = L5.s.f6511b;
            c2839p.resumeWith(L5.s.b(L5.t.a(((C2804C) d02).f31678a)));
        } else {
            C2839p c2839p2 = this.f31725e;
            s.a aVar2 = L5.s.f6511b;
            c2839p2.resumeWith(L5.s.b(G0.h(d02)));
        }
    }
}
