package p4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import p4.w0;
import p4.x0;
import p4.z0;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class s0 implements w0, m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f37711x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final v0 f37712a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37713b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37714c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f37715d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37716e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37717f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f37718g;

    /* renamed from: h, reason: collision with root package name */
    private final o6.w f37719h;

    /* renamed from: i, reason: collision with root package name */
    private final String f37720i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f37721j;

    /* renamed from: k, reason: collision with root package name */
    private final o6.w f37722k;

    /* renamed from: l, reason: collision with root package name */
    private final o6.w f37723l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f37724m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f37725n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3698L f37726o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f37727p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f37728q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3698L f37729r;

    /* renamed from: s, reason: collision with root package name */
    private final o6.w f37730s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f37731t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3698L f37732u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3698L f37733v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3698L f37734w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) s0.this.f37727p.getValue()).getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37736a = new b();

        b() {
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
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3255y.i(it, "it");
            if (!it.a() && (it.a() || !s0.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3255y.i(it, "it");
            return s0.this.z().h(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f37739a = new e();

        e() {
            super(2);
        }

        public final Boolean a(y0 fieldState, boolean z8) {
            AbstractC3255y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public s0(v0 textFieldConfig, boolean z8, String str) {
        AutofillType autofillType;
        AbstractC3255y.i(textFieldConfig, "textFieldConfig");
        this.f37712a = textFieldConfig;
        this.f37713b = z8;
        this.f37714c = str;
        this.f37715d = textFieldConfig.d();
        this.f37716e = textFieldConfig.g();
        this.f37717f = textFieldConfig.i();
        VisualTransformation e8 = textFieldConfig.e();
        this.f37718g = e8 == null ? VisualTransformation.Companion.getNone() : e8;
        this.f37719h = AbstractC3700N.a(textFieldConfig.b());
        this.f37720i = textFieldConfig.k();
        if (textFieldConfig instanceof C3774v) {
            autofillType = AutofillType.CreditCardExpirationDate;
        } else if (textFieldConfig instanceof Y) {
            autofillType = AutofillType.PostalCode;
        } else if (textFieldConfig instanceof C3742A) {
            autofillType = AutofillType.EmailAddress;
        } else {
            autofillType = textFieldConfig instanceof J ? AutofillType.PersonFullName : null;
        }
        this.f37721j = autofillType;
        this.f37722k = AbstractC3700N.a(textFieldConfig.f());
        o6.w a8 = AbstractC3700N.a("");
        this.f37723l = a8;
        this.f37724m = AbstractC3708h.b(a8);
        this.f37725n = y4.g.m(a8, new d());
        this.f37726o = AbstractC3708h.b(a8);
        o6.w a9 = AbstractC3700N.a(z0.a.f37883c);
        this.f37727p = a9;
        this.f37728q = AbstractC3708h.b(a9);
        this.f37729r = textFieldConfig.a();
        o6.w a10 = AbstractC3700N.a(Boolean.FALSE);
        this.f37730s = a10;
        this.f37731t = y4.g.d(a9, a10, e.f37739a);
        this.f37732u = y4.g.m(n(), new a());
        this.f37733v = y4.g.m(a9, new c());
        this.f37734w = y4.g.d(t(), y(), b.f37736a);
        String s8 = s();
        if (s8 != null) {
            r(s8);
        }
    }

    @Override // p4.w0
    public InterfaceC3698L a() {
        return this.f37729r;
    }

    @Override // p4.w0, p4.j0
    public void c(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // p4.w0
    public InterfaceC3698L d() {
        return this.f37715d;
    }

    @Override // p4.w0
    public VisualTransformation e() {
        return this.f37718g;
    }

    @Override // p4.w0
    public int g() {
        return this.f37716e;
    }

    @Override // p4.w0
    public InterfaceC3698L getContentDescription() {
        return this.f37726o;
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37732u;
    }

    @Override // p4.w0
    public void h(boolean z8) {
        this.f37730s.setValue(Boolean.valueOf(z8));
    }

    @Override // p4.w0
    public int i() {
        return this.f37717f;
    }

    @Override // p4.w0
    public InterfaceC3698L j() {
        return this.f37724m;
    }

    @Override // p4.w0
    public void k(x0.a.C0853a c0853a) {
        w0.a.d(this, c0853a);
    }

    @Override // p4.w0
    public y0 l(String displayFormatted) {
        AbstractC3255y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f37727p.getValue();
        this.f37723l.setValue(this.f37712a.j(displayFormatted));
        this.f37727p.setValue(this.f37712a.l((String) this.f37723l.getValue()));
        if (!AbstractC3255y.d(this.f37727p.getValue(), y0Var)) {
            return (y0) this.f37727p.getValue();
        }
        return null;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f37734w;
    }

    @Override // p4.w0
    public InterfaceC3698L n() {
        return this.f37731t;
    }

    @Override // p4.w0
    public InterfaceC3698L o() {
        return this.f37728q;
    }

    @Override // p4.w0
    public AutofillType p() {
        return this.f37721j;
    }

    @Override // p4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // p4.H
    public void r(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        l(this.f37712a.c(rawValue));
    }

    @Override // p4.w0
    public String s() {
        return this.f37714c;
    }

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f37733v;
    }

    @Override // p4.w0
    public boolean u() {
        return this.f37713b;
    }

    @Override // p4.w0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public o6.w b() {
        return this.f37719h;
    }

    @Override // p4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public o6.w f() {
        return this.f37722k;
    }

    public InterfaceC3698L y() {
        return this.f37725n;
    }

    public final v0 z() {
        return this.f37712a;
    }

    public /* synthetic */ s0(v0 v0Var, boolean z8, String str, int i8, AbstractC3247p abstractC3247p) {
        this(v0Var, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? null : str);
    }
}
