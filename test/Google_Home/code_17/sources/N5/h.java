package n5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f35536a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f35537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view) {
        super(view);
        AbstractC3255y.i(view, "view");
        View findViewById = view.findViewById(R.id.iv_icon);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.iv_icon)");
        this.f35536a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_name);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.tv_name)");
        TextView textView = (TextView) findViewById2;
        this.f35537b = textView;
        textView.setTypeface(H4.j.f3824g.u());
    }

    public final void a(h5.b tvManageAppsItem) {
        AbstractC3255y.i(tvManageAppsItem, "tvManageAppsItem");
        this.f35537b.setText(tvManageAppsItem.c());
        this.f35536a.setImageResource(tvManageAppsItem.a());
    }
}