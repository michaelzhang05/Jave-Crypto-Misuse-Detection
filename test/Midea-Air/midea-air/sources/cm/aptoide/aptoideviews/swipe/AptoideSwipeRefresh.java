package cm.aptoide.aptoideviews.swipe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import c.r.a.c;
import cm.aptoide.aptoideviews.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: AptoideSwipeRefresh.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"Lcm/aptoide/aptoideviews/swipe/AptoideSwipeRefresh;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "retrievePreferences", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "setColors", "progressPrimaryColor", "progressSecondaryColor", "progressBackgroundColor", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AptoideSwipeRefresh extends c {
    public Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AptoideSwipeRefresh(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final void retrievePreferences(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.AptoideSwipeRefresh, defStyleAttr, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…Refresh, defStyleAttr, 0)");
        setColors(obtainStyledAttributes.getColor(R.styleable.AptoideSwipeRefresh_progressPrimaryColor, getResources().getColor(R.color.default_progress_bar_color)), obtainStyledAttributes.getColor(R.styleable.AptoideSwipeRefresh_progressSecondaryColor, -1), obtainStyledAttributes.getColor(R.styleable.AptoideSwipeRefresh_progressBackgroundColor, -1));
        obtainStyledAttributes.recycle();
    }

    private final void setColors(int progressPrimaryColor, int progressSecondaryColor, int progressBackgroundColor) {
        if (progressSecondaryColor != -1) {
            setColorSchemeColors(progressPrimaryColor, progressSecondaryColor, progressPrimaryColor, progressSecondaryColor);
        } else {
            setColorSchemeColors(progressPrimaryColor);
        }
        setProgressBackgroundColorSchemeColor(progressBackgroundColor);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AptoideSwipeRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        retrievePreferences(attributeSet, 0);
    }
}
