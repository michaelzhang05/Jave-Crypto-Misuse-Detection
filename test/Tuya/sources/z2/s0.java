package Z2;

import Y2.h;
import e4.R0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
final class s0 implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f13374a = new s0();

    private s0() {
    }

    @Override // Y2.h.d
    public W2.a b(boolean z8) {
        return h.d.a.b(this, z8);
    }

    @Override // Y2.h
    public W2.a e(Y2.b bVar, Y2.d dVar, List list, boolean z8) {
        return h.d.a.d(this, bVar, dVar, list, z8);
    }

    @Override // Y2.h
    public X2.g f(Y2.b bVar, List list) {
        return h.d.a.e(this, bVar, list);
    }

    @Override // Y2.h.d
    public List g(Y2.d metadata, h.a arguments) {
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(arguments, "arguments");
        return new X2.b(arguments).b(m4.h0.f35513f.b(new R0(null, 1, null), Integer.valueOf(b4.n.f14698K))).a();
    }

    @Override // Y2.h
    public boolean h(Y2.b bVar, List list) {
        return h.d.a.a(this, bVar, list);
    }

    @Override // Y2.h
    public List i(Y2.b bVar, Y2.d dVar, List list, h.a aVar) {
        return h.d.a.c(this, bVar, dVar, list, aVar);
    }

    @Override // Y2.h.d
    public X2.g j() {
        return new X2.g(r0.f13368a, null, b4.n.f14753t0, b4.k.f14652I, false, null, 50, null);
    }
}
