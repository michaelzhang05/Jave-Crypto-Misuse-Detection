package androidx.compose.foundation.lazy.staggeredgrid;

import X5.n;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 extends AbstractC3160z implements n {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ n $slots;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(Orientation orientation, n nVar, Function0 function0, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z8, float f8) {
        super(2);
        this.$orientation = orientation;
        this.$slots = nVar;
        this.$itemProviderLambda = function0;
        this.$state = lazyStaggeredGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$mainAxisSpacing = f8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m784invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m784invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        boolean z8;
        float beforePadding;
        float afterPadding;
        float startPadding;
        int m5146getMaxWidthimpl;
        long IntOffset;
        AbstractC3159y.i(lazyLayoutMeasureScope, "$this$null");
        CheckScrollableContainerConstraintsKt.m310checkScrollableContainerConstraintsK40F9xA(j8, this.$orientation);
        LazyStaggeredGridSlots lazyStaggeredGridSlots = (LazyStaggeredGridSlots) this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m5134boximpl(j8));
        if (this.$orientation == Orientation.Vertical) {
            z8 = true;
        } else {
            z8 = false;
        }
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = (LazyStaggeredGridItemProvider) this.$itemProviderLambda.invoke();
        this.$state.setSlots$foundation_release(lazyStaggeredGridSlots);
        this.$state.setVertical$foundation_release(z8);
        this.$state.setSpanProvider$foundation_release(lazyStaggeredGridItemProvider.getSpanProvider());
        beforePadding = LazyStaggeredGridMeasurePolicyKt.beforePadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo442roundToPx0680j_4 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(beforePadding);
        afterPadding = LazyStaggeredGridMeasurePolicyKt.afterPadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo442roundToPx0680j_42 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(afterPadding);
        startPadding = LazyStaggeredGridMeasurePolicyKt.startPadding(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection());
        int mo442roundToPx0680j_43 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(startPadding);
        if (z8) {
            m5146getMaxWidthimpl = Constraints.m5145getMaxHeightimpl(j8);
        } else {
            m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        }
        int i8 = (m5146getMaxWidthimpl - mo442roundToPx0680j_4) - mo442roundToPx0680j_42;
        if (z8) {
            IntOffset = IntOffsetKt.IntOffset(mo442roundToPx0680j_43, mo442roundToPx0680j_4);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo442roundToPx0680j_4, mo442roundToPx0680j_43);
        }
        long j9 = IntOffset;
        PaddingValues paddingValues = this.$contentPadding;
        int mo442roundToPx0680j_44 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(Dp.m5178constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        int mo442roundToPx0680j_45 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(Dp.m5178constructorimpl(paddingValues2.mo553calculateTopPaddingD9Ej5fM() + paddingValues2.mo550calculateBottomPaddingD9Ej5fM()));
        boolean z9 = z8;
        LazyStaggeredGridMeasureResult m782measureStaggeredGriddSVRQoE = LazyStaggeredGridMeasureKt.m782measureStaggeredGriddSVRQoE(lazyLayoutMeasureScope, this.$state, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProvider, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, Constraints.m5137copyZbe2FdA$default(j8, ConstraintsKt.m5160constrainWidthK40F9xA(j8, mo442roundToPx0680j_44), 0, ConstraintsKt.m5159constrainHeightK40F9xA(j8, mo442roundToPx0680j_45), 0, 10, null), z9, this.$reverseLayout, j9, i8, lazyLayoutMeasureScope.mo442roundToPx0680j_4(this.$mainAxisSpacing), mo442roundToPx0680j_4, mo442roundToPx0680j_42);
        this.$state.applyMeasureResult$foundation_release(m782measureStaggeredGriddSVRQoE);
        return m782measureStaggeredGriddSVRQoE;
    }
}
