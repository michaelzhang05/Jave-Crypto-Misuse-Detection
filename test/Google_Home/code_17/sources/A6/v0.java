package A6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3241j;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class v0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f619a = new v0();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f620b = E.a("kotlin.UByte", AbstractC4193a.x(C3241j.f34179a));

    private v0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f620b;
    }

    @Override // w6.InterfaceC4150a
    public /* bridge */ /* synthetic */ Object b(z6.e eVar) {
        return O5.y.a(f(eVar));
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((O5.y) obj).f());
    }

    public byte f(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return O5.y.b(decoder.i(a()).C());
    }

    public void g(z6.f encoder, byte b8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.l(a()).m(b8);
    }
}
