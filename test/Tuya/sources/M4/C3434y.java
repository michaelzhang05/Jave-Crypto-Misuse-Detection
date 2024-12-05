package m4;

import M5.AbstractC1246t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import r4.C3688a;

/* renamed from: m4.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3434y implements H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3433x f35790a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35791b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35792c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f35793d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f35794e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f35795f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f35796g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f35797h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3349K f35798i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3349K f35799j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f35800k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35801l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.y$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35804c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35805d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35806e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35807f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35808g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35809h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35810i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35803b = z8;
            this.f35804c = k0Var;
            this.f35805d = modifier;
            this.f35806e = set;
            this.f35807f = g8;
            this.f35808g = i8;
            this.f35809h = i9;
            this.f35810i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C3434y.this.f(this.f35803b, this.f35804c, this.f35805d, this.f35806e, this.f35807f, this.f35808g, this.f35809h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35810i | 1));
        }
    }

    /* renamed from: m4.y$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        public final String a(int i8) {
            return (String) C3434y.this.x().get(i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: m4.y$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35812a = new c();

        c() {
            super(2);
        }

        public final C3688a a(boolean z8, String str) {
            return new C3688a(str, z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* renamed from: m4.y$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        public final String a(int i8) {
            return (String) AbstractC1246t.p0(C3434y.this.f35790a.j(), i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public C3434y(InterfaceC3433x config, String str) {
        AbstractC3159y.i(config, "config");
        this.f35790a = config;
        this.f35791b = config.i();
        this.f35792c = config.h();
        l6.v a8 = AbstractC3351M.a(0);
        this.f35793d = a8;
        this.f35794e = a8;
        this.f35795f = AbstractC3351M.a(Integer.valueOf(config.b()));
        this.f35796g = v4.g.m(a8, new b());
        this.f35797h = v4.g.m(a8, new d());
        this.f35798i = v4.g.n(null);
        this.f35799j = AbstractC3351M.a(Boolean.TRUE);
        this.f35800k = v4.g.d(t(), y(), c.f35812a);
        this.f35801l = config.k();
        if (str != null) {
            r(str);
        }
    }

    private final void D(int i8) {
        if (i8 < this.f35791b.size()) {
            this.f35793d.setValue(Integer.valueOf(i8));
        }
    }

    public final String A(int i8) {
        return this.f35790a.g(i8);
    }

    public final boolean B() {
        return this.f35801l;
    }

    public final void C(int i8) {
        D(i8);
    }

    public InterfaceC3349K b() {
        return this.f35795f;
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-186755585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-186755585, i10, -1, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:78)");
        }
        AbstractC3435z.a(this, z8, null, false, startRestartGroup, ((i10 << 3) & 112) | 8, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35798i;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35800k;
    }

    @Override // m4.H
    public void r(String rawValue) {
        int i8;
        AbstractC3159y.i(rawValue, "rawValue");
        Integer valueOf = Integer.valueOf(this.f35791b.indexOf(this.f35790a.f(rawValue)));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            i8 = valueOf.intValue();
        } else {
            i8 = 0;
        }
        D(i8);
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f35799j;
    }

    public final boolean w() {
        return this.f35792c;
    }

    public final List x() {
        return this.f35791b;
    }

    public InterfaceC3349K y() {
        return this.f35797h;
    }

    public final InterfaceC3349K z() {
        return this.f35794e;
    }

    public /* synthetic */ C3434y(InterfaceC3433x interfaceC3433x, String str, int i8, AbstractC3151p abstractC3151p) {
        this(interfaceC3433x, (i8 & 2) != 0 ? null : str);
    }
}
