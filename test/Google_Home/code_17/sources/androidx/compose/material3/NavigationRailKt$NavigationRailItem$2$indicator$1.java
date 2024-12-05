package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$2$indicator$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ NavigationRailItemColors $colors;
    final /* synthetic */ Shape $indicatorShape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$2$indicator$1(NavigationRailItemColors navigationRailItemColors, int i8, Shape shape, State<Float> state) {
        super(2);
        this.$colors = navigationRailItemColors;
        this.$$dirty = i8;
        this.$indicatorShape = shape;
        this.$animationProgress$delegate = state;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float m1730NavigationRailItem$lambda5$lambda2;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1862011490, i8, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
        }
        Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
        long indicatorColor = this.$colors.getIndicatorColor(composer, (this.$$dirty >> 21) & 14);
        m1730NavigationRailItem$lambda5$lambda2 = NavigationRailKt.m1730NavigationRailItem$lambda5$lambda2(this.$animationProgress$delegate);
        BoxKt.Box(BackgroundKt.m286backgroundbw27NRU(layoutId, Color.m2975copywmQWz5c$default(indicatorColor, m1730NavigationRailItem$lambda5$lambda2, 0.0f, 0.0f, 0.0f, 14, null), this.$indicatorShape), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
