package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Set;
import kotlin.jvm.functions.Function0;
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

/* renamed from: m4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3416f implements w0, H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f35453a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f35454b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35455c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f35456d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35457e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35458f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f35459g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35460h;

    /* renamed from: i, reason: collision with root package name */
    private final l6.v f35461i;

    /* renamed from: j, reason: collision with root package name */
    private final String f35462j;

    /* renamed from: k, reason: collision with root package name */
    private final AutofillType f35463k;

    /* renamed from: l, reason: collision with root package name */
    private final l6.v f35464l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f35465m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f35466n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f35467o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f35468p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f35469q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f35470r;

    /* renamed from: s, reason: collision with root package name */
    private final l6.v f35471s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f35472t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f35473u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3349K f35474v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f35475w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35479d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35480e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35481f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35482g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35483h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35484i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35477b = z8;
            this.f35478c = k0Var;
            this.f35479d = modifier;
            this.f35480e = set;
            this.f35481f = g8;
            this.f35482g = i8;
            this.f35483h = i9;
            this.f35484i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C3416f.this.f(this.f35477b, this.f35478c, this.f35479d, this.f35480e, this.f35481f, this.f35482g, this.f35483h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35484i | 1));
        }
    }

    /* renamed from: m4.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) C3416f.this.f35468p.getValue()).getError();
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

    /* renamed from: m4.f$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35486a = new c();

        c() {
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

    /* renamed from: m4.f$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3159y.i(it, "it");
            if (!it.a() && (it.a() || !C3416f.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* renamed from: m4.f$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return C3416f.this.f35453a.h(it);
        }
    }

    /* renamed from: m4.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0817f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0817f f35489a = new C0817f();

        C0817f() {
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

    public C3416f(v0 config, Function0 function0, String str) {
        AbstractC3159y.i(config, "config");
        this.f35453a = config;
        this.f35454b = function0;
        this.f35455c = str;
        String s8 = s();
        if (s8 != null) {
            r(s8);
        }
        this.f35456d = config.c();
        this.f35457e = config.g();
        this.f35458f = config.i();
        VisualTransformation d8 = config.d();
        this.f35459g = d8 == null ? VisualTransformation.Companion.getNone() : d8;
        this.f35461i = AbstractC3351M.a(config.b());
        this.f35462j = config.k();
        l6.v a8 = AbstractC3351M.a("");
        this.f35464l = a8;
        this.f35465m = AbstractC3360h.b(a8);
        this.f35466n = v4.g.m(a8, new e());
        this.f35467o = AbstractC3360h.b(a8);
        l6.v a9 = AbstractC3351M.a(z0.a.f35857c);
        this.f35468p = a9;
        this.f35469q = AbstractC3360h.b(a9);
        this.f35470r = config.a();
        l6.v a10 = AbstractC3351M.a(Boolean.FALSE);
        this.f35471s = a10;
        this.f35472t = v4.g.d(a9, a10, C0817f.f35489a);
        this.f35473u = v4.g.m(n(), new b());
        this.f35474v = v4.g.m(a9, new d());
        this.f35475w = v4.g.d(t(), y(), c.f35486a);
    }

    @Override // m4.w0
    public InterfaceC3349K a() {
        return this.f35470r;
    }

    @Override // m4.w0
    public InterfaceC3349K c() {
        return this.f35456d;
    }

    @Override // m4.w0
    public VisualTransformation d() {
        return this.f35459g;
    }

    @Override // m4.w0
    public InterfaceC3349K e() {
        return w0.a.c(this);
    }

    @Override // m4.w0, m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-2122817753);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2122817753, i10, -1, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:112)");
        }
        AbstractC3418h.a(this, null, startRestartGroup, 8, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.w0
    public int g() {
        return this.f35457e;
    }

    @Override // m4.w0
    public InterfaceC3349K getContentDescription() {
        return this.f35467o;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35473u;
    }

    @Override // m4.w0
    public void h(x0.a.C0823a c0823a) {
        w0.a.d(this, c0823a);
    }

    @Override // m4.w0
    public void i(boolean z8) {
        this.f35471s.setValue(Boolean.valueOf(z8));
    }

    @Override // m4.w0
    public int j() {
        return this.f35458f;
    }

    @Override // m4.w0
    public InterfaceC3349K k() {
        return this.f35465m;
    }

    @Override // m4.w0
    public y0 l(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f35468p.getValue();
        this.f35464l.setValue(this.f35453a.j(displayFormatted));
        this.f35468p.setValue(this.f35453a.l((String) this.f35464l.getValue()));
        if (!AbstractC3159y.d(this.f35468p.getValue(), y0Var)) {
            return (y0) this.f35468p.getValue();
        }
        return null;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35475w;
    }

    @Override // m4.w0
    public InterfaceC3349K n() {
        return this.f35472t;
    }

    @Override // m4.w0
    public InterfaceC3349K o() {
        return this.f35469q;
    }

    @Override // m4.w0
    public AutofillType p() {
        return this.f35463k;
    }

    @Override // m4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        l(this.f35453a.f(rawValue));
    }

    @Override // m4.w0
    public String s() {
        return this.f35455c;
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f35474v;
    }

    @Override // m4.w0
    public boolean u() {
        return this.f35460h;
    }

    @Override // m4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public l6.v b() {
        return this.f35461i;
    }

    public InterfaceC3349K y() {
        return this.f35466n;
    }

    public final void z() {
        Function0 function0 = this.f35454b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public /* synthetic */ C3416f(v0 v0Var, Function0 function0, String str, int i8, AbstractC3151p abstractC3151p) {
        this(v0Var, (i8 & 2) != 0 ? null : function0, (i8 & 4) != 0 ? null : str);
    }
}
