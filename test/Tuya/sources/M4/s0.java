package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import m4.w0;
import m4.x0;
import m4.z0;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class s0 implements w0, m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f35685x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final v0 f35686a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35687b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35688c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f35689d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35690e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35691f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f35692g;

    /* renamed from: h, reason: collision with root package name */
    private final l6.v f35693h;

    /* renamed from: i, reason: collision with root package name */
    private final String f35694i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f35695j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.v f35696k;

    /* renamed from: l, reason: collision with root package name */
    private final l6.v f35697l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f35698m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f35699n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f35700o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f35701p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f35702q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f35703r;

    /* renamed from: s, reason: collision with root package name */
    private final l6.v f35704s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f35705t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f35706u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3349K f35707v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f35708w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) s0.this.f35701p.getValue()).getError();
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
    static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35710a = new b();

        b() {
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
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3159y.i(it, "it");
            if (!it.a() && (it.a() || !s0.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return s0.this.z().h(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f35713a = new e();

        e() {
            super(2);
        }

        public final Boolean a(y0 fieldState, boolean z8) {
            AbstractC3159y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public s0(v0 textFieldConfig, boolean z8, String str) {
        AutofillType autofillType;
        AbstractC3159y.i(textFieldConfig, "textFieldConfig");
        this.f35686a = textFieldConfig;
        this.f35687b = z8;
        this.f35688c = str;
        this.f35689d = textFieldConfig.c();
        this.f35690e = textFieldConfig.g();
        this.f35691f = textFieldConfig.i();
        VisualTransformation d8 = textFieldConfig.d();
        this.f35692g = d8 == null ? VisualTransformation.Companion.getNone() : d8;
        this.f35693h = AbstractC3351M.a(textFieldConfig.b());
        this.f35694i = textFieldConfig.k();
        if (textFieldConfig instanceof C3431v) {
            autofillType = AutofillType.CreditCardExpirationDate;
        } else if (textFieldConfig instanceof Y) {
            autofillType = AutofillType.PostalCode;
        } else if (textFieldConfig instanceof C3399A) {
            autofillType = AutofillType.EmailAddress;
        } else {
            autofillType = textFieldConfig instanceof J ? AutofillType.PersonFullName : null;
        }
        this.f35695j = autofillType;
        this.f35696k = AbstractC3351M.a(textFieldConfig.e());
        l6.v a8 = AbstractC3351M.a("");
        this.f35697l = a8;
        this.f35698m = AbstractC3360h.b(a8);
        this.f35699n = v4.g.m(a8, new d());
        this.f35700o = AbstractC3360h.b(a8);
        l6.v a9 = AbstractC3351M.a(z0.a.f35857c);
        this.f35701p = a9;
        this.f35702q = AbstractC3360h.b(a9);
        this.f35703r = textFieldConfig.a();
        l6.v a10 = AbstractC3351M.a(Boolean.FALSE);
        this.f35704s = a10;
        this.f35705t = v4.g.d(a9, a10, e.f35713a);
        this.f35706u = v4.g.m(n(), new a());
        this.f35707v = v4.g.m(a9, new c());
        this.f35708w = v4.g.d(t(), y(), b.f35710a);
        String s8 = s();
        if (s8 != null) {
            r(s8);
        }
    }

    @Override // m4.w0
    public InterfaceC3349K a() {
        return this.f35703r;
    }

    @Override // m4.w0
    public InterfaceC3349K c() {
        return this.f35689d;
    }

    @Override // m4.w0
    public VisualTransformation d() {
        return this.f35692g;
    }

    @Override // m4.w0, m4.j0
    public void f(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // m4.w0
    public int g() {
        return this.f35690e;
    }

    @Override // m4.w0
    public InterfaceC3349K getContentDescription() {
        return this.f35700o;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35706u;
    }

    @Override // m4.w0
    public void h(x0.a.C0823a c0823a) {
        w0.a.d(this, c0823a);
    }

    @Override // m4.w0
    public void i(boolean z8) {
        this.f35704s.setValue(Boolean.valueOf(z8));
    }

    @Override // m4.w0
    public int j() {
        return this.f35691f;
    }

    @Override // m4.w0
    public InterfaceC3349K k() {
        return this.f35698m;
    }

    @Override // m4.w0
    public y0 l(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f35701p.getValue();
        this.f35697l.setValue(this.f35686a.j(displayFormatted));
        this.f35701p.setValue(this.f35686a.l((String) this.f35697l.getValue()));
        if (!AbstractC3159y.d(this.f35701p.getValue(), y0Var)) {
            return (y0) this.f35701p.getValue();
        }
        return null;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35708w;
    }

    @Override // m4.w0
    public InterfaceC3349K n() {
        return this.f35705t;
    }

    @Override // m4.w0
    public InterfaceC3349K o() {
        return this.f35702q;
    }

    @Override // m4.w0
    public AutofillType p() {
        return this.f35695j;
    }

    @Override // m4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        l(this.f35686a.f(rawValue));
    }

    @Override // m4.w0
    public String s() {
        return this.f35688c;
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f35707v;
    }

    @Override // m4.w0
    public boolean u() {
        return this.f35687b;
    }

    @Override // m4.w0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public l6.v b() {
        return this.f35693h;
    }

    @Override // m4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public l6.v e() {
        return this.f35696k;
    }

    public InterfaceC3349K y() {
        return this.f35699n;
    }

    public final v0 z() {
        return this.f35686a;
    }

    public /* synthetic */ s0(v0 v0Var, boolean z8, String str, int i8, AbstractC3151p abstractC3151p) {
        this(v0Var, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? null : str);
    }
}
