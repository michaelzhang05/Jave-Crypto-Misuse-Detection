package j5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class l extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34004a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34005b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(l this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.h(view, "view");
        this$0.c(view, z8);
    }

    private final void c(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f34004a;
        } else {
            i8 = this.f34005b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(object, "object");
        ((n5.h) viewHolder).a((h5.b) object);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_manage_apps_item, parent, false);
        this.f34005b = ContextCompat.getColor(parent.getContext(), R.color.main_blue);
        this.f34004a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        v8.setFocusable(true);
        v8.setFocusableInTouchMode(true);
        v8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: j5.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                l.b(l.this, view, z8);
            }
        });
        AbstractC3255y.h(v8, "v");
        c(v8, false);
        return new n5.h(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
    }
}
