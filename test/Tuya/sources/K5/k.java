package k5;

import X4.C1498h;
import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.Presenter;
import com.squareup.picasso.s;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class k extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f33557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View view) {
        super(view);
        AbstractC3159y.i(view, "view");
        View findViewById = view.findViewById(R.id.iv_feature_program_day);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.iv_feature_program_day)");
        this.f33557a = (ImageView) findViewById;
    }

    public final void a(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        s.h().l(appInfo.e0()).i(this.f33557a);
    }
}
