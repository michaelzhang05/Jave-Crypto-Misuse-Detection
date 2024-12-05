package androidx.compose.material.pullrefresh;

import O5.I;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import g6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ boolean $scale;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2(PullRefreshState pullRefreshState, boolean z8) {
        super(1);
        this.$state = pullRefreshState;
        this.$scale = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8278a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        AbstractC3255y.i(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(this.$state.getPosition$material_release() - Size.m2806getHeightimpl(graphicsLayer.mo3143getSizeNHjbRc()));
        if (!this.$scale || this.$state.getRefreshing$material_release()) {
            return;
        }
        float j8 = m.j(EasingKt.getLinearOutSlowInEasing().transform(this.$state.getPosition$material_release() / this.$state.getThreshold$material_release()), 0.0f, 1.0f);
        graphicsLayer.setScaleX(j8);
        graphicsLayer.setScaleY(j8);
    }
}
