package h4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import e3.EnumC2791e;
import e4.AbstractC2800a;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import p4.w0;
import p4.x0;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class Q implements p4.w0, p4.m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f32411x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final P f32412a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32413b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32414c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32415d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32416e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f32417f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f32418g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f32419h;

    /* renamed from: i, reason: collision with root package name */
    private final String f32420i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f32421j;

    /* renamed from: k, reason: collision with root package name */
    private final o6.w f32422k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3698L f32423l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f32424m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f32425n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3698L f32426o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3698L f32427p;

    /* renamed from: q, reason: collision with root package name */
    private final o6.w f32428q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3698L f32429r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3698L f32430s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f32431t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3698L f32432u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3698L f32433v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3698L f32434w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {
        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p4.y0 invoke(EnumC2791e brand, String fieldValue) {
            AbstractC3255y.i(brand, "brand");
            AbstractC3255y.i(fieldValue, "fieldValue");
            return Q.this.f32412a.c(brand, fieldValue, brand.m());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32436a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(EnumC2791e cardBrand) {
            int i8;
            AbstractC3255y.i(cardBrand, "cardBrand");
            if (cardBrand == EnumC2791e.f31446q) {
                i8 = AbstractC3407E.f34847b0;
            } else {
                i8 = AbstractC3407E.f34853e0;
            }
            return Integer.valueOf(i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32437a = new c();

        c() {
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
    static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32438a = new d();

        d() {
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
    static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f32439a = new e();

        e() {
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
    static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f32440a = new f();

        f() {
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
    static final class g extends AbstractC3256z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3255y.i(it, "it");
            return Q.this.f32412a.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f32442a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0.c invoke(EnumC2791e it) {
            AbstractC3255y.i(it, "it");
            return new x0.c(it.g(), null, false, null, 10, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f32443a = new i();

        i() {
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

    public Q(P cvcTextFieldConfig, InterfaceC3698L cardBrandFlow, String str, boolean z8) {
        AbstractC3255y.i(cvcTextFieldConfig, "cvcTextFieldConfig");
        AbstractC3255y.i(cardBrandFlow, "cardBrandFlow");
        this.f32412a = cvcTextFieldConfig;
        this.f32413b = str;
        this.f32414c = z8;
        this.f32415d = cvcTextFieldConfig.e();
        this.f32416e = cvcTextFieldConfig.g();
        this.f32417f = cvcTextFieldConfig.h();
        InterfaceC3698L m8 = y4.g.m(cardBrandFlow, b.f32436a);
        this.f32418g = m8;
        this.f32419h = m8;
        this.f32420i = cvcTextFieldConfig.f();
        this.f32421j = AutofillType.CreditCardSecurityCode;
        o6.w a8 = AbstractC3700N.a("");
        this.f32422k = a8;
        this.f32423l = AbstractC3708h.b(a8);
        this.f32424m = y4.g.m(a8, new g());
        this.f32425n = y4.g.m(a8, c.f32437a);
        InterfaceC3698L d8 = y4.g.d(cardBrandFlow, a8, new a());
        this.f32426o = d8;
        this.f32427p = d8;
        Boolean bool = Boolean.FALSE;
        o6.w a9 = AbstractC3700N.a(bool);
        this.f32428q = a9;
        this.f32429r = y4.g.d(d8, a9, i.f32443a);
        this.f32430s = y4.g.d(n(), d8, d.f32438a);
        this.f32431t = y4.g.m(d8, f.f32440a);
        this.f32432u = y4.g.d(t(), w(), e.f32439a);
        this.f32433v = y4.g.m(cardBrandFlow, h.f32442a);
        this.f32434w = y4.g.n(bool);
        String s8 = s();
        r(s8 != null ? s8 : "");
    }

    @Override // p4.w0
    public InterfaceC3698L a() {
        return this.f32434w;
    }

    @Override // p4.w0
    public InterfaceC3698L b() {
        return this.f32419h;
    }

    @Override // p4.w0, p4.j0
    public void c(boolean z8, p4.k0 k0Var, Modifier modifier, Set set, p4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // p4.w0
    public InterfaceC3698L d() {
        return this.f32433v;
    }

    @Override // p4.w0
    public VisualTransformation e() {
        return this.f32417f;
    }

    @Override // p4.w0
    public InterfaceC3698L f() {
        return w0.a.c(this);
    }

    @Override // p4.w0
    public int g() {
        return this.f32415d;
    }

    @Override // p4.w0
    public InterfaceC3698L getContentDescription() {
        return this.f32425n;
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f32430s;
    }

    @Override // p4.w0
    public void h(boolean z8) {
        this.f32428q.setValue(Boolean.valueOf(z8));
    }

    @Override // p4.w0
    public int i() {
        return this.f32416e;
    }

    @Override // p4.w0
    public InterfaceC3698L j() {
        return this.f32423l;
    }

    @Override // p4.w0
    public void k(x0.a.C0853a c0853a) {
        w0.a.d(this, c0853a);
    }

    @Override // p4.w0
    public p4.y0 l(String displayFormatted) {
        AbstractC3255y.i(displayFormatted, "displayFormatted");
        this.f32422k.setValue(this.f32412a.d(displayFormatted));
        return null;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f32432u;
    }

    @Override // p4.w0
    public InterfaceC3698L n() {
        return this.f32429r;
    }

    @Override // p4.w0
    public InterfaceC3698L o() {
        return this.f32427p;
    }

    @Override // p4.w0
    public AutofillType p() {
        return this.f32421j;
    }

    @Override // p4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // p4.H
    public void r(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        l(this.f32412a.a(rawValue));
    }

    @Override // p4.w0
    public String s() {
        return this.f32413b;
    }

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f32431t;
    }

    @Override // p4.w0
    public boolean u() {
        return this.f32414c;
    }

    public InterfaceC3698L w() {
        return this.f32424m;
    }

    public /* synthetic */ Q(P p8, InterfaceC3698L interfaceC3698L, String str, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? new P() : p8, interfaceC3698L, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? false : z8);
    }
}
