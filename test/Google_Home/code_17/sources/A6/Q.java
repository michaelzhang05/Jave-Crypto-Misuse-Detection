package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* loaded from: classes5.dex */
public final class Q implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f522a = new Q();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f523b = new k0("kotlin.Long", e.g.f41031a);

    private Q() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f523b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Number) obj).longValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Long.valueOf(decoder.u());
    }

    public void g(z6.f encoder, long j8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.D(j8);
    }
}
