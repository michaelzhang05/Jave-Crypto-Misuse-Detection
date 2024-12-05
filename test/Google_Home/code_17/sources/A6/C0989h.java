package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* renamed from: A6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0989h implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0989h f567a = new C0989h();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f568b = new k0("kotlin.Boolean", e.a.f41025a);

    private C0989h() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f568b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Boolean) obj).booleanValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Boolean.valueOf(decoder.h());
    }

    public void g(z6.f encoder, boolean z8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.n(z8);
    }
}
