package g5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class n extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f31285a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f31286b = -1;

    private final void a(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f31285a;
        } else {
            i8 = this.f31286b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        ((k5.i) viewHolder).a((File) item, viewHolder.view.getContext());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_download_item, parent, false);
        this.f31286b = ContextCompat.getColor(parent.getContext(), R.color.tv_default_background);
        this.f31285a = ContextCompat.getColor(parent.getContext(), R.color.tv_selected_background);
        v8.setFocusable(true);
        v8.setFocusableInTouchMode(true);
        AbstractC3159y.h(v8, "v");
        a(v8, false);
        return new k5.i(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
    }
}
