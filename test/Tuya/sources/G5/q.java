package g5;

import X4.C1498h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class q extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f31290a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f31291b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(q this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.h(view, "view");
        this$0.c(view, z8);
    }

    private final void c(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f31290a;
        } else {
            i8 = this.f31291b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(object, "object");
        ((k5.k) viewHolder).a((C1498h) object);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_program_day, parent, false);
        this.f31291b = ContextCompat.getColor(parent.getContext(), R.color.main_blue);
        this.f31290a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        v8.setFocusable(true);
        v8.setFocusableInTouchMode(true);
        v8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: g5.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                q.b(q.this, view, z8);
            }
        });
        AbstractC3159y.h(v8, "v");
        c(v8, false);
        return new k5.k(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
    }
}
