package n5;

import H4.j;
import Q4.q;
import a5.C1639f;
import a5.C1641h;
import a5.C1644k;
import a5.O;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import o5.C3674n;
import s5.C4003g;

/* loaded from: classes5.dex */
public final class f extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f35525a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f35526b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f35527c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f35528d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f35529e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f35530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, Context context) {
        super(view);
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(context, "context");
        this.f35525a = context;
        View findViewById = view.findViewById(R.id.iv_home_card_featured_item);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.iv_home_card_featured_item)");
        this.f35526b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.iv_logo_home_card_featured_item);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.i…_home_card_featured_item)");
        this.f35527c = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_name_home_card_featured_item);
        AbstractC3255y.h(findViewById3, "view.findViewById(R.id.t…_home_card_featured_item)");
        this.f35528d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_desc_home_card_featured_item);
        AbstractC3255y.h(findViewById4, "view.findViewById(R.id.t…_home_card_featured_item)");
        this.f35529e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_status_home_card_featured_item);
        AbstractC3255y.h(findViewById5, "view.findViewById(R.id.t…_home_card_featured_item)");
        this.f35530f = (TextView) findViewById5;
        TextView textView = this.f35528d;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        this.f35529e.setTypeface(aVar.u());
        this.f35530f.setTypeface(aVar.u());
    }

    private final boolean a(C1639f c1639f) {
        PackageManager packageManager = this.f35525a.getPackageManager();
        AbstractC3255y.h(packageManager, "context.packageManager");
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        ApplicationInfo a8 = q.a(packageManager, J8, 0);
        if (c1639f.i() != 0 || !a8.enabled) {
            return false;
        }
        return true;
    }

    private final void c(O o8, TextView textView, TextView textView2, boolean z8) {
        if (o8 != null && o8.h() == 0) {
            textView.setText(this.f35525a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f35525a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f35525a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f35525a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f35525a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f35525a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void d(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3667g().r(str, this.f35525a)) {
            C3674n a8 = C3674n.f36505t.a(this.f35525a);
            a8.a();
            AbstractC3255y.f(str);
            O u02 = a8.u0(str);
            C1639f S8 = a8.S(str);
            a8.l();
            if (S8 != null) {
                if (S8.l0() && SettingsPreferences.f30353b.h0(this.f35525a) && a(S8)) {
                    c(u02, textView, textView2, z8);
                    return;
                }
                if (a(S8) && !S8.l0()) {
                    c(u02, textView, textView2, z8);
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

    static /* synthetic */ void e(f fVar, String str, TextView textView, TextView textView2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        fVar.d(str, textView, textView2, z8);
    }

    private final void f(ImageView imageView, String str) {
        if (str != null) {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C4003g((int) this.f35525a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).i(imageView);
        } else {
            imageView.setImageDrawable(ContextCompat.getDrawable(this.f35525a, R.drawable.vector_app_icon_placeholder));
        }
    }

    private final void g(String str, String str2, TextView textView, TextView textView2) {
        textView.setText(str);
        textView2.setText(str2);
    }

    public final void b(Object item) {
        AbstractC3255y.i(item, "item");
        if (item instanceof C1641h) {
            C1641h c1641h = (C1641h) item;
            String e02 = c1641h.e0();
            if (e02 != null && e02.length() != 0) {
                s.h().l(c1641h.i0()).n(new C4003g((int) this.f35525a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f35526b);
            } else {
                this.f35526b.setImageDrawable(ContextCompat.getDrawable(this.f35525a, R.drawable.shape_bg_placeholder));
            }
            g(c1641h.s0(), c1641h.T0(), this.f35528d, this.f35529e);
            e(this, c1641h.y0(), this.f35530f, this.f35529e, false, 8, null);
            f(this.f35527c, c1641h.m0());
            return;
        }
        if (item instanceof h5.c) {
            C1644k a8 = ((h5.c) item).a();
            AbstractC3255y.f(a8);
            g(a8.h(), null, this.f35528d, this.f35529e);
            this.f35530f.setVisibility(8);
            int color = ContextCompat.getColor(this.f35525a, R.color.main_blue);
            Drawable drawable = ContextCompat.getDrawable(this.f35525a, R.drawable.vector_plus);
            if (drawable != null) {
                drawable.setTint(color);
            }
            this.f35526b.setImageDrawable(drawable);
            this.f35527c.setImageDrawable(null);
            return;
        }
        throw new Exception("item unknown!");
    }

    public final void h() {
        this.f35526b.setImageDrawable(null);
        this.f35527c.setImageDrawable(null);
        this.f35528d.setText((CharSequence) null);
        this.f35529e.setText((CharSequence) null);
        this.f35530f.setText((CharSequence) null);
    }
}
