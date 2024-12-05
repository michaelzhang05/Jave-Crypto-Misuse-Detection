package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* loaded from: classes5.dex */
public final class r0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f39600a = new r0();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39601b = new k0("kotlin.String", e.i.f38902a);

    private r0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39601b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return decoder.t();
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, String value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        encoder.E(value);
    }
}
