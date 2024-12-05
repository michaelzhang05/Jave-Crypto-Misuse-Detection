package x6;

import h6.C2758a;
import kotlin.jvm.internal.AbstractC3159y;
import v6.e;

/* renamed from: x6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3960u implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3960u f39615a = new C3960u();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39616b = new k0("kotlin.time.Duration", e.i.f38902a);

    private C3960u() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39616b;
    }

    @Override // t6.InterfaceC3796a
    public /* bridge */ /* synthetic */ Object c(w6.e eVar) {
        return C2758a.e(f(eVar));
    }

    @Override // t6.i
    public /* bridge */ /* synthetic */ void e(w6.f fVar, Object obj) {
        g(fVar, ((C2758a) obj).L());
    }

    public long f(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return C2758a.f31409b.c(decoder.t());
    }

    public void g(w6.f encoder, long j8) {
        AbstractC3159y.i(encoder, "encoder");
        encoder.E(C2758a.H(j8));
    }
}
