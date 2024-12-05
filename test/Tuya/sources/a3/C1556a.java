package a3;

import K2.d;
import K2.e;
import L5.I;
import M5.AbstractC1246t;
import T2.f;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import e4.A0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.G;
import v4.g;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1556a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    private final b f13496d;

    /* renamed from: e, reason: collision with root package name */
    private final e f13497e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f13498f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0260a extends AbstractC3160z implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0260a(boolean z8, int i8) {
            super(2);
            this.f13500b = z8;
            this.f13501c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C1556a.this.f(this.f13500b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13501c | 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1556a(b configuration, e linkConfigurationCoordinator, Function1 onLinkInlineSignupStateChanged) {
        super(G.Companion.a("link_form"), true);
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3159y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.f13496d = configuration;
        this.f13497e = linkConfigurationCoordinator;
        this.f13498f = onLinkInlineSignupStateChanged;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return g.n(AbstractC1246t.m());
    }

    @Override // e4.A0
    public void f(boolean z8, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-736893023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-736893023, i8, -1, "com.stripe.android.lpmfoundations.paymentmethod.link.LinkFormElement.ComposeUI (LinkFormElement.kt:25)");
        }
        f.a(this.f13497e, this.f13496d.b(), this.f13496d.c(), z8, this.f13498f, startRestartGroup, (d.f5890h << 3) | 8 | ((i8 << 9) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0260a(z8, i8));
        }
    }
}
