package j5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f34000a;

    public f(Context context) {
        AbstractC3255y.i(context, "context");
        this.f34000a = context;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(item, "item");
        if (viewHolder instanceof n5.g) {
            ((n5.g) viewHolder).b(item);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_card_small_item, parent, false);
        AbstractC3255y.h(v8, "v");
        return new n5.g(v8, this.f34000a);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof n5.g) {
            ((n5.g) viewHolder).h();
        }
    }
}
