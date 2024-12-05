package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* renamed from: x6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3948h implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3948h f39572a = new C3948h();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39573b = new k0("kotlin.Boolean", e.a.f38894a);

    private C3948h() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39573b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Boolean) obj).booleanValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Boolean.valueOf(decoder.g());
    }

    public void g(w6.f encoder, boolean z8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.n(z8);
    }
}
