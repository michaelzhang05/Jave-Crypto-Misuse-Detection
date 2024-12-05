package g5;

import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import k5.C3131e;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2719b extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private C3131e f31261a;

    public final void a(Context context, C1498h c1498h) {
        C3131e c3131e = this.f31261a;
        if (c3131e != null) {
            AbstractC3159y.f(c3131e);
            c3131e.f(context, c1498h);
        }
    }

    public final void b(Context context, C1498h c1498h) {
        AbstractC3159y.i(context, "context");
        C3131e c3131e = this.f31261a;
        if (c3131e != null) {
            AbstractC3159y.f(c3131e);
            c3131e.i(context, c1498h);
        }
    }

    public final void c(int i8) {
        C3131e c3131e = this.f31261a;
        if (c3131e != null) {
            AbstractC3159y.f(c3131e);
            c3131e.m(i8);
        }
    }

    public final void d(boolean z8) {
        C3131e c3131e = this.f31261a;
        if (c3131e != null) {
            AbstractC3159y.f(c3131e);
            c3131e.n(z8);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        C3131e c3131e = (C3131e) viewHolder;
        this.f31261a = c3131e;
        AbstractC3159y.f(c3131e);
        Context context = viewHolder.view.getContext();
        AbstractC3159y.h(context, "viewHolder.view.context");
        c3131e.e(context, (C1498h) item, 0);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_app_detail, parent, false);
        AbstractC3159y.h(v8, "v");
        return new C3131e(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
    }
}
