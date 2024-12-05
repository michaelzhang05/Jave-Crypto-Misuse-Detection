package g5;

import X4.C1496f;
import X4.z;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class o extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private String f31287a;

    /* renamed from: b, reason: collision with root package name */
    private C1496f f31288b;

    public o(String str) {
        this.f31287a = str;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(object, "object");
        k5.j jVar = (k5.j) viewHolder;
        Context context = viewHolder.view.getContext();
        AbstractC3159y.h(context, "viewHolder.view.context");
        jVar.a((z) object, context, this.f31287a, this.f31288b);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_old_version_item, parent, false);
        v8.setFocusable(true);
        v8.setFocusableInTouchMode(true);
        v8.setBackgroundColor(ContextCompat.getColor(parent.getContext(), R.color.white));
        AbstractC3159y.h(v8, "v");
        return new k5.j(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
    }

    public o(C1496f appInstalled) {
        AbstractC3159y.i(appInstalled, "appInstalled");
        this.f31287a = appInstalled.Q();
        this.f31288b = appInstalled;
    }
}
