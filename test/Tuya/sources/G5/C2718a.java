package g5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2718a extends Presenter {
    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        View view = viewHolder.view;
        AbstractC3159y.g(view, "null cannot be cast to non-null type android.widget.Button");
        ((Button) view).setText(((Action) item).getLabel1());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        return new Presenter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_custom_action, parent, false));
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
    }
}
