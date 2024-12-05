package p4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import u2.AbstractC4058e;
import u4.C4061a;
import y2.C4202a;

/* loaded from: classes4.dex */
public final class Q implements H, j0 {

    /* renamed from: r */
    public static final a f37220r = new a(null);

    /* renamed from: s */
    public static final int f37221s = 8;

    /* renamed from: a */
    private final String f37222a;

    /* renamed from: b */
    private final boolean f37223b;

    /* renamed from: c */
    private final boolean f37224c;

    /* renamed from: d */
    private final InterfaceC3698L f37225d;

    /* renamed from: e */
    private final o6.w f37226e;

    /* renamed from: f */
    private final InterfaceC3698L f37227f;

    /* renamed from: g */
    private final o6.w f37228g;

    /* renamed from: h */
    private final C3772t f37229h;

    /* renamed from: i */
    private final C3777y f37230i;

    /* renamed from: j */
    private final InterfaceC3698L f37231j;

    /* renamed from: k */
    private final InterfaceC3698L f37232k;

    /* renamed from: l */
    private final InterfaceC3698L f37233l;

    /* renamed from: m */
    private final InterfaceC3698L f37234m;

    /* renamed from: n */
    private final InterfaceC3698L f37235n;

    /* renamed from: o */
    private final InterfaceC3698L f37236o;

    /* renamed from: p */
    private final InterfaceC3698L f37237p;

    /* renamed from: q */
    private final InterfaceC3698L f37238q;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ Q b(a aVar, String str, String str2, Set set, boolean z8, boolean z9, int i8, Object obj) {
            boolean z10;
            boolean z11;
            if ((i8 & 1) != 0) {
                str = "";
            }
            if ((i8 & 2) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i8 & 4) != 0) {
                set = P5.a0.f();
            }
            Set set2 = set;
            if ((i8 & 8) != 0) {
                z10 = false;
            } else {
                z10 = z8;
            }
            if ((i8 & 16) != 0) {
                z11 = false;
            } else {
                z11 = z9;
            }
            return aVar.a(str, str3, set2, z10, z11);
        }

        public final Q a(String initialValue, String str, Set overrideCountryCodes, boolean z8, boolean z9) {
            AbstractC3255y.i(initialValue, "initialValue");
            AbstractC3255y.i(overrideCountryCodes, "overrideCountryCodes");
            U u8 = null;
            boolean C8 = j6.n.C(initialValue, "+", false, 2, null);
            if (str == null && C8) {
                u8 = U.f37298a.d(initialValue);
            } else if (str != null) {
                u8 = U.f37298a.c(str);
            }
            if (u8 != null) {
                String e8 = u8.e();
                return new Q(j6.n.k0(u8.g(j6.n.k0(initialValue, e8)), e8), u8.c(), overrideCountryCodes, z8, z9, null);
            }
            return new Q(initialValue, str, overrideCountryCodes, z8, z9, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b */
        final /* synthetic */ boolean f37240b;

        /* renamed from: c */
        final /* synthetic */ k0 f37241c;

        /* renamed from: d */
        final /* synthetic */ Modifier f37242d;

        /* renamed from: e */
        final /* synthetic */ Set f37243e;

        /* renamed from: f */
        final /* synthetic */ G f37244f;

        /* renamed from: g */
        final /* synthetic */ int f37245g;

        /* renamed from: h */
        final /* synthetic */ int f37246h;

        /* renamed from: i */
        final /* synthetic */ int f37247i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37240b = z8;
            this.f37241c = k0Var;
            this.f37242d = modifier;
            this.f37243e = set;
            this.f37244f = g8;
            this.f37245g = i8;
            this.f37246h = i9;
            this.f37247i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            Q.this.c(this.f37240b, this.f37241c, this.f37242d, this.f37243e, this.f37244f, this.f37245g, this.f37246h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37247i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        public static final c f37248a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C4202a country) {
            String str;
            AbstractC3255y.i(country, "country");
            String a8 = C3772t.f37740k.a(country.b().b());
            String g8 = U.f37298a.g(country.b().b());
            if (g8 != null) {
                str = "  " + g8 + "  ";
            } else {
                str = null;
            }
            return AbstractC1378t.w0(AbstractC1378t.r(a8, str), "", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        public static final d f37249a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C4202a country) {
            AbstractC3255y.i(country, "country");
            return AbstractC1378t.w0(AbstractC1378t.r(C3772t.f37740k.a(country.b().b()), country.g(), U.f37298a.g(country.b().b())), " ", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a */
        public static final e f37250a = new e();

        e() {
            super(3);
        }

        public final C a(String value, boolean z8, boolean z9) {
            AbstractC3255y.i(value, "value");
            if (!(!j6.n.u(value)) || z8 || z9) {
                return null;
            }
            return new C(AbstractC3435g.f35161G, null, 2, null);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a */
        public static final f f37251a = new f();

        f() {
            super(2);
        }

        public final C4061a a(String fieldValue, boolean z8) {
            AbstractC3255y.i(fieldValue, "fieldValue");
            return new C4061a(fieldValue, z8);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((String) obj, ((Boolean) obj2).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {
        g() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a */
        public final Boolean invoke(String value, Integer num) {
            int i8;
            AbstractC3255y.i(value, "value");
            int length = value.length();
            boolean z8 = false;
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = 0;
            }
            if (length >= i8 || Q.this.f37224c) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function1 {
        h() {
            super(1);
        }

        public final U a(int i8) {
            return U.f37298a.c(((C4202a) Q.this.f37229h.a().get(i8)).b().b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i8) {
            return U.f37298a.f(((C4202a) Q.this.f37229h.a().get(i8)).b().b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        public static final j f37255a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(U it) {
            AbstractC3255y.i(it, "it");
            return it.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a */
        public static final k f37256a = new k();

        k() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a */
        public final String invoke(String value, U formatter) {
            AbstractC3255y.i(value, "value");
            AbstractC3255y.i(formatter, "formatter");
            return formatter.g(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        public static final l f37257a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final VisualTransformation invoke(U it) {
            AbstractC3255y.i(it, "it");
            return it.f();
        }
    }

    public /* synthetic */ Q(String str, String str2, Set set, boolean z8, boolean z9, AbstractC3247p abstractC3247p) {
        this(str, str2, set, z8, z9);
    }

    public final String A() {
        return this.f37222a;
    }

    public final String B() {
        return j6.n.k0((String) this.f37226e.getValue(), ((U) this.f37231j.getValue()).e());
    }

    public final InterfaceC3698L C() {
        return this.f37237p;
    }

    public final InterfaceC3698L D() {
        return this.f37238q;
    }

    public final void E(String displayFormatted) {
        AbstractC3255y.i(displayFormatted, "displayFormatted");
        this.f37226e.setValue(((U) this.f37231j.getValue()).h(displayFormatted));
    }

    public InterfaceC3698L b() {
        return this.f37225d;
    }

    @Override // p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        int m4873getDoneeUduSuo;
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1468906333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468906333, i10, -1, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:180)");
        }
        if (!AbstractC3255y.d(g8, field.a())) {
            m4873getDoneeUduSuo = ImeAction.Companion.m4875getNexteUduSuo();
        } else {
            m4873getDoneeUduSuo = ImeAction.Companion.m4873getDoneeUduSuo();
        }
        T.b(z8, this, null, null, false, false, null, null, m4873getDoneeUduSuo, startRestartGroup, (i10 & 14) | 64, 252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37236o;
    }

    public final void h(boolean z8) {
        this.f37228g.setValue(Boolean.valueOf(z8));
    }

    public InterfaceC3698L j() {
        return this.f37227f;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f37235n;
    }

    @Override // p4.H
    public void r(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        E(rawValue);
    }

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f37234m;
    }

    public boolean u() {
        return this.f37223b;
    }

    public final String x() {
        return ((U) this.f37231j.getValue()).c();
    }

    public final C3777y y() {
        return this.f37230i;
    }

    public final String z(String phoneNumber) {
        AbstractC3255y.i(phoneNumber, "phoneNumber");
        return ((U) this.f37231j.getValue()).g(phoneNumber);
    }

    private Q(String str, String str2, Set set, boolean z8, boolean z9) {
        this.f37222a = str;
        this.f37223b = z8;
        this.f37224c = z9;
        this.f37225d = y4.g.n(Integer.valueOf(AbstractC4058e.f39959f));
        o6.w a8 = AbstractC3700N.a(str);
        this.f37226e = a8;
        this.f37227f = AbstractC3708h.b(a8);
        o6.w a9 = AbstractC3700N.a(Boolean.FALSE);
        this.f37228g = a9;
        C3772t c3772t = new C3772t(set, null, true, false, c.f37248a, d.f37249a, 10, null);
        this.f37229h = c3772t;
        C3777y c3777y = new C3777y(c3772t, str2);
        this.f37230i = c3777y;
        InterfaceC3698L m8 = y4.g.m(c3777y.z(), new h());
        this.f37231j = m8;
        InterfaceC3698L m9 = y4.g.m(c3777y.z(), new i());
        this.f37232k = m9;
        this.f37233l = y4.g.d(j(), m8, k.f37256a);
        this.f37234m = y4.g.d(j(), m9, new g());
        this.f37235n = y4.g.d(j(), t(), f.f37251a);
        this.f37236o = y4.g.e(j(), t(), a9, e.f37250a);
        this.f37237p = y4.g.m(m8, j.f37255a);
        this.f37238q = y4.g.m(m8, l.f37257a);
    }
}
