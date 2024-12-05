package p4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import u4.C4061a;

/* renamed from: p4.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3777y implements H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3776x f37816a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37817b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37818c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f37819d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f37820e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f37821f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f37822g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f37823h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3698L f37824i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3698L f37825j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3698L f37826k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f37827l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.y$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f37830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37831d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f37832e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f37833f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37834g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37835h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37836i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37829b = z8;
            this.f37830c = k0Var;
            this.f37831d = modifier;
            this.f37832e = set;
            this.f37833f = g8;
            this.f37834g = i8;
            this.f37835h = i9;
            this.f37836i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C3777y.this.c(this.f37829b, this.f37830c, this.f37831d, this.f37832e, this.f37833f, this.f37834g, this.f37835h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37836i | 1));
        }
    }

    /* renamed from: p4.y$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        public final String a(int i8) {
            return (String) C3777y.this.x().get(i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: p4.y$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37838a = new c();

        c() {
            super(2);
        }

        public final C4061a a(boolean z8, String str) {
            return new C4061a(str, z8);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* renamed from: p4.y$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {
        d() {
            super(1);
        }

        public final String a(int i8) {
            return (String) AbstractC1378t.p0(C3777y.this.f37816a.g(), i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public C3777y(InterfaceC3776x config, String str) {
        AbstractC3255y.i(config, "config");
        this.f37816a = config;
        this.f37817b = config.f();
        this.f37818c = config.e();
        o6.w a8 = AbstractC3700N.a(0);
        this.f37819d = a8;
        this.f37820e = a8;
        this.f37821f = AbstractC3700N.a(Integer.valueOf(config.b()));
        this.f37822g = y4.g.m(a8, new b());
        this.f37823h = y4.g.m(a8, new d());
        this.f37824i = y4.g.n(null);
        this.f37825j = AbstractC3700N.a(Boolean.TRUE);
        this.f37826k = y4.g.d(t(), y(), c.f37838a);
        this.f37827l = config.h();
        if (str != null) {
            r(str);
        }
    }

    private final void D(int i8) {
        if (i8 < this.f37817b.size()) {
            this.f37819d.setValue(Integer.valueOf(i8));
        }
    }

    public final String A(int i8) {
        return this.f37816a.d(i8);
    }

    public final boolean B() {
        return this.f37827l;
    }

    public final void C(int i8) {
        D(i8);
    }

    public InterfaceC3698L b() {
        return this.f37821f;
    }

    @Override // p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-186755585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-186755585, i10, -1, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:78)");
        }
        AbstractC3778z.a(this, z8, null, false, startRestartGroup, ((i10 << 3) & 112) | 8, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37824i;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f37826k;
    }

    @Override // p4.H
    public void r(String rawValue) {
        int i8;
        AbstractC3255y.i(rawValue, "rawValue");
        Integer valueOf = Integer.valueOf(this.f37817b.indexOf(this.f37816a.c(rawValue)));
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

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f37825j;
    }

    public final boolean w() {
        return this.f37818c;
    }

    public final List x() {
        return this.f37817b;
    }

    public InterfaceC3698L y() {
        return this.f37823h;
    }

    public final InterfaceC3698L z() {
        return this.f37820e;
    }

    public /* synthetic */ C3777y(InterfaceC3776x interfaceC3776x, String str, int i8, AbstractC3247p abstractC3247p) {
        this(interfaceC3776x, (i8 & 2) != 0 ? null : str);
    }
}
