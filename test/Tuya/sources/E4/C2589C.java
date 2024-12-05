package e4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import b3.EnumC1870e;
import c4.InterfaceC1925a;
import e4.InterfaceC2588B;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.InterfaceC3167b;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.C3409a0;
import m4.C3411b0;
import m4.C3431v;
import m4.G;

/* renamed from: e4.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2589C implements m4.m0, m4.j0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.q0 f30288a;

    /* renamed from: b, reason: collision with root package name */
    private final L f30289b;

    /* renamed from: c, reason: collision with root package name */
    private final S f30290c;

    /* renamed from: d, reason: collision with root package name */
    private final m4.q0 f30291d;

    /* renamed from: e, reason: collision with root package name */
    private final List f30292e;

    /* renamed from: f, reason: collision with root package name */
    private final List f30293f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30294g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.C$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m4.k0 f30297c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f30298d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f30299e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m4.G f30300f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f30301g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f30302h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f30303i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, m4.k0 k0Var, Modifier modifier, Set set, m4.G g8, int i8, int i9, int i10) {
            super(2);
            this.f30296b = z8;
            this.f30297c = k0Var;
            this.f30298d = modifier;
            this.f30299e = set;
            this.f30300f = g8;
            this.f30301g = i8;
            this.f30302h = i9;
            this.f30303i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C2589C.this.f(this.f30296b, this.f30297c, this.f30298d, this.f30299e, this.f30300f, this.f30301g, this.f30302h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30303i | 1));
        }
    }

    /* renamed from: e4.C$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f30304a;

        /* renamed from: e4.C$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f30305a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f30305a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new m4.C[this.f30305a.length];
            }
        }

        /* renamed from: e4.C$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0729b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f30306a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f30307b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f30308c;

            public C0729b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f30306a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f30307b;
                    m4.C c8 = (m4.C) AbstractC1246t.o0(AbstractC1246t.j0(AbstractC1239l.V0((Object[]) this.f30308c)));
                    this.f30306a = 1;
                    if (interfaceC3359g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0729b c0729b = new C0729b(dVar);
                c0729b.f30307b = interfaceC3359g;
                c0729b.f30308c = objArr;
                return c0729b.invokeSuspend(L5.I.f6487a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr) {
            this.f30304a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f30304a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new C0729b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* renamed from: e4.C$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f30309a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f30309a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f30309a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return (m4.C) AbstractC1246t.o0(AbstractC1246t.j0(arrayList));
        }
    }

    public C2589C(InterfaceC3167b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC1925a cbcEligibility, P5.g uiContext, P5.g workContext) {
        m4.q0 q0Var;
        InterfaceC2588B interfaceC2588B;
        InterfaceC3358f bVar;
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(initialValues, "initialValues");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(workContext, "workContext");
        if (z8) {
            m4.r0 r0Var = new m4.r0(Integer.valueOf(b4.n.f14690D), KeyboardCapitalization.Companion.m4898getWordsIUNYP9k(), KeyboardType.Companion.m4922getTextPjHm6EE(), null, 8, null);
            G.b bVar2 = m4.G.Companion;
            q0Var = new m4.q0(bVar2.r(), new m4.s0(r0Var, false, (String) initialValues.get(bVar2.r()), 2, null));
        } else {
            q0Var = null;
        }
        this.f30288a = q0Var;
        G.b bVar3 = m4.G.Companion;
        m4.G j8 = bVar3.j();
        C2596J c2596j = new C2596J();
        InterfaceC3167b a8 = cardAccountRangeRepositoryFactory.a();
        String str = (String) initialValues.get(bVar3.j());
        if (cbcEligibility instanceof InterfaceC1925a.b) {
            List b8 = ((InterfaceC1925a.b) cbcEligibility).b();
            String str2 = (String) initialValues.get(bVar3.v());
            interfaceC2588B = new InterfaceC2588B.a(b8, str2 != null ? EnumC1870e.f14436m.b(str2) : null);
        } else {
            if (!(cbcEligibility instanceof InterfaceC1925a.c)) {
                throw new L5.p();
            }
            interfaceC2588B = InterfaceC2588B.b.f30277a;
        }
        m4.q0 q0Var2 = q0Var;
        L l8 = new L(j8, new T(c2596j, a8, uiContext, workContext, null, str, false, interfaceC2588B, 80, null));
        this.f30289b = l8;
        S s8 = new S(bVar3.g(), new Q(new P(), l8.i().v(), (String) initialValues.get(bVar3.g()), false, 8, null));
        this.f30290c = s8;
        m4.G a9 = bVar3.a("date");
        C3431v c3431v = new C3431v();
        Object obj = initialValues.get(bVar3.h());
        String str3 = (String) initialValues.get(bVar3.i());
        m4.q0 q0Var3 = new m4.q0(a9, new m4.s0(c3431v, false, obj + (str3 != null ? g6.n.V0(str3, 2) : null), 2, null));
        this.f30291d = q0Var3;
        List p8 = AbstractC1246t.p(q0Var3, s8);
        this.f30292e = p8;
        this.f30293f = AbstractC1246t.r(q0Var2, l8, new C3411b0(bVar3.a("row_" + UUID.randomUUID().getLeastSignificantBits()), p8, new C3409a0(p8)));
        List r8 = AbstractC1246t.r(q0Var2, l8, q0Var3, s8);
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(r8, 10));
        Iterator it = r8.iterator();
        while (it.hasNext()) {
            arrayList.add(((m4.o0) it.next()).i());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m4.H) it2.next()).getError());
        }
        if (arrayList2.isEmpty()) {
            bVar = v4.g.n((m4.C) AbstractC1246t.o0(AbstractC1246t.j0(AbstractC1246t.m())));
        } else {
            bVar = new b((InterfaceC3358f[]) AbstractC1246t.W0(arrayList2).toArray(new InterfaceC3358f[0]));
        }
        this.f30294g = new v4.e(bVar, new c(arrayList2));
    }

    @Override // m4.j0
    public void f(boolean z8, m4.k0 field, Modifier modifier, Set hiddenIdentifiers, m4.G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1407073849);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407073849, i10, -1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:124)");
        }
        AbstractC2592F.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | (m4.G.f35073d << 9) | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f30294g;
    }

    public final S v() {
        return this.f30290c;
    }

    public final m4.q0 w() {
        return this.f30291d;
    }

    public final List x() {
        return this.f30293f;
    }

    public final m4.q0 y() {
        return this.f30288a;
    }

    public final L z() {
        return this.f30289b;
    }

    public /* synthetic */ C2589C(InterfaceC3167b.a aVar, Map map, boolean z8, InterfaceC1925a interfaceC1925a, P5.g gVar, P5.g gVar2, int i8, AbstractC3151p abstractC3151p) {
        this(aVar, map, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? InterfaceC1925a.c.f14983a : interfaceC1925a, (i8 & 16) != 0 ? C2812b0.c() : gVar, (i8 & 32) != 0 ? C2812b0.b() : gVar2);
    }
}
