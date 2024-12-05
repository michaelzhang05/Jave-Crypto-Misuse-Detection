package c3;

import a3.C1625g;
import a3.C1626h;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.C2927f;
import h4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2021d implements InterfaceC1974h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2021d f15635a = new C2021d();

    private C2021d() {
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.c.a.d(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.c
    public Z2.a c(H0 h02) {
        return InterfaceC1974h.c.a.c(this, h02);
    }

    @Override // b3.InterfaceC1974h
    public boolean d(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.a(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h
    public Z2.a e(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, boolean z8) {
        return InterfaceC1974h.c.a.e(this, interfaceC1968b, c1970d, list, z8);
    }

    @Override // b3.InterfaceC1974h.c
    public List f(C1970d c1970d, H0 h02, C1626h c1626h) {
        return InterfaceC1974h.c.a.b(this, c1970d, h02, c1626h);
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.f(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.c
    public C1625g i(H0 sharedDataSpec) {
        int i8;
        B2.b a8;
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        C2020c c2020c = C2020c.f15631a;
        C2927f.a aVar = C2927f.f32594e;
        if (aVar.a()) {
            i8 = e4.n.f31718Y;
        } else {
            i8 = e4.n.f31706M;
        }
        int i9 = i8;
        int i10 = e4.k.f31667f;
        if (aVar.a()) {
            a8 = B2.c.a(t3.w.f39781e);
        } else {
            a8 = B2.c.a(t3.w.f39775b);
        }
        return new C1625g(c2020c, sharedDataSpec, i9, i10, false, a8, 16, null);
    }
}
