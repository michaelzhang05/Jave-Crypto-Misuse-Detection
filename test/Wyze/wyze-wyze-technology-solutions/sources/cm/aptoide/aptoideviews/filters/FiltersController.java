package cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.TypedEpoxyController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: FiltersController.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u001a"}, d2 = {"Lcm/aptoide/aptoideviews/filters/FiltersController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/filters/Filter;", "eventListener", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "(Lcm/aptoide/aptoideviews/filters/FilterEventListener;)V", "backgroundRes", HttpUrl.FRAGMENT_ENCODE_SET, "getBackgroundRes", "()Ljava/lang/Integer;", "setBackgroundRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEventListener", "()Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "selectionList", "textColor", "getTextColor", "setTextColor", "buildModels", HttpUrl.FRAGMENT_ENCODE_SET, "list", "sortList", "updateSelectionList", "newList", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FiltersController extends TypedEpoxyController<List<? extends Filter>> {
    private Integer backgroundRes;
    private final FilterEventListener eventListener;
    private List<Filter> selectionList;
    private Integer textColor;

    public FiltersController(FilterEventListener filterEventListener) {
        l.f(filterEventListener, "eventListener");
        this.eventListener = filterEventListener;
    }

    private final List<Filter> sortList(List<Filter> list) {
        updateSelectionList(list);
        Collection collection = this.selectionList;
        if (collection == null) {
            collection = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.addAll(list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Integer.valueOf(((Filter) obj).getId()))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final void updateSelectionList(List<Filter> newList) {
        Object obj;
        Collection collection = this.selectionList;
        if (collection == null) {
            collection = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Filter filter = (Filter) obj2;
            Iterator<T> it = newList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (filter.getId() == ((Filter) obj).getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Filter filter2 = (Filter) obj;
            if (filter2 != null && filter2.getSelected()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : newList) {
            if (((Filter) obj3).getSelected()) {
                arrayList3.add(obj3);
            }
        }
        arrayList2.addAll(arrayList3);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (hashSet.add(Integer.valueOf(((Filter) obj4).getId()))) {
                arrayList4.add(obj4);
            }
        }
        this.selectionList = arrayList4;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Filter> list) {
        buildModels2((List<Filter>) list);
    }

    public final Integer getBackgroundRes() {
        return this.backgroundRes;
    }

    public final FilterEventListener getEventListener() {
        return this.eventListener;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final void setBackgroundRes(Integer num) {
        this.backgroundRes = num;
    }

    public final void setTextColor(Integer num) {
        this.textColor = num;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    protected void buildModels2(List<Filter> list) {
        Object obj;
        l.f(list, "list");
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Filter) obj).getSelected()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            new ClearFiltersModel_().id((CharSequence) "clear_filter").textColorStateList(this.textColor).eventListener(this.eventListener).addTo(this);
        }
        for (Filter filter : sortList(list)) {
            new FilterModel_().id(Integer.valueOf(filter.getId())).filter(filter).textColorStateList(this.textColor).backgroundRes(this.backgroundRes).eventListener(this.eventListener).addTo(this);
        }
    }
}
