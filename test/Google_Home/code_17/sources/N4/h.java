package n4;

import B6.o;
import O5.I;
import P5.AbstractC1378t;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import p4.C3752a0;
import p4.C3754b0;
import p4.C3763j;
import p4.C3764k;
import p4.C3777y;
import p4.G;
import p4.Y;
import p4.o0;
import p4.q0;
import p4.r0;
import p4.s0;
import p4.v0;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final B6.a f35507a = o.b(null, b.f35509a, 1, null);

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35508a;

        static {
            int[] iArr = new int[EnumC3481f.values().length];
            try {
                iArr[EnumC3481f.f35469k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3481f.f35467i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35508a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35509a = new b();

        b() {
            super(1);
        }

        public final void a(B6.d Json) {
            AbstractC3255y.i(Json, "$this$Json");
            Json.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B6.d) obj);
            return I.f8278a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List a(List list) {
        List m8 = AbstractC1378t.m();
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            o0 o0Var = (o0) obj;
            if (i9 < list.size() && d((o0) list.get(i8), (o0) list.get(i9))) {
                List p8 = AbstractC1378t.p(list.get(i8), list.get(i9));
                m8 = AbstractC1378t.H0(m8, new C3754b0(G.Companion.a("row_" + UUID.randomUUID().getLeastSignificantBits()), p8, new C3752a0(p8)));
            } else if (AbstractC1378t.z0(m8) instanceof C3754b0) {
                m8 = AbstractC1378t.H0(m8, null);
            } else {
                m8 = AbstractC1378t.H0(m8, o0Var);
            }
            i8 = i9;
        }
        return AbstractC1378t.j0(m8);
    }

    private static final int b(C3480e c3480e) {
        if (c3480e != null && c3480e.c()) {
            return KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();
        }
        return KeyboardType.Companion.m4927getTextPjHm6EE();
    }

    private static final boolean c(G g8) {
        G.b bVar = G.Companion;
        if (!AbstractC3255y.d(g8, bVar.u()) && !AbstractC3255y.d(g8, bVar.k())) {
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

    private static final v0 e(EnumC3481f enumC3481f, int i8, int i9, int i10, String str) {
        if (a.f35508a[enumC3481f.ordinal()] == 2) {
            return new Y(i8, null, str, 2, null);
        }
        return new r0(Integer.valueOf(i8), i9, i10, null, 8, null);
    }

    private static final o0 f(EnumC3481f enumC3481f, G g8, int i8, int i9, int i10, String str, boolean z8) {
        C3763j.a bVar;
        q0 q0Var = new q0(g8, new s0(e(enumC3481f, i8, i9, i10, str), z8, null, 4, null));
        if (a.f35508a[enumC3481f.ordinal()] == 1 && AbstractC1378t.p("CA", "US").contains(str)) {
            if (AbstractC3255y.d(str, "CA")) {
                bVar = new C3763j.a.C0851a(0, null, 3, null);
            } else if (AbstractC3255y.d(str, "US")) {
                bVar = new C3763j.a.b(0, null, 3, null);
            } else {
                throw new IllegalArgumentException();
            }
            return new C3764k(g8, new C3777y(new C3763j(bVar), null, 2, null));
        }
        return q0Var;
    }

    public static final List g(List list, String countryCode) {
        o0 o0Var;
        int d8;
        g b8;
        AbstractC3255y.i(list, "<this>");
        AbstractC3255y.i(countryCode, "countryCode");
        ArrayList<C3479d> arrayList = new ArrayList();
        for (Object obj : list) {
            C3479d c3479d = (C3479d) obj;
            if (c3479d.d() != EnumC3481f.f35468j && c3479d.d() != EnumC3481f.f35466h) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3479d c3479d2 : arrayList) {
            EnumC3481f d9 = c3479d2.d();
            if (d9 != null) {
                G e8 = c3479d2.d().e();
                C3480e c8 = c3479d2.c();
                if (c8 != null && (b8 = c8.b()) != null) {
                    d8 = b8.c();
                } else {
                    d8 = c3479d2.d().d();
                }
                o0Var = f(d9, e8, d8, c3479d2.d().c(), b(c3479d2.c()), countryCode, !c3479d2.b());
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
