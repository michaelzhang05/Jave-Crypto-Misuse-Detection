package e4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import b3.EnumC1870e;
import b4.AbstractC1879a;
import j2.AbstractC3053E;
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
import r4.C3688a;

/* loaded from: classes4.dex */
public final class Q implements m4.w0, m4.m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f30490x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final P f30491a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30492b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30493c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30494d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30495e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f30496f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30497g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f30498h;

    /* renamed from: i, reason: collision with root package name */
    private final String f30499i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f30500j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.v f30501k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3349K f30502l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f30503m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f30504n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f30505o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3349K f30506p;

    /* renamed from: q, reason: collision with root package name */
    private final l6.v f30507q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f30508r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3349K f30509s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f30510t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f30511u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3349K f30512v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f30513w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {
        a() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m4.y0 invoke(EnumC1870e brand, String fieldValue) {
            AbstractC3159y.i(brand, "brand");
            AbstractC3159y.i(fieldValue, "fieldValue");
            return Q.this.f30491a.c(brand, fieldValue, brand.m());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30515a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(EnumC1870e cardBrand) {
            int i8;
            AbstractC3159y.i(cardBrand, "cardBrand");
            if (cardBrand == EnumC1870e.f14440q) {
                i8 = AbstractC3053E.f32871b0;
            } else {
                i8 = AbstractC3053E.f32877e0;
            }
            return Integer.valueOf(i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f30516a = new c();

        c() {
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
    static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f30517a = new d();

        d() {
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
    static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f30518a = new e();

        e() {
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
    static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f30519a = new f();

        f() {
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
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return Q.this.f30491a.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f30521a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0.c invoke(EnumC1870e it) {
            AbstractC3159y.i(it, "it");
            return new x0.c(it.g(), null, false, null, 10, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f30522a = new i();

        i() {
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

    public Q(P cvcTextFieldConfig, InterfaceC3349K cardBrandFlow, String str, boolean z8) {
        AbstractC3159y.i(cvcTextFieldConfig, "cvcTextFieldConfig");
        AbstractC3159y.i(cardBrandFlow, "cardBrandFlow");
        this.f30491a = cvcTextFieldConfig;
        this.f30492b = str;
        this.f30493c = z8;
        this.f30494d = cvcTextFieldConfig.e();
        this.f30495e = cvcTextFieldConfig.g();
        this.f30496f = cvcTextFieldConfig.h();
        InterfaceC3349K m8 = v4.g.m(cardBrandFlow, b.f30515a);
        this.f30497g = m8;
        this.f30498h = m8;
        this.f30499i = cvcTextFieldConfig.f();
        this.f30500j = AutofillType.CreditCardSecurityCode;
        l6.v a8 = AbstractC3351M.a("");
        this.f30501k = a8;
        this.f30502l = AbstractC3360h.b(a8);
        this.f30503m = v4.g.m(a8, new g());
        this.f30504n = v4.g.m(a8, c.f30516a);
        InterfaceC3349K d8 = v4.g.d(cardBrandFlow, a8, new a());
        this.f30505o = d8;
        this.f30506p = d8;
        Boolean bool = Boolean.FALSE;
        l6.v a9 = AbstractC3351M.a(bool);
        this.f30507q = a9;
        this.f30508r = v4.g.d(d8, a9, i.f30522a);
        this.f30509s = v4.g.d(n(), d8, d.f30517a);
        this.f30510t = v4.g.m(d8, f.f30519a);
        this.f30511u = v4.g.d(t(), w(), e.f30518a);
        this.f30512v = v4.g.m(cardBrandFlow, h.f30521a);
        this.f30513w = v4.g.n(bool);
        String s8 = s();
        r(s8 != null ? s8 : "");
    }

    @Override // m4.w0
    public InterfaceC3349K a() {
        return this.f30513w;
    }

    @Override // m4.w0
    public InterfaceC3349K b() {
        return this.f30498h;
    }

    @Override // m4.w0
    public InterfaceC3349K c() {
        return this.f30512v;
    }

    @Override // m4.w0
    public VisualTransformation d() {
        return this.f30496f;
    }

    @Override // m4.w0
    public InterfaceC3349K e() {
        return w0.a.c(this);
    }

    @Override // m4.w0, m4.j0
    public void f(boolean z8, m4.k0 k0Var, Modifier modifier, Set set, m4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // m4.w0
    public int g() {
        return this.f30494d;
    }

    @Override // m4.w0
    public InterfaceC3349K getContentDescription() {
        return this.f30504n;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f30509s;
    }

    @Override // m4.w0
    public void h(x0.a.C0823a c0823a) {
        w0.a.d(this, c0823a);
    }

    @Override // m4.w0
    public void i(boolean z8) {
        this.f30507q.setValue(Boolean.valueOf(z8));
    }

    @Override // m4.w0
    public int j() {
        return this.f30495e;
    }

    @Override // m4.w0
    public InterfaceC3349K k() {
        return this.f30502l;
    }

    @Override // m4.w0
    public m4.y0 l(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        this.f30501k.setValue(this.f30491a.d(displayFormatted));
        return null;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f30511u;
    }

    @Override // m4.w0
    public InterfaceC3349K n() {
        return this.f30508r;
    }

    @Override // m4.w0
    public InterfaceC3349K o() {
        return this.f30506p;
    }

    @Override // m4.w0
    public AutofillType p() {
        return this.f30500j;
    }

    @Override // m4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        l(this.f30491a.a(rawValue));
    }

    @Override // m4.w0
    public String s() {
        return this.f30492b;
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f30510t;
    }

    @Override // m4.w0
    public boolean u() {
        return this.f30493c;
    }

    public InterfaceC3349K w() {
        return this.f30503m;
    }

    public /* synthetic */ Q(P p8, InterfaceC3349K interfaceC3349K, String str, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new P() : p8, interfaceC3349K, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? false : z8);
    }
}
