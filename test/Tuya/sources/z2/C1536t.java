package Z2;

import Y2.h;
import e4.C2632s;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import m4.h0;

/* renamed from: Z2.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1536t implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1536t f13375a = new C1536t();

    private C1536t() {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y2.h.d
    public List g(Y2.d metadata, h.a arguments) {
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(arguments, "arguments");
        return new X2.b(arguments).b(h0.a.c(m4.h0.f35513f, new C2632s(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, 2, null)).a();
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
        return new X2.g(C1535s.f13371a, null, b4.n.f14708U, b4.k.f14668m, false, null, 50, null);
    }
}
