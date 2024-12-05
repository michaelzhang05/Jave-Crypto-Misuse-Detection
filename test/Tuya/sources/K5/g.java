package k5;

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
import l5.C3307A;
import l5.C3319g;
import l5.C3326n;
import p5.C3609g;

/* loaded from: classes5.dex */
public final class g extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f33539a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f33540b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f33541c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f33542d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f33543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, Context context) {
        super(view);
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(context, "context");
        this.f33539a = context;
        this.f33540b = (ImageView) view.findViewById(R.id.iv_logo_home_card_item);
        this.f33541c = (TextView) view.findViewById(R.id.tv_name_home_card_item);
        this.f33542d = (TextView) view.findViewById(R.id.tv_desc_home_card_item);
        this.f33543e = (TextView) view.findViewById(R.id.tv_status_home_card_item);
        TextView textView = this.f33541c;
        if (textView != null) {
            textView.setTypeface(E4.j.f2274g.t());
        }
        TextView textView2 = this.f33542d;
        if (textView2 != null) {
            textView2.setTypeface(E4.j.f2274g.u());
        }
        TextView textView3 = this.f33543e;
        if (textView3 != null) {
            textView3.setTypeface(E4.j.f2274g.u());
        }
    }

    private final boolean a(C1496f c1496f) {
        PackageManager packageManager = this.f33539a.getPackageManager();
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
            textView.setText(this.f33539a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f33539a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f33539a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f33539a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f33539a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f33539a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void d(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3319g().r(str, this.f33539a)) {
            C3326n a8 = C3326n.f34504t.a(this.f33539a);
            a8.a();
            AbstractC3159y.f(str);
            O u02 = a8.u0(str);
            C1496f S7 = a8.S(str);
            a8.g();
            if (S7 != null) {
                if (S7.l0() && SettingsPreferences.f29323b.h0(this.f33539a) && a(S7)) {
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

    static /* synthetic */ void e(g gVar, String str, TextView textView, TextView textView2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        gVar.d(str, textView, textView2, z8);
    }

    private final void f(ImageView imageView, String str, String str2) {
        if (new C3319g().r(str2, this.f33539a)) {
            imageView.setImageDrawable(C3307A.f34473a.j(this.f33539a, str2));
        } else {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C3609g((int) this.f33539a.getResources().getDimension(R.dimen.border_radius_s), null, 2, null)).i(imageView);
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
            String s02 = c1498h.s0();
            String T02 = c1498h.T0();
            TextView textView = this.f33541c;
            AbstractC3159y.f(textView);
            TextView textView2 = this.f33542d;
            AbstractC3159y.f(textView2);
            g(s02, T02, textView, textView2);
            String y02 = c1498h.y0();
            TextView textView3 = this.f33543e;
            AbstractC3159y.f(textView3);
            TextView textView4 = this.f33542d;
            AbstractC3159y.f(textView4);
            e(this, y02, textView3, textView4, false, 8, null);
            ImageView imageView = this.f33540b;
            AbstractC3159y.f(imageView);
            f(imageView, c1498h.l0(), c1498h.y0());
            return;
        }
        if (item instanceof e5.c) {
            C1501k a8 = ((e5.c) item).a();
            AbstractC3159y.f(a8);
            String f8 = a8.f();
            TextView textView5 = this.f33541c;
            AbstractC3159y.f(textView5);
            TextView textView6 = this.f33542d;
            AbstractC3159y.f(textView6);
            g(f8, null, textView5, textView6);
            TextView textView7 = this.f33543e;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            int color = ContextCompat.getColor(this.f33539a, R.color.main_blue);
            Drawable drawable = ContextCompat.getDrawable(this.f33539a, R.drawable.vector_plus);
            if (drawable != null) {
                drawable.setTint(color);
            }
            ImageView imageView2 = this.f33540b;
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable);
                return;
            }
            return;
        }
        throw new Exception("item unknown!");
    }

    public final void h() {
        ImageView imageView = this.f33540b;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = this.f33541c;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.f33542d;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.f33543e;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
    }
}
