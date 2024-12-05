package n5;

import a5.C1641h;
import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.Presenter;
import com.squareup.picasso.s;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class k extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f35549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View view) {
        super(view);
        AbstractC3255y.i(view, "view");
        View findViewById = view.findViewById(R.id.iv_feature_program_day);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.iv_feature_program_day)");
        this.f35549a = (ImageView) findViewById;
    }

    public final void a(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        s.h().l(appInfo.e0()).i(this.f35549a);
    }
}
