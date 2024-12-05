package h4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import e3.EnumC2791e;
import f4.InterfaceC2835a;
import h4.InterfaceC2908B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3347b0;
import o2.InterfaceC3515b;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p4.C3752a0;
import p4.C3754b0;
import p4.C3774v;
import p4.G;

/* renamed from: h4.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2909C implements p4.m0, p4.j0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.q0 f32209a;

    /* renamed from: b, reason: collision with root package name */
    private final L f32210b;

    /* renamed from: c, reason: collision with root package name */
    private final S f32211c;

    /* renamed from: d, reason: collision with root package name */
    private final p4.q0 f32212d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32213e;

    /* renamed from: f, reason: collision with root package name */
    private final List f32214f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f32215g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.C$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32217b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p4.k0 f32218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f32219d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f32220e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p4.G f32221f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f32222g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f32223h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f32224i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, p4.k0 k0Var, Modifier modifier, Set set, p4.G g8, int i8, int i9, int i10) {
            super(2);
            this.f32217b = z8;
            this.f32218c = k0Var;
            this.f32219d = modifier;
            this.f32220e = set;
            this.f32221f = g8;
            this.f32222g = i8;
            this.f32223h = i9;
            this.f32224i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C2909C.this.c(this.f32217b, this.f32218c, this.f32219d, this.f32220e, this.f32221f, this.f32222g, this.f32223h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32224i | 1));
        }
    }

    /* renamed from: h4.C$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f32225a;

        /* renamed from: h4.C$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f32226a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f32226a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new p4.C[this.f32226a.length];
            }
        }

        /* renamed from: h4.C$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0755b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f32227a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f32228b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32229c;

            public C0755b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f32227a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f32228b;
                    p4.C c8 = (p4.C) AbstractC1378t.o0(AbstractC1378t.j0(AbstractC1371l.V0((Object[]) this.f32229c)));
                    this.f32227a = 1;
                    if (interfaceC3707g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                C0755b c0755b = new C0755b(dVar);
                c0755b.f32228b = interfaceC3707g;
                c0755b.f32229c = objArr;
                return c0755b.invokeSuspend(O5.I.f8278a);
            }
        }

        public b(InterfaceC3706f[] interfaceC3706fArr) {
            this.f32225a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f32225a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new C0755b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* renamed from: h4.C$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f32230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f32230a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f32230a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return (p4.C) AbstractC1378t.o0(AbstractC1378t.j0(arrayList));
        }
    }

    public C2909C(InterfaceC3515b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2835a cbcEligibility, S5.g uiContext, S5.g workContext) {
        p4.q0 q0Var;
        InterfaceC2908B interfaceC2908B;
        InterfaceC3706f bVar;
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(initialValues, "initialValues");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(workContext, "workContext");
        if (z8) {
            p4.r0 r0Var = new p4.r0(Integer.valueOf(e4.n.f31696D), KeyboardCapitalization.Companion.m4903getWordsIUNYP9k(), KeyboardType.Companion.m4927getTextPjHm6EE(), null, 8, null);
            G.b bVar2 = p4.G.Companion;
            q0Var = new p4.q0(bVar2.r(), new p4.s0(r0Var, false, (String) initialValues.get(bVar2.r()), 2, null));
        } else {
            q0Var = null;
        }
        this.f32209a = q0Var;
        G.b bVar3 = p4.G.Companion;
        p4.G j8 = bVar3.j();
        C2916J c2916j = new C2916J();
        InterfaceC3515b a8 = cardAccountRangeRepositoryFactory.a();
        String str = (String) initialValues.get(bVar3.j());
        if (cbcEligibility instanceof InterfaceC2835a.b) {
            List a9 = ((InterfaceC2835a.b) cbcEligibility).a();
            String str2 = (String) initialValues.get(bVar3.v());
            interfaceC2908B = new InterfaceC2908B.a(a9, str2 != null ? EnumC2791e.f31442m.b(str2) : null);
        } else {
            if (!(cbcEligibility instanceof InterfaceC2835a.c)) {
                throw new O5.p();
            }
            interfaceC2908B = InterfaceC2908B.b.f32198a;
        }
        p4.q0 q0Var2 = q0Var;
        L l8 = new L(j8, new T(c2916j, a8, uiContext, workContext, null, str, false, interfaceC2908B, 80, null));
        this.f32210b = l8;
        S s8 = new S(bVar3.g(), new Q(new P(), l8.i().v(), (String) initialValues.get(bVar3.g()), false, 8, null));
        this.f32211c = s8;
        p4.G a10 = bVar3.a("date");
        C3774v c3774v = new C3774v();
        Object obj = initialValues.get(bVar3.h());
        String str3 = (String) initialValues.get(bVar3.i());
        p4.q0 q0Var3 = new p4.q0(a10, new p4.s0(c3774v, false, obj + (str3 != null ? j6.n.V0(str3, 2) : null), 2, null));
        this.f32212d = q0Var3;
        List p8 = AbstractC1378t.p(q0Var3, s8);
        this.f32213e = p8;
        this.f32214f = AbstractC1378t.r(q0Var2, l8, new C3754b0(bVar3.a("row_" + UUID.randomUUID().getLeastSignificantBits()), p8, new C3752a0(p8)));
        List r8 = AbstractC1378t.r(q0Var2, l8, q0Var3, s8);
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(r8, 10));
        Iterator it = r8.iterator();
        while (it.hasNext()) {
            arrayList.add(((p4.o0) it.next()).i());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((p4.H) it2.next()).getError());
        }
        if (arrayList2.isEmpty()) {
            bVar = y4.g.n((p4.C) AbstractC1378t.o0(AbstractC1378t.j0(AbstractC1378t.m())));
        } else {
            bVar = new b((InterfaceC3706f[]) AbstractC1378t.W0(arrayList2).toArray(new InterfaceC3706f[0]));
        }
        this.f32215g = new y4.e(bVar, new c(arrayList2));
    }

    @Override // p4.j0
    public void c(boolean z8, p4.k0 field, Modifier modifier, Set hiddenIdentifiers, p4.G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1407073849);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407073849, i10, -1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:124)");
        }
        AbstractC2912F.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | (p4.G.f37099d << 9) | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f32215g;
    }

    public final S v() {
        return this.f32211c;
    }

    public final p4.q0 w() {
        return this.f32212d;
    }

    public final List x() {
        return this.f32214f;
    }

    public final p4.q0 y() {
        return this.f32209a;
    }

    public final L z() {
        return this.f32210b;
    }

    public /* synthetic */ C2909C(InterfaceC3515b.a aVar, Map map, boolean z8, InterfaceC2835a interfaceC2835a, S5.g gVar, S5.g gVar2, int i8, AbstractC3247p abstractC3247p) {
        this(aVar, map, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? InterfaceC2835a.c.f31958a : interfaceC2835a, (i8 & 16) != 0 ? C3347b0.c() : gVar, (i8 & 32) != 0 ? C3347b0.b() : gVar2);
    }
}
