package A6;

import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

/* loaded from: classes5.dex */
public final class B0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f499a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f500b = E.a("kotlin.ULong", AbstractC4193a.C(kotlin.jvm.internal.A.f34155a));

    private B0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f500b;
    }

    @Override // w6.InterfaceC4150a
    public /* bridge */ /* synthetic */ Object b(z6.e eVar) {
        return O5.C.a(f(eVar));
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((O5.C) obj).g());
    }

    public long f(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return O5.C.b(decoder.i(a()).u());
    }

    public void g(z6.f encoder, long j8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.l(a()).D(j8);
    }
}
