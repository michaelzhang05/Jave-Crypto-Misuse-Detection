package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* loaded from: classes5.dex */
public final class q0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f39596a = new q0();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39597b = new k0("kotlin.Short", e.h.f38901a);

    private q0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39597b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Number) obj).shortValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Short c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Short.valueOf(decoder.D());
    }

    public void g(w6.f encoder, short s8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.h(s8);
    }
}
