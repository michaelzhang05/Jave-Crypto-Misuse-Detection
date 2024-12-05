package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* loaded from: classes5.dex */
public final class Q implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f39527a = new Q();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39528b = new k0("kotlin.Long", e.g.f38900a);

    private Q() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39528b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Number) obj).longValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Long.valueOf(decoder.v());
    }

    public void g(w6.f encoder, long j8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.C(j8);
    }
}
