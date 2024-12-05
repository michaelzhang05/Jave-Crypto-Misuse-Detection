package g5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class h extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f31274a;

    public h(Context context) {
        AbstractC3159y.i(context, "context");
        this.f31274a = context;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        if (viewHolder instanceof k5.f) {
            ((k5.f) viewHolder).b(item);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        if (parent.getContext() != null) {
            View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_home_card_featured_item, parent, false);
            AbstractC3159y.h(v8, "v");
            return new k5.f(v8, this.f31274a);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof k5.f) {
            ((k5.f) viewHolder).h();
        }
    }
}
