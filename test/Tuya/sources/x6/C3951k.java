package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* renamed from: x6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3951k implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3951k f39579a = new C3951k();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39580b = new k0("kotlin.Byte", e.b.f38895a);

    private C3951k() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39580b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Number) obj).byteValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Byte c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Byte.valueOf(decoder.C());
    }

    public void g(w6.f encoder, byte b8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.l(b8);
    }
}
