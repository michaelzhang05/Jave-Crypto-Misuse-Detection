package h4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
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
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;

/* renamed from: h4.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2912F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.F$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32270a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2909C f32271b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f32272c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p4.G f32273d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32274e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, C2909C c2909c, Set set, p4.G g8, int i8) {
            super(2);
            this.f32270a = z8;
            this.f32271b = c2909c;
            this.f32272c = set;
            this.f32273d = g8;
            this.f32274e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2912F.a(this.f32270a, this.f32271b, this.f32272c, this.f32273d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32274e | 1));
        }
    }

    public static final void a(boolean z8, C2909C controller, Set hiddenIdentifiers, p4.G g8, Composer composer, int i8) {
        int m2663getDowndhqQ8s;
        AbstractC3255y.i(controller, "controller");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1519035641);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519035641, i8, -1, "com.stripe.android.ui.core.elements.CardDetailsElementUI (CardDetailsElementUI.kt:20)");
        }
        int i9 = 0;
        for (Object obj : controller.x()) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1378t.w();
            }
            p4.k0 k0Var = (p4.k0) obj;
            if (AbstractC3255y.d(k0Var.a(), p4.G.Companion.j())) {
                m2663getDowndhqQ8s = FocusDirection.Companion.m2667getNextdhqQ8s();
            } else {
                m2663getDowndhqQ8s = FocusDirection.Companion.m2663getDowndhqQ8s();
            }
            p4.l0.a(z8, k0Var, null, hiddenIdentifiers, g8, m2663getDowndhqQ8s, 0, startRestartGroup, (i8 & 14) | 4160 | (p4.G.f37099d << 12) | ((i8 << 3) & 57344), 68);
            startRestartGroup.startReplaceableGroup(1631013063);
            if (i9 != AbstractC1378t.o(controller.x())) {
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                DividerKt.m1218DivideroMI9zvI(PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, startRestartGroup, i11).c()), 0.0f, 2, null), AbstractC3441m.n(materialTheme, startRestartGroup, i11).f(), Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, startRestartGroup, i11).c()), 0.0f, startRestartGroup, 0, 8);
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
