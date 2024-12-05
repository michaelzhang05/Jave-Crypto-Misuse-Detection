package Z2;

import M5.AbstractC1246t;
import Y2.h;
import a3.C1556a;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import e4.C0;
import e4.C2594H;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y2.AbstractC3984c;

/* renamed from: Z2.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1541y implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1541y f13395a = new C1541y();

    private C1541y() {
    }

    private final e4.t0 k(String str, T2.k kVar, boolean z8) {
        float m5178constructorimpl;
        m4.G a8 = m4.G.Companion.a("card_mandate");
        int i8 = q3.w.f37427C;
        if (kVar == T2.k.f9967b) {
            m5178constructorimpl = Dp.m5178constructorimpl(0);
        } else if (kVar == T2.k.f9966a) {
            m5178constructorimpl = Dp.m5178constructorimpl(4);
        } else if (z8) {
            m5178constructorimpl = Dp.m5178constructorimpl(6);
        } else {
            m5178constructorimpl = Dp.m5178constructorimpl(2);
        }
        return new e4.t0(a8, i8, AbstractC1246t.e(str), m5178constructorimpl, null, 16, null);
    }

    private final boolean l(Y2.d dVar) {
        return X2.f.a(o.p.f24532i.f24550a, dVar.T(), dVar.V(), dVar.I());
    }

    @Override // Y2.h.d
    public W2.a b(boolean z8) {
        int i8;
        if (z8) {
            i8 = b4.n.f14695H;
        } else {
            i8 = b4.n.f14694G;
        }
        return W2.a.b(j().c(), AbstractC3984c.a(i8), false, 0, null, null, false, 60, null);
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
        m4.D d8;
        T2.k kVar;
        m4.D c8;
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(arguments, "arguments");
        u.d s8 = metadata.s();
        List c9 = AbstractC1246t.c();
        d8 = AbstractC1540x.d(arguments.d(), s8.f(), s8.j());
        if (d8 != null) {
            c9.add(d8);
        }
        c9.add(new C2594H(arguments.b(), arguments.d(), s8.i(), arguments.c(), m4.G.Companion.a("card_details"), null, 32, null));
        if (s8.b() != u.d.a.f26392b) {
            c8 = AbstractC1540x.c(AbstractC1540x.e(s8.b()), arguments.d(), arguments.j());
            c9.add(c8);
        }
        C1541y c1541y = f13395a;
        boolean l8 = c1541y.l(metadata);
        if (l8) {
            c9.add(new C0(arguments.i(), arguments.f()));
        }
        if (metadata.L() != null && arguments.e() != null) {
            c9.add(new C1556a(metadata.L(), arguments.e(), arguments.g()));
            kVar = metadata.L().c();
        } else {
            kVar = null;
        }
        if (metadata.Y()) {
            c9.add(c1541y.k(metadata.Q(), kVar, l8));
        }
        return AbstractC1246t.a(c9);
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
        return new X2.g(C1539w.f13387a, null, b4.n.f14710W, b4.k.f14670o, true, null, 34, null);
    }
}
