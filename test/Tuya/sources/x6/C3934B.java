package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* renamed from: x6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3934B implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3934B f39502a = new C3934B();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39503b = new k0("kotlin.Float", e.C0898e.f38898a);

    private C3934B() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39503b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Number) obj).floatValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Float.valueOf(decoder.E());
    }

    public void g(w6.f encoder, float f8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.p(f8);
    }
}
