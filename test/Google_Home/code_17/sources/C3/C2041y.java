package c3;

import P5.AbstractC1378t;
import a3.AbstractC1624f;
import a3.C1625g;
import androidx.compose.ui.unit.Dp;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import d3.C2736a;
import h4.C0;
import h4.C2914H;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2041y implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2041y f15719a = new C2041y();

    private C2041y() {
    }

    private final h4.t0 k(String str, W2.k kVar, boolean z8) {
        float m5183constructorimpl;
        p4.G a8 = p4.G.Companion.a("card_mandate");
        int i8 = t3.w.f39749C;
        if (kVar == W2.k.f11624b) {
            m5183constructorimpl = Dp.m5183constructorimpl(0);
        } else if (kVar == W2.k.f11623a) {
            m5183constructorimpl = Dp.m5183constructorimpl(4);
        } else if (z8) {
            m5183constructorimpl = Dp.m5183constructorimpl(6);
        } else {
            m5183constructorimpl = Dp.m5183constructorimpl(2);
        }
        return new h4.t0(a8, i8, AbstractC1378t.e(str), m5183constructorimpl, null, 16, null);
    }

    private final boolean l(C1970d c1970d) {
        return AbstractC1624f.a(o.p.f25587i.f25605a, c1970d.U(), c1970d.W(), c1970d.z());
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.d.a.c(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.d
    public Z2.a b(boolean z8) {
        int i8;
        if (z8) {
            i8 = e4.n.f31701H;
        } else {
            i8 = e4.n.f31700G;
        }
        return Z2.a.b(j().c(), B2.c.a(i8), false, 0, null, null, false, 60, null);
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
        p4.D d8;
        W2.k kVar;
        p4.D c8;
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(arguments, "arguments");
        u.d v8 = metadata.v();
        List c9 = AbstractC1378t.c();
        d8 = AbstractC2040x.d(arguments.d(), v8.h(), v8.l());
        if (d8 != null) {
            c9.add(d8);
        }
        c9.add(new C2914H(arguments.b(), arguments.d(), v8.i(), arguments.c(), p4.G.Companion.a("card_details"), null, 32, null));
        if (v8.a() != u.d.a.f27447b) {
            c8 = AbstractC2040x.c(AbstractC2040x.e(v8.a()), arguments.d(), arguments.j());
            c9.add(c8);
        }
        C2041y c2041y = f15719a;
        boolean l8 = c2041y.l(metadata);
        if (l8) {
            c9.add(new C0(arguments.i(), arguments.f()));
        }
        if (metadata.H() != null && arguments.e() != null) {
            c9.add(new C2736a(metadata.H(), arguments.e(), arguments.g()));
            kVar = metadata.H().b();
        } else {
            kVar = null;
        }
        if (metadata.Y()) {
            c9.add(c2041y.k(metadata.J(), kVar, l8));
        }
        return AbstractC1378t.a(c9);
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(C2039w.f15711a, null, e4.n.f31716W, e4.k.f31676o, true, null, 34, null);
    }
}
