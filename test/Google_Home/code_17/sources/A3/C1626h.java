package a3;

import O5.p;
import P5.AbstractC1378t;
import b3.InterfaceC1974h;
import h4.AbstractC2928f0;
import h4.C2917a;
import h4.C2918a0;
import h4.C2923d;
import h4.C2929g;
import h4.C2933i;
import h4.C2939l;
import h4.C2942m0;
import h4.C2943n;
import h4.C2945o;
import h4.C2946o0;
import h4.C2948p0;
import h4.C2957x;
import h4.G0;
import h4.L0;
import h4.N;
import h4.O;
import h4.O0;
import h4.W;
import h4.Y;
import h4.Z;
import h4.u0;
import h4.w0;
import h4.x0;
import h4.y0;
import h4.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import p4.D;
import p4.G;

/* renamed from: a3.h */
/* loaded from: classes4.dex */
public final class C1626h {

    /* renamed from: a */
    private final InterfaceC1974h.a f13855a;

    public C1626h(InterfaceC1974h.a arguments) {
        AbstractC3255y.i(arguments, "arguments");
        this.f13855a = arguments;
    }

    public static /* synthetic */ List b(C1626h c1626h, List list, List list2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            list2 = AbstractC1378t.m();
        }
        return c1626h.a(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(List specs, List placeholderOverrideList) {
        D i8;
        AbstractC3255y.i(specs, "specs");
        AbstractC3255y.i(placeholderOverrideList, "placeholderOverrideList");
        List<AbstractC2928f0> f8 = z3.f.f41170a.f(specs, placeholderOverrideList, this.f13855a.h(), this.f13855a.a());
        ArrayList arrayList = new ArrayList();
        for (AbstractC2928f0 abstractC2928f0 : f8) {
            if (abstractC2928f0 instanceof O0) {
                i8 = ((O0) abstractC2928f0).i();
            } else if (abstractC2928f0 instanceof C2929g) {
                i8 = ((C2929g) abstractC2928f0).i();
            } else if (abstractC2928f0 instanceof C2923d) {
                i8 = ((C2923d) abstractC2928f0).i();
            } else {
                G g8 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (abstractC2928f0 instanceof C2918a0) {
                    i8 = new Z(g8, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
                } else if (abstractC2928f0 instanceof u0) {
                    i8 = ((u0) abstractC2928f0).i(this.f13855a.f());
                } else if (abstractC2928f0 instanceof C2939l) {
                    i8 = ((C2939l) abstractC2928f0).i(this.f13855a.f());
                } else if (abstractC2928f0 instanceof C2943n) {
                    i8 = ((C2943n) abstractC2928f0).i(this.f13855a.d());
                } else if (abstractC2928f0 instanceof C2945o) {
                    i8 = ((C2945o) abstractC2928f0).i(this.f13855a.f(), this.f13855a.d());
                } else if (abstractC2928f0 instanceof C2957x) {
                    i8 = ((C2957x) abstractC2928f0).i(this.f13855a.d());
                } else if (abstractC2928f0 instanceof x0) {
                    i8 = ((x0) abstractC2928f0).l();
                } else if (abstractC2928f0 instanceof w0) {
                    i8 = ((w0) abstractC2928f0).l(this.f13855a.d());
                } else if (abstractC2928f0 instanceof Y) {
                    i8 = ((Y) abstractC2928f0).i(this.f13855a.d());
                } else if (abstractC2928f0 instanceof y0) {
                    i8 = ((y0) abstractC2928f0).i(this.f13855a.d());
                } else if (abstractC2928f0 instanceof L0) {
                    i8 = ((L0) abstractC2928f0).l(this.f13855a.d());
                } else if (abstractC2928f0 instanceof C2933i) {
                    i8 = ((C2933i) abstractC2928f0).i(this.f13855a.d());
                } else if (abstractC2928f0 instanceof C2942m0) {
                    i8 = ((C2942m0) abstractC2928f0).i(this.f13855a.d());
                } else if (abstractC2928f0 instanceof C2946o0) {
                    i8 = ((C2946o0) abstractC2928f0).i();
                } else if (abstractC2928f0 instanceof W) {
                    i8 = ((W) abstractC2928f0).l(this.f13855a.d());
                } else if (abstractC2928f0 instanceof O) {
                    i8 = ((O) abstractC2928f0).l(this.f13855a.d());
                } else if (abstractC2928f0 instanceof C2917a) {
                    i8 = ((C2917a) abstractC2928f0).s(this.f13855a.d(), this.f13855a.j());
                } else if (abstractC2928f0 instanceof G0) {
                    i8 = ((G0) abstractC2928f0).i(this.f13855a.f());
                } else if (abstractC2928f0 instanceof z0) {
                    i8 = null;
                } else if (abstractC2928f0 instanceof N) {
                    i8 = ((N) abstractC2928f0).i(this.f13855a.f());
                } else if (abstractC2928f0 instanceof C2948p0) {
                    i8 = ((C2948p0) abstractC2928f0).i(this.f13855a.f());
                } else {
                    throw new p();
                }
            }
            if (i8 != null) {
                arrayList.add(i8);
            }
        }
        return arrayList;
    }
}
