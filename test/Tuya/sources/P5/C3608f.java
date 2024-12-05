package p5;

import E4.j;
import X4.C1496f;
import X4.C1498h;
import X4.C1505o;
import X4.O;
import X4.U;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3313a;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;
import l5.C3332t;
import n5.C3475c;

/* renamed from: p5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3608f {

    /* renamed from: a, reason: collision with root package name */
    public View f37041a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f37042b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f37043c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f37044d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f37045e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f37046f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f37047g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f37048h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f37049i;

    /* renamed from: j, reason: collision with root package name */
    public ProgressBar f37050j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f37051k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f37052l;

    /* renamed from: m, reason: collision with root package name */
    private long f37053m;

    /* renamed from: n, reason: collision with root package name */
    private AtomicBoolean f37054n = new AtomicBoolean(false);

    private final void A(O o8, Context context) {
        C3475c.f36198a.e(o(), m());
        r().setVisibility(8);
        n().setVisibility(0);
        q().setText(R.string.option_button_cancel);
        q().setBackground(ContextCompat.getDrawable(t().getContext(), R.drawable.ripple_open_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
        if (o8.o() == 0) {
            t().setText(context.getString(R.string.status_download_update_pending));
            o().setIndeterminate(true);
        } else {
            o().setIndeterminate(false);
            t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(o8.o()), new N4.g().c(o8.s())));
            o().setProgress(o8.o());
        }
    }

    private final void B(String str, Context context) {
        C3475c.f36198a.c(o(), m());
        q().setText(str);
        q().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_install_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.white));
        n().setVisibility(8);
        r().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(T wishlist, Context context, C3608f this$0, C1498h appInfo, RelativeLayout appInfoSelectedView, View view) {
        AbstractC3159y.i(wishlist, "$wishlist");
        AbstractC3159y.i(context, "$context");
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        AbstractC3159y.i(appInfoSelectedView, "$appInfoSelectedView");
        if (UptodownApp.f28003B.a0()) {
            Object obj = wishlist.f33761a;
            if (obj != null) {
                AbstractC3159y.f(obj);
                ((U) obj).i(context);
                wishlist.f33761a = null;
                this$0.l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_added_button));
                this$0.l().setImageResource(R.drawable.vector_heart_white);
            } else {
                long i8 = appInfo.i();
                String s02 = appInfo.s0();
                AbstractC3159y.f(s02);
                U u8 = new U(i8, s02, appInfo.m0(), appInfo.y0(), appInfo.n1());
                wishlist.f33761a = u8;
                AbstractC3159y.f(u8);
                u8.h(context);
                this$0.l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_button));
                this$0.l().setImageResource(R.drawable.vector_heart_red);
            }
            this$0.f(context, appInfoSelectedView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(C3608f this$0, Context context, RelativeLayout appInfoSelectedView, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        AbstractC3159y.i(appInfoSelectedView, "$appInfoSelectedView");
        this$0.f(context, appInfoSelectedView);
    }

    private final void V(C1505o c1505o, Context context) {
        z(c1505o, context);
        C3475c.f36198a.e(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void X(C1505o c1505o, Context context) {
        z(c1505o, context);
        C3475c.f36198a.e(o(), m());
        o().setProgress(c1505o.Z());
        t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(c1505o.Z()), new N4.g().c(c1505o.a0())));
        n().setVisibility(0);
        r().setVisibility(8);
    }

    private final void h(Context context) {
        C3475c.f36198a.c(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
        String string = context.getString(R.string.updates_button_download_app);
        AbstractC3159y.h(string, "context.getString(R.stri…ates_button_download_app)");
        y(string, context);
    }

    private final void i(C1498h c1498h, Context context) {
        C1505o c1505o = new C1505o();
        c1505o.b(c1498h);
        int l02 = c1505o.l0(context);
        if (l02 >= 0) {
            if (C3332t.f34530a.d()) {
                DownloadApkWorker.f30002k.f(context, l02);
            }
            if (context instanceof MainActivity) {
                ((MainActivity) context).S1(c1505o);
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
            AbstractC3159y.h(string, "context.getString(R.stri…pdates_button_update_app)");
        } else {
            string = context.getString(R.string.option_button_install);
            AbstractC3159y.h(string, "context.getString(R.string.option_button_install)");
        }
        B(string, context);
        C3475c.f36198a.c(o(), m());
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
        C3475c.f36198a.c(o(), m());
        q().setText(str);
        q().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.white));
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void z(C1505o c1505o, Context context) {
        C3475c.f36198a.e(o(), m());
        r().setVisibility(8);
        n().setVisibility(0);
        q().setText(R.string.option_button_cancel);
        q().setBackground(ContextCompat.getDrawable(t().getContext(), R.drawable.ripple_open_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
        if (c1505o.Z() == 0) {
            t().setText(context.getString(R.string.status_download_update_pending));
            o().setIndeterminate(true);
        } else {
            o().setIndeterminate(false);
            t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(c1505o.Z()), new N4.g().c(c1505o.a0())));
            o().setProgress(c1505o.Z());
        }
    }

    public final void C(ImageView imageView) {
        AbstractC3159y.i(imageView, "<set-?>");
        this.f37048h = imageView;
    }

    public final void D(ImageView imageView) {
        AbstractC3159y.i(imageView, "<set-?>");
        this.f37043c = imageView;
    }

    public final void E(long j8) {
        this.f37053m = j8;
    }

    public final void F(LinearLayout linearLayout) {
        AbstractC3159y.i(linearLayout, "<set-?>");
        this.f37049i = linearLayout;
    }

    public final void G(ProgressBar progressBar) {
        AbstractC3159y.i(progressBar, "<set-?>");
        this.f37050j = progressBar;
    }

    public final void H(final C1498h appInfo, final Context context, final RelativeLayout appInfoSelectedView) {
        O o8;
        boolean z8;
        boolean z9;
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appInfoSelectedView, "appInfoSelectedView");
        this.f37053m = appInfo.i();
        View findViewById = appInfoSelectedView.findViewById(R.id.v_background_app_info_selected);
        AbstractC3159y.h(findViewById, "appInfoSelectedView.find…ground_app_info_selected)");
        U(findViewById);
        boolean z10 = false;
        w().setVisibility(0);
        View findViewById2 = appInfoSelectedView.findViewById(R.id.rl_app_info_selected);
        AbstractC3159y.h(findViewById2, "appInfoSelectedView.find….id.rl_app_info_selected)");
        N((RelativeLayout) findViewById2);
        View findViewById3 = appInfoSelectedView.findViewById(R.id.iv_logo_app_info_selected);
        AbstractC3159y.h(findViewById3, "appInfoSelectedView.find…v_logo_app_info_selected)");
        D((ImageView) findViewById3);
        View findViewById4 = appInfoSelectedView.findViewById(R.id.tv_name_app_info_selected);
        AbstractC3159y.h(findViewById4, "appInfoSelectedView.find…v_name_app_info_selected)");
        Q((TextView) findViewById4);
        View findViewById5 = appInfoSelectedView.findViewById(R.id.tv_author_app_info_selected);
        AbstractC3159y.h(findViewById5, "appInfoSelectedView.find…author_app_info_selected)");
        P((TextView) findViewById5);
        View findViewById6 = appInfoSelectedView.findViewById(R.id.ll_download_app_info_selected);
        AbstractC3159y.h(findViewById6, "appInfoSelectedView.find…wnload_app_info_selected)");
        F((LinearLayout) findViewById6);
        View findViewById7 = appInfoSelectedView.findViewById(R.id.pb_progress_app_info_selected);
        AbstractC3159y.h(findViewById7, "appInfoSelectedView.find…ogress_app_info_selected)");
        G((ProgressBar) findViewById7);
        View findViewById8 = appInfoSelectedView.findViewById(R.id.tv_progress_app_info_selected);
        AbstractC3159y.h(findViewById8, "appInfoSelectedView.find…ogress_app_info_selected)");
        R((TextView) findViewById8);
        View findViewById9 = appInfoSelectedView.findViewById(R.id.tv_verified_app_info_selected);
        AbstractC3159y.h(findViewById9, "appInfoSelectedView.find…rified_app_info_selected)");
        T((TextView) findViewById9);
        View findViewById10 = appInfoSelectedView.findViewById(R.id.tv_valoration_app_info_selected);
        AbstractC3159y.h(findViewById10, "appInfoSelectedView.find…ration_app_info_selected)");
        S((TextView) findViewById10);
        View findViewById11 = appInfoSelectedView.findViewById(R.id.tv_action_app_info_selected);
        AbstractC3159y.h(findViewById11, "appInfoSelectedView.find…action_app_info_selected)");
        O((TextView) findViewById11);
        View findViewById12 = appInfoSelectedView.findViewById(R.id.iv_wishlist_action_app_info_selected);
        AbstractC3159y.h(findViewById12, "appInfoSelectedView.find…action_app_info_selected)");
        C((ImageView) findViewById12);
        TextView s8 = s();
        j.a aVar = j.f2274g;
        s8.setTypeface(aVar.t());
        r().setTypeface(aVar.u());
        t().setTypeface(aVar.u());
        v().setTypeface(aVar.u());
        u().setTypeface(aVar.u());
        q().setTypeface(aVar.t());
        w l8 = s.h().l(appInfo.l0()).l(R.drawable.shape_bg_placeholder);
        UptodownApp.a aVar2 = UptodownApp.f28003B;
        l8.n(aVar2.f0(context)).i(m());
        s().setText(appInfo.s0());
        r().setText(appInfo.k());
        u().setText(String.valueOf(appInfo.F0() / 10.0d));
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        final T t8 = new T();
        t8.f33761a = a8.x0(appInfo.i());
        C1505o Z7 = a8.Z(String.valueOf(appInfo.f0()));
        String y02 = appInfo.y0();
        if (y02 != null && y02.length() != 0) {
            String y03 = appInfo.y0();
            AbstractC3159y.f(y03);
            o8 = a8.u0(y03);
        } else {
            o8 = null;
        }
        a8.g();
        q().setVisibility(8);
        if (appInfo.n1()) {
            q().setVisibility(0);
            if (aVar2.V("downloadApkWorker", context) && DownloadApkWorker.f30002k.c(appInfo.i())) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (Z7 != null && Z7.I() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (Z7 != null && Z7.h0()) {
                z10 = true;
            }
            boolean r8 = new C3319g().r(appInfo.y0(), context);
            if (Z7 != null && (z8 || z10)) {
                z(Z7, context);
            } else if (o8 != null && o8.b()) {
                A(o8, context);
            } else if (r8) {
                if (o8 != null) {
                    if (o8.o() != 100 && !z9) {
                        String string = context.getString(R.string.updates_button_download_app);
                        AbstractC3159y.h(string, "context.getString(R.stri…ates_button_download_app)");
                        y(string, context);
                    } else {
                        String string2 = context.getString(R.string.updates_button_update_app);
                        AbstractC3159y.h(string2, "context.getString(R.stri…pdates_button_update_app)");
                        B(string2, context);
                    }
                } else {
                    String string3 = context.getString(R.string.open);
                    AbstractC3159y.h(string3, "context.getString(R.string.open)");
                    y(string3, context);
                }
            } else if (z9) {
                String string4 = context.getString(R.string.option_button_install);
                AbstractC3159y.h(string4, "context.getString(R.string.option_button_install)");
                B(string4, context);
            } else {
                String string5 = context.getString(R.string.updates_button_download_app);
                AbstractC3159y.h(string5, "context.getString(R.stri…ates_button_download_app)");
                y(string5, context);
            }
        }
        if (t8.f33761a != null) {
            l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_button));
            l().setImageResource(R.drawable.vector_heart_red);
        } else {
            l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_added_button));
            l().setImageResource(R.drawable.vector_heart_white);
        }
        r().setOnClickListener(new View.OnClickListener() { // from class: p5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3608f.I(view);
            }
        });
        u().setOnClickListener(new View.OnClickListener() { // from class: p5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3608f.J(view);
            }
        });
        p().setOnClickListener(new View.OnClickListener() { // from class: p5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3608f.K(view);
            }
        });
        l().setOnClickListener(new View.OnClickListener() { // from class: p5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3608f.L(T.this, context, this, appInfo, appInfoSelectedView, view);
            }
        });
        w().setOnClickListener(new View.OnClickListener() { // from class: p5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3608f.M(C3608f.this, context, appInfoSelectedView, view);
            }
        });
    }

    public final void N(RelativeLayout relativeLayout) {
        AbstractC3159y.i(relativeLayout, "<set-?>");
        this.f37042b = relativeLayout;
    }

    public final void O(TextView textView) {
        AbstractC3159y.i(textView, "<set-?>");
        this.f37052l = textView;
    }

    public final void P(TextView textView) {
        AbstractC3159y.i(textView, "<set-?>");
        this.f37045e = textView;
    }

    public final void Q(TextView textView) {
        AbstractC3159y.i(textView, "<set-?>");
        this.f37044d = textView;
    }

    public final void R(TextView textView) {
        AbstractC3159y.i(textView, "<set-?>");
        this.f37051k = textView;
    }

    public final void S(TextView textView) {
        AbstractC3159y.i(textView, "<set-?>");
        this.f37047g = textView;
    }

    public final void T(TextView textView) {
        AbstractC3159y.i(textView, "<set-?>");
        this.f37046f = textView;
    }

    public final void U(View view) {
        AbstractC3159y.i(view, "<set-?>");
        this.f37041a = view;
    }

    public final void W(C1505o download, RelativeLayout relativeLayout, int i8, Context context) {
        AbstractC3159y.i(download, "download");
        AbstractC3159y.i(context, "context");
        if (relativeLayout != null && download.f() == this.f37053m) {
            if (i8 != 205) {
                if (i8 != 207) {
                    switch (i8) {
                        case 200:
                            break;
                        case ComposerKt.providerKey /* 201 */:
                            X(download, context);
                            return;
                        case ComposerKt.compositionLocalMapKey /* 202 */:
                            j(new C3319g().r(download.Y(), context), context);
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
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appInfoSelectedView, "appInfoSelectedView");
        if (SettingsPreferences.f29323b.N(context) && !UptodownApp.f28003B.S() && this.f37054n.compareAndSet(false, true)) {
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_out);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_out_bottom);
            p().startAnimation(loadAnimation2);
            loadAnimation2.setAnimationListener(new a(loadAnimation, appInfoSelectedView));
            loadAnimation.setAnimationListener(new b(appInfoSelectedView));
            return;
        }
        appInfoSelectedView.setVisibility(8);
        this.f37053m = 0L;
    }

    public final void g(C1498h appInfo, Context context) {
        String y02;
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        C1505o Z7 = a8.Z(String.valueOf(appInfo.f0()));
        if (Z7 == null && (y02 = appInfo.y0()) != null && y02.length() != 0) {
            String y03 = appInfo.y0();
            AbstractC3159y.f(y03);
            Z7 = a8.a0(y03);
        }
        String y04 = appInfo.y0();
        AbstractC3159y.f(y04);
        C1496f S7 = a8.S(y04);
        String y05 = appInfo.y0();
        AbstractC3159y.f(y05);
        O u02 = a8.u0(y05);
        a8.g();
        if ((new C3319g().r(appInfo.y0(), context) && u02 == null) || ((S7 != null && S7.i() == 1) || (u02 != null && u02.f() == 1))) {
            x(appInfo.y0(), context);
            return;
        }
        if (Z7 != null) {
            int Z8 = Z7.Z();
            if (1 <= Z8 && Z8 < 100) {
                DownloadApkWorker.a aVar = DownloadApkWorker.f30002k;
                if (aVar.d(appInfo.i(), appInfo.o0())) {
                    aVar.a(appInfo.i());
                    new C3313a().a(context, Z7.X());
                    Z7.n0(context);
                    if (context instanceof MainActivity) {
                        ((MainActivity) context).J2(Z7);
                        return;
                    }
                    return;
                }
            }
            if (u02 != null) {
                if (u02.o() == 100) {
                    File g8 = new C3329q().g(context);
                    String j8 = u02.j();
                    AbstractC3159y.f(j8);
                    UptodownApp.f28003B.X(new File(g8, j8), context, appInfo.t0());
                    return;
                }
                if (Z7.Z() == 100 && u02.u() == Z7.e0()) {
                    File f8 = new C3329q().f(context);
                    String X7 = Z7.X();
                    AbstractC3159y.f(X7);
                    UptodownApp.f28003B.X(new File(f8, X7), context, appInfo.t0());
                    return;
                }
                i(appInfo, context);
                return;
            }
            if (S7 != null && Z7.e0() == S7.f0()) {
                x(appInfo.y0(), context);
                return;
            }
            if (Z7.Z() == 100) {
                File f9 = new C3329q().f(context);
                String X8 = Z7.X();
                AbstractC3159y.f(X8);
                UptodownApp.f28003B.X(new File(f9, X8), context, appInfo.t0());
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
        return this.f37054n;
    }

    public final ImageView l() {
        ImageView imageView = this.f37048h;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3159y.y("ivLikeAppInfoSelected");
        return null;
    }

    public final ImageView m() {
        ImageView imageView = this.f37043c;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3159y.y("ivLogoAppIndoSelected");
        return null;
    }

    public final LinearLayout n() {
        LinearLayout linearLayout = this.f37049i;
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC3159y.y("llAppInfoSelected");
        return null;
    }

    public final ProgressBar o() {
        ProgressBar progressBar = this.f37050j;
        if (progressBar != null) {
            return progressBar;
        }
        AbstractC3159y.y("pbAppInfoSelected");
        return null;
    }

    public final RelativeLayout p() {
        RelativeLayout relativeLayout = this.f37042b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC3159y.y("rlAppInfoSelected");
        return null;
    }

    public final TextView q() {
        TextView textView = this.f37052l;
        if (textView != null) {
            return textView;
        }
        AbstractC3159y.y("tvActionAppInfoSelected");
        return null;
    }

    public final TextView r() {
        TextView textView = this.f37045e;
        if (textView != null) {
            return textView;
        }
        AbstractC3159y.y("tvAuthorAppInfoSelected");
        return null;
    }

    public final TextView s() {
        TextView textView = this.f37044d;
        if (textView != null) {
            return textView;
        }
        AbstractC3159y.y("tvNameAppInfoSelected");
        return null;
    }

    public final TextView t() {
        TextView textView = this.f37051k;
        if (textView != null) {
            return textView;
        }
        AbstractC3159y.y("tvProgressAppInfoSelected");
        return null;
    }

    public final TextView u() {
        TextView textView = this.f37047g;
        if (textView != null) {
            return textView;
        }
        AbstractC3159y.y("tvValorationAppInfoSelected");
        return null;
    }

    public final TextView v() {
        TextView textView = this.f37046f;
        if (textView != null) {
            return textView;
        }
        AbstractC3159y.y("tvVerifiedAppInfoSelected");
        return null;
    }

    public final View w() {
        View view = this.f37041a;
        if (view != null) {
            return view;
        }
        AbstractC3159y.y("vBackground");
        return null;
    }

    /* renamed from: p5.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f37056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f37057c;

        a(Animation animation, RelativeLayout relativeLayout) {
            this.f37056b = animation;
            this.f37057c = relativeLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C3608f.this.p().setVisibility(8);
            this.f37057c.setVisibility(8);
            C3608f.this.k().set(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C3608f.this.w().startAnimation(this.f37056b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: p5.f$b */
    /* loaded from: classes5.dex */
    public static final class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f37058a;

        b(RelativeLayout relativeLayout) {
            this.f37058a = relativeLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f37058a.findViewById(R.id.v_background_app_info_selected).setVisibility(8);
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
