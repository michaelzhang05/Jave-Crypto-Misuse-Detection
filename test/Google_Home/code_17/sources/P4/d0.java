package p4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class d0 implements H, j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f37452i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f37453a = y4.g.n(Integer.valueOf(AbstractC3435g.f35187x));

    /* renamed from: b, reason: collision with root package name */
    private final o6.w f37454b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f37455c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f37456d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f37457e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f37458f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f37459g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f37460h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37462b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f37463c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37464d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f37465e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f37466f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37467g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37468h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37469i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37462b = z8;
            this.f37463c = k0Var;
            this.f37464d = modifier;
            this.f37465e = set;
            this.f37466f = g8;
            this.f37467g = i8;
            this.f37468h = i9;
            this.f37469i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            d0.this.c(this.f37462b, this.f37463c, this.f37464d, this.f37465e, this.f37466f, this.f37467g, this.f37468h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37469i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37470a = new b();

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
    static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37471a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4061a invoke(String str) {
            return new C4061a(str, true);
        }
    }

    public d0(boolean z8) {
        o6.w a8 = AbstractC3700N.a(Boolean.valueOf(z8));
        this.f37454b = a8;
        InterfaceC3698L b8 = AbstractC3708h.b(a8);
        this.f37455c = b8;
        this.f37456d = y4.g.m(b8, b.f37470a);
        this.f37457e = j();
        this.f37458f = y4.g.n(null);
        this.f37459g = y4.g.n(Boolean.TRUE);
        this.f37460h = y4.g.m(v(), c.f37471a);
    }

    public InterfaceC3698L b() {
        return this.f37453a;
    }

    @Override // p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
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

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37458f;
    }

    public InterfaceC3698L j() {
        return this.f37456d;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f37460h;
    }

    @Override // p4.H
    public void r(String rawValue) {
        boolean z8;
        AbstractC3255y.i(rawValue, "rawValue");
        Boolean L02 = j6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    public InterfaceC3698L v() {
        return this.f37457e;
    }

    public final InterfaceC3698L w() {
        return this.f37455c;
    }

    public final void x(boolean z8) {
        this.f37454b.setValue(Boolean.valueOf(z8));
    }
}
