package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* loaded from: classes5.dex */
public final class H implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final H f39518a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39519b = new k0("kotlin.Int", e.f.f38899a);

    private H() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39519b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Number) obj).intValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Integer.valueOf(decoder.o());
    }

    public void g(w6.f encoder, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.z(i8);
    }
}
