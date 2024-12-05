package Z2;

import Y2.h;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import m4.h0;

/* loaded from: classes4.dex */
final class S implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final S f13283a = new S();

    private S() {
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
        G.b bVar = m4.G.Companion;
        return new X2.b(arguments).e(X2.a.f12210a).e(X2.a.f12212c).b(h0.a.c(m4.h0.f35513f, new m4.q0(bVar.o(), new m4.s0(new m4.r0(Integer.valueOf(b4.n.f14688C), KeyboardCapitalization.Companion.m4896getNoneIUNYP9k(), KeyboardType.Companion.m4921getPhonePjHm6EE(), null, 8, null), true, (String) arguments.d().get(bVar.o()))), null, 2, null)).a();
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
        return new X2.g(Q.f13280a, null, b4.n.f14727g0, b4.k.f14678w, false, null, 50, null);
    }
}
