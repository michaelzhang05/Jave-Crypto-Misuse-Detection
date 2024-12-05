package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class E0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f506a = new E0();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f507b = E.a("kotlin.UShort", AbstractC4193a.D(kotlin.jvm.internal.W.f34165a));

    private E0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f507b;
    }

    @Override // w6.InterfaceC4150a
    public /* bridge */ /* synthetic */ Object b(z6.e eVar) {
        return O5.F.a(f(eVar));
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((O5.F) obj).f());
    }

    public short f(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return O5.F.b(decoder.i(a()).E());
    }

    public void g(z6.f encoder, short s8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.l(a()).i(s8);
    }
}
