package s6;

import l6.I;
import q6.AbstractC3879n;

/* renamed from: s6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C4018m extends I {

    /* renamed from: a, reason: collision with root package name */
    public static final C4018m f39329a = new C4018m();

    private C4018m() {
    }

    @Override // l6.I
    public void dispatch(S5.g gVar, Runnable runnable) {
        C4008c.f39310g.F(runnable, AbstractC4017l.f39328h, false);
    }

    @Override // l6.I
    public void dispatchYield(S5.g gVar, Runnable runnable) {
        C4008c.f39310g.F(runnable, AbstractC4017l.f39328h, true);
    }

    @Override // l6.I
    public I limitedParallelism(int i8) {
        AbstractC3879n.a(i8);
        if (i8 >= AbstractC4017l.f39324d) {
            return this;
        }
        return super.limitedParallelism(i8);
    }
}
