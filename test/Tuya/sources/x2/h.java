package X2;

import L5.p;
import M5.AbstractC1246t;
import Y2.h;
import e4.AbstractC2608f0;
import e4.C2597a;
import e4.C2598a0;
import e4.C2603d;
import e4.C2609g;
import e4.C2613i;
import e4.C2619l;
import e4.C2622m0;
import e4.C2623n;
import e4.C2625o;
import e4.C2626o0;
import e4.C2628p0;
import e4.C2637x;
import e4.G0;
import e4.L0;
import e4.N;
import e4.O;
import e4.O0;
import e4.W;
import e4.Y;
import e4.Z;
import e4.u0;
import e4.w0;
import e4.x0;
import e4.y0;
import e4.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import m4.D;
import m4.G;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a */
    private final h.a f12234a;

    public h(h.a arguments) {
        AbstractC3159y.i(arguments, "arguments");
        this.f12234a = arguments;
    }

    public static /* synthetic */ List b(h hVar, List list, List list2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            list2 = AbstractC1246t.m();
        }
        return hVar.a(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(List specs, List placeholderOverrideList) {
        D i8;
        AbstractC3159y.i(specs, "specs");
        AbstractC3159y.i(placeholderOverrideList, "placeholderOverrideList");
        List<AbstractC2608f0> f8 = w3.f.f39047a.f(specs, placeholderOverrideList, this.f12234a.h(), this.f12234a.a());
        ArrayList arrayList = new ArrayList();
        for (AbstractC2608f0 abstractC2608f0 : f8) {
            if (abstractC2608f0 instanceof O0) {
                i8 = ((O0) abstractC2608f0).i();
            } else if (abstractC2608f0 instanceof C2609g) {
                i8 = ((C2609g) abstractC2608f0).i();
            } else if (abstractC2608f0 instanceof C2603d) {
                i8 = ((C2603d) abstractC2608f0).i();
            } else {
                G g8 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (abstractC2608f0 instanceof C2598a0) {
                    i8 = new Z(g8, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
                } else if (abstractC2608f0 instanceof u0) {
                    i8 = ((u0) abstractC2608f0).i(this.f12234a.f());
                } else if (abstractC2608f0 instanceof C2619l) {
                    i8 = ((C2619l) abstractC2608f0).i(this.f12234a.f());
                } else if (abstractC2608f0 instanceof C2623n) {
                    i8 = ((C2623n) abstractC2608f0).i(this.f12234a.d());
                } else if (abstractC2608f0 instanceof C2625o) {
                    i8 = ((C2625o) abstractC2608f0).i(this.f12234a.f(), this.f12234a.d());
                } else if (abstractC2608f0 instanceof C2637x) {
                    i8 = ((C2637x) abstractC2608f0).i(this.f12234a.d());
                } else if (abstractC2608f0 instanceof x0) {
                    i8 = ((x0) abstractC2608f0).j();
                } else if (abstractC2608f0 instanceof w0) {
                    i8 = ((w0) abstractC2608f0).j(this.f12234a.d());
                } else if (abstractC2608f0 instanceof Y) {
                    i8 = ((Y) abstractC2608f0).i(this.f12234a.d());
                } else if (abstractC2608f0 instanceof y0) {
                    i8 = ((y0) abstractC2608f0).i(this.f12234a.d());
                } else if (abstractC2608f0 instanceof L0) {
                    i8 = ((L0) abstractC2608f0).j(this.f12234a.d());
                } else if (abstractC2608f0 instanceof C2613i) {
                    i8 = ((C2613i) abstractC2608f0).i(this.f12234a.d());
                } else if (abstractC2608f0 instanceof C2622m0) {
                    i8 = ((C2622m0) abstractC2608f0).i(this.f12234a.d());
                } else if (abstractC2608f0 instanceof C2626o0) {
                    i8 = ((C2626o0) abstractC2608f0).i();
                } else if (abstractC2608f0 instanceof W) {
                    i8 = ((W) abstractC2608f0).j(this.f12234a.d());
                } else if (abstractC2608f0 instanceof O) {
                    i8 = ((O) abstractC2608f0).j(this.f12234a.d());
                } else if (abstractC2608f0 instanceof C2597a) {
                    i8 = ((C2597a) abstractC2608f0).n(this.f12234a.d(), this.f12234a.j());
                } else if (abstractC2608f0 instanceof G0) {
                    i8 = ((G0) abstractC2608f0).i(this.f12234a.f());
                } else if (abstractC2608f0 instanceof z0) {
                    i8 = null;
                } else if (abstractC2608f0 instanceof N) {
                    i8 = ((N) abstractC2608f0).i(this.f12234a.f());
                } else if (abstractC2608f0 instanceof C2628p0) {
                    i8 = ((C2628p0) abstractC2608f0).i(this.f12234a.f());
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
