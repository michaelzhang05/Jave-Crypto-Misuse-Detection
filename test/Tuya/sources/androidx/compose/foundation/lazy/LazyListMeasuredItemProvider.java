package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider {
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyListMeasuredItemProvider(long j8, boolean z8, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, AbstractC3151p abstractC3151p) {
        this(j8, z8, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    public abstract LazyListMeasuredItem createItem(int i8, Object obj, Object obj2, List<? extends Placeable> list);

    public final LazyListMeasuredItem getAndMeasure(int i8) {
        return createItem(i8, this.itemProvider.getKey(i8), this.itemProvider.getContentType(i8), this.measureScope.mo756measure0kLqBqw(i8, this.childConstraints));
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m709getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    private LazyListMeasuredItemProvider(long j8, boolean z8, LazyListItemProvider itemProvider, LazyLayoutMeasureScope measureScope) {
        AbstractC3159y.i(itemProvider, "itemProvider");
        AbstractC3159y.i(measureScope, "measureScope");
        this.itemProvider = itemProvider;
        this.measureScope = measureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z8 ? Constraints.m5146getMaxWidthimpl(j8) : Integer.MAX_VALUE, 0, !z8 ? Constraints.m5145getMaxHeightimpl(j8) : Integer.MAX_VALUE, 5, null);
    }
}
