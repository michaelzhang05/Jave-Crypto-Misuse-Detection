package k5;

import E4.j;
import N4.q;
import X4.C1496f;
import X4.C1498h;
import X4.C1501k;
import X4.O;
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
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import l5.C3326n;
import p5.C3609g;

/* loaded from: classes5.dex */
public final class f extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f33533a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f33534b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f33535c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f33536d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f33537e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f33538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, Context context) {
        super(view);
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(context, "context");
        this.f33533a = context;
        View findViewById = view.findViewById(R.id.iv_home_card_featured_item);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.iv_home_card_featured_item)");
        this.f33534b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.iv_logo_home_card_featured_item);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.i…_home_card_featured_item)");
        this.f33535c = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_name_home_card_featured_item);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.t…_home_card_featured_item)");
        this.f33536d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_desc_home_card_featured_item);
        AbstractC3159y.h(findViewById4, "view.findViewById(R.id.t…_home_card_featured_item)");
        this.f33537e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_status_home_card_featured_item);
        AbstractC3159y.h(findViewById5, "view.findViewById(R.id.t…_home_card_featured_item)");
        this.f33538f = (TextView) findViewById5;
        TextView textView = this.f33536d;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        this.f33537e.setTypeface(aVar.u());
        this.f33538f.setTypeface(aVar.u());
    }

    private final boolean a(C1496f c1496f) {
        PackageManager packageManager = this.f33533a.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        ApplicationInfo a8 = q.a(packageManager, Q8, 0);
        if (c1496f.i() != 0 || !a8.enabled) {
            return false;
        }
        return true;
    }

    private final void c(O o8, TextView textView, TextView textView2, boolean z8) {
        if (o8 != null && o8.f() == 0) {
            textView.setText(this.f33533a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f33533a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f33533a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f33533a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f33533a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f33533a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void d(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3319g().r(str, this.f33533a)) {
            C3326n a8 = C3326n.f34504t.a(this.f33533a);
            a8.a();
            AbstractC3159y.f(str);
            O u02 = a8.u0(str);
            C1496f S7 = a8.S(str);
            a8.g();
            if (S7 != null) {
                if (S7.l0() && SettingsPreferences.f29323b.h0(this.f33533a) && a(S7)) {
                    c(u02, textView, textView2, z8);
                    return;
                }
                if (a(S7) && !S7.l0()) {
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
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C3609g((int) this.f33533a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).i(imageView);
        } else {
            imageView.setImageDrawable(ContextCompat.getDrawable(this.f33533a, R.drawable.vector_app_icon_placeholder));
        }
    }

    private final void g(String str, String str2, TextView textView, TextView textView2) {
        textView.setText(str);
        textView2.setText(str2);
    }

    public final void b(Object item) {
        AbstractC3159y.i(item, "item");
        if (item instanceof C1498h) {
            C1498h c1498h = (C1498h) item;
            String e02 = c1498h.e0();
            if (e02 != null && e02.length() != 0) {
                s.h().l(c1498h.i0()).n(new C3609g((int) this.f33533a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f33534b);
            } else {
                this.f33534b.setImageDrawable(ContextCompat.getDrawable(this.f33533a, R.drawable.shape_bg_placeholder));
            }
            g(c1498h.s0(), c1498h.T0(), this.f33536d, this.f33537e);
            e(this, c1498h.y0(), this.f33538f, this.f33537e, false, 8, null);
            f(this.f33535c, c1498h.m0());
            return;
        }
        if (item instanceof e5.c) {
            C1501k a8 = ((e5.c) item).a();
            AbstractC3159y.f(a8);
            g(a8.f(), null, this.f33536d, this.f33537e);
            this.f33538f.setVisibility(8);
            int color = ContextCompat.getColor(this.f33533a, R.color.main_blue);
            Drawable drawable = ContextCompat.getDrawable(this.f33533a, R.drawable.vector_plus);
            if (drawable != null) {
                drawable.setTint(color);
            }
            this.f33534b.setImageDrawable(drawable);
            this.f33535c.setImageDrawable(null);
            return;
        }
        throw new Exception("item unknown!");
    }

    public final void h() {
        this.f33534b.setImageDrawable(null);
        this.f33535c.setImageDrawable(null);
        this.f33536d.setText((CharSequence) null);
        this.f33537e.setText((CharSequence) null);
        this.f33538f.setText((CharSequence) null);
    }
}
