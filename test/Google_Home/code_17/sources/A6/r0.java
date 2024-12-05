package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* loaded from: classes5.dex */
public final class r0 implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f595a = new r0();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f596b = new k0("kotlin.String", e.i.f41033a);

    private r0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f596b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return decoder.t();
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, String value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        encoder.E(value);
    }
}
