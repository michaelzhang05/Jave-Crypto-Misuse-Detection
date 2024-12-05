package j5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class n extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34012a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34013b = -1;

    private final void a(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f34012a;
        } else {
            i8 = this.f34013b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(item, "item");
        ((n5.i) viewHolder).a((File) item, viewHolder.view.getContext());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_download_item, parent, false);
        this.f34013b = ContextCompat.getColor(parent.getContext(), R.color.tv_default_background);
        this.f34012a = ContextCompat.getColor(parent.getContext(), R.color.tv_selected_background);
        v8.setFocusable(true);
        v8.setFocusableInTouchMode(true);
        AbstractC3255y.h(v8, "v");
        a(v8, false);
        return new n5.i(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
    }
}
