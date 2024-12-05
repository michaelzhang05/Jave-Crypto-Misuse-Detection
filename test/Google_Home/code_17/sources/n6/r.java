package n6;

import O5.I;
import l6.K;
import n6.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r extends e implements s {
    public r(S5.g gVar, d dVar) {
        super(gVar, dVar, true, true);
    }

    @Override // l6.AbstractC3344a
    protected void K0(Throwable th, boolean z8) {
        if (!O0().q(th) && !z8) {
            K.a(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l6.AbstractC3344a
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void L0(I i8) {
        v.a.a(O0(), null, 1, null);
    }

    @Override // l6.AbstractC3344a, l6.F0, l6.InterfaceC3390x0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // n6.s
    public /* bridge */ /* synthetic */ v l() {
        return N0();
    }
}
