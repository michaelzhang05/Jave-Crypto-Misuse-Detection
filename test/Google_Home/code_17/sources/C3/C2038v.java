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
import p4.h0;

/* renamed from: c3.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2038v implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2038v f15707a = new C2038v();

    private C2038v() {
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
        p4.G a8 = p4.G.Companion.a("boleto[tax_id]");
        return new C1620b(arguments).e(EnumC1619a.f13831a).e(EnumC1619a.f13833c).b(h0.a.c(p4.h0.f37539f, new p4.q0(a8, new p4.s0(new p4.r0(Integer.valueOf(e4.n.f31742l), KeyboardCapitalization.Companion.m4901getNoneIUNYP9k(), KeyboardType.Companion.m4920getAsciiPjHm6EE(), null, 8, null), false, (String) arguments.d().get(a8), 2, null)), null, 2, null)).c(P5.a0.d("BR")).a();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(C2037u.f15703a, null, e4.n.f31715V, e4.k.f31675n, false, null, 50, null);
    }
}
