package k6;

import L5.I;
import i6.K;
import k6.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r extends e implements s {
    public r(P5.g gVar, d dVar) {
        super(gVar, dVar, true, true);
    }

    @Override // i6.AbstractC2809a
    protected void L0(Throwable th, boolean z8) {
        if (!P0().p(th) && !z8) {
            K.a(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i6.AbstractC2809a
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public void M0(I i8) {
        v.a.a(P0(), null, 1, null);
    }

    @Override // i6.AbstractC2809a, i6.F0, i6.InterfaceC2855x0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // k6.s
    public /* bridge */ /* synthetic */ v o() {
        return O0();
    }
}
