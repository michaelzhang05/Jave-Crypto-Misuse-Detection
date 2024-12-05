package n5;

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
import o5.C3655A;
import o5.C3667g;
import o5.C3674n;
import s5.C4003g;

/* loaded from: classes5.dex */
public final class g extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f35531a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f35532b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f35533c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f35534d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f35535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, Context context) {
        super(view);
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(context, "context");
        this.f35531a = context;
        this.f35532b = (ImageView) view.findViewById(R.id.iv_logo_home_card_item);
        this.f35533c = (TextView) view.findViewById(R.id.tv_name_home_card_item);
        this.f35534d = (TextView) view.findViewById(R.id.tv_desc_home_card_item);
        this.f35535e = (TextView) view.findViewById(R.id.tv_status_home_card_item);
        TextView textView = this.f35533c;
        if (textView != null) {
            textView.setTypeface(H4.j.f3824g.t());
        }
        TextView textView2 = this.f35534d;
        if (textView2 != null) {
            textView2.setTypeface(H4.j.f3824g.u());
        }
        TextView textView3 = this.f35535e;
        if (textView3 != null) {
            textView3.setTypeface(H4.j.f3824g.u());
        }
    }

    private final boolean a(C1639f c1639f) {
        PackageManager packageManager = this.f35531a.getPackageManager();
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
            textView.setText(this.f35531a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f35531a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f35531a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f35531a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f35531a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f35531a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void d(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3667g().r(str, this.f35531a)) {
            C3674n a8 = C3674n.f36505t.a(this.f35531a);
            a8.a();
            AbstractC3255y.f(str);
            O u02 = a8.u0(str);
            C1639f S8 = a8.S(str);
            a8.l();
            if (S8 != null) {
                if (S8.l0() && SettingsPreferences.f30353b.h0(this.f35531a) && a(S8)) {
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

    static /* synthetic */ void e(g gVar, String str, TextView textView, TextView textView2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        gVar.d(str, textView, textView2, z8);
    }

    private final void f(ImageView imageView, String str, String str2) {
        if (new C3667g().r(str2, this.f35531a)) {
            imageView.setImageDrawable(C3655A.f36474a.j(this.f35531a, str2));
        } else {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C4003g((int) this.f35531a.getResources().getDimension(R.dimen.border_radius_s), null, 2, null)).i(imageView);
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
            String s02 = c1641h.s0();
            String T02 = c1641h.T0();
            TextView textView = this.f35533c;
            AbstractC3255y.f(textView);
            TextView textView2 = this.f35534d;
            AbstractC3255y.f(textView2);
            g(s02, T02, textView, textView2);
            String y02 = c1641h.y0();
            TextView textView3 = this.f35535e;
            AbstractC3255y.f(textView3);
            TextView textView4 = this.f35534d;
            AbstractC3255y.f(textView4);
            e(this, y02, textView3, textView4, false, 8, null);
            ImageView imageView = this.f35532b;
            AbstractC3255y.f(imageView);
            f(imageView, c1641h.l0(), c1641h.y0());
            return;
        }
        if (item instanceof h5.c) {
            C1644k a8 = ((h5.c) item).a();
            AbstractC3255y.f(a8);
            String h8 = a8.h();
            TextView textView5 = this.f35533c;
            AbstractC3255y.f(textView5);
            TextView textView6 = this.f35534d;
            AbstractC3255y.f(textView6);
            g(h8, null, textView5, textView6);
            TextView textView7 = this.f35535e;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            int color = ContextCompat.getColor(this.f35531a, R.color.main_blue);
            Drawable drawable = ContextCompat.getDrawable(this.f35531a, R.drawable.vector_plus);
            if (drawable != null) {
                drawable.setTint(color);
            }
            ImageView imageView2 = this.f35532b;
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable);
                return;
            }
            return;
        }
        throw new Exception("item unknown!");
    }

    public final void h() {
        ImageView imageView = this.f35532b;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = this.f35533c;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.f35534d;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.f35535e;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
    }
}
