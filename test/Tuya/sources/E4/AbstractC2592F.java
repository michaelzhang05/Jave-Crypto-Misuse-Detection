package e4;

import M5.AbstractC1246t;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: e4.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2592F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.F$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30349a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2589C f30350b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f30351c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m4.G f30352d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30353e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, C2589C c2589c, Set set, m4.G g8, int i8) {
            super(2);
            this.f30349a = z8;
            this.f30350b = c2589c;
            this.f30351c = set;
            this.f30352d = g8;
            this.f30353e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2592F.a(this.f30349a, this.f30350b, this.f30351c, this.f30352d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30353e | 1));
        }
    }

    public static final void a(boolean z8, C2589C controller, Set hiddenIdentifiers, m4.G g8, Composer composer, int i8) {
        int m2658getDowndhqQ8s;
        AbstractC3159y.i(controller, "controller");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1519035641);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519035641, i8, -1, "com.stripe.android.ui.core.elements.CardDetailsElementUI (CardDetailsElementUI.kt:20)");
        }
        int i9 = 0;
        for (Object obj : controller.x()) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1246t.w();
            }
            m4.k0 k0Var = (m4.k0) obj;
            if (AbstractC3159y.d(k0Var.a(), m4.G.Companion.j())) {
                m2658getDowndhqQ8s = FocusDirection.Companion.m2662getNextdhqQ8s();
            } else {
                m2658getDowndhqQ8s = FocusDirection.Companion.m2658getDowndhqQ8s();
            }
            m4.l0.a(z8, k0Var, null, hiddenIdentifiers, g8, m2658getDowndhqQ8s, 0, startRestartGroup, (i8 & 14) | 4160 | (m4.G.f35073d << 12) | ((i8 << 3) & 57344), 68);
            startRestartGroup.startReplaceableGroup(1631013063);
            if (i9 != AbstractC1246t.o(controller.x())) {
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                DividerKt.m1213DivideroMI9zvI(PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, startRestartGroup, i11).c()), 0.0f, 2, null), AbstractC3087m.n(materialTheme, startRestartGroup, i11).f(), Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, startRestartGroup, i11).c()), 0.0f, startRestartGroup, 0, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i9 = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }
}
