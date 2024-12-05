package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* loaded from: classes5.dex */
public final class q0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f591a = new q0();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f592b = new k0("kotlin.Short", e.h.f41032a);

    private q0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f592b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Number) obj).shortValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Short b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Short.valueOf(decoder.E());
    }

    public void g(z6.f encoder, short s8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.i(s8);
    }
}
