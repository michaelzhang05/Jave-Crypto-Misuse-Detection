package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* loaded from: classes5.dex */
public final class B implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final B f497a = new B();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f498b = new k0("kotlin.Float", e.C0935e.f41029a);

    private B() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f498b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Number) obj).floatValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Float.valueOf(decoder.F());
    }

    public void g(z6.f encoder, float f8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.r(f8);
    }
}
