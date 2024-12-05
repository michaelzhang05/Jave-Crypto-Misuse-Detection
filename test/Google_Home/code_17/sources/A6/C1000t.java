package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* renamed from: A6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1000t implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1000t f606a = new C1000t();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f607b = new k0("kotlin.Double", e.d.f41028a);

    private C1000t() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f607b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Number) obj).doubleValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Double.valueOf(decoder.H());
    }

    public void g(z6.f encoder, double d8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.h(d8);
    }
}
