package s5;

import H4.j;
import a5.C1639f;
import a5.C1641h;
import a5.C1648o;
import a5.O;
import a5.U;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.core.content.ContextCompat;
import com.squareup.picasso.s;
import com.squareup.picasso.w;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import o5.C3661a;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;
import o5.C3680t;
import q5.C3854c;

/* renamed from: s5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4002f {

    /* renamed from: a, reason: collision with root package name */
    public View f39240a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f39241b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f39242c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f39243d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f39244e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f39245f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f39246g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f39247h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f39248i;

    /* renamed from: j, reason: collision with root package name */
    public ProgressBar f39249j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f39250k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f39251l;

    /* renamed from: m, reason: collision with root package name */
    private long f39252m;

    /* renamed from: n, reason: collision with root package name */
    private AtomicBoolean f39253n = new AtomicBoolean(false);

    private final void A(O o8, Context context) {
        C3854c.f38326a.e(o(), m());
        r().setVisibility(8);
        n().setVisibility(0);
        q().setText(R.string.option_button_cancel);
        q().setBackground(ContextCompat.getDrawable(t().getContext(), R.drawable.ripple_open_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
        if (o8.u() == 0) {
            t().setText(context.getString(R.string.status_download_update_pending));
            o().setIndeterminate(true);
        } else {
            o().setIndeterminate(false);
            t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(o8.u()), new Q4.g().c(o8.v())));
            o().setProgress(o8.u());
        }
    }

    private final void B(String str, Context context) {
        C3854c.f38326a.c(o(), m());
        q().setText(str);
        q().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_install_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.white));
        n().setVisibility(8);
        r().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(T wishlist, Context context, C4002f this$0, C1641h appInfo, RelativeLayout appInfoSelectedView, View view) {
        AbstractC3255y.i(wishlist, "$wishlist");
        AbstractC3255y.i(context, "$context");
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        AbstractC3255y.i(appInfoSelectedView, "$appInfoSelectedView");
        if (UptodownApp.f29058B.a0()) {
            Object obj = wishlist.f34162a;
            if (obj != null) {
                AbstractC3255y.f(obj);
                ((U) obj).i(context);
                wishlist.f34162a = null;
                this$0.l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_added_button));
                this$0.l().setImageResource(R.drawable.vector_heart_white);
            } else {
                long i8 = appInfo.i();
                String s02 = appInfo.s0();
                AbstractC3255y.f(s02);
                U u8 = new U(i8, s02, appInfo.m0(), appInfo.y0(), appInfo.n1());
                wishlist.f34162a = u8;
                AbstractC3255y.f(u8);
                u8.h(context);
                this$0.l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_button));
                this$0.l().setImageResource(R.drawable.vector_heart_red);
            }
            this$0.f(context, appInfoSelectedView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(C4002f this$0, Context context, RelativeLayout appInfoSelectedView, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        AbstractC3255y.i(appInfoSelectedView, "$appInfoSelectedView");
        this$0.f(context, appInfoSelectedView);
    }

    private final void V(C1648o c1648o, Context context) {
        z(c1648o, context);
        C3854c.f38326a.e(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void X(C1648o c1648o, Context context) {
        z(c1648o, context);
        C3854c.f38326a.e(o(), m());
        o().setProgress(c1648o.Z());
        t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(c1648o.Z()), new Q4.g().c(c1648o.a0())));
        n().setVisibility(0);
        r().setVisibility(8);
    }

    private final void h(Context context) {
        C3854c.f38326a.c(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
        String string = context.getString(R.string.updates_button_download_app);
        AbstractC3255y.h(string, "context.getString(R.stri…ates_button_download_app)");
        y(string, context);
    }

    private final void i(C1641h c1641h, Context context) {
        C1648o c1648o = new C1648o();
        c1648o.a(c1641h);
        int l02 = c1648o.l0(context);
        if (l02 >= 0) {
            if (C3680t.f36531a.d()) {
                DownloadApkWorker.f31034k.f(context, l02);
            }
            if (context instanceof MainActivity) {
                ((MainActivity) context).S1(c1648o);
                return;
            }
            return;
        }
        Toast.makeText(context, context.getString(R.string.error_cant_enqueue_download), 1).show();
    }

    private final void j(boolean z8, Context context) {
        String string;
        if (z8) {
            string = context.getString(R.string.updates_button_update_app);
            AbstractC3255y.h(string, "context.getString(R.stri…pdates_button_update_app)");
        } else {
            string = context.getString(R.string.option_button_install);
            AbstractC3255y.h(string, "context.getString(R.string.option_button_install)");
        }
        B(string, context);
        C3854c.f38326a.c(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void x(String str, Context context) {
        Intent launchIntentForPackage;
        if (str != null && str.length() != 0 && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
            context.startActivity(launchIntentForPackage);
        }
    }

    private final void y(String str, Context context) {
        C3854c.f38326a.c(o(), m());
        q().setText(str);
        q().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.white));
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void z(C1648o c1648o, Context context) {
        C3854c.f38326a.e(o(), m());
        r().setVisibility(8);
        n().setVisibility(0);
        q().setText(R.string.option_button_cancel);
        q().setBackground(ContextCompat.getDrawable(t().getContext(), R.drawable.ripple_open_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
        if (c1648o.Z() == 0) {
            t().setText(context.getString(R.string.status_download_update_pending));
            o().setIndeterminate(true);
        } else {
            o().setIndeterminate(false);
            t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(c1648o.Z()), new Q4.g().c(c1648o.a0())));
            o().setProgress(c1648o.Z());
        }
    }

    public final void C(ImageView imageView) {
        AbstractC3255y.i(imageView, "<set-?>");
        this.f39247h = imageView;
    }

    public final void D(ImageView imageView) {
        AbstractC3255y.i(imageView, "<set-?>");
        this.f39242c = imageView;
    }

    public final void E(long j8) {
        this.f39252m = j8;
    }

    public final void F(LinearLayout linearLayout) {
        AbstractC3255y.i(linearLayout, "<set-?>");
        this.f39248i = linearLayout;
    }

    public final void G(ProgressBar progressBar) {
        AbstractC3255y.i(progressBar, "<set-?>");
        this.f39249j = progressBar;
    }

    public final void H(final C1641h appInfo, final Context context, final RelativeLayout appInfoSelectedView) {
        O o8;
        boolean z8;
        boolean z9;
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(appInfoSelectedView, "appInfoSelectedView");
        this.f39252m = appInfo.i();
        View findViewById = appInfoSelectedView.findViewById(R.id.v_background_app_info_selected);
        AbstractC3255y.h(findViewById, "appInfoSelectedView.find…ground_app_info_selected)");
        U(findViewById);
        boolean z10 = false;
        w().setVisibility(0);
        View findViewById2 = appInfoSelectedView.findViewById(R.id.rl_app_info_selected);
        AbstractC3255y.h(findViewById2, "appInfoSelectedView.find….id.rl_app_info_selected)");
        N((RelativeLayout) findViewById2);
        View findViewById3 = appInfoSelectedView.findViewById(R.id.iv_logo_app_info_selected);
        AbstractC3255y.h(findViewById3, "appInfoSelectedView.find…v_logo_app_info_selected)");
        D((ImageView) findViewById3);
        View findViewById4 = appInfoSelectedView.findViewById(R.id.tv_name_app_info_selected);
        AbstractC3255y.h(findViewById4, "appInfoSelectedView.find…v_name_app_info_selected)");
        Q((TextView) findViewById4);
        View findViewById5 = appInfoSelectedView.findViewById(R.id.tv_author_app_info_selected);
        AbstractC3255y.h(findViewById5, "appInfoSelectedView.find…author_app_info_selected)");
        P((TextView) findViewById5);
        View findViewById6 = appInfoSelectedView.findViewById(R.id.ll_download_app_info_selected);
        AbstractC3255y.h(findViewById6, "appInfoSelectedView.find…wnload_app_info_selected)");
        F((LinearLayout) findViewById6);
        View findViewById7 = appInfoSelectedView.findViewById(R.id.pb_progress_app_info_selected);
        AbstractC3255y.h(findViewById7, "appInfoSelectedView.find…ogress_app_info_selected)");
        G((ProgressBar) findViewById7);
        View findViewById8 = appInfoSelectedView.findViewById(R.id.tv_progress_app_info_selected);
        AbstractC3255y.h(findViewById8, "appInfoSelectedView.find…ogress_app_info_selected)");
        R((TextView) findViewById8);
        View findViewById9 = appInfoSelectedView.findViewById(R.id.tv_verified_app_info_selected);
        AbstractC3255y.h(findViewById9, "appInfoSelectedView.find…rified_app_info_selected)");
        T((TextView) findViewById9);
        View findViewById10 = appInfoSelectedView.findViewById(R.id.tv_valoration_app_info_selected);
        AbstractC3255y.h(findViewById10, "appInfoSelectedView.find…ration_app_info_selected)");
        S((TextView) findViewById10);
        View findViewById11 = appInfoSelectedView.findViewById(R.id.tv_action_app_info_selected);
        AbstractC3255y.h(findViewById11, "appInfoSelectedView.find…action_app_info_selected)");
        O((TextView) findViewById11);
        View findViewById12 = appInfoSelectedView.findViewById(R.id.iv_wishlist_action_app_info_selected);
        AbstractC3255y.h(findViewById12, "appInfoSelectedView.find…action_app_info_selected)");
        C((ImageView) findViewById12);
        TextView s8 = s();
        j.a aVar = j.f3824g;
        s8.setTypeface(aVar.t());
        r().setTypeface(aVar.u());
        t().setTypeface(aVar.u());
        v().setTypeface(aVar.u());
        u().setTypeface(aVar.u());
        q().setTypeface(aVar.t());
        w l8 = s.h().l(appInfo.l0()).l(R.drawable.shape_bg_placeholder);
        UptodownApp.a aVar2 = UptodownApp.f29058B;
        l8.n(aVar2.f0(context)).i(m());
        s().setText(appInfo.s0());
        r().setText(appInfo.p());
        u().setText(String.valueOf(appInfo.F0() / 10.0d));
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        final T t8 = new T();
        t8.f34162a = a8.x0(appInfo.i());
        C1648o Z7 = a8.Z(String.valueOf(appInfo.f0()));
        String y02 = appInfo.y0();
        if (y02 != null && y02.length() != 0) {
            String y03 = appInfo.y0();
            AbstractC3255y.f(y03);
            o8 = a8.u0(y03);
        } else {
            o8 = null;
        }
        a8.l();
        q().setVisibility(8);
        if (appInfo.n1()) {
            q().setVisibility(0);
            if (aVar2.V("downloadApkWorker", context) && DownloadApkWorker.f31034k.c(appInfo.i())) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (Z7 != null && Z7.z() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (Z7 != null && Z7.h0()) {
                z10 = true;
            }
            boolean r8 = new C3667g().r(appInfo.y0(), context);
            if (Z7 != null && (z8 || z10)) {
                z(Z7, context);
            } else if (o8 != null && o8.a()) {
                A(o8, context);
            } else if (r8) {
                if (o8 != null) {
                    if (o8.u() != 100 && !z9) {
                        String string = context.getString(R.string.updates_button_download_app);
                        AbstractC3255y.h(string, "context.getString(R.stri…ates_button_download_app)");
                        y(string, context);
                    } else {
                        String string2 = context.getString(R.string.updates_button_update_app);
                        AbstractC3255y.h(string2, "context.getString(R.stri…pdates_button_update_app)");
                        B(string2, context);
                    }
                } else {
                    String string3 = context.getString(R.string.open);
                    AbstractC3255y.h(string3, "context.getString(R.string.open)");
                    y(string3, context);
                }
            } else if (z9) {
                String string4 = context.getString(R.string.option_button_install);
                AbstractC3255y.h(string4, "context.getString(R.string.option_button_install)");
                B(string4, context);
            } else {
                String string5 = context.getString(R.string.updates_button_download_app);
                AbstractC3255y.h(string5, "context.getString(R.stri…ates_button_download_app)");
                y(string5, context);
            }
        }
        if (t8.f34162a != null) {
            l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_button));
            l().setImageResource(R.drawable.vector_heart_red);
        } else {
            l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_added_button));
            l().setImageResource(R.drawable.vector_heart_white);
        }
        r().setOnClickListener(new View.OnClickListener() { // from class: s5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4002f.I(view);
            }
        });
        u().setOnClickListener(new View.OnClickListener() { // from class: s5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4002f.J(view);
            }
        });
        p().setOnClickListener(new View.OnClickListener() { // from class: s5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4002f.K(view);
            }
        });
        l().setOnClickListener(new View.OnClickListener() { // from class: s5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4002f.L(T.this, context, this, appInfo, appInfoSelectedView, view);
            }
        });
        w().setOnClickListener(new View.OnClickListener() { // from class: s5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4002f.M(C4002f.this, context, appInfoSelectedView, view);
            }
        });
    }

    public final void N(RelativeLayout relativeLayout) {
        AbstractC3255y.i(relativeLayout, "<set-?>");
        this.f39241b = relativeLayout;
    }

    public final void O(TextView textView) {
        AbstractC3255y.i(textView, "<set-?>");
        this.f39251l = textView;
    }

    public final void P(TextView textView) {
        AbstractC3255y.i(textView, "<set-?>");
        this.f39244e = textView;
    }

    public final void Q(TextView textView) {
        AbstractC3255y.i(textView, "<set-?>");
        this.f39243d = textView;
    }

    public final void R(TextView textView) {
        AbstractC3255y.i(textView, "<set-?>");
        this.f39250k = textView;
    }

    public final void S(TextView textView) {
        AbstractC3255y.i(textView, "<set-?>");
        this.f39246g = textView;
    }

    public final void T(TextView textView) {
        AbstractC3255y.i(textView, "<set-?>");
        this.f39245f = textView;
    }

    public final void U(View view) {
        AbstractC3255y.i(view, "<set-?>");
        this.f39240a = view;
    }

    public final void W(C1648o download, RelativeLayout relativeLayout, int i8, Context context) {
        AbstractC3255y.i(download, "download");
        AbstractC3255y.i(context, "context");
        if (relativeLayout != null && download.h() == this.f39252m) {
            if (i8 != 205) {
                if (i8 != 207) {
                    switch (i8) {
                        case 200:
                            break;
                        case ComposerKt.providerKey /* 201 */:
                            X(download, context);
                            return;
                        case ComposerKt.compositionLocalMapKey /* 202 */:
                            j(new C3667g().r(download.Y(), context), context);
                            return;
                        default:
                            return;
                    }
                } else {
                    h(context);
                    return;
                }
            }
            V(download, context);
        }
    }

    public final void f(Context context, RelativeLayout appInfoSelectedView) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(appInfoSelectedView, "appInfoSelectedView");
        if (SettingsPreferences.f30353b.N(context) && !UptodownApp.f29058B.S() && this.f39253n.compareAndSet(false, true)) {
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_out);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_out_bottom);
            p().startAnimation(loadAnimation2);
            loadAnimation2.setAnimationListener(new a(loadAnimation, appInfoSelectedView));
            loadAnimation.setAnimationListener(new b(appInfoSelectedView));
            return;
        }
        appInfoSelectedView.setVisibility(8);
        this.f39252m = 0L;
    }

    public final void g(C1641h appInfo, Context context) {
        String y02;
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        C1648o Z7 = a8.Z(String.valueOf(appInfo.f0()));
        if (Z7 == null && (y02 = appInfo.y0()) != null && y02.length() != 0) {
            String y03 = appInfo.y0();
            AbstractC3255y.f(y03);
            Z7 = a8.a0(y03);
        }
        String y04 = appInfo.y0();
        AbstractC3255y.f(y04);
        C1639f S8 = a8.S(y04);
        String y05 = appInfo.y0();
        AbstractC3255y.f(y05);
        O u02 = a8.u0(y05);
        a8.l();
        if ((new C3667g().r(appInfo.y0(), context) && u02 == null) || ((S8 != null && S8.i() == 1) || (u02 != null && u02.h() == 1))) {
            x(appInfo.y0(), context);
            return;
        }
        if (Z7 != null) {
            int Z8 = Z7.Z();
            if (1 <= Z8 && Z8 < 100) {
                DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
                if (aVar.d(appInfo.i(), appInfo.o0())) {
                    aVar.a(appInfo.i());
                    new C3661a().a(context, Z7.X());
                    Z7.n0(context);
                    if (context instanceof MainActivity) {
                        ((MainActivity) context).J2(Z7);
                        return;
                    }
                    return;
                }
            }
            if (u02 != null) {
                if (u02.u() == 100) {
                    File g8 = new C3677q().g(context);
                    String l8 = u02.l();
                    AbstractC3255y.f(l8);
                    UptodownApp.f29058B.X(new File(g8, l8), context, appInfo.t0());
                    return;
                }
                if (Z7.Z() == 100 && u02.w() == Z7.e0()) {
                    File f8 = new C3677q().f(context);
                    String X7 = Z7.X();
                    AbstractC3255y.f(X7);
                    UptodownApp.f29058B.X(new File(f8, X7), context, appInfo.t0());
                    return;
                }
                i(appInfo, context);
                return;
            }
            if (S8 != null && Z7.e0() == S8.f0()) {
                x(appInfo.y0(), context);
                return;
            }
            if (Z7.Z() == 100) {
                File f9 = new C3677q().f(context);
                String X8 = Z7.X();
                AbstractC3255y.f(X8);
                UptodownApp.f29058B.X(new File(f9, X8), context, appInfo.t0());
                return;
            }
            Z7.n0(context);
            if (context instanceof MainActivity) {
                ((MainActivity) context).J2(Z7);
                return;
            }
            return;
        }
        i(appInfo, context);
    }

    public final AtomicBoolean k() {
        return this.f39253n;
    }

    public final ImageView l() {
        ImageView imageView = this.f39247h;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3255y.y("ivLikeAppInfoSelected");
        return null;
    }

    public final ImageView m() {
        ImageView imageView = this.f39242c;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3255y.y("ivLogoAppIndoSelected");
        return null;
    }

    public final LinearLayout n() {
        LinearLayout linearLayout = this.f39248i;
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC3255y.y("llAppInfoSelected");
        return null;
    }

    public final ProgressBar o() {
        ProgressBar progressBar = this.f39249j;
        if (progressBar != null) {
            return progressBar;
        }
        AbstractC3255y.y("pbAppInfoSelected");
        return null;
    }

    public final RelativeLayout p() {
        RelativeLayout relativeLayout = this.f39241b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC3255y.y("rlAppInfoSelected");
        return null;
    }

    public final TextView q() {
        TextView textView = this.f39251l;
        if (textView != null) {
            return textView;
        }
        AbstractC3255y.y("tvActionAppInfoSelected");
        return null;
    }

    public final TextView r() {
        TextView textView = this.f39244e;
        if (textView != null) {
            return textView;
        }
        AbstractC3255y.y("tvAuthorAppInfoSelected");
        return null;
    }

    public final TextView s() {
        TextView textView = this.f39243d;
        if (textView != null) {
            return textView;
        }
        AbstractC3255y.y("tvNameAppInfoSelected");
        return null;
    }

    public final TextView t() {
        TextView textView = this.f39250k;
        if (textView != null) {
            return textView;
        }
        AbstractC3255y.y("tvProgressAppInfoSelected");
        return null;
    }

    public final TextView u() {
        TextView textView = this.f39246g;
        if (textView != null) {
            return textView;
        }
        AbstractC3255y.y("tvValorationAppInfoSelected");
        return null;
    }

    public final TextView v() {
        TextView textView = this.f39245f;
        if (textView != null) {
            return textView;
        }
        AbstractC3255y.y("tvVerifiedAppInfoSelected");
        return null;
    }

    public final View w() {
        View view = this.f39240a;
        if (view != null) {
            return view;
        }
        AbstractC3255y.y("vBackground");
        return null;
    }

    /* renamed from: s5.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f39255b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f39256c;

        a(Animation animation, RelativeLayout relativeLayout) {
            this.f39255b = animation;
            this.f39256c = relativeLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C4002f.this.p().setVisibility(8);
            this.f39256c.setVisibility(8);
            C4002f.this.k().set(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C4002f.this.w().startAnimation(this.f39255b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: s5.f$b */
    /* loaded from: classes5.dex */
    public static final class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f39257a;

        b(RelativeLayout relativeLayout) {
            this.f39257a = relativeLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f39257a.findViewById(R.id.v_background_app_info_selected).setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view) {
    }
}
