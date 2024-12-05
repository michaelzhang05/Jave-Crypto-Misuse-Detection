package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class E0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f39511a = new E0();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39512b = E.a("kotlin.UShort", AbstractC3808a.D(kotlin.jvm.internal.W.f33764a));

    private E0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39512b;
    }

    @Override // t6.InterfaceC3796a
    public /* bridge */ /* synthetic */ Object c(w6.e eVar) {
        return L5.F.a(f(eVar));
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((L5.F) obj).f());
    }

    public short f(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return L5.F.b(decoder.k(a()).D());
    }

    public void g(w6.f encoder, short s8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.F(a()).h(s8);
    }
}
