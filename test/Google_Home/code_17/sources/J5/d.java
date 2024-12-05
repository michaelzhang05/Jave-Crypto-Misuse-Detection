package j5;

import a5.C1639f;
import a5.C1641h;
import a5.O;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.utils.CropImageViewTv;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3667g;
import o5.C3674n;
import s5.C4003g;

/* loaded from: classes5.dex */
public final class d extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f33989a;

    /* renamed from: b, reason: collision with root package name */
    private CropImageViewTv f33990b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f33991c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f33992d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f33993e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f33994f;

    public d(Context context) {
        AbstractC3255y.i(context, "context");
        this.f33989a = context;
    }

    private final boolean a(C1639f c1639f) {
        PackageManager packageManager = this.f33989a.getPackageManager();
        AbstractC3255y.h(packageManager, "context.packageManager");
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        ApplicationInfo a8 = Q4.q.a(packageManager, J8, 0);
        if (c1639f.i() != 0 || !a8.enabled) {
            return false;
        }
        return true;
    }

    private final void b(O o8, TextView textView, TextView textView2, boolean z8) {
        if (o8 != null && o8.h() == 0) {
            textView.setText(this.f33989a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f33989a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f33989a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f33989a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f33989a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f33989a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void c(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3667g().r(str, this.f33989a)) {
            C3674n a8 = C3674n.f36505t.a(this.f33989a);
            a8.a();
            AbstractC3255y.f(str);
            O u02 = a8.u0(str);
            C1639f S8 = a8.S(str);
            a8.l();
            if (S8 != null) {
                if (S8.l0() && SettingsPreferences.f30353b.h0(this.f33989a) && a(S8)) {
                    b(u02, textView, textView2, z8);
                    return;
                }
                if (a(S8) && !S8.l0()) {
                    b(u02, textView, textView2, z8);
                    return;
                }
                textView.setVisibility(8);
                if (z8) {
                    textView2.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (z8) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(4);
        }
        textView2.setVisibility(0);
    }

    private final void d(ImageView imageView, String str, String str2) {
        if (new C3667g().r(str2, this.f33989a)) {
            imageView.setImageDrawable(C3655A.f36474a.j(this.f33989a, str2));
        } else {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C4003g((int) this.f33989a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).i(imageView);
        }
    }

    private final void e(String str, String str2, TextView textView, TextView textView2) {
        textView.setText(str);
        textView2.setText(str2);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(item, "item");
        C1641h c1641h = (C1641h) item;
        s.h().l(c1641h.e0()).l(R.color.main_blue).i(this.f33990b);
        String s02 = c1641h.s0();
        String T02 = c1641h.T0();
        TextView textView = this.f33992d;
        AbstractC3255y.f(textView);
        TextView textView2 = this.f33993e;
        AbstractC3255y.f(textView2);
        e(s02, T02, textView, textView2);
        String y02 = c1641h.y0();
        TextView textView3 = this.f33994f;
        AbstractC3255y.f(textView3);
        TextView textView4 = this.f33993e;
        AbstractC3255y.f(textView4);
        c(y02, textView3, textView4, false);
        ImageView imageView = this.f33991c;
        AbstractC3255y.f(imageView);
        d(imageView, c1641h.l0(), c1641h.y0());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        if (parent.getContext() != null) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_card_featured, parent, false);
            this.f33990b = (CropImageViewTv) inflate.findViewById(R.id.iv_featured);
            this.f33991c = (ImageView) inflate.findViewById(R.id.iv_logo_card);
            this.f33992d = (TextView) inflate.findViewById(R.id.tv_titulo_card);
            this.f33993e = (TextView) inflate.findViewById(R.id.tv_resumen_card);
            this.f33994f = (TextView) inflate.findViewById(R.id.tv_status_card);
            TextView textView = this.f33992d;
            if (textView != null) {
                textView.setTypeface(H4.j.f3824g.t());
            }
            TextView textView2 = this.f33993e;
            if (textView2 != null) {
                textView2.setTypeface(H4.j.f3824g.u());
            }
            TextView textView3 = this.f33994f;
            if (textView3 != null) {
                textView3.setTypeface(H4.j.f3824g.u());
            }
            return new Presenter.ViewHolder(inflate);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
    }
}
