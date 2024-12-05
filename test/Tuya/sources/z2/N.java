package Z2;

import M5.AbstractC1246t;
import Y2.h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
final class N implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final N f13275a = new N();

    private N() {
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
        return AbstractC1246t.m();
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
        return new X2.g(M.f13272a.getType().f24550a, b4.n.f14723e0, b4.k.f14666k, true, (String) null, (String) null, (InterfaceC3983b) null, 64, (AbstractC3151p) null);
    }
}
