package j5;

import a5.C1639f;
import a5.z;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class o extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private String f34014a;

    /* renamed from: b, reason: collision with root package name */
    private C1639f f34015b;

    public o(String str) {
        this.f34014a = str;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(object, "object");
        n5.j jVar = (n5.j) viewHolder;
        Context context = viewHolder.view.getContext();
        AbstractC3255y.h(context, "viewHolder.view.context");
        jVar.a((z) object, context, this.f34014a, this.f34015b);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        View v8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_old_version_item, parent, false);
        v8.setFocusable(true);
        v8.setFocusableInTouchMode(true);
        v8.setBackgroundColor(ContextCompat.getColor(parent.getContext(), R.color.white));
        AbstractC3255y.h(v8, "v");
        return new n5.j(v8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
    }

    public o(C1639f appInstalled) {
        AbstractC3255y.i(appInstalled, "appInstalled");
        this.f34014a = appInstalled.J();
        this.f34015b = appInstalled;
    }
}
