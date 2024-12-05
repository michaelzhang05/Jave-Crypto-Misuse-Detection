package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class B0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f39504a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39505b = E.a("kotlin.ULong", AbstractC3808a.C(kotlin.jvm.internal.A.f33754a));

    private B0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39505b;
    }

    @Override // t6.InterfaceC3796a
    public /* bridge */ /* synthetic */ Object c(w6.e eVar) {
        return L5.C.a(f(eVar));
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((L5.C) obj).g());
    }

    public long f(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return L5.C.b(decoder.k(a()).v());
    }

    public void g(w6.f encoder, long j8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.F(a()).C(j8);
    }
}
