package h4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import e3.C2787a;
import e3.EnumC2791e;
import e4.AbstractC2800a;
import h4.InterfaceC2908B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k4.AbstractC3222b;
import k4.InterfaceC3221a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import o2.C3516c;
import o2.InterfaceC3515b;
import o2.f;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import p4.A0;
import p4.x0;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class T extends K {

    /* renamed from: G, reason: collision with root package name */
    private static final a f32462G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    public static final int f32463H = 8;

    /* renamed from: A, reason: collision with root package name */
    private final o6.w f32464A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC3698L f32465B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3698L f32466C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC3698L f32467D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC3698L f32468E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3698L f32469F;

    /* renamed from: b, reason: collision with root package name */
    private final C2916J f32470b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32471c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32472d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2908B f32473e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32474f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32475g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f32476h;

    /* renamed from: i, reason: collision with root package name */
    private final String f32477i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3698L f32478j;

    /* renamed from: k, reason: collision with root package name */
    private final o6.w f32479k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3698L f32480l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f32481m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f32482n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f32483o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f32484p;

    /* renamed from: q, reason: collision with root package name */
    private final List f32485q;

    /* renamed from: r, reason: collision with root package name */
    private final o6.w f32486r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3698L f32487s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f32488t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3698L f32489u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f32490v;

    /* renamed from: w, reason: collision with root package name */
    private final C3516c f32491w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3698L f32492x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3698L f32493y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3698L f32494z;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f32495a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221a f32497c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f32498a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f32499b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221a f32500c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3221a interfaceC3221a, S5.d dVar) {
                super(2, dVar);
                this.f32500c = interfaceC3221a;
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p4.y0 y0Var, S5.d dVar) {
                return ((a) create(y0Var, dVar)).invokeSuspend(O5.I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                a aVar = new a(this.f32500c, dVar);
                aVar.f32499b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f32498a == 0) {
                    O5.t.b(obj);
                    if (((p4.y0) this.f32499b) instanceof A0.a) {
                        this.f32500c.a();
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3221a interfaceC3221a, S5.d dVar) {
            super(2, dVar);
            this.f32497c = interfaceC3221a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f32497c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f32495a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f q8 = AbstractC3708h.q(T.this.o(), 1);
                a aVar = new a(this.f32497c, null);
                this.f32495a = 1;
                if (AbstractC3708h.j(q8, aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p4.k0 f32503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f32504d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f32505e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p4.G f32506f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f32507g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f32508h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f32509i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, p4.k0 k0Var, Modifier modifier, Set set, p4.G g8, int i8, int i9, int i10) {
            super(2);
            this.f32502b = z8;
            this.f32503c = k0Var;
            this.f32504d = modifier;
            this.f32505e = set;
            this.f32506f = g8;
            this.f32507g = i8;
            this.f32508h = i9;
            this.f32509i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            T.this.c(this.f32502b, this.f32503c, this.f32504d, this.f32505e, this.f32506f, this.f32507g, this.f32508h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32509i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements InterfaceC1668n {
        d() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p4.y0 invoke(EnumC2791e brand, String fieldValue) {
            int n8;
            AbstractC3255y.i(brand, "brand");
            AbstractC3255y.i(fieldValue, "fieldValue");
            C2916J c2916j = T.this.f32470b;
            C2787a d8 = T.this.D().d();
            if (d8 != null) {
                n8 = d8.g();
            } else {
                n8 = brand.n(fieldValue);
            }
            return c2916j.c(brand, fieldValue, n8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements C3516c.a {
        e() {
        }

        @Override // o2.C3516c.a
        public void a(List accountRanges) {
            AbstractC3255y.i(accountRanges, "accountRanges");
            C2787a c2787a = (C2787a) AbstractC1378t.o0(accountRanges);
            if (c2787a != null) {
                int g8 = c2787a.g();
                VisualTransformation e8 = T.this.e();
                AbstractC3255y.g(e8, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.CardNumberVisualTransformation");
                ((M) e8).a(Integer.valueOf(g8));
            }
            List list = accountRanges;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2787a) it.next()).b());
            }
            T.this.f32484p.setValue(AbstractC1378t.e0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(T.this.f32483o);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f32513a = new g();

        g() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC2791e invoke(List choices, EnumC2791e selected) {
            AbstractC3255y.i(choices, "choices");
            AbstractC3255y.i(selected, "selected");
            EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.M0(choices);
            if (enumC2791e != null) {
                return enumC2791e;
            }
            return selected;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f32514a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3255y.i(it, "it");
            return AbstractC2800a.a(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f32515a = new i();

        i() {
            super(2);
        }

        public final p4.C a(boolean z8, p4.y0 fieldState) {
            AbstractC3255y.i(fieldState, "fieldState");
            p4.C error = fieldState.getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (p4.y0) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f32516a = new j();

        j() {
            super(2);
        }

        public final C4061a a(boolean z8, String value) {
            AbstractC3255y.i(value, "value");
            return new C4061a(value, z8);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3256z implements Function1 {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC2791e invoke(String it) {
            EnumC2791e b8;
            AbstractC3255y.i(it, "it");
            C2787a d8 = T.this.D().d();
            if (d8 == null || (b8 = d8.b()) == null) {
                EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.o0(EnumC2791e.f31442m.c(it));
                if (enumC2791e == null) {
                    return EnumC2791e.f31452w;
                }
                return enumC2791e;
            }
            return b8;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f32518a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p4.y0 it) {
            AbstractC3255y.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3256z implements Function1 {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3255y.i(it, "it");
            return T.this.f32470b.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3256z implements InterfaceC1668n {
        n() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC2791e invoke(EnumC2791e enumC2791e, List choices) {
            Object obj;
            AbstractC3255y.i(choices, "choices");
            EnumC2791e enumC2791e2 = EnumC2791e.f31452w;
            if (enumC2791e != enumC2791e2) {
                if (AbstractC1378t.d0(choices, enumC2791e)) {
                    if (enumC2791e == null) {
                        return enumC2791e2;
                    }
                    return enumC2791e;
                }
                Iterator it = T.this.f32485q.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (choices.contains((EnumC2791e) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                EnumC2791e enumC2791e3 = (EnumC2791e) obj;
                if (enumC2791e3 == null) {
                    return EnumC2791e.f31452w;
                }
                return enumC2791e3;
            }
            return enumC2791e;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3256z implements InterfaceC1669o {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32522a;

            static {
                int[] iArr = new int[EnumC2791e.values().length];
                try {
                    iArr[EnumC2791e.f31452w.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f32522a = iArr;
            }
        }

        o() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p4.x0 invoke(String number, List brands, EnumC2791e chosen) {
            x0.a.C0853a c0853a;
            AbstractC3255y.i(number, "number");
            AbstractC3255y.i(brands, "brands");
            AbstractC3255y.i(chosen, "chosen");
            if (T.this.f32483o && number.length() > 0) {
                EnumC2791e enumC2791e = EnumC2791e.f31452w;
                x0.a.C0853a c0853a2 = new x0.a.C0853a(enumC2791e.f(), B2.c.a(AbstractC3407E.f34840W), enumC2791e.k());
                boolean z8 = false;
                if (brands.size() == 1) {
                    EnumC2791e enumC2791e2 = (EnumC2791e) brands.get(0);
                    c0853a = new x0.a.C0853a(enumC2791e2.f(), B2.c.b(enumC2791e2.h()), enumC2791e2.k());
                } else if (a.f32522a[chosen.ordinal()] == 1) {
                    c0853a = null;
                } else {
                    c0853a = new x0.a.C0853a(chosen.f(), B2.c.b(chosen.h()), chosen.k());
                }
                List<EnumC2791e> list = brands;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                for (EnumC2791e enumC2791e3 : list) {
                    arrayList.add(new x0.a.C0853a(enumC2791e3.f(), B2.c.b(enumC2791e3.h()), enumC2791e3.k()));
                }
                B2.b a8 = B2.c.a(AbstractC3407E.f34841X);
                if (c0853a != null) {
                    c0853a2 = c0853a;
                }
                if (brands.size() < 2) {
                    z8 = true;
                }
                return new x0.a(a8, z8, c0853a2, arrayList);
            }
            if (T.this.D().d() != null) {
                C2787a d8 = T.this.D().d();
                AbstractC3255y.f(d8);
                return new x0.c(d8.b().k(), null, false, null, 10, null);
            }
            List c8 = EnumC2791e.f31442m.c(number);
            ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(c8, 10));
            Iterator it = c8.iterator();
            while (it.hasNext()) {
                arrayList2.add(new x0.c(((EnumC2791e) it.next()).k(), null, false, null, 10, null));
            }
            List Q02 = AbstractC1378t.Q0(arrayList2, 3);
            ArrayList arrayList3 = new ArrayList(AbstractC1378t.x(c8, 10));
            Iterator it2 = c8.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new x0.c(((EnumC2791e) it2.next()).k(), null, false, null, 10, null));
            }
            return new x0.b(Q02, AbstractC1378t.f0(arrayList3, 3));
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f32523a = new p();

        p() {
            super(2);
        }

        public final Boolean a(p4.y0 fieldState, boolean z8) {
            AbstractC3255y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p4.y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public /* synthetic */ T(C2916J c2916j, InterfaceC3515b interfaceC3515b, S5.g gVar, S5.g gVar2, o2.p pVar, String str, boolean z8, InterfaceC2908B interfaceC2908B, int i8, AbstractC3247p abstractC3247p) {
        this(c2916j, interfaceC3515b, gVar, gVar2, (i8 & 16) != 0 ? new o2.k() : pVar, str, (i8 & 64) != 0 ? false : z8, (i8 & 128) != 0 ? InterfaceC2908B.b.f32198a : interfaceC2908B);
    }

    public final C3516c D() {
        return this.f32491w;
    }

    public InterfaceC3698L E() {
        return this.f32481m;
    }

    @Override // p4.w0
    public InterfaceC3698L a() {
        return this.f32465B;
    }

    @Override // p4.w0
    public InterfaceC3698L b() {
        return this.f32478j;
    }

    @Override // h4.K, p4.w0, p4.j0
    public void c(boolean z8, p4.k0 field, Modifier modifier, Set hiddenIdentifiers, p4.G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(722479676);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(722479676, i10, -1, "com.stripe.android.ui.core.elements.DefaultCardNumberController.ComposeUI (CardNumberController.kt:314)");
        }
        EffectsKt.LaunchedEffect(O5.I.f8278a, new b((InterfaceC3221a) startRestartGroup.consume(AbstractC3222b.a()), null), startRestartGroup, 70);
        super.c(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, startRestartGroup, (i10 & 14) | 16781376 | (i10 & 896) | (p4.G.f37099d << 12) | (57344 & i10) | (458752 & i10) | (3670016 & i10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.w0
    public InterfaceC3698L d() {
        return this.f32492x;
    }

    @Override // p4.w0
    public VisualTransformation e() {
        return this.f32476h;
    }

    @Override // p4.w0
    public int g() {
        return this.f32474f;
    }

    @Override // p4.w0
    public InterfaceC3698L getContentDescription() {
        return this.f32482n;
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f32467D;
    }

    @Override // p4.w0
    public void h(boolean z8) {
        this.f32464A.setValue(Boolean.valueOf(z8));
    }

    @Override // p4.w0
    public int i() {
        return this.f32475g;
    }

    @Override // p4.w0
    public InterfaceC3698L j() {
        return this.f32480l;
    }

    @Override // p4.w0
    public void k(x0.a.C0853a item) {
        AbstractC3255y.i(item, "item");
        this.f32486r.setValue(EnumC2791e.f31442m.b(item.a()));
    }

    @Override // p4.w0
    public p4.y0 l(String displayFormatted) {
        AbstractC3255y.i(displayFormatted, "displayFormatted");
        this.f32479k.setValue(this.f32470b.d(displayFormatted));
        this.f32491w.h(new f.b(displayFormatted));
        return null;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f32469F;
    }

    @Override // p4.w0
    public InterfaceC3698L n() {
        return this.f32466C;
    }

    @Override // p4.w0
    public InterfaceC3698L o() {
        return this.f32494z;
    }

    @Override // p4.H
    public void r(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        l(this.f32470b.a(rawValue));
    }

    @Override // p4.w0
    public String s() {
        return this.f32471c;
    }

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f32468E;
    }

    @Override // p4.w0
    public boolean u() {
        return this.f32472d;
    }

    @Override // h4.K
    public InterfaceC3698L v() {
        return this.f32489u;
    }

    @Override // h4.K
    public boolean w() {
        return this.f32490v;
    }

    @Override // h4.K
    public InterfaceC3698L x() {
        return this.f32487s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C2916J cardTextFieldConfig, InterfaceC3515b cardAccountRangeRepository, S5.g uiContext, S5.g workContext, o2.p staticCardAccountRanges, String str, boolean z8, InterfaceC2908B cardBrandChoiceConfig) {
        super(null);
        List m8;
        AbstractC3255y.i(cardTextFieldConfig, "cardTextFieldConfig");
        AbstractC3255y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3255y.i(cardBrandChoiceConfig, "cardBrandChoiceConfig");
        EnumC2791e enumC2791e = null;
        this.f32470b = cardTextFieldConfig;
        this.f32471c = str;
        this.f32472d = z8;
        this.f32473e = cardBrandChoiceConfig;
        this.f32474f = cardTextFieldConfig.e();
        this.f32475g = cardTextFieldConfig.g();
        this.f32476h = cardTextFieldConfig.i();
        this.f32477i = cardTextFieldConfig.f();
        this.f32478j = y4.g.n(Integer.valueOf(cardTextFieldConfig.h()));
        o6.w a8 = AbstractC3700N.a("");
        this.f32479k = a8;
        this.f32480l = AbstractC3708h.b(a8);
        this.f32481m = y4.g.m(a8, new m());
        this.f32482n = y4.g.m(a8, h.f32514a);
        boolean z9 = cardBrandChoiceConfig instanceof InterfaceC2908B.a;
        this.f32483o = z9;
        o6.w a9 = AbstractC3700N.a(AbstractC1378t.m());
        this.f32484p = a9;
        if (cardBrandChoiceConfig instanceof InterfaceC2908B.a) {
            m8 = ((InterfaceC2908B.a) cardBrandChoiceConfig).b();
        } else {
            if (!(cardBrandChoiceConfig instanceof InterfaceC2908B.b)) {
                throw new O5.p();
            }
            m8 = AbstractC1378t.m();
        }
        this.f32485q = m8;
        if (cardBrandChoiceConfig instanceof InterfaceC2908B.a) {
            enumC2791e = ((InterfaceC2908B.a) cardBrandChoiceConfig).a();
        } else if (!(cardBrandChoiceConfig instanceof InterfaceC2908B.b)) {
            throw new O5.p();
        }
        o6.w a10 = AbstractC3700N.a(enumC2791e);
        this.f32486r = a10;
        this.f32487s = y4.g.d(a10, a9, new n());
        InterfaceC3698L m9 = y4.g.m(a8, new k());
        this.f32488t = m9;
        this.f32489u = z9 ? y4.g.d(a9, x(), g.f32513a) : m9;
        this.f32490v = true;
        C3516c c3516c = new C3516c(cardAccountRangeRepository, uiContext, workContext, staticCardAccountRanges, new e(), new f());
        this.f32491w = c3516c;
        this.f32492x = y4.g.e(a8, a9, x(), new o());
        InterfaceC3698L d8 = y4.g.d(m9, a8, new d());
        this.f32493y = d8;
        this.f32494z = d8;
        o6.w a11 = AbstractC3700N.a(Boolean.FALSE);
        this.f32464A = a11;
        this.f32465B = c3516c.g();
        this.f32466C = y4.g.d(d8, a11, p.f32523a);
        this.f32467D = y4.g.d(n(), d8, i.f32515a);
        this.f32468E = y4.g.m(d8, l.f32518a);
        this.f32469F = y4.g.d(t(), E(), j.f32516a);
        String s8 = s();
        r(s8 != null ? s8 : "");
    }
}
