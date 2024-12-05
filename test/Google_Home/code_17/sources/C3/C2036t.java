package c3;

import a3.C1620b;
import a3.C1625g;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.C2952s;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import p4.h0;

/* renamed from: c3.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2036t implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2036t f15699a = new C2036t();

    private C2036t() {
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.d.a.c(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.d
    public Z2.a b(boolean z8) {
        return InterfaceC1974h.d.a.b(this, z8);
    }

    @Override // b3.InterfaceC1974h
    public boolean d(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.a(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h
    public Z2.a e(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, boolean z8) {
        return InterfaceC1974h.d.a.d(this, interfaceC1968b, c1970d, list, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b3.InterfaceC1974h.d
    public List g(C1970d metadata, InterfaceC1974h.a arguments) {
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(arguments, "arguments");
        return new C1620b(arguments).b(h0.a.c(p4.h0.f37539f, new C2952s(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, 2, null)).a();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(C2035s.f15695a, null, e4.n.f31714U, e4.k.f31674m, false, null, 50, null);
    }
}
