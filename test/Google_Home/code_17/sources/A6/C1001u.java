package A6;

import k6.C3225a;
import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* renamed from: A6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1001u implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1001u f610a = new C1001u();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f611b = new k0("kotlin.time.Duration", e.i.f41033a);

    private C1001u() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f611b;
    }

    @Override // w6.InterfaceC4150a
    public /* bridge */ /* synthetic */ Object b(z6.e eVar) {
        return C3225a.e(f(eVar));
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((C3225a) obj).P());
    }

    public long f(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return C3225a.f34131b.c(decoder.t());
    }

    public void g(z6.f encoder, long j8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.E(C3225a.L(j8));
    }
}
