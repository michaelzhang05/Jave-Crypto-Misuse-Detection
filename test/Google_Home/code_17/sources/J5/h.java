package j5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f34001a;

    public h(Context context) {
        AbstractC3255y.i(context, "context");
        this.f34001a = context;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(item, "item");
        if (viewHolder instanceof n5.f) {
            ((n5.f) viewHolder).b(item);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        if (parent.getContext() != null) {
            View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_home_card_featured_item, parent, false);
            AbstractC3255y.h(v8, "v");
            return new n5.f(v8, this.f34001a);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof n5.f) {
            ((n5.f) viewHolder).h();
        }
    }
}
