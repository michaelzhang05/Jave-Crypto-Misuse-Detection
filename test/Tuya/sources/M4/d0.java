package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import j4.AbstractC3081g;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class d0 implements H, j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f35426i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f35427a = v4.g.n(Integer.valueOf(AbstractC3081g.f33211x));

    /* renamed from: b, reason: collision with root package name */
    private final l6.v f35428b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f35429c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f35430d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f35431e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f35432f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f35433g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f35434h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35437c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35438d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35439e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35440f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35441g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35442h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35443i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35436b = z8;
            this.f35437c = k0Var;
            this.f35438d = modifier;
            this.f35439e = set;
            this.f35440f = g8;
            this.f35441g = i8;
            this.f35442h = i9;
            this.f35443i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            d0.this.f(this.f35436b, this.f35437c, this.f35438d, this.f35439e, this.f35440f, this.f35441g, this.f35442h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35443i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35444a = new b();

        b() {
            super(1);
        }

        public final String a(boolean z8) {
            return String.valueOf(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35445a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3688a invoke(String str) {
            return new C3688a(str, true);
        }
    }

    public d0(boolean z8) {
        l6.v a8 = AbstractC3351M.a(Boolean.valueOf(z8));
        this.f35428b = a8;
        InterfaceC3349K b8 = AbstractC3360h.b(a8);
        this.f35429c = b8;
        this.f35430d = v4.g.m(b8, b.f35444a);
        this.f35431e = k();
        this.f35432f = v4.g.n(null);
        this.f35433g = v4.g.n(Boolean.TRUE);
        this.f35434h = v4.g.m(v(), c.f35445a);
    }

    public InterfaceC3349K b() {
        return this.f35427a;
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(1284799623);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1284799623, i10, -1, "com.stripe.android.uicore.elements.SameAsShippingController.ComposeUI (SameAsShippingController.kt:49)");
        }
        f0.a(this, startRestartGroup, 8);
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
        return this.f35432f;
    }

    public InterfaceC3349K k() {
        return this.f35430d;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35434h;
    }

    @Override // m4.H
    public void r(String rawValue) {
        boolean z8;
        AbstractC3159y.i(rawValue, "rawValue");
        Boolean L02 = g6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    public InterfaceC3349K v() {
        return this.f35431e;
    }

    public final InterfaceC3349K w() {
        return this.f35429c;
    }

    public final void x(boolean z8) {
        this.f35428b.setValue(Boolean.valueOf(z8));
    }
}
