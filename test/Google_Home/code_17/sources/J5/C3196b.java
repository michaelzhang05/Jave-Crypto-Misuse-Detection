package j5;

import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;
import n5.C3486e;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3196b extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private C3486e f33988a;

    public final void a(Context context, C1641h c1641h) {
        C3486e c3486e = this.f33988a;
        if (c3486e != null) {
            AbstractC3255y.f(c3486e);
            c3486e.f(context, c1641h);
        }
    }

    public final void b(Context context, C1641h c1641h) {
        AbstractC3255y.i(context, "context");
        C3486e c3486e = this.f33988a;
        if (c3486e != null) {
            AbstractC3255y.f(c3486e);
            c3486e.i(context, c1641h);
        }
    }

    public final void c(int i8) {
        C3486e c3486e = this.f33988a;
        if (c3486e != null) {
            AbstractC3255y.f(c3486e);
            c3486e.m(i8);
        }
    }

    public final void d(boolean z8) {
        C3486e c3486e = this.f33988a;
        if (c3486e != null) {
            AbstractC3255y.f(c3486e);
            c3486e.n(z8);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(item, "item");
        C3486e c3486e = (C3486e) viewHolder;
        this.f33988a = c3486e;
        AbstractC3255y.f(c3486e);
        Context context = viewHolder.view.getContext();
        AbstractC3255y.h(context, "viewHolder.view.context");
        c3486e.e(context, (C1641h) item, 0);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_app_detail, parent, false);
        AbstractC3255y.h(v8, "v");
        return new C3486e(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
    }
}
