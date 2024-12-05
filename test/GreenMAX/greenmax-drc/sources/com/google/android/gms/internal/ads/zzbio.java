package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import cm.aptoide.pt.dataprovider.BuildConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.File;
import okhttp3.HttpUrl;

@VisibleForTesting
@zzard
/* loaded from: classes2.dex */
public final class zzbio extends zzbiz implements zzbii {
    private View.OnAttachStateChangeListener A;

    /* renamed from: d, reason: collision with root package name */
    protected zzbgz f13297d;

    /* renamed from: g, reason: collision with root package name */
    private zzxr f13300g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.zzo f13301h;

    /* renamed from: i, reason: collision with root package name */
    private zzbij f13302i;

    /* renamed from: j, reason: collision with root package name */
    private zzbik f13303j;

    /* renamed from: k, reason: collision with root package name */
    private zzagv f13304k;
    private zzagx l;
    private zzbil m;
    private volatile boolean o;
    private boolean p;
    private boolean q;
    private com.google.android.gms.ads.internal.overlay.zzu r;
    private zzaqa s;
    private com.google.android.gms.ads.internal.zzb t;
    private zzapr u;
    private zzavb v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    /* renamed from: f, reason: collision with root package name */
    private final Object f13299f = new Object();
    private boolean n = false;

    /* renamed from: e, reason: collision with root package name */
    private final zzaju<zzbgz> f13298e = new zzaju<>();

    private final void H() {
        if (this.A == null) {
            return;
        }
        this.f13297d.getView().removeOnAttachStateChangeListener(this.A);
    }

    private final void I() {
        zzbij zzbijVar = this.f13302i;
        if (zzbijVar != null && ((this.w && this.y <= 0) || this.x)) {
            zzbijVar.zzae(!this.x);
            this.f13302i = null;
        }
        this.f13297d.I();
    }

    private static WebResourceResponse J() {
        if (((Boolean) zzyt.e().c(zzacu.T0)).booleanValue()) {
            return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        com.google.android.gms.ads.internal.zzk.zzlg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        return com.google.android.gms.internal.ads.zzaxi.M(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse O(com.google.android.gms.internal.ads.zzbja r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbio.O(com.google.android.gms.internal.ads.zzbja):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(View view, zzavb zzavbVar, int i2) {
        if (!zzavbVar.g() || i2 <= 0) {
            return;
        }
        zzavbVar.f(view);
        if (zzavbVar.g()) {
            zzaxi.a.postDelayed(new kb(this, view, zzavbVar, i2), 100L);
        }
    }

    private final void w(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzapr zzaprVar = this.u;
        boolean k2 = zzaprVar != null ? zzaprVar.k() : false;
        zzk.zzlf();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.f13297d.getContext(), adOverlayInfoParcel, !k2);
        zzavb zzavbVar = this.v;
        if (zzavbVar != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzcVar = adOverlayInfoParcel.zzdkl) != null) {
                str = zzcVar.url;
            }
            zzavbVar.b(str);
        }
    }

    public final void A(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        this.f13298e.t(str, predicate);
    }

    public final void B(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f13298e.f(str, zzahoVar);
    }

    public final void C(boolean z, int i2, String str) {
        boolean m = this.f13297d.m();
        zzxr zzxrVar = (!m || this.f13297d.o().e()) ? this.f13300g : null;
        mb mbVar = m ? null : new mb(this.f13297d, this.f13301h);
        zzagv zzagvVar = this.f13304k;
        zzagx zzagxVar = this.l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.r;
        zzbgz zzbgzVar = this.f13297d;
        w(new AdOverlayInfoParcel(zzxrVar, mbVar, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, zzbgzVar.b()));
    }

    public final void D(boolean z, int i2, String str, String str2) {
        boolean m = this.f13297d.m();
        zzxr zzxrVar = (!m || this.f13297d.o().e()) ? this.f13300g : null;
        mb mbVar = m ? null : new mb(this.f13297d, this.f13301h);
        zzagv zzagvVar = this.f13304k;
        zzagx zzagxVar = this.l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.r;
        zzbgz zzbgzVar = this.f13297d;
        w(new AdOverlayInfoParcel(zzxrVar, mbVar, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, str2, zzbgzVar.b()));
    }

    public final boolean E() {
        boolean z;
        synchronized (this.f13299f) {
            z = this.p;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener F() {
        synchronized (this.f13299f) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener G() {
        synchronized (this.f13299f) {
        }
        return null;
    }

    public final void K(boolean z) {
        this.n = z;
    }

    public final void L(boolean z) {
        this.z = z;
    }

    public final void M(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f13298e.i(str, zzahoVar);
    }

    public final void N(boolean z, int i2) {
        zzxr zzxrVar = (!this.f13297d.m() || this.f13297d.o().e()) ? this.f13300g : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f13301h;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.r;
        zzbgz zzbgzVar = this.f13297d;
        w(new AdOverlayInfoParcel(zzxrVar, zzoVar, zzuVar, zzbgzVar, z, i2, zzbgzVar.b()));
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void a(Uri uri) {
        this.f13298e.y0(uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void b(boolean z) {
        synchronized (this.f13299f) {
            this.p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void c(zzxr zzxrVar, zzagv zzagvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagx zzagxVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar, boolean z, zzahp zzahpVar, com.google.android.gms.ads.internal.zzb zzbVar, zzaqc zzaqcVar, zzavb zzavbVar) {
        if (zzbVar == null) {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.f13297d.getContext(), zzavbVar, null);
        }
        this.u = new zzapr(this.f13297d, zzaqcVar);
        this.v = zzavbVar;
        if (((Boolean) zzyt.e().c(zzacu.c1)).booleanValue()) {
            B("/adMetadata", new zzagu(zzagvVar));
        }
        B("/appEvent", new zzagw(zzagxVar));
        B("/backButton", zzagz.f12720j);
        B("/refresh", zzagz.f12721k);
        B("/canOpenURLs", zzagz.a);
        B("/canOpenIntents", zzagz.f12712b);
        B("/click", zzagz.f12713c);
        B("/close", zzagz.f12714d);
        B("/customClose", zzagz.f12715e);
        B("/instrument", zzagz.n);
        B("/delayPageLoaded", zzagz.p);
        B("/delayPageClosed", zzagz.q);
        B("/getLocationInfo", zzagz.r);
        B("/httpTrack", zzagz.f12716f);
        B("/log", zzagz.f12717g);
        B("/mraid", new zzahr(zzbVar, this.u, zzaqcVar));
        B("/mraidLoaded", this.s);
        B("/open", new zzahs(zzbVar, this.u));
        B("/precache", new zzbgc());
        B("/touch", zzagz.f12719i);
        B("/video", zzagz.l);
        B("/videoMeta", zzagz.m);
        if (zzk.zzme().D(this.f13297d.getContext())) {
            B("/logScionEvent", new zzahq(this.f13297d.getContext()));
        }
        this.f13300g = zzxrVar;
        this.f13301h = zzoVar;
        this.f13304k = zzagvVar;
        this.l = zzagxVar;
        this.r = zzuVar;
        this.t = zzbVar;
        this.n = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void d() {
        synchronized (this.f13299f) {
            this.n = false;
            this.o = true;
            zzbbm.a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jb

                /* renamed from: f, reason: collision with root package name */
                private final zzbio f11641f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11641f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbio zzbioVar = this.f11641f;
                    zzbioVar.f13297d.C();
                    com.google.android.gms.ads.internal.overlay.zzd k0 = zzbioVar.f13297d.k0();
                    if (k0 != null) {
                        k0.zzth();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void e() {
        zzavb zzavbVar = this.v;
        if (zzavbVar != null) {
            WebView webView = this.f13297d.getWebView();
            if (androidx.core.view.u.N(webView)) {
                v(webView, zzavbVar, 10);
                return;
            }
            H();
            this.A = new lb(this, zzavbVar);
            this.f13297d.getView().addOnAttachStateChangeListener(this.A);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void f() {
        synchronized (this.f13299f) {
            this.q = true;
        }
        this.y++;
        I();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void g(int i2, int i3) {
        zzapr zzaprVar = this.u;
        if (zzaprVar != null) {
            zzaprVar.j(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void h() {
        this.y--;
        I();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void i(zzbij zzbijVar) {
        this.f13302i = zzbijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void j(zzbik zzbikVar) {
        this.f13303j = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void k() {
        this.x = true;
        I();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void l(int i2, int i3, boolean z) {
        this.s.h(i2, i3);
        zzapr zzaprVar = this.u;
        if (zzaprVar != null) {
            zzaprVar.h(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final boolean m() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzavb n() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final com.google.android.gms.ads.internal.zzb o() {
        return this.t;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f13297d.w(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void p(zzbja zzbjaVar) {
        this.w = true;
        zzbik zzbikVar = this.f13303j;
        if (zzbikVar != null) {
            zzbikVar.a();
            this.f13303j = null;
        }
        I();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void r(zzbja zzbjaVar) {
        this.f13298e.w0(zzbjaVar.f13307b);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final boolean s(zzbja zzbjaVar) {
        String valueOf = String.valueOf(zzbjaVar.a);
        zzawz.m(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbjaVar.f13307b;
        if (this.f13298e.w0(uri)) {
            return true;
        }
        if (this.n) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                zzxr zzxrVar = this.f13300g;
                if (zzxrVar != null) {
                    zzxrVar.onAdClicked();
                    zzavb zzavbVar = this.v;
                    if (zzavbVar != null) {
                        zzavbVar.b(zzbjaVar.a);
                    }
                    this.f13300g = null;
                }
                return false;
            }
        }
        if (!this.f13297d.getWebView().willNotDraw()) {
            try {
                zzdh d2 = this.f13297d.d();
                if (d2 != null && d2.e(uri)) {
                    uri = d2.a(uri, this.f13297d.getContext(), this.f13297d.getView(), this.f13297d.a());
                }
            } catch (zzdi unused) {
                String valueOf2 = String.valueOf(zzbjaVar.a);
                zzbad.i(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.zzb zzbVar = this.t;
            if (zzbVar != null && !zzbVar.zzkx()) {
                this.t.zzbk(zzbjaVar.a);
            } else {
                x(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            }
        } else {
            String valueOf3 = String.valueOf(zzbjaVar.a);
            zzbad.i(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final WebResourceResponse t(zzbja zzbjaVar) {
        String str;
        WebResourceResponse L;
        zzvs d2;
        zzavb zzavbVar = this.v;
        if (zzavbVar != null) {
            zzavbVar.a(zzbjaVar.a, zzbjaVar.f13309d, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(zzbjaVar.a).getName())) {
            d();
            if (this.f13297d.o().e()) {
                str = (String) zzyt.e().c(zzacu.b0);
            } else if (this.f13297d.m()) {
                str = (String) zzyt.e().c(zzacu.a0);
            } else {
                str = (String) zzyt.e().c(zzacu.Z);
            }
            zzk.zzlg();
            L = zzaxi.L(this.f13297d.getContext(), this.f13297d.b().f13150f, str);
        } else {
            L = null;
        }
        if (L != null) {
            return L;
        }
        try {
            if (!zzavx.c(zzbjaVar.a, this.f13297d.getContext(), this.z).equals(zzbjaVar.a)) {
                return O(zzbjaVar);
            }
            zzvv w = zzvv.w(zzbjaVar.a);
            if (w != null && (d2 = zzk.zzlm().d(w)) != null && d2.w()) {
                return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, d2.z());
            }
            if (zzazx.a()) {
                if (((Boolean) zzyt.e().c(zzacu.J1)).booleanValue()) {
                    return O(zzbjaVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            zzk.zzlk().e(e2, "AdWebViewClient.interceptRequest");
            return J();
        }
    }

    public final void u() {
        zzavb zzavbVar = this.v;
        if (zzavbVar != null) {
            zzavbVar.c();
            this.v = null;
        }
        H();
        this.f13298e.B();
        this.f13298e.r0(null);
        synchronized (this.f13299f) {
            this.f13300g = null;
            this.f13301h = null;
            this.f13302i = null;
            this.f13303j = null;
            this.f13304k = null;
            this.l = null;
            this.r = null;
            this.m = null;
            zzapr zzaprVar = this.u;
            if (zzaprVar != null) {
                zzaprVar.l(true);
                this.u = null;
            }
        }
    }

    public final void x(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        boolean m = this.f13297d.m();
        w(new AdOverlayInfoParcel(zzcVar, (!m || this.f13297d.o().e()) ? this.f13300g : null, m ? null : this.f13301h, this.r, this.f13297d.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(zzbgz zzbgzVar, boolean z) {
        zzaqa zzaqaVar = new zzaqa(zzbgzVar, zzbgzVar.d0(), new zzacf(zzbgzVar.getContext()));
        this.f13297d = zzbgzVar;
        this.o = z;
        this.s = zzaqaVar;
        this.u = null;
        this.f13298e.r0(zzbgzVar);
    }
}
