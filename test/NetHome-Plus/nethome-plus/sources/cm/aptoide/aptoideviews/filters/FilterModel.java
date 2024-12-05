package cm.aptoide.aptoideviews.filters;

import android.view.View;
import android.widget.CheckedTextView;
import cm.aptoide.aptoideviews.R;
import cm.aptoide.aptoideviews.filters.FilterEventListener;
import com.airbnb.epoxy.t;
import e.c.a.a.a.base.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: FilterModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001f"}, d2 = {"Lcm/aptoide/aptoideviews/filters/FilterModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/aptoideviews/filters/FilterModel$CardHolder;", "()V", "backgroundRes", HttpUrl.FRAGMENT_ENCODE_SET, "getBackgroundRes", "()Ljava/lang/Integer;", "setBackgroundRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "eventListener", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "getEventListener", "()Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "setEventListener", "(Lcm/aptoide/aptoideviews/filters/FilterEventListener;)V", "filter", "Lcm/aptoide/aptoideviews/filters/Filter;", "getFilter", "()Lcm/aptoide/aptoideviews/filters/Filter;", "setFilter", "(Lcm/aptoide/aptoideviews/filters/Filter;)V", "textColorStateList", "getTextColorStateList", "setTextColorStateList", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "getDefaultLayout", "CardHolder", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FilterModel extends t<CardHolder> {
    private Integer backgroundRes;
    private FilterEventListener eventListener;
    private Filter filter;
    private Integer textColorStateList;

    /* compiled from: FilterModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcm/aptoide/aptoideviews/filters/FilterModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "button", "Landroid/widget/CheckedTextView;", "getButton", "()Landroid/widget/CheckedTextView;", "button$delegate", "Lkotlin/properties/ReadOnlyProperty;", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CardHolder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {b0.g(new v(CardHolder.class, "button", "getButton()Landroid/widget/CheckedTextView;", 0))};
        private final ReadOnlyProperty button$delegate = bind(R.id.filter_button);

        public final CheckedTextView getButton() {
            return (CheckedTextView) this.button$delegate.a(this, $$delegatedProperties[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bind$lambda-3$lambda-0, reason: not valid java name */
    public static final void m5bind$lambda3$lambda0(FilterModel filterModel, Filter filter, View view) {
        l.f(filterModel, "this$0");
        l.f(filter, "$f");
        FilterEventListener filterEventListener = filterModel.eventListener;
        if (filterEventListener != null) {
            filterEventListener.onFilterEvent(FilterEventListener.EventType.FILTER_CLICK, filter);
        }
    }

    public final Integer getBackgroundRes() {
        return this.backgroundRes;
    }

    @Override // com.airbnb.epoxy.s
    protected int getDefaultLayout() {
        return R.layout.filter_item;
    }

    public final FilterEventListener getEventListener() {
        return this.eventListener;
    }

    public final Filter getFilter() {
        return this.filter;
    }

    public final Integer getTextColorStateList() {
        return this.textColorStateList;
    }

    public final void setBackgroundRes(Integer num) {
        this.backgroundRes = num;
    }

    public final void setEventListener(FilterEventListener filterEventListener) {
        this.eventListener = filterEventListener;
    }

    public final void setFilter(Filter filter) {
        this.filter = filter;
    }

    public final void setTextColorStateList(Integer num) {
        this.textColorStateList = num;
    }

    @Override // com.airbnb.epoxy.t, com.airbnb.epoxy.s
    public void bind(CardHolder holder) {
        l.f(holder, "holder");
        super.bind((FilterModel) holder);
        final Filter filter = this.filter;
        if (filter != null) {
            holder.getButton().setText(filter.getName());
            holder.getButton().setChecked(filter.getSelected());
            holder.getButton().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.filters.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilterModel.m5bind$lambda3$lambda0(FilterModel.this, filter, view);
                }
            });
            Integer num = this.textColorStateList;
            if (num != null) {
                holder.getButton().setTextColor(androidx.core.content.a.d(holder.getItemView().getContext(), num.intValue()));
            }
            Integer num2 = this.backgroundRes;
            if (num2 != null) {
                holder.getButton().setBackgroundResource(num2.intValue());
            }
        }
    }
}
