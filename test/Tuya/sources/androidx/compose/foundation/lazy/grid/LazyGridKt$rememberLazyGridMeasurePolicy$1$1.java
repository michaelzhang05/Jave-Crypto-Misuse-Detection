package androidx.compose.foundation.lazy.grid;

import L5.I;
import L5.r;
import L5.x;
import M5.Q;
import X5.n;
import X5.o;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends AbstractC3160z implements n {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ n $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 $measuredLineProvider;
        final /* synthetic */ LazyGridSpanLayoutProvider $spanLayoutProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) {
            super(1);
            this.$spanLayoutProvider = lazyGridSpanLayoutProvider;
            this.$measuredLineProvider = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final ArrayList<r> invoke(int i8) {
            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.$spanLayoutProvider.getLineConfiguration(i8);
            int firstItemIndex = lineConfiguration.getFirstItemIndex();
            ArrayList<r> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
            List<GridItemSpan> spans = lineConfiguration.getSpans();
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = this.$measuredLineProvider;
            int size = spans.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                int m717getCurrentLineSpanimpl = GridItemSpan.m717getCurrentLineSpanimpl(spans.get(i10).m720unboximpl());
                arrayList.add(x.a(Integer.valueOf(firstItemIndex), Constraints.m5134boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m738childConstraintsJhjzzOo$foundation_release(i9, m717getCurrentLineSpanimpl))));
                firstItemIndex++;
                i9 += m717getCurrentLineSpanimpl;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3160z implements o {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8, int i8, int i9) {
            super(3);
            this.$this_null = lazyLayoutMeasureScope;
            this.$containerConstraints = j8;
            this.$totalHorizontalPadding = i8;
            this.$totalVerticalPadding = i9;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
        }

        public final MeasureResult invoke(int i8, int i9, Function1 placement) {
            AbstractC3159y.i(placement, "placement");
            return this.$this_null.layout(ConstraintsKt.m5160constrainWidthK40F9xA(this.$containerConstraints, i8 + this.$totalHorizontalPadding), ConstraintsKt.m5159constrainHeightK40F9xA(this.$containerConstraints, i9 + this.$totalVerticalPadding), Q.h(), placement);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z8, PaddingValues paddingValues, boolean z9, Function0 function0, n nVar, LazyGridState lazyGridState, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal) {
        super(2);
        this.$isVertical = z8;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z9;
        this.$itemProviderLambda = function0;
        this.$slots = nVar;
        this.$state = lazyGridState;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m732invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* JADX WARN: Type inference failed for: r32v0, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridMeasureResult m732invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        Orientation orientation;
        int mo442roundToPx0680j_4;
        int mo442roundToPx0680j_42;
        int i8;
        int i9;
        float mo520getSpacingD9Ej5fM;
        int m5146getMaxWidthimpl;
        long IntOffset;
        int firstVisibleItemScrollOffset;
        int i10;
        AbstractC3159y.i(lazyLayoutMeasureScope, "$this$null");
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m310checkScrollableContainerConstraintsK40F9xA(j8, orientation);
        if (this.$isVertical) {
            mo442roundToPx0680j_4 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(this.$contentPadding.mo551calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo442roundToPx0680j_4 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            mo442roundToPx0680j_42 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(this.$contentPadding.mo552calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo442roundToPx0680j_42 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo442roundToPx0680j_43 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(this.$contentPadding.mo553calculateTopPaddingD9Ej5fM());
        int mo442roundToPx0680j_44 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(this.$contentPadding.mo550calculateBottomPaddingD9Ej5fM());
        int i11 = mo442roundToPx0680j_43 + mo442roundToPx0680j_44;
        int i12 = mo442roundToPx0680j_4 + mo442roundToPx0680j_42;
        boolean z8 = this.$isVertical;
        if (z8) {
            i8 = i11;
        } else {
            i8 = i12;
        }
        if (z8 && !this.$reverseLayout) {
            i9 = mo442roundToPx0680j_43;
        } else if (z8 && this.$reverseLayout) {
            i9 = mo442roundToPx0680j_44;
        } else if (!z8 && !this.$reverseLayout) {
            i9 = mo442roundToPx0680j_4;
        } else {
            i9 = mo442roundToPx0680j_42;
        }
        final int i13 = i8 - i9;
        long m5162offsetNN6EwU = ConstraintsKt.m5162offsetNN6EwU(j8, -i12, -i11);
        final LazyGridItemProvider lazyGridItemProvider = (LazyGridItemProvider) this.$itemProviderLambda.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
        final LazyGridSlots lazyGridSlots = (LazyGridSlots) this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m5134boximpl(j8));
        int length = lazyGridSlots.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        this.$state.setSlotsPerLine$foundation_release(length);
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                mo520getSpacingD9Ej5fM = vertical.mo520getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                mo520getSpacingD9Ej5fM = horizontal.mo520getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        final int mo442roundToPx0680j_45 = lazyLayoutMeasureScope.mo442roundToPx0680j_4(mo520getSpacingD9Ej5fM);
        final int itemCount = lazyGridItemProvider.getItemCount();
        if (this.$isVertical) {
            m5146getMaxWidthimpl = Constraints.m5145getMaxHeightimpl(j8) - i11;
        } else {
            m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8) - i12;
        }
        int i14 = m5146getMaxWidthimpl;
        if (this.$reverseLayout && i14 <= 0) {
            boolean z9 = this.$isVertical;
            if (!z9) {
                mo442roundToPx0680j_4 += i14;
            }
            if (z9) {
                mo442roundToPx0680j_43 += i14;
            }
            IntOffset = IntOffsetKt.IntOffset(mo442roundToPx0680j_4, mo442roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo442roundToPx0680j_4, mo442roundToPx0680j_43);
        }
        final long j9 = IntOffset;
        final boolean z10 = this.$isVertical;
        final boolean z11 = this.$reverseLayout;
        final int i15 = i9;
        final ?? r32 = new LazyGridMeasuredItemProvider(lazyGridItemProvider, lazyLayoutMeasureScope, mo442roundToPx0680j_45, z10, z11, i15, i13, j9) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ LazyLayoutMeasureScope $this_null;
            final /* synthetic */ long $visualItemOffset;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$this_null = lazyLayoutMeasureScope;
                this.$isVertical = z10;
                this.$reverseLayout = z11;
                this.$beforeContentPadding = i15;
                this.$afterContentPadding = i13;
                this.$visualItemOffset = j9;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            public LazyGridMeasuredItem createItem(int i16, Object key, Object obj, int i17, int i18, List<? extends Placeable> placeables) {
                AbstractC3159y.i(key, "key");
                AbstractC3159y.i(placeables, "placeables");
                return new LazyGridMeasuredItem(i16, key, this.$isVertical, i17, i18, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, obj, null);
            }
        };
        final boolean z12 = this.$isVertical;
        ?? r9 = new LazyGridMeasuredLineProvider(z12, lazyGridSlots, itemCount, mo442roundToPx0680j_45, r32, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ LazyGridSlots $resolvedSlots;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z12, lazyGridSlots, itemCount, mo442roundToPx0680j_45, r32, spanLayoutProvider);
                this.$isVertical = z12;
                this.$resolvedSlots = lazyGridSlots;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            public LazyGridMeasuredLine createLine(int i16, LazyGridMeasuredItem[] items, List<GridItemSpan> spans, int i17) {
                AbstractC3159y.i(items, "items");
                AbstractC3159y.i(spans, "spans");
                return new LazyGridMeasuredLine(i16, items, this.$resolvedSlots, spans, this.$isVertical, i17);
            }
        };
        this.$state.setPrefetchInfoRetriever$foundation_release(new AnonymousClass1(spanLayoutProvider, r9));
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider, lazyGridState.getFirstVisibleItemIndex());
                if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                    i10 = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                    firstVisibleItemScrollOffset = 0;
                    I i16 = I.f6487a;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    createNonObservableSnapshot.dispose();
                    LazyGridMeasureResult m733measureLazyGridZRKPzZ8 = LazyGridMeasureKt.m733measureLazyGridZRKPzZ8(itemCount, r9, r32, i14, i9, i13, mo442roundToPx0680j_45, i10, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m5162offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProvider, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass3(lazyLayoutMeasureScope, j8, i12, i11));
                    this.$state.applyMeasureResult$foundation_release(m733measureLazyGridZRKPzZ8);
                    return m733measureLazyGridZRKPzZ8;
                }
                int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                firstVisibleItemScrollOffset = lazyGridState.getFirstVisibleItemScrollOffset();
                i10 = lineIndexOfItem;
                I i162 = I.f6487a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                LazyGridMeasureResult m733measureLazyGridZRKPzZ82 = LazyGridMeasureKt.m733measureLazyGridZRKPzZ8(itemCount, r9, r32, i14, i9, i13, mo442roundToPx0680j_45, i10, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m5162offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProvider, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass3(lazyLayoutMeasureScope, j8, i12, i11));
                this.$state.applyMeasureResult$foundation_release(m733measureLazyGridZRKPzZ82);
                return m733measureLazyGridZRKPzZ82;
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
