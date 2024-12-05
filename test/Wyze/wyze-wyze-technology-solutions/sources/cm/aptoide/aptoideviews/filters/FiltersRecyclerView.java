package cm.aptoide.aptoideviews.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: FiltersRecyclerView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcm/aptoide/aptoideviews/filters/FiltersRecyclerView;", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "createLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FiltersRecyclerView extends EpoxyRecyclerView {
    public Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        l.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
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

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    protected RecyclerView.o createLayoutManager() {
        return new LinearLayoutManager(getContext(), 0, false);
    }

    public /* synthetic */ FiltersRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3, g gVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
