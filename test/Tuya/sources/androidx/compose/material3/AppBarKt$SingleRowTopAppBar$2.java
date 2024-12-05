package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ n $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ n $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$2(WindowInsets windowInsets, TopAppBarColors topAppBarColors, n nVar, TextStyle textStyle, boolean z8, n nVar2, n nVar3, int i8, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$title = nVar;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z8;
        this.$navigationIcon = nVar2;
        this.$actionsRow = nVar3;
        this.$$dirty = i8;
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        TopAppBarState state;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(376925230, i8, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1046)");
        }
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        float mo448toPx0680j_4 = ((Density) consume).mo448toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m2412getContainerHeightD9Ej5fM()) + ((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset());
        Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.$windowInsets));
        long m1947getNavigationIconContentColor0d7_KjU$material3_release = this.$colors.m1947getNavigationIconContentColor0d7_KjU$material3_release();
        long m1948getTitleContentColor0d7_KjU$material3_release = this.$colors.m1948getTitleContentColor0d7_KjU$material3_release();
        long m1946getActionIconContentColor0d7_KjU$material3_release = this.$colors.m1946getActionIconContentColor0d7_KjU$material3_release();
        n nVar = this.$title;
        TextStyle textStyle = this.$titleTextStyle;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        Arrangement.Horizontal center2 = this.$centeredTitle ? arrangement.getCenter() : arrangement.getStart();
        n nVar2 = this.$navigationIcon;
        n nVar3 = this.$actionsRow;
        int i9 = this.$$dirty;
        AppBarKt.m1458TopAppBarLayoutkXwM9vE(clipToBounds, mo448toPx0680j_4, m1947getNavigationIconContentColor0d7_KjU$material3_release, m1948getTitleContentColor0d7_KjU$material3_release, m1946getActionIconContentColor0d7_KjU$material3_release, nVar, textStyle, 1.0f, center, center2, 0, false, nVar2, nVar3, composer, ((i9 << 12) & 458752) | 113246208 | ((i9 << 12) & 3670016), ((i9 >> 6) & 896) | 3126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
