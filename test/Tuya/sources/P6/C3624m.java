package p6;

import i6.I;
import n6.AbstractC3500n;

/* renamed from: p6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3624m extends I {

    /* renamed from: a, reason: collision with root package name */
    public static final C3624m f37130a = new C3624m();

    private C3624m() {
    }

    @Override // i6.I
    public void dispatch(P5.g gVar, Runnable runnable) {
        C3614c.f37111g.F(runnable, AbstractC3623l.f37129h, false);
    }

    @Override // i6.I
    public void dispatchYield(P5.g gVar, Runnable runnable) {
        C3614c.f37111g.F(runnable, AbstractC3623l.f37129h, true);
    }

    @Override // i6.I
    public I limitedParallelism(int i8) {
        AbstractC3500n.a(i8);
        if (i8 >= AbstractC3623l.f37125d) {
            return this;
        }
        return super.limitedParallelism(i8);
    }
}
