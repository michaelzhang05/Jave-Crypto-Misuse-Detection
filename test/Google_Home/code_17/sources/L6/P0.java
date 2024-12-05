package l6;

import O5.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class P0 extends E0 {

    /* renamed from: e, reason: collision with root package name */
    private final C3374p f34577e;

    public P0(C3374p c3374p) {
        this.f34577e = c3374p;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return O5.I.f8278a;
    }

    @Override // l6.AbstractC3341E
    public void r(Throwable th) {
        Object d02 = s().d0();
        if (d02 instanceof C3339C) {
            C3374p c3374p = this.f34577e;
            s.a aVar = O5.s.f8302b;
            c3374p.resumeWith(O5.s.b(O5.t.a(((C3339C) d02).f34530a)));
        } else {
            C3374p c3374p2 = this.f34577e;
            s.a aVar2 = O5.s.f8302b;
            c3374p2.resumeWith(O5.s.b(G0.h(d02)));
        }
    }
}
