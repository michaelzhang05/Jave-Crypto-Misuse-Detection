package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbhk extends FrameLayout implements zzbgz {

    /* renamed from: f, reason: collision with root package name */
    private final zzbgz f13282f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbcw f13283g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f13284h;

    public zzbhk(zzbgz zzbgzVar) {
        super(zzbgzVar.getContext());
        this.f13284h = new AtomicBoolean();
        this.f13282f = zzbgzVar;
        this.f13283g = new zzbcw(zzbgzVar.d0(), this, this);
        addView(zzbgzVar.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void A(zzbin zzbinVar) {
        this.f13282f.A(zzbinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void B(boolean z, int i2) {
        this.f13282f.B(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void C() {
        this.f13282f.C();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void D(zzadv zzadvVar) {
        this.f13282f.D(zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean F() {
        return this.f13282f.F();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void G(String str, String str2, String str3) {
        this.f13282f.G(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void H(IObjectWrapper iObjectWrapper) {
        this.f13282f.H(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void I() {
        this.f13282f.I();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void J() {
        this.f13282f.J();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void K(boolean z) {
        this.f13282f.K(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void L(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.f13282f.L(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void M() {
        this.f13282f.M();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void N() {
        this.f13282f.N();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void O() {
        this.f13282f.O();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzadg P() {
        return this.f13282f.P();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final zzadx Q() {
        return this.f13282f.Q();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void R(boolean z, long j2) {
        this.f13282f.R(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void S(boolean z) {
        this.f13282f.S(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final int U() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzbft V(String str) {
        return this.f13282f.V(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void W(Context context) {
        this.f13282f.W(context);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void Y(String str, JSONObject jSONObject) {
        this.f13282f.Y(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final IObjectWrapper Z() {
        return this.f13282f.Z();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbhx
    public final Activity a() {
        return this.f13282f.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void a0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f13282f.a0(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbig
    public final zzbai b() {
        return this.f13282f.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void b0(int i2) {
        this.f13282f.b0(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final com.google.android.gms.ads.internal.zza c() {
        return this.f13282f.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void c0() {
        this.f13282f.c0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbif
    public final zzdh d() {
        return this.f13282f.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final Context d0() {
        return this.f13282f.d0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void destroy() {
        IObjectWrapper Z = Z();
        if (Z != null) {
            zzk.zzlv().f(Z);
            zzaxi.a.postDelayed(new ab(this), ((Integer) zzyt.e().c(zzacu.c4)).intValue());
            return;
        }
        this.f13282f.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final void e(zzbhq zzbhqVar) {
        this.f13282f.e(zzbhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void e0() {
        setBackgroundColor(0);
        this.f13282f.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void f(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f13282f.f(str, zzahoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final int f0() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final void g(String str, zzbft zzbftVar) {
        this.f13282f.g(str, zzbftVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void g0(boolean z, int i2, String str) {
        this.f13282f.g0(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbih
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final WebView getWebView() {
        return this.f13282f.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final zzbhq h() {
        return this.f13282f.h();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void h0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f13282f.h0(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void i(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f13282f.i(str, zzahoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzbcw i0() {
        return this.f13283g;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void j(String str, JSONObject jSONObject) {
        this.f13282f.j(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void j0(boolean z) {
        this.f13282f.j0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void k(String str) {
        this.f13282f.k(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.overlay.zzd k0() {
        return this.f13282f.k0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean l() {
        return this.f13282f.l();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void l0() {
        TextView textView = new TextView(getContext());
        Resources b2 = zzk.zzlk().b();
        textView.setText(b2 != null ? b2.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void loadData(String str, String str2, String str3) {
        this.f13282f.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f13282f.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void loadUrl(String str) {
        this.f13282f.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbhy
    public final boolean m() {
        return this.f13282f.m();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void m0(boolean z) {
        this.f13282f.m0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final zzadh n() {
        return this.f13282f.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void n0() {
        this.f13283g.a();
        this.f13282f.n0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbie
    public final zzbin o() {
        return this.f13282f.o();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void onPause() {
        this.f13283g.b();
        this.f13282f.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void onResume() {
        this.f13282f.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final zzbii p() {
        return this.f13282f.p();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean p0() {
        return this.f13284h.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final String r() {
        return this.f13282f.r();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void r0(zzud zzudVar) {
        this.f13282f.r0(zzudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean s() {
        return this.f13282f.s();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.overlay.zzd s0() {
        return this.f13282f.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13282f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f13282f.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void setRequestedOrientation(int i2) {
        this.f13282f.setRequestedOrientation(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f13282f.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f13282f.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void t(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        this.f13282f.t(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean t0() {
        return this.f13282f.t0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String v() {
        return this.f13282f.v();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void v0(boolean z) {
        this.f13282f.v0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean w(boolean z, int i2) {
        if (!this.f13284h.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzyt.e().c(zzacu.V0)).booleanValue()) {
            return false;
        }
        removeView(this.f13282f.getView());
        return this.f13282f.w(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void w0(boolean z, int i2, String str, String str2) {
        this.f13282f.w0(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void x(boolean z) {
        this.f13282f.x(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void x0(zzadx zzadxVar) {
        this.f13282f.x0(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void y(String str, Map<String, ?> map) {
        this.f13282f.y(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final WebViewClient z() {
        return this.f13282f.z();
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzlc() {
        this.f13282f.zzlc();
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzld() {
        this.f13282f.zzld();
    }
}
