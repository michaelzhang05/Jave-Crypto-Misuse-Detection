package k4;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C3409a0;
import m4.C3411b0;
import m4.C3420j;
import m4.C3421k;
import m4.C3434y;
import m4.G;
import m4.Y;
import m4.o0;
import m4.q0;
import m4.r0;
import m4.s0;
import m4.v0;
import y6.AbstractC3999a;
import y6.C4002d;
import y6.o;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC3999a f33515a = o.b(null, b.f33517a, 1, null);

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33516a;

        static {
            int[] iArr = new int[EnumC3126f.values().length];
            try {
                iArr[EnumC3126f.f33477k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3126f.f33475i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33516a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33517a = new b();

        b() {
            super(1);
        }

        public final void a(C4002d Json) {
            AbstractC3159y.i(Json, "$this$Json");
            Json.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4002d) obj);
            return I.f6487a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List a(List list) {
        List m8 = AbstractC1246t.m();
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            o0 o0Var = (o0) obj;
            if (i9 < list.size() && d((o0) list.get(i8), (o0) list.get(i9))) {
                List p8 = AbstractC1246t.p(list.get(i8), list.get(i9));
                m8 = AbstractC1246t.H0(m8, new C3411b0(G.Companion.a("row_" + UUID.randomUUID().getLeastSignificantBits()), p8, new C3409a0(p8)));
            } else if (AbstractC1246t.z0(m8) instanceof C3411b0) {
                m8 = AbstractC1246t.H0(m8, null);
            } else {
                m8 = AbstractC1246t.H0(m8, o0Var);
            }
            i8 = i9;
        }
        return AbstractC1246t.j0(m8);
    }

    private static final int b(C3125e c3125e) {
        if (c3125e != null && c3125e.c()) {
            return KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();
        }
        return KeyboardType.Companion.m4922getTextPjHm6EE();
    }

    private static final boolean c(G g8) {
        G.b bVar = G.Companion;
        if (!AbstractC3159y.d(g8, bVar.u()) && !AbstractC3159y.d(g8, bVar.k())) {
            return false;
        }
        return true;
    }

    private static final boolean d(o0 o0Var, o0 o0Var2) {
        if (c(o0Var.a()) && c(o0Var2.a())) {
            return true;
        }
        return false;
    }

    private static final v0 e(EnumC3126f enumC3126f, int i8, int i9, int i10, String str) {
        if (a.f33516a[enumC3126f.ordinal()] == 2) {
            return new Y(i8, null, str, 2, null);
        }
        return new r0(Integer.valueOf(i8), i9, i10, null, 8, null);
    }

    private static final o0 f(EnumC3126f enumC3126f, G g8, int i8, int i9, int i10, String str, boolean z8) {
        C3420j.a bVar;
        q0 q0Var = new q0(g8, new s0(e(enumC3126f, i8, i9, i10, str), z8, null, 4, null));
        if (a.f33516a[enumC3126f.ordinal()] == 1 && AbstractC1246t.p("CA", "US").contains(str)) {
            if (AbstractC3159y.d(str, "CA")) {
                bVar = new C3420j.a.C0821a(0, null, 3, null);
            } else if (AbstractC3159y.d(str, "US")) {
                bVar = new C3420j.a.b(0, null, 3, null);
            } else {
                throw new IllegalArgumentException();
            }
            return new C3421k(g8, new C3434y(new C3420j(bVar), null, 2, null));
        }
        return q0Var;
    }

    public static final List g(List list, String countryCode) {
        o0 o0Var;
        int d8;
        g b8;
        AbstractC3159y.i(list, "<this>");
        AbstractC3159y.i(countryCode, "countryCode");
        ArrayList<C3124d> arrayList = new ArrayList();
        for (Object obj : list) {
            C3124d c3124d = (C3124d) obj;
            if (c3124d.d() != EnumC3126f.f33476j && c3124d.d() != EnumC3126f.f33474h) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3124d c3124d2 : arrayList) {
            EnumC3126f d9 = c3124d2.d();
            if (d9 != null) {
                G e8 = c3124d2.d().e();
                C3125e c8 = c3124d2.c();
                if (c8 != null && (b8 = c8.b()) != null) {
                    d8 = b8.c();
                } else {
                    d8 = c3124d2.d().d();
                }
                o0Var = f(d9, e8, d8, c3124d2.d().c(), b(c3124d2.c()), countryCode, !c3124d2.b());
            } else {
                o0Var = null;
            }
            if (o0Var != null) {
                arrayList2.add(o0Var);
            }
        }
        return a(arrayList2);
    }
}
