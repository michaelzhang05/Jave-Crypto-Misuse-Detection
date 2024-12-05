package c3;

import a3.C1620b;
import a3.C1625g;
import a3.EnumC1619a;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;
import p4.h0;

/* loaded from: classes4.dex */
final class S implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final S f15607a = new S();

    private S() {
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

    @Override // b3.InterfaceC1974h.d
    public List g(C1970d metadata, InterfaceC1974h.a arguments) {
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(arguments, "arguments");
        G.b bVar = p4.G.Companion;
        return new C1620b(arguments).e(EnumC1619a.f13831a).e(EnumC1619a.f13833c).b(h0.a.c(p4.h0.f37539f, new p4.q0(bVar.o(), new p4.s0(new p4.r0(Integer.valueOf(e4.n.f31694C), KeyboardCapitalization.Companion.m4901getNoneIUNYP9k(), KeyboardType.Companion.m4926getPhonePjHm6EE(), null, 8, null), true, (String) arguments.d().get(bVar.o()))), null, 2, null)).a();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(Q.f15604a, null, e4.n.f31733g0, e4.k.f31684w, false, null, 50, null);
    }
}
