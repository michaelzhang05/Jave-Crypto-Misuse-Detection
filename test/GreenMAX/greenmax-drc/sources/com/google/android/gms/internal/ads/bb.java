package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cm.aptoide.pt.BuildConfig;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
@zzard
/* loaded from: classes2.dex */
final class bb extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbgz {
    private boolean A;
    private String B;
    private zzbhq C;
    private boolean D;
    private boolean E;
    private zzadx F;
    private zzadv G;
    private int H;
    private int I;
    private zzadg J;
    private zzadg K;
    private zzadg L;
    private zzadh M;
    private WeakReference<View.OnClickListener> N;
    private com.google.android.gms.ads.internal.overlay.zzd O;
    private boolean P;
    private zzazs Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private Map<String, zzbft> V;
    private final WindowManager W;
    private final zzwj a0;

    /* renamed from: f, reason: collision with root package name */
    private final zzbim f11143f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdh f11144g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbai f11145h;

    /* renamed from: i, reason: collision with root package name */
    private final zzj f11146i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.zza f11147j;

    /* renamed from: k, reason: collision with root package name */
    private final DisplayMetrics f11148k;
    private final float l;
    private boolean m;
    private boolean n;
    private zzbha o;
    private com.google.android.gms.ads.internal.overlay.zzd p;
    private IObjectWrapper q;
    private zzbin r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private Boolean x;
    private int y;
    private boolean z;

    @VisibleForTesting
    private bb(zzbim zzbimVar, zzbin zzbinVar, String str, boolean z, boolean z2, zzdh zzdhVar, zzbai zzbaiVar, zzadi zzadiVar, zzj zzjVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar) {
        super(zzbimVar);
        this.m = false;
        this.n = false;
        this.z = true;
        this.A = false;
        this.B = HttpUrl.FRAGMENT_ENCODE_SET;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.f11143f = zzbimVar;
        this.r = zzbinVar;
        this.s = str;
        this.v = z;
        this.y = -1;
        this.f11144g = zzdhVar;
        this.f11145h = zzbaiVar;
        this.f11146i = zzjVar;
        this.f11147j = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.W = windowManager;
        zzk.zzlg();
        DisplayMetrics b2 = zzaxi.b(windowManager);
        this.f11148k = b2;
        this.l = b2.density;
        this.a0 = zzwjVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            zzbad.c("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzk.zzlg().k(zzbimVar, zzbaiVar.f13150f, settings);
        zzk.zzli().k(getContext(), settings);
        setDownloadListener(this);
        F0();
        if (PlatformVersion.d()) {
            addJavascriptInterface(zzbht.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.Q = new zzazs(this.f11143f.b(), this, this, null);
        J0();
        zzadh zzadhVar = new zzadh(new zzadi(true, "make_wv", this.s));
        this.M = zzadhVar;
        zzadhVar.c().b(zzadiVar);
        zzadg b3 = zzadb.b(this.M.c());
        this.K = b3;
        this.M.a("native:view_create", b3);
        this.L = null;
        this.J = null;
        zzk.zzli().m(zzbimVar);
        zzk.zzlk().o();
    }

    @TargetApi(19)
    private final synchronized void A0(String str, ValueCallback<String> valueCallback) {
        if (!l()) {
            evaluateJavascript(str, null);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void B0(boolean z, int i2, zzxn zzxnVar) {
        zzwt.zzv.zza C = zzwt.zzv.C();
        if (C.v() != z) {
            C.x(z);
        }
        C.u(i2);
        zzxnVar.n = (zzwt.zzv) ((zzdob) C.J());
    }

    private final boolean C0() {
        int i2;
        int i3;
        if (!this.o.m() && !this.o.y()) {
            return false;
        }
        zzyt.a();
        DisplayMetrics displayMetrics = this.f11148k;
        int k2 = zzazt.k(displayMetrics, displayMetrics.widthPixels);
        zzyt.a();
        DisplayMetrics displayMetrics2 = this.f11148k;
        int k3 = zzazt.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity b2 = this.f11143f.b();
        if (b2 == null || b2.getWindow() == null) {
            i2 = k2;
            i3 = k3;
        } else {
            zzk.zzlg();
            int[] P = zzaxi.P(b2);
            zzyt.a();
            int k4 = zzazt.k(this.f11148k, P[0]);
            zzyt.a();
            i3 = zzazt.k(this.f11148k, P[1]);
            i2 = k4;
        }
        int i4 = this.S;
        if (i4 == k2 && this.R == k3 && this.T == i2 && this.U == i3) {
            return false;
        }
        boolean z = (i4 == k2 && this.R == k3) ? false : true;
        this.S = k2;
        this.R = k3;
        this.T = i2;
        this.U = i3;
        new zzaqb(this).c(k2, k3, i2, i3, this.f11148k.density, this.W.getDefaultDisplay().getRotation());
        return z;
    }

    private final synchronized void D0() {
        Boolean m = zzk.zzlk().m();
        this.x = m;
        if (m == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                z0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                z0(Boolean.FALSE);
            }
        }
    }

    private final void E0() {
        zzadb.a(this.M.c(), this.K, "aeh2");
    }

    private final synchronized void F0() {
        if (!this.v && !this.r.e()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzbad.e("Disabling hardware acceleration on an AdView.");
                G0();
                return;
            } else {
                zzbad.e("Enabling hardware acceleration on an AdView.");
                H0();
                return;
            }
        }
        zzbad.e("Enabling hardware acceleration on an overlay.");
        H0();
    }

    private final synchronized void G0() {
        if (!this.w) {
            zzk.zzli();
            setLayerType(1, null);
        }
        this.w = true;
    }

    private final synchronized void H0() {
        if (this.w) {
            zzk.zzli();
            setLayerType(0, null);
        }
        this.w = false;
    }

    private final synchronized void I0() {
        Map<String, zzbft> map = this.V;
        if (map != null) {
            Iterator<zzbft> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        this.V = null;
    }

    private final void J0() {
        zzadi c2;
        zzadh zzadhVar = this.M;
        if (zzadhVar == null || (c2 = zzadhVar.c()) == null || zzk.zzlk().l() == null) {
            return;
        }
        zzk.zzlk().l().d(c2);
    }

    private final void K0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        y("onAdVisibilityChanged", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bb L0(Context context, zzbin zzbinVar, String str, boolean z, boolean z2, zzdh zzdhVar, zzbai zzbaiVar, zzadi zzadiVar, zzj zzjVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar) {
        return new bb(new zzbim(context), zzbinVar, str, z, z2, zzdhVar, zzbaiVar, zzadiVar, zzjVar, zzaVar, zzwjVar);
    }

    private final synchronized void N0(String str) {
        if (!l()) {
            loadUrl(str);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void O0(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            zzk.zzlk().e(e2, "AdWebViewImpl.loadUrlUnsafe");
            zzbad.d("Could not call loadUrl. ", e2);
        }
    }

    private final void P0(String str) {
        if (PlatformVersion.f()) {
            if (Q0() == null) {
                D0();
            }
            if (Q0().booleanValue()) {
                A0(str, null);
                return;
            } else {
                String valueOf = String.valueOf(str);
                N0(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
                return;
            }
        }
        String valueOf2 = String.valueOf(str);
        N0(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @VisibleForTesting
    private final synchronized Boolean Q0() {
        return this.x;
    }

    private final synchronized void R0() {
        if (!this.P) {
            this.P = true;
            zzk.zzlk().p();
        }
    }

    @VisibleForTesting
    private final void z0(Boolean bool) {
        synchronized (this) {
            this.x = bool;
        }
        zzk.zzlk().d(bool);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void A(zzbin zzbinVar) {
        this.r = zzbinVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void B(boolean z, int i2) {
        this.o.H(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void C() {
        this.Q.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void D(zzadv zzadvVar) {
        this.G = zzadvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized boolean F() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void G(String str, String str2, String str3) {
        if (!l()) {
            if (((Boolean) zzyt.e().c(zzacu.R0)).booleanValue()) {
                str2 = zzbid.b(str2, zzbid.a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        zzbad.i("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void H(IObjectWrapper iObjectWrapper) {
        this.q = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void I() {
        if (this.L == null) {
            zzadg b2 = zzadb.b(this.M.c());
            this.L = b2;
            this.M.a("native:view_load", b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void J() {
        E0();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f11145h.f13150f);
        y("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void K(boolean z) {
        this.z = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void L(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.o.s(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final synchronized void M() {
        zzadv zzadvVar = this.G;
        if (zzadvVar != null) {
            zzadvVar.B5();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void N() {
        com.google.android.gms.ads.internal.overlay.zzd k0 = k0();
        if (k0 != null) {
            k0.zztm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void O() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzk.zzll().e()));
        hashMap.put("app_volume", String.valueOf(zzk.zzll().d()));
        hashMap.put("device_volume", String.valueOf(zzaya.c(getContext())));
        y("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzadg P() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized zzadx Q() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void R(boolean z, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, z ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        y("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void S(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVar;
        int i2 = this.H + (z ? 1 : -1);
        this.H = i2;
        if (i2 <= 0 && (zzdVar = this.p) != null) {
            zzdVar.zztn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final int U() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final synchronized zzbft V(String str) {
        Map<String, zzbft> map = this.V;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void W(Context context) {
        this.f11143f.setBaseContext(context);
        this.Q.c(this.f11143f.b());
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void Y(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        P0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized IObjectWrapper Z() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbhx
    public final Activity a() {
        return this.f11143f.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void a0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.O = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbig
    public final zzbai b() {
        return this.f11145h;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void b0(int i2) {
        if (i2 == 0) {
            zzadb.a(this.M.c(), this.K, "aebb2");
        }
        E0();
        if (this.M.c() != null) {
            this.M.c().d("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f11145h.f13150f);
        y("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final com.google.android.gms.ads.internal.zza c() {
        return this.f11147j;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void c0() {
        if (this.J == null) {
            zzadb.a(this.M.c(), this.K, "aes2");
            zzadg b2 = zzadb.b(this.M.c());
            this.J = b2;
            this.M.a("native:view_show", b2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f11145h.f13150f);
        y("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbif
    public final zzdh d() {
        return this.f11144g;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final Context d0() {
        return this.f11143f.a();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void destroy() {
        J0();
        this.Q.f();
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.p;
        if (zzdVar != null) {
            zzdVar.close();
            this.p.onDestroy();
            this.p = null;
        }
        this.q = null;
        this.o.p();
        if (this.u) {
            return;
        }
        zzk.zzmc();
        zzbfs.f(this);
        I0();
        this.u = true;
        zzawz.m("Initiating WebView self destruct sequence in 3...");
        zzawz.m("Loading blank page in WebView, 2...");
        O0("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final synchronized void e(zzbhq zzbhqVar) {
        if (this.C != null) {
            zzbad.g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.C = zzbhqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void e0() {
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (l()) {
            zzbad.k("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void f(String str, zzaho<? super zzbgz> zzahoVar) {
        zzbha zzbhaVar = this.o;
        if (zzbhaVar != null) {
            zzbhaVar.v(str, zzahoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final int f0() {
        return getMeasuredHeight();
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.u) {
                    this.o.p();
                    zzk.zzmc();
                    zzbfs.f(this);
                    I0();
                    R0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final synchronized void g(String str, zzbft zzbftVar) {
        if (this.V == null) {
            this.V = new HashMap();
        }
        this.V.put(str, zzbftVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void g0(boolean z, int i2, String str) {
        this.o.w(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbih
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final synchronized zzbhq h() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void h0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.p = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void i(String str, zzaho<? super zzbgz> zzahoVar) {
        zzbha zzbhaVar = this.o;
        if (zzbhaVar != null) {
            zzbhaVar.G(str, zzahoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzbcw i0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void j(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzbad.e(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        P0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void j0(boolean z) {
        boolean z2 = z != this.v;
        this.v = z;
        F0();
        if (z2) {
            new zzaqb(this).g(z ? "expanded" : BuildConfig.APTOIDE_THEME);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void k(String str) {
        P0(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd k0() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized boolean l() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void l0() {
        zzawz.m("Cannot add text view to inner AdWebView");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!l()) {
            super.loadData(str, str2, str3);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!l()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void loadUrl(String str) {
        if (!l()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                zzk.zzlk().e(e2, "AdWebViewImpl.loadUrl");
                zzbad.d("Could not call loadUrl. ", e2);
                return;
            }
        }
        zzbad.i("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbhy
    public final synchronized boolean m() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void m0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.p;
        if (zzdVar != null) {
            zzdVar.zza(this.o.m(), z);
        } else {
            this.t = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    public final zzadh n() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void n0() {
        zzawz.m("Destroying WebView!");
        R0();
        zzaxi.a.post(new eb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbie
    public final synchronized zzbin o() {
        return this.r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!l()) {
            this.Q.a();
        }
        boolean z = this.D;
        zzbha zzbhaVar = this.o;
        if (zzbhaVar != null && zzbhaVar.y()) {
            if (!this.E) {
                this.o.z();
                this.o.A();
                this.E = true;
            }
            C0();
            z = true;
        }
        K0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzbha zzbhaVar;
        synchronized (this) {
            if (!l()) {
                this.Q.b();
            }
            super.onDetachedFromWindow();
            if (this.E && (zzbhaVar = this.o) != null && zzbhaVar.y() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.o.z();
                this.o.A();
                this.E = false;
            }
        }
        K0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzk.zzlg();
            zzaxi.i(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzbad.e(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (l()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean C0 = C0();
        com.google.android.gms.ads.internal.overlay.zzd k0 = k0();
        if (k0 == null || !C0) {
            return;
        }
        k0.zztk();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0084, B:45:0x0080, B:47:0x0091, B:49:0x0099, B:51:0x00ab, B:54:0x00b2, B:56:0x00ce, B:57:0x00d7, B:60:0x00d3, B:61:0x00dc, B:64:0x00e1, B:66:0x00e9, B:69:0x00f4, B:76:0x011a, B:78:0x0121, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:94:0x015d, B:96:0x01aa, B:97:0x01ae, B:99:0x01b5, B:104:0x01c0, B:106:0x01c6, B:107:0x01c9, B:109:0x01cd, B:110:0x01d6, B:114:0x01e1), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b A[Catch: all -> 0x01e6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0084, B:45:0x0080, B:47:0x0091, B:49:0x0099, B:51:0x00ab, B:54:0x00b2, B:56:0x00ce, B:57:0x00d7, B:60:0x00d3, B:61:0x00dc, B:64:0x00e1, B:66:0x00e9, B:69:0x00f4, B:76:0x011a, B:78:0x0121, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:94:0x015d, B:96:0x01aa, B:97:0x01ae, B:99:0x01b5, B:104:0x01c0, B:106:0x01c6, B:107:0x01c9, B:109:0x01cd, B:110:0x01d6, B:114:0x01e1), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d A[Catch: all -> 0x01e6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0084, B:45:0x0080, B:47:0x0091, B:49:0x0099, B:51:0x00ab, B:54:0x00b2, B:56:0x00ce, B:57:0x00d7, B:60:0x00d3, B:61:0x00dc, B:64:0x00e1, B:66:0x00e9, B:69:0x00f4, B:76:0x011a, B:78:0x0121, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:94:0x015d, B:96:0x01aa, B:97:0x01ae, B:99:0x01b5, B:104:0x01c0, B:106:0x01c6, B:107:0x01c9, B:109:0x01cd, B:110:0x01d6, B:114:0x01e1), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void onPause() {
        if (l()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e2) {
            zzbad.c("Could not pause webview.", e2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void onResume() {
        if (l()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e2) {
            zzbad.c("Could not resume webview.", e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.o.y()) {
            synchronized (this) {
                zzadx zzadxVar = this.F;
                if (zzadxVar != null) {
                    zzadxVar.b(motionEvent);
                }
            }
        } else {
            zzdh zzdhVar = this.f11144g;
            if (zzdhVar != null) {
                zzdhVar.c(motionEvent);
            }
        }
        if (l()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final /* synthetic */ zzbii p() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean p0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final synchronized String r() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void r0(zzud zzudVar) {
        boolean z;
        synchronized (this) {
            z = zzudVar.m;
            this.D = z;
        }
        K0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized boolean s() {
        return this.H > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd s0() {
        return this.O;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.N = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void setRequestedOrientation(int i2) {
        this.y = i2;
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.p;
        if (zzdVar != null) {
            zzdVar.setRequestedOrientation(i2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbha) {
            this.o = (zzbha) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (l()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            zzbad.c("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void t(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        zzbha zzbhaVar = this.o;
        if (zzbhaVar != null) {
            zzbhaVar.u(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized boolean t0() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized String v() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void v0(boolean z) {
        this.o.E(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final boolean w(final boolean z, final int i2) {
        destroy();
        this.a0.a(new zzwk(z, i2) { // from class: com.google.android.gms.internal.ads.cb
            private final boolean a;

            /* renamed from: b, reason: collision with root package name */
            private final int f11237b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = z;
                this.f11237b = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            public final void a(zzxn zzxnVar) {
                bb.B0(this.a, this.f11237b, zzxnVar);
            }
        });
        this.a0.b(zzwl.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void w0(boolean z, int i2, String str, String str2) {
        this.o.x(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void x(boolean z) {
        this.o.F(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void x0(zzadx zzadxVar) {
        this.F = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void y(String str, Map<String, ?> map) {
        try {
            j(str, zzk.zzlg().Y(map));
        } catch (JSONException unused) {
            zzbad.i("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final WebViewClient z() {
        return this.o;
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final synchronized void zzlc() {
        this.A = true;
        zzj zzjVar = this.f11146i;
        if (zzjVar != null) {
            zzjVar.zzlc();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final synchronized void zzld() {
        this.A = false;
        zzj zzjVar = this.f11146i;
        if (zzjVar != null) {
            zzjVar.zzld();
        }
    }
}
