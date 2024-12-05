package androidx.compose.material.pullrefresh;

import P5.h;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    @Composable
    @ExperimentalMaterialApi
    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m1433rememberPullRefreshStateUuyPYSY(boolean z8, Function0 onRefresh, float f8, float f9, Composer composer, int i8, int i9) {
        AbstractC3159y.i(onRefresh, "onRefresh");
        composer.startReplaceableGroup(-174977512);
        if ((i9 & 4) != 0) {
            f8 = PullRefreshDefaults.INSTANCE.m1426getRefreshThresholdD9Ej5fM();
        }
        if ((i9 & 8) != 0) {
            f9 = PullRefreshDefaults.INSTANCE.m1427getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i8, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:56)");
        }
        if (Dp.m5177compareTo0680j_4(f8, Dp.m5178constructorimpl(0)) > 0) {
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f7994a, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onRefresh, composer, (i8 >> 3) & 14);
            P p8 = new P();
            P p9 = new P();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            p8.f33758a = density.mo448toPx0680j_4(f8);
            p9.f33758a = density.mo448toPx0680j_4(f9);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(coroutineScope);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new PullRefreshState(coroutineScope, rememberUpdatedState, p9.f33758a, p8.f33758a);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            PullRefreshState pullRefreshState = (PullRefreshState) rememberedValue2;
            EffectsKt.SideEffect(new PullRefreshStateKt$rememberPullRefreshState$3(pullRefreshState, z8, p8, p9), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return pullRefreshState;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    }
}
