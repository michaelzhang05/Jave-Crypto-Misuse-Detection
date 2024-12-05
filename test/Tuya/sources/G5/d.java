package g5;

import X4.C1496f;
import X4.C1498h;
import X4.O;
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
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3319g;
import l5.C3326n;
import p5.C3609g;

/* loaded from: classes5.dex */
public final class d extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f31262a;

    /* renamed from: b, reason: collision with root package name */
    private CropImageViewTv f31263b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f31264c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f31265d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f31266e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f31267f;

    public d(Context context) {
        AbstractC3159y.i(context, "context");
        this.f31262a = context;
    }

    private final boolean a(C1496f c1496f) {
        PackageManager packageManager = this.f31262a.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        ApplicationInfo a8 = N4.q.a(packageManager, Q8, 0);
        if (c1496f.i() != 0 || !a8.enabled) {
            return false;
        }
        return true;
    }

    private final void b(O o8, TextView textView, TextView textView2, boolean z8) {
        if (o8 != null && o8.f() == 0) {
            textView.setText(this.f31262a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f31262a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f31262a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f31262a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f31262a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f31262a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void c(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3319g().r(str, this.f31262a)) {
            C3326n a8 = C3326n.f34504t.a(this.f31262a);
            a8.a();
            AbstractC3159y.f(str);
            O u02 = a8.u0(str);
            C1496f S7 = a8.S(str);
            a8.g();
            if (S7 != null) {
                if (S7.l0() && SettingsPreferences.f29323b.h0(this.f31262a) && a(S7)) {
                    b(u02, textView, textView2, z8);
                    return;
                }
                if (a(S7) && !S7.l0()) {
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
        if (new C3319g().r(str2, this.f31262a)) {
            imageView.setImageDrawable(C3307A.f34473a.j(this.f31262a, str2));
        } else {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C3609g((int) this.f31262a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).i(imageView);
        }
    }

    private final void e(String str, String str2, TextView textView, TextView textView2) {
        textView.setText(str);
        textView2.setText(str2);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        C1498h c1498h = (C1498h) item;
        s.h().l(c1498h.e0()).l(R.color.main_blue).i(this.f31263b);
        String s02 = c1498h.s0();
        String T02 = c1498h.T0();
        TextView textView = this.f31265d;
        AbstractC3159y.f(textView);
        TextView textView2 = this.f31266e;
        AbstractC3159y.f(textView2);
        e(s02, T02, textView, textView2);
        String y02 = c1498h.y0();
        TextView textView3 = this.f31267f;
        AbstractC3159y.f(textView3);
        TextView textView4 = this.f31266e;
        AbstractC3159y.f(textView4);
        c(y02, textView3, textView4, false);
        ImageView imageView = this.f31264c;
        AbstractC3159y.f(imageView);
        d(imageView, c1498h.l0(), c1498h.y0());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        if (parent.getContext() != null) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_card_featured, parent, false);
            this.f31263b = (CropImageViewTv) inflate.findViewById(R.id.iv_featured);
            this.f31264c = (ImageView) inflate.findViewById(R.id.iv_logo_card);
            this.f31265d = (TextView) inflate.findViewById(R.id.tv_titulo_card);
            this.f31266e = (TextView) inflate.findViewById(R.id.tv_resumen_card);
            this.f31267f = (TextView) inflate.findViewById(R.id.tv_status_card);
            TextView textView = this.f31265d;
            if (textView != null) {
                textView.setTypeface(E4.j.f2274g.t());
            }
            TextView textView2 = this.f31266e;
            if (textView2 != null) {
                textView2.setTypeface(E4.j.f2274g.u());
            }
            TextView textView3 = this.f31267f;
            if (textView3 != null) {
                textView3.setTypeface(E4.j.f2274g.u());
            }
            return new Presenter.ViewHolder(inflate);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
    }
}
