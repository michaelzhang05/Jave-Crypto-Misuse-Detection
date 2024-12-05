package A6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3254x;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class y0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f634a = new y0();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f635b = E.a("kotlin.UInt", AbstractC4193a.B(C3254x.f34192a));

    private y0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f635b;
    }

    @Override // w6.InterfaceC4150a
    public /* bridge */ /* synthetic */ Object b(z6.e eVar) {
        return O5.A.a(f(eVar));
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((O5.A) obj).f());
    }

    public int f(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return O5.A.b(decoder.i(a()).o());
    }

    public void g(z6.f encoder, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.l(a()).z(i8);
    }
}
