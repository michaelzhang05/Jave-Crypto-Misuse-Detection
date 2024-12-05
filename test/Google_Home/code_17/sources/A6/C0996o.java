package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* renamed from: A6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0996o implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0996o f585a = new C0996o();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f586b = new k0("kotlin.Char", e.c.f41027a);

    private C0996o() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f586b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Character) obj).charValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Character b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Character.valueOf(decoder.j());
    }

    public void g(z6.f encoder, char c8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.t(c8);
    }
}
