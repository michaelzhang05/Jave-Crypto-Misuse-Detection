package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3158x;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class y0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f39639a = new y0();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39640b = E.a("kotlin.UInt", AbstractC3808a.B(C3158x.f33791a));

    private y0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39640b;
    }

    @Override // t6.InterfaceC3796a
    public /* bridge */ /* synthetic */ Object c(w6.e eVar) {
        return L5.A.a(f(eVar));
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((L5.A) obj).f());
    }

    public int f(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return L5.A.b(decoder.k(a()).o());
    }

    public void g(w6.f encoder, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.F(a()).z(i8);
    }
}
