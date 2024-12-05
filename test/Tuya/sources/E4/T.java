package e4;

import M5.AbstractC1246t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import b3.C1866a;
import b3.EnumC1870e;
import b4.AbstractC1879a;
import e4.InterfaceC2588B;
import h4.AbstractC2755b;
import h4.InterfaceC2754a;
import j2.AbstractC3053E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.C3168c;
import l2.InterfaceC3167b;
import l2.f;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import m4.A0;
import m4.x0;
import r4.C3688a;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class T extends K {

    /* renamed from: G, reason: collision with root package name */
    private static final a f30541G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    public static final int f30542H = 8;

    /* renamed from: A, reason: collision with root package name */
    private final l6.v f30543A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC3349K f30544B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3349K f30545C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC3349K f30546D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC3349K f30547E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3349K f30548F;

    /* renamed from: b, reason: collision with root package name */
    private final C2596J f30549b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30550c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30551d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2588B f30552e;

    /* renamed from: f, reason: collision with root package name */
    private final int f30553f;

    /* renamed from: g, reason: collision with root package name */
    private final int f30554g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f30555h;

    /* renamed from: i, reason: collision with root package name */
    private final String f30556i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3349K f30557j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.v f30558k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3349K f30559l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f30560m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f30561n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f30562o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f30563p;

    /* renamed from: q, reason: collision with root package name */
    private final List f30564q;

    /* renamed from: r, reason: collision with root package name */
    private final l6.v f30565r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3349K f30566s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f30567t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f30568u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f30569v;

    /* renamed from: w, reason: collision with root package name */
    private final C3168c f30570w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3349K f30571x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3349K f30572y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3349K f30573z;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f30574a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2754a f30576c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f30577a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f30578b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2754a f30579c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC2754a interfaceC2754a, P5.d dVar) {
                super(2, dVar);
                this.f30579c = interfaceC2754a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                a aVar = new a(this.f30579c, dVar);
                aVar.f30578b = obj;
                return aVar;
            }

            @Override // X5.n
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m4.y0 y0Var, P5.d dVar) {
                return ((a) create(y0Var, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f30577a == 0) {
                    L5.t.b(obj);
                    if (((m4.y0) this.f30578b) instanceof A0.a) {
                        this.f30579c.a();
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2754a interfaceC2754a, P5.d dVar) {
            super(2, dVar);
            this.f30576c = interfaceC2754a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f30576c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f30574a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f o8 = AbstractC3360h.o(T.this.o(), 1);
                a aVar = new a(this.f30576c, null);
                this.f30574a = 1;
                if (AbstractC3360h.h(o8, aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30581b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m4.k0 f30582c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f30583d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f30584e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m4.G f30585f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f30586g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f30587h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f30588i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, m4.k0 k0Var, Modifier modifier, Set set, m4.G g8, int i8, int i9, int i10) {
            super(2);
            this.f30581b = z8;
            this.f30582c = k0Var;
            this.f30583d = modifier;
            this.f30584e = set;
            this.f30585f = g8;
            this.f30586g = i8;
            this.f30587h = i9;
            this.f30588i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.this.f(this.f30581b, this.f30582c, this.f30583d, this.f30584e, this.f30585f, this.f30586g, this.f30587h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30588i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements X5.n {
        d() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m4.y0 invoke(EnumC1870e brand, String fieldValue) {
            int n8;
            AbstractC3159y.i(brand, "brand");
            AbstractC3159y.i(fieldValue, "fieldValue");
            C2596J c2596j = T.this.f30549b;
            C1866a d8 = T.this.D().d();
            if (d8 != null) {
                n8 = d8.e();
            } else {
                n8 = brand.n(fieldValue);
            }
            return c2596j.c(brand, fieldValue, n8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements C3168c.a {
        e() {
        }

        @Override // l2.C3168c.a
        public void a(List accountRanges) {
            AbstractC3159y.i(accountRanges, "accountRanges");
            C1866a c1866a = (C1866a) AbstractC1246t.o0(accountRanges);
            if (c1866a != null) {
                int e8 = c1866a.e();
                VisualTransformation d8 = T.this.d();
                AbstractC3159y.g(d8, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.CardNumberVisualTransformation");
                ((M) d8).a(Integer.valueOf(e8));
            }
            List list = accountRanges;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1866a) it.next()).c());
            }
            T.this.f30563p.setValue(AbstractC1246t.e0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(T.this.f30562o);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f30592a = new g();

        g() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC1870e invoke(List choices, EnumC1870e selected) {
            AbstractC3159y.i(choices, "choices");
            AbstractC3159y.i(selected, "selected");
            EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.M0(choices);
            if (enumC1870e != null) {
                return enumC1870e;
            }
            return selected;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f30593a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return AbstractC1879a.a(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f30594a = new i();

        i() {
            super(2);
        }

        public final m4.C a(boolean z8, m4.y0 fieldState) {
            AbstractC3159y.i(fieldState, "fieldState");
            m4.C error = fieldState.getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (m4.y0) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f30595a = new j();

        j() {
            super(2);
        }

        public final C3688a a(boolean z8, String value) {
            AbstractC3159y.i(value, "value");
            return new C3688a(value, z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3160z implements Function1 {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC1870e invoke(String it) {
            EnumC1870e c8;
            AbstractC3159y.i(it, "it");
            C1866a d8 = T.this.D().d();
            if (d8 == null || (c8 = d8.c()) == null) {
                EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.o0(EnumC1870e.f14436m.c(it));
                if (enumC1870e == null) {
                    return EnumC1870e.f14446w;
                }
                return enumC1870e;
            }
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f30597a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(m4.y0 it) {
            AbstractC3159y.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3160z implements Function1 {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return T.this.f30549b.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3160z implements X5.n {
        n() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC1870e invoke(EnumC1870e enumC1870e, List choices) {
            Object obj;
            AbstractC3159y.i(choices, "choices");
            EnumC1870e enumC1870e2 = EnumC1870e.f14446w;
            if (enumC1870e != enumC1870e2) {
                if (AbstractC1246t.d0(choices, enumC1870e)) {
                    if (enumC1870e == null) {
                        return enumC1870e2;
                    }
                    return enumC1870e;
                }
                Iterator it = T.this.f30564q.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (choices.contains((EnumC1870e) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                EnumC1870e enumC1870e3 = (EnumC1870e) obj;
                if (enumC1870e3 == null) {
                    return EnumC1870e.f14446w;
                }
                return enumC1870e3;
            }
            return enumC1870e;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3160z implements X5.o {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30601a;

            static {
                int[] iArr = new int[EnumC1870e.values().length];
                try {
                    iArr[EnumC1870e.f14446w.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f30601a = iArr;
            }
        }

        o() {
            super(3);
        }

        @Override // X5.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m4.x0 invoke(String number, List brands, EnumC1870e chosen) {
            x0.a.C0823a c0823a;
            AbstractC3159y.i(number, "number");
            AbstractC3159y.i(brands, "brands");
            AbstractC3159y.i(chosen, "chosen");
            if (T.this.f30562o && number.length() > 0) {
                EnumC1870e enumC1870e = EnumC1870e.f14446w;
                x0.a.C0823a c0823a2 = new x0.a.C0823a(enumC1870e.f(), AbstractC3984c.a(AbstractC3053E.f32864W), enumC1870e.l());
                boolean z8 = false;
                if (brands.size() == 1) {
                    EnumC1870e enumC1870e2 = (EnumC1870e) brands.get(0);
                    c0823a = new x0.a.C0823a(enumC1870e2.f(), AbstractC3984c.b(enumC1870e2.h()), enumC1870e2.l());
                } else if (a.f30601a[chosen.ordinal()] == 1) {
                    c0823a = null;
                } else {
                    c0823a = new x0.a.C0823a(chosen.f(), AbstractC3984c.b(chosen.h()), chosen.l());
                }
                List<EnumC1870e> list = brands;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                for (EnumC1870e enumC1870e3 : list) {
                    arrayList.add(new x0.a.C0823a(enumC1870e3.f(), AbstractC3984c.b(enumC1870e3.h()), enumC1870e3.l()));
                }
                InterfaceC3983b a8 = AbstractC3984c.a(AbstractC3053E.f32865X);
                if (c0823a != null) {
                    c0823a2 = c0823a;
                }
                if (brands.size() < 2) {
                    z8 = true;
                }
                return new x0.a(a8, z8, c0823a2, arrayList);
            }
            if (T.this.D().d() != null) {
                C1866a d8 = T.this.D().d();
                AbstractC3159y.f(d8);
                return new x0.c(d8.c().l(), null, false, null, 10, null);
            }
            List c8 = EnumC1870e.f14436m.c(number);
            ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(c8, 10));
            Iterator it = c8.iterator();
            while (it.hasNext()) {
                arrayList2.add(new x0.c(((EnumC1870e) it.next()).l(), null, false, null, 10, null));
            }
            List Q02 = AbstractC1246t.Q0(arrayList2, 3);
            ArrayList arrayList3 = new ArrayList(AbstractC1246t.x(c8, 10));
            Iterator it2 = c8.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new x0.c(((EnumC1870e) it2.next()).l(), null, false, null, 10, null));
            }
            return new x0.b(Q02, AbstractC1246t.f0(arrayList3, 3));
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f30602a = new p();

        p() {
            super(2);
        }

        public final Boolean a(m4.y0 fieldState, boolean z8) {
            AbstractC3159y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((m4.y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public /* synthetic */ T(C2596J c2596j, InterfaceC3167b interfaceC3167b, P5.g gVar, P5.g gVar2, l2.p pVar, String str, boolean z8, InterfaceC2588B interfaceC2588B, int i8, AbstractC3151p abstractC3151p) {
        this(c2596j, interfaceC3167b, gVar, gVar2, (i8 & 16) != 0 ? new l2.k() : pVar, str, (i8 & 64) != 0 ? false : z8, (i8 & 128) != 0 ? InterfaceC2588B.b.f30277a : interfaceC2588B);
    }

    public final C3168c D() {
        return this.f30570w;
    }

    public InterfaceC3349K E() {
        return this.f30560m;
    }

    @Override // m4.w0
    public InterfaceC3349K a() {
        return this.f30544B;
    }

    @Override // m4.w0
    public InterfaceC3349K b() {
        return this.f30557j;
    }

    @Override // m4.w0
    public InterfaceC3349K c() {
        return this.f30571x;
    }

    @Override // m4.w0
    public VisualTransformation d() {
        return this.f30555h;
    }

    @Override // e4.K, m4.w0, m4.j0
    public void f(boolean z8, m4.k0 field, Modifier modifier, Set hiddenIdentifiers, m4.G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(722479676);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(722479676, i10, -1, "com.stripe.android.ui.core.elements.DefaultCardNumberController.ComposeUI (CardNumberController.kt:314)");
        }
        EffectsKt.LaunchedEffect(L5.I.f6487a, new b((InterfaceC2754a) startRestartGroup.consume(AbstractC2755b.a()), null), startRestartGroup, 70);
        super.f(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, startRestartGroup, (i10 & 14) | 16781376 | (i10 & 896) | (m4.G.f35073d << 12) | (57344 & i10) | (458752 & i10) | (3670016 & i10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.w0
    public int g() {
        return this.f30553f;
    }

    @Override // m4.w0
    public InterfaceC3349K getContentDescription() {
        return this.f30561n;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f30546D;
    }

    @Override // m4.w0
    public void h(x0.a.C0823a item) {
        AbstractC3159y.i(item, "item");
        this.f30565r.setValue(EnumC1870e.f14436m.b(item.a()));
    }

    @Override // m4.w0
    public void i(boolean z8) {
        this.f30543A.setValue(Boolean.valueOf(z8));
    }

    @Override // m4.w0
    public int j() {
        return this.f30554g;
    }

    @Override // m4.w0
    public InterfaceC3349K k() {
        return this.f30559l;
    }

    @Override // m4.w0
    public m4.y0 l(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        this.f30558k.setValue(this.f30549b.d(displayFormatted));
        this.f30570w.h(new f.b(displayFormatted));
        return null;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f30548F;
    }

    @Override // m4.w0
    public InterfaceC3349K n() {
        return this.f30545C;
    }

    @Override // m4.w0
    public InterfaceC3349K o() {
        return this.f30573z;
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        l(this.f30549b.a(rawValue));
    }

    @Override // m4.w0
    public String s() {
        return this.f30550c;
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f30547E;
    }

    @Override // m4.w0
    public boolean u() {
        return this.f30551d;
    }

    @Override // e4.K
    public InterfaceC3349K v() {
        return this.f30568u;
    }

    @Override // e4.K
    public boolean w() {
        return this.f30569v;
    }

    @Override // e4.K
    public InterfaceC3349K x() {
        return this.f30566s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C2596J cardTextFieldConfig, InterfaceC3167b cardAccountRangeRepository, P5.g uiContext, P5.g workContext, l2.p staticCardAccountRanges, String str, boolean z8, InterfaceC2588B cardBrandChoiceConfig) {
        super(null);
        List m8;
        AbstractC3159y.i(cardTextFieldConfig, "cardTextFieldConfig");
        AbstractC3159y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3159y.i(cardBrandChoiceConfig, "cardBrandChoiceConfig");
        EnumC1870e enumC1870e = null;
        this.f30549b = cardTextFieldConfig;
        this.f30550c = str;
        this.f30551d = z8;
        this.f30552e = cardBrandChoiceConfig;
        this.f30553f = cardTextFieldConfig.e();
        this.f30554g = cardTextFieldConfig.g();
        this.f30555h = cardTextFieldConfig.i();
        this.f30556i = cardTextFieldConfig.f();
        this.f30557j = v4.g.n(Integer.valueOf(cardTextFieldConfig.h()));
        l6.v a8 = AbstractC3351M.a("");
        this.f30558k = a8;
        this.f30559l = AbstractC3360h.b(a8);
        this.f30560m = v4.g.m(a8, new m());
        this.f30561n = v4.g.m(a8, h.f30593a);
        boolean z9 = cardBrandChoiceConfig instanceof InterfaceC2588B.a;
        this.f30562o = z9;
        l6.v a9 = AbstractC3351M.a(AbstractC1246t.m());
        this.f30563p = a9;
        if (cardBrandChoiceConfig instanceof InterfaceC2588B.a) {
            m8 = ((InterfaceC2588B.a) cardBrandChoiceConfig).b();
        } else {
            if (!(cardBrandChoiceConfig instanceof InterfaceC2588B.b)) {
                throw new L5.p();
            }
            m8 = AbstractC1246t.m();
        }
        this.f30564q = m8;
        if (cardBrandChoiceConfig instanceof InterfaceC2588B.a) {
            enumC1870e = ((InterfaceC2588B.a) cardBrandChoiceConfig).a();
        } else if (!(cardBrandChoiceConfig instanceof InterfaceC2588B.b)) {
            throw new L5.p();
        }
        l6.v a10 = AbstractC3351M.a(enumC1870e);
        this.f30565r = a10;
        this.f30566s = v4.g.d(a10, a9, new n());
        InterfaceC3349K m9 = v4.g.m(a8, new k());
        this.f30567t = m9;
        this.f30568u = z9 ? v4.g.d(a9, x(), g.f30592a) : m9;
        this.f30569v = true;
        C3168c c3168c = new C3168c(cardAccountRangeRepository, uiContext, workContext, staticCardAccountRanges, new e(), new f());
        this.f30570w = c3168c;
        this.f30571x = v4.g.e(a8, a9, x(), new o());
        InterfaceC3349K d8 = v4.g.d(m9, a8, new d());
        this.f30572y = d8;
        this.f30573z = d8;
        l6.v a11 = AbstractC3351M.a(Boolean.FALSE);
        this.f30543A = a11;
        this.f30544B = c3168c.g();
        this.f30545C = v4.g.d(d8, a11, p.f30602a);
        this.f30546D = v4.g.d(n(), d8, i.f30594a);
        this.f30547E = v4.g.m(d8, l.f30597a);
        this.f30548F = v4.g.d(t(), E(), j.f30595a);
        String s8 = s();
        r(s8 != null ? s8 : "");
    }
}
