package androidx.compose.foundation.pager;

import O5.I;
import P5.Q;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import c6.AbstractC2055a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ Function0 $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3256z implements InterfaceC1669o {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8, int i8, int i9) {
            super(3);
            this.$this_null = lazyLayoutMeasureScope;
            this.$containerConstraints = j8;
            this.$totalHorizontalPadding = i8;
            this.$totalVerticalPadding = i9;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
        }

        public final MeasureResult invoke(int i8, int i9, Function1 placement) {
            AbstractC3255y.i(placement, "placement");
            return this.$this_null.layout(ConstraintsKt.m5165constrainWidthK40F9xA(this.$containerConstraints, i8 + this.$totalHorizontalPadding), ConstraintsKt.m5164constrainHeightK40F9xA(this.$containerConstraints, i9 + this.$totalVerticalPadding), Q.h(), placement);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(Orientation orientation, PaddingValues paddingValues, boolean z8, PagerState pagerState, float f8, PageSize pageSize, Function0 function0, Function0 function02, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i8) {
        super(2);
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$state = pagerState;
        this.$pageSpacing = f8;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = function0;
        this.$pageCount = function02;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondBoundsPageCount = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m822invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5157unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final PagerMeasureResult m822invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        boolean z8;
        Orientation orientation;
        int mo447roundToPx0680j_4;
        int mo447roundToPx0680j_42;
        int i8;
        int i9;
        int m5151getMaxWidthimpl;
        long IntOffset;
        int i10;
        int i11;
        int firstVisiblePageOffset$foundation_release;
        AbstractC3255y.i(lazyLayoutMeasureScope, "$this$null");
        Orientation orientation2 = this.$orientation;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 == orientation3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            orientation = orientation3;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m315checkScrollableContainerConstraintsK40F9xA(j8, orientation);
        if (z8) {
            mo447roundToPx0680j_4 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(this.$contentPadding.mo556calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo447roundToPx0680j_4 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (z8) {
            mo447roundToPx0680j_42 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(this.$contentPadding.mo557calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo447roundToPx0680j_42 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo447roundToPx0680j_43 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(this.$contentPadding.mo558calculateTopPaddingD9Ej5fM());
        int mo447roundToPx0680j_44 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(this.$contentPadding.mo555calculateBottomPaddingD9Ej5fM());
        int i12 = mo447roundToPx0680j_43 + mo447roundToPx0680j_44;
        int i13 = mo447roundToPx0680j_4 + mo447roundToPx0680j_42;
        if (z8) {
            i8 = i12;
        } else {
            i8 = i13;
        }
        if (z8 && !this.$reverseLayout) {
            i9 = mo447roundToPx0680j_43;
        } else if (z8 && this.$reverseLayout) {
            i9 = mo447roundToPx0680j_44;
        } else if (!z8 && !this.$reverseLayout) {
            i9 = mo447roundToPx0680j_4;
        } else {
            i9 = mo447roundToPx0680j_42;
        }
        int i14 = i8 - i9;
        long m5167offsetNN6EwU = ConstraintsKt.m5167offsetNN6EwU(j8, -i13, -i12);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        int mo447roundToPx0680j_45 = lazyLayoutMeasureScope.mo447roundToPx0680j_4(this.$pageSpacing);
        if (z8) {
            m5151getMaxWidthimpl = Constraints.m5150getMaxHeightimpl(j8) - i12;
        } else {
            m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8) - i13;
        }
        if (this.$reverseLayout && m5151getMaxWidthimpl <= 0) {
            if (!z8) {
                mo447roundToPx0680j_4 += m5151getMaxWidthimpl;
            }
            if (z8) {
                mo447roundToPx0680j_43 += m5151getMaxWidthimpl;
            }
            IntOffset = IntOffsetKt.IntOffset(mo447roundToPx0680j_4, mo447roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo447roundToPx0680j_4, mo447roundToPx0680j_43);
        }
        long j9 = IntOffset;
        int calculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope, m5151getMaxWidthimpl, mo447roundToPx0680j_45);
        PagerState pagerState = this.$state;
        if (this.$orientation == orientation3) {
            i10 = Constraints.m5151getMaxWidthimpl(m5167offsetNN6EwU);
        } else {
            i10 = calculateMainAxisPageSize;
        }
        if (this.$orientation != orientation3) {
            i11 = Constraints.m5150getMaxHeightimpl(m5167offsetNN6EwU);
        } else {
            i11 = calculateMainAxisPageSize;
        }
        pagerState.m825setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, i10, 0, i11, 5, null));
        Snapshot.Companion companion = Snapshot.Companion;
        PagerState pagerState2 = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int firstVisiblePage$foundation_release = pagerState2.getFirstVisiblePage$foundation_release();
                if (AbstractC3255y.d(pagerState2.getLayoutInfo$foundation_release(), PagerStateKt.getEmptyLayoutInfo())) {
                    firstVisiblePageOffset$foundation_release = AbstractC2055a.d(pagerState2.getInitialPageOffsetFraction() * calculateMainAxisPageSize);
                } else {
                    firstVisiblePageOffset$foundation_release = pagerState2.getFirstVisiblePageOffset$foundation_release();
                }
                int i15 = firstVisiblePageOffset$foundation_release;
                I i16 = I.f8278a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) this.$itemProviderLambda.invoke();
                PagerMeasureResult m820measurePagerntgEbfI = PagerMeasureKt.m820measurePagerntgEbfI(lazyLayoutMeasureScope, ((Number) this.$pageCount.invoke()).intValue(), pagerLazyLayoutItemProvider, m5151getMaxWidthimpl, i9, i14, mo447roundToPx0680j_45, firstVisiblePage$foundation_release, i15, this.$state.getScrollToBeConsumed$foundation_release(), m5167offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, j9, calculateMainAxisPageSize, this.$beyondBoundsPageCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProvider, this.$state.getPinnedPages$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass2(lazyLayoutMeasureScope, j8, i13, i12));
                this.$state.applyMeasureResult$foundation_release(m820measurePagerntgEbfI);
                return m820measurePagerntgEbfI;
            } catch (Throwable th) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            createNonObservableSnapshot.dispose();
            throw th2;
        }
    }
}
