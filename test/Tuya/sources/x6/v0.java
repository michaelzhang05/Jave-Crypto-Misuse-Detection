package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3145j;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class v0 implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f39624a = new v0();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39625b = E.a("kotlin.UByte", AbstractC3808a.x(C3145j.f33778a));

    private v0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39625b;
    }

    @Override // t6.InterfaceC3796a
    public /* bridge */ /* synthetic */ Object c(w6.e eVar) {
        return L5.y.a(f(eVar));
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((L5.y) obj).f());
    }

    public byte f(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return L5.y.b(decoder.k(a()).C());
    }

    public void g(w6.f encoder, byte b8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.F(a()).l(b8);
    }
}
