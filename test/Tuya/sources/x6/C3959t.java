package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* renamed from: x6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3959t implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3959t f39611a = new C3959t();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39612b = new k0("kotlin.Double", e.d.f38897a);

    private C3959t() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39612b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Number) obj).doubleValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Double.valueOf(decoder.H());
    }

    public void g(w6.f encoder, double d8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.g(d8);
    }
}
