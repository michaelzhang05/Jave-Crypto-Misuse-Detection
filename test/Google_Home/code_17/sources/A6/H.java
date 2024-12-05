package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* loaded from: classes5.dex */
public final class H implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final H f513a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f514b = new k0("kotlin.Int", e.f.f41030a);

    private H() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f514b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Number) obj).intValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Integer.valueOf(decoder.o());
    }

    public void g(z6.f encoder, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.z(i8);
    }
}
