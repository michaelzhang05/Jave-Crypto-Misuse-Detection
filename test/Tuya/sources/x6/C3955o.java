package x6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* renamed from: x6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3955o implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3955o f39590a = new C3955o();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39591b = new k0("kotlin.Char", e.c.f38896a);

    private C3955o() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39591b;
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((Character) obj).charValue());
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Character c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return Character.valueOf(decoder.h());
    }

    public void g(w6.f encoder, char c8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.q(c8);
    }
}
