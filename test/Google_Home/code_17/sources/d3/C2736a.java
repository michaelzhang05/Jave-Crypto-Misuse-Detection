package d3;

import N2.d;
import N2.e;
import O5.I;
import P5.AbstractC1378t;
import W2.f;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h4.A0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import p4.G;
import y4.g;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2736a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    private final b f31159d;

    /* renamed from: e, reason: collision with root package name */
    private final e f31160e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f31161f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0714a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0714a(boolean z8, int i8) {
            super(2);
            this.f31163b = z8;
            this.f31164c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C2736a.this.f(this.f31163b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f31164c | 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2736a(b configuration, e linkConfigurationCoordinator, Function1 onLinkInlineSignupStateChanged) {
        super(G.Companion.a("link_form"), true);
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3255y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.f31159d = configuration;
        this.f31160e = linkConfigurationCoordinator;
        this.f31161f = onLinkInlineSignupStateChanged;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return g.n(AbstractC1378t.m());
    }

    @Override // h4.A0
    public void f(boolean z8, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-736893023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-736893023, i8, -1, "com.stripe.android.lpmfoundations.paymentmethod.link.LinkFormElement.ComposeUI (LinkFormElement.kt:25)");
        }
        f.a(this.f31160e, this.f31159d.a(), this.f31159d.b(), z8, this.f31161f, startRestartGroup, (d.f7669h << 3) | 8 | ((i8 << 9) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0714a(z8, i8));
        }
    }
}
