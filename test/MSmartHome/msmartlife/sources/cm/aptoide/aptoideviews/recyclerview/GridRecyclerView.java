package cm.aptoide.aptoideviews.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.ExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.u;
import okhttp3.HttpUrl;

/* compiled from: GridRecyclerView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u0012\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\tH\u0003J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0003J\b\u0010\u001d\u001a\u00020\tH\u0003J\b\u0010\u001e\u001a\u00020\tH\u0003J\b\u0010\u001f\u001a\u00020\tH\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0014J\"\u0010'\u001a\u00020\u00122\b\b\u0001\u0010(\u001a\u00020\t2\b\b\u0001\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\fJ\u0010\u0010+\u001a\u00020\u00122\b\b\u0001\u0010,\u001a\u00020\tJ\u0012\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adaptStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "intendedItemSize", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$Size;", "spacingItemDecorator", "Lcm/aptoide/aptoideviews/recyclerview/GridItemSpacingDecorator;", "attachLayoutAnimationParameters", HttpUrl.FRAGMENT_ENCODE_SET, "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "count", "dpToPx", "dp", "getAdaptiveMeasuredPadding", "itemWidth", "getItemMeasuredWidth", "getTotalHorizontalPadding", "getTotalWidth", "isEndReached", HttpUrl.FRAGMENT_ENCODE_SET, "thresholdRow", "onChildAttachedToWindow", "onMeasure", "widthSpec", "heightSpec", "setAdaptiveLayout", "intendedItemWidth", "intendedItemHeight", "strategy", "setIntendedItemSpacing", "spacing", "setLayoutManager", "layout", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "AdaptStrategy", "Size", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GridRecyclerView extends RecyclerView {
    public Map<Integer, View> _$_findViewCache;
    private AdaptStrategy adaptStrategy;
    private Size intendedItemSize;
    private GridItemSpacingDecorator spacingItemDecorator;

    /* compiled from: GridRecyclerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "SCALE_WIDTH_ONLY", "SCALE_KEEP_ASPECT_RATIO", "ADJUST_PADDING", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum AdaptStrategy {
        SCALE_WIDTH_ONLY,
        SCALE_KEEP_ASPECT_RATIO,
        ADJUST_PADDING
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GridRecyclerView.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$Size;", HttpUrl.FRAGMENT_ENCODE_SET, "width", HttpUrl.FRAGMENT_ENCODE_SET, "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "getRatio", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Size {
        private final int height;
        private final int width;

        public Size(int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        public static /* synthetic */ Size copy$default(Size size, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = size.width;
            }
            if ((i4 & 2) != 0) {
                i3 = size.height;
            }
            return size.copy(i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final Size copy(int width, int height) {
            return new Size(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final double getRatio() {
            double d2 = this.width;
            double d3 = this.height;
            Double.isNaN(d2);
            Double.isNaN(d3);
            return d2 / d3;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (this.width * 31) + this.height;
        }

        public String toString() {
            return "Size(width=" + this.width + ", height=" + this.height + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final int dpToPx(int dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAdaptiveMeasuredPadding(int itemWidth) {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
            int spacingPx = this.spacingItemDecorator.getSpacingPx();
            double totalWidth = getTotalWidth();
            double d2 = itemWidth + spacingPx;
            double d3 = spanCount;
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(totalWidth);
            double d4 = spacingPx;
            Double.isNaN(d4);
            return (int) ((totalWidth - (d2 * d3)) + d4);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getItemMeasuredWidth() {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
            int spacingPx = this.spacingItemDecorator.getSpacingPx();
            double totalWidth = (getTotalWidth() - getTotalHorizontalPadding()) + spacingPx;
            double d2 = spanCount;
            Double.isNaN(totalWidth);
            Double.isNaN(d2);
            double d3 = spacingPx;
            Double.isNaN(d3);
            return (int) ((totalWidth / d2) - d3);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalHorizontalPadding() {
        return getPaddingLeft() + getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalWidth() {
        return getWidth() > 0 ? getWidth() : getContext().getResources().getDisplayMetrics().widthPixels;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup
    protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params, int index, int count) {
        l.f(params, "params");
        RecyclerView.o layoutManager = getLayoutManager();
        if (getAdapter() != null && (layoutManager instanceof GridLayoutManager)) {
            LayoutAnimationController.AnimationParameters animationParameters = params.layoutAnimationParameters;
            GridLayoutAnimationController.AnimationParameters animationParameters2 = animationParameters instanceof GridLayoutAnimationController.AnimationParameters ? (GridLayoutAnimationController.AnimationParameters) animationParameters : null;
            if (animationParameters2 == null) {
                animationParameters2 = new GridLayoutAnimationController.AnimationParameters();
                params.layoutAnimationParameters = animationParameters2;
            }
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
            animationParameters2.count = count;
            animationParameters2.index = index;
            animationParameters2.columnsCount = spanCount;
            int i2 = count / spanCount;
            animationParameters2.rowsCount = i2;
            int i3 = (count - 1) - index;
            animationParameters2.column = (spanCount - 1) - (i3 % spanCount);
            animationParameters2.row = (i2 - 1) - (i3 / spanCount);
            return;
        }
        super.attachLayoutAnimationParameters(child, params, index, count);
    }

    public final boolean isEndReached(int thresholdRow) {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return gridLayoutManager.getItemCount() - (gridLayoutManager.getSpanCount() * thresholdRow) <= gridLayoutManager.findLastCompletelyVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(View child) {
        l.f(child, "child");
        if (((u) ExtensionsKt.safeLet(this.intendedItemSize, this.adaptStrategy, new GridRecyclerView$onChildAttachedToWindow$1(child, this))) == null) {
            super.onChildAttachedToWindow(child);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
        ExtensionsKt.safeLet(this.intendedItemSize, this.adaptStrategy, new GridRecyclerView$onMeasure$1(this));
    }

    public final void setAdaptiveLayout(int intendedItemWidth, int intendedItemHeight, AdaptStrategy strategy) {
        l.f(strategy, "strategy");
        this.intendedItemSize = new Size(dpToPx(intendedItemWidth), dpToPx(intendedItemHeight));
        this.adaptStrategy = strategy;
    }

    public final void setIntendedItemSpacing(int spacing) {
        removeItemDecoration(this.spacingItemDecorator);
        this.spacingItemDecorator.setSpacingPx(dpToPx(spacing));
        if (spacing > 0) {
            addItemDecoration(this.spacingItemDecorator);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.o oVar) {
        if (oVar instanceof GridLayoutManager) {
            super.setLayoutManager(oVar);
            return;
        }
        throw new ClassCastException("This GridRecyclerView should only be used with a CustomGridLayoutManager");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.spacingItemDecorator = new GridItemSpacingDecorator(0, 1, null);
    }
}
