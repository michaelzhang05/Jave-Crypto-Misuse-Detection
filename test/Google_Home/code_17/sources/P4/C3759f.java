package p4;

import a6.InterfaceC1668n;
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

/* renamed from: p4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3759f implements w0, H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f37479a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f37480b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37481c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f37482d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37483e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37484f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f37485g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f37486h;

    /* renamed from: i, reason: collision with root package name */
    private final o6.w f37487i;

    /* renamed from: j, reason: collision with root package name */
    private final String f37488j;

    /* renamed from: k, reason: collision with root package name */
    private final AutofillType f37489k;

    /* renamed from: l, reason: collision with root package name */
    private final o6.w f37490l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f37491m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f37492n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3698L f37493o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f37494p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f37495q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3698L f37496r;

    /* renamed from: s, reason: collision with root package name */
    private final o6.w f37497s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f37498t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3698L f37499u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3698L f37500v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3698L f37501w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f37504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37505d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f37506e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f37507f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37508g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37509h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37510i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37503b = z8;
            this.f37504c = k0Var;
            this.f37505d = modifier;
            this.f37506e = set;
            this.f37507f = g8;
            this.f37508g = i8;
            this.f37509h = i9;
            this.f37510i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C3759f.this.c(this.f37503b, this.f37504c, this.f37505d, this.f37506e, this.f37507f, this.f37508g, this.f37509h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37510i | 1));
        }
    }

    /* renamed from: p4.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) C3759f.this.f37494p.getValue()).getError();
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

    /* renamed from: p4.f$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37512a = new c();

        c() {
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

    /* renamed from: p4.f$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3255y.i(it, "it");
            if (!it.a() && (it.a() || !C3759f.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* renamed from: p4.f$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3255y.i(it, "it");
            return C3759f.this.f37479a.h(it);
        }
    }

    /* renamed from: p4.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0847f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0847f f37515a = new C0847f();

        C0847f() {
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

    public C3759f(v0 config, Function0 function0, String str) {
        AbstractC3255y.i(config, "config");
        this.f37479a = config;
        this.f37480b = function0;
        this.f37481c = str;
        String s8 = s();
        if (s8 != null) {
            r(s8);
        }
        this.f37482d = config.d();
        this.f37483e = config.g();
        this.f37484f = config.i();
        VisualTransformation e8 = config.e();
        this.f37485g = e8 == null ? VisualTransformation.Companion.getNone() : e8;
        this.f37487i = AbstractC3700N.a(config.b());
        this.f37488j = config.k();
        o6.w a8 = AbstractC3700N.a("");
        this.f37490l = a8;
        this.f37491m = AbstractC3708h.b(a8);
        this.f37492n = y4.g.m(a8, new e());
        this.f37493o = AbstractC3708h.b(a8);
        o6.w a9 = AbstractC3700N.a(z0.a.f37883c);
        this.f37494p = a9;
        this.f37495q = AbstractC3708h.b(a9);
        this.f37496r = config.a();
        o6.w a10 = AbstractC3700N.a(Boolean.FALSE);
        this.f37497s = a10;
        this.f37498t = y4.g.d(a9, a10, C0847f.f37515a);
        this.f37499u = y4.g.m(n(), new b());
        this.f37500v = y4.g.m(a9, new d());
        this.f37501w = y4.g.d(t(), y(), c.f37512a);
    }

    @Override // p4.w0
    public InterfaceC3698L a() {
        return this.f37496r;
    }

    @Override // p4.w0, p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-2122817753);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2122817753, i10, -1, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:112)");
        }
        AbstractC3761h.a(this, null, startRestartGroup, 8, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.w0
    public InterfaceC3698L d() {
        return this.f37482d;
    }

    @Override // p4.w0
    public VisualTransformation e() {
        return this.f37485g;
    }

    @Override // p4.w0
    public InterfaceC3698L f() {
        return w0.a.c(this);
    }

    @Override // p4.w0
    public int g() {
        return this.f37483e;
    }

    @Override // p4.w0
    public InterfaceC3698L getContentDescription() {
        return this.f37493o;
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37499u;
    }

    @Override // p4.w0
    public void h(boolean z8) {
        this.f37497s.setValue(Boolean.valueOf(z8));
    }

    @Override // p4.w0
    public int i() {
        return this.f37484f;
    }

    @Override // p4.w0
    public InterfaceC3698L j() {
        return this.f37491m;
    }

    @Override // p4.w0
    public void k(x0.a.C0853a c0853a) {
        w0.a.d(this, c0853a);
    }

    @Override // p4.w0
    public y0 l(String displayFormatted) {
        AbstractC3255y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f37494p.getValue();
        this.f37490l.setValue(this.f37479a.j(displayFormatted));
        this.f37494p.setValue(this.f37479a.l((String) this.f37490l.getValue()));
        if (!AbstractC3255y.d(this.f37494p.getValue(), y0Var)) {
            return (y0) this.f37494p.getValue();
        }
        return null;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f37501w;
    }

    @Override // p4.w0
    public InterfaceC3698L n() {
        return this.f37498t;
    }

    @Override // p4.w0
    public InterfaceC3698L o() {
        return this.f37495q;
    }

    @Override // p4.w0
    public AutofillType p() {
        return this.f37489k;
    }

    @Override // p4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // p4.H
    public void r(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        l(this.f37479a.c(rawValue));
    }

    @Override // p4.w0
    public String s() {
        return this.f37481c;
    }

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f37500v;
    }

    @Override // p4.w0
    public boolean u() {
        return this.f37486h;
    }

    @Override // p4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public o6.w b() {
        return this.f37487i;
    }

    public InterfaceC3698L y() {
        return this.f37492n;
    }

    public final void z() {
        Function0 function0 = this.f37480b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public /* synthetic */ C3759f(v0 v0Var, Function0 function0, String str, int i8, AbstractC3247p abstractC3247p) {
        this(v0Var, (i8 & 2) != 0 ? null : function0, (i8 & 4) != 0 ? null : str);
    }
}
