package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacu;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyt;
import java.util.Collections;
import okhttp3.internal.http2.Http2Connection;

@zzard
/* loaded from: classes2.dex */
public class zzd extends zzaqh implements zzx {

    @VisibleForTesting
    private static final int zzdjk = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;

    @VisibleForTesting
    AdOverlayInfoParcel zzdjl;

    @VisibleForTesting
    zzbgz zzdjm;

    @VisibleForTesting
    private zzj zzdjn;

    @VisibleForTesting
    private zzp zzdjo;

    @VisibleForTesting
    private FrameLayout zzdjq;

    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzdjr;

    @VisibleForTesting
    private zzi zzdju;
    private Runnable zzdjy;
    private boolean zzdjz;
    private boolean zzdka;

    @VisibleForTesting
    private boolean zzdjp = false;

    @VisibleForTesting
    private boolean zzdjs = false;

    @VisibleForTesting
    private boolean zzdjt = false;

    @VisibleForTesting
    private boolean zzdjv = false;

    @VisibleForTesting
    int zzdjw = 0;
    private final Object zzdjx = new Object();
    private boolean zzdkb = false;
    private boolean zzdkc = false;
    private boolean zzdkd = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    private final void zzad(boolean z) throws zzh {
        if (!this.zzdka) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window = this.mActivity.getWindow();
        if (window != null) {
            zzbgz zzbgzVar = this.zzdjl.zzdbs;
            zzbii p = zzbgzVar != null ? zzbgzVar.p() : null;
            boolean z2 = p != null && p.m();
            this.zzdjv = false;
            if (z2) {
                int i2 = this.zzdjl.orientation;
                com.google.android.gms.ads.internal.zzk.zzli();
                if (i2 == 6) {
                    this.zzdjv = this.mActivity.getResources().getConfiguration().orientation == 1;
                } else {
                    int i3 = this.zzdjl.orientation;
                    com.google.android.gms.ads.internal.zzk.zzli();
                    if (i3 == 7) {
                        this.zzdjv = this.mActivity.getResources().getConfiguration().orientation == 2;
                    }
                }
            }
            boolean z3 = this.zzdjv;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z3);
            zzbad.e(sb.toString());
            setRequestedOrientation(this.zzdjl.orientation);
            com.google.android.gms.ads.internal.zzk.zzli();
            window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            zzbad.e("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzdjt) {
                this.zzdju.setBackgroundColor(-16777216);
            } else {
                this.zzdju.setBackgroundColor(zzdjk);
            }
            this.mActivity.setContentView(this.zzdju);
            this.zzdka = true;
            if (z) {
                try {
                    com.google.android.gms.ads.internal.zzk.zzlh();
                    Activity activity = this.mActivity;
                    zzbgz zzbgzVar2 = this.zzdjl.zzdbs;
                    zzbin o = zzbgzVar2 != null ? zzbgzVar2.o() : null;
                    zzbgz zzbgzVar3 = this.zzdjl.zzdbs;
                    String v = zzbgzVar3 != null ? zzbgzVar3.v() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
                    zzbai zzbaiVar = adOverlayInfoParcel.zzbtc;
                    zzbgz zzbgzVar4 = adOverlayInfoParcel.zzdbs;
                    zzbgz b2 = zzbhf.b(activity, o, v, true, z2, null, zzbaiVar, null, null, zzbgzVar4 != null ? zzbgzVar4.c() : null, zzwj.f());
                    this.zzdjm = b2;
                    zzbii p2 = b2.p();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
                    zzagv zzagvVar = adOverlayInfoParcel2.zzczo;
                    zzagx zzagxVar = adOverlayInfoParcel2.zzczp;
                    zzu zzuVar = adOverlayInfoParcel2.zzdkq;
                    zzbgz zzbgzVar5 = adOverlayInfoParcel2.zzdbs;
                    p2.c(null, zzagvVar, null, zzagxVar, zzuVar, true, null, zzbgzVar5 != null ? zzbgzVar5.p().o() : null, null, null);
                    this.zzdjm.p().i(new zzbij(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                        private final zzd zzdke;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdke = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbij
                        public final void zzae(boolean z4) {
                            zzbgz zzbgzVar6 = this.zzdke.zzdjm;
                            if (zzbgzVar6 != null) {
                                zzbgzVar6.c0();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzdjl;
                    String str = adOverlayInfoParcel3.url;
                    if (str != null) {
                        this.zzdjm.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.zzdkp;
                        if (str2 != null) {
                            this.zzdjm.loadDataWithBaseURL(adOverlayInfoParcel3.zzdkn, str2, "text/html", "UTF-8", null);
                        } else {
                            throw new zzh("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzbgz zzbgzVar6 = this.zzdjl.zzdbs;
                    if (zzbgzVar6 != null) {
                        zzbgzVar6.a0(this);
                    }
                } catch (Exception e2) {
                    zzbad.c("Error obtaining webview.", e2);
                    throw new zzh("Could not obtain webview for the overlay.");
                }
            } else {
                zzbgz zzbgzVar7 = this.zzdjl.zzdbs;
                this.zzdjm = zzbgzVar7;
                zzbgzVar7.W(this.mActivity);
            }
            this.zzdjm.h0(this);
            zzbgz zzbgzVar8 = this.zzdjl.zzdbs;
            if (zzbgzVar8 != null) {
                zzb(zzbgzVar8.Z(), this.zzdju);
            }
            ViewParent parent = this.zzdjm.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdjm.getView());
            }
            if (this.zzdjt) {
                this.zzdjm.e0();
            }
            this.zzdju.addView(this.zzdjm.getView(), -1, -1);
            if (!z && !this.zzdjv) {
                zztl();
            }
            zzac(z2);
            if (this.zzdjm.F()) {
                zza(z2, true);
                return;
            }
            return;
        }
        throw new zzh("Invalid activity, no window available.");
    }

    private static void zzb(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzk.zzlv().d(iObjectWrapper, view);
    }

    private final void zzti() {
        if (!this.mActivity.isFinishing() || this.zzdkb) {
            return;
        }
        this.zzdkb = true;
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar != null) {
            zzbgzVar.b0(this.zzdjw);
            synchronized (this.zzdjx) {
                if (!this.zzdjz && this.zzdjm.s()) {
                    Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        private final zzd zzdke;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdke = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdke.zztj();
                        }
                    };
                    this.zzdjy = runnable;
                    zzaxi.a.postDelayed(runnable, ((Long) zzyt.e().c(zzacu.k1)).longValue());
                    return;
                }
            }
        }
        zztj();
    }

    private final void zztl() {
        this.zzdjm.c0();
    }

    public final void close() {
        this.zzdjw = 2;
        this.mActivity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onBackPressed() {
        this.zzdjw = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public void onCreate(Bundle bundle) {
        zzxr zzxrVar;
        this.mActivity.requestWindowFeature(1);
        this.zzdjs = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            this.zzdjl = zzc;
            if (zzc != null) {
                if (zzc.zzbtc.f13152h > 7500000) {
                    this.zzdjw = 3;
                }
                if (this.mActivity.getIntent() != null) {
                    this.zzdkd = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                com.google.android.gms.ads.internal.zzh zzhVar = this.zzdjl.zzdkt;
                if (zzhVar != null) {
                    this.zzdjt = zzhVar.zzbre;
                } else {
                    this.zzdjt = false;
                }
                if (this.zzdjt && zzhVar.zzbrj != -1) {
                    new zzk(this).zzvi();
                }
                if (bundle == null) {
                    zzo zzoVar = this.zzdjl.zzdkm;
                    if (zzoVar != null && this.zzdkd) {
                        zzoVar.zzta();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
                    if (adOverlayInfoParcel.zzdkr != 1 && (zzxrVar = adOverlayInfoParcel.zzcgi) != null) {
                        zzxrVar.onAdClicked();
                    }
                }
                Activity activity = this.mActivity;
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
                zzi zziVar = new zzi(activity, adOverlayInfoParcel2.zzdks, adOverlayInfoParcel2.zzbtc.f13150f);
                this.zzdju = zziVar;
                zziVar.setId(1000);
                com.google.android.gms.ads.internal.zzk.zzli().r(this.mActivity);
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzdjl;
                int i2 = adOverlayInfoParcel3.zzdkr;
                if (i2 == 1) {
                    zzad(false);
                    return;
                }
                if (i2 == 2) {
                    this.zzdjn = new zzj(adOverlayInfoParcel3.zzdbs);
                    zzad(false);
                    return;
                } else {
                    if (i2 == 3) {
                        zzad(true);
                        return;
                    }
                    throw new zzh("Could not determine ad overlay type.");
                }
            }
            throw new zzh("Could not get info for ad overlay.");
        } catch (zzh e2) {
            zzbad.i(e2.getMessage());
            this.zzdjw = 3;
            this.mActivity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onDestroy() {
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar != null) {
            this.zzdju.removeView(zzbgzVar.getView());
        }
        zzti();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onPause() {
        zzte();
        zzo zzoVar = this.zzdjl.zzdkm;
        if (zzoVar != null) {
            zzoVar.onPause();
        }
        if (!((Boolean) zzyt.e().c(zzacu.P3)).booleanValue() && this.zzdjm != null && (!this.mActivity.isFinishing() || this.zzdjn == null)) {
            com.google.android.gms.ads.internal.zzk.zzli();
            zzaxo.l(this.zzdjm);
        }
        zzti();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onRestart() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onResume() {
        zzo zzoVar = this.zzdjl.zzdkm;
        if (zzoVar != null) {
            zzoVar.onResume();
        }
        zza(this.mActivity.getResources().getConfiguration());
        if (((Boolean) zzyt.e().c(zzacu.P3)).booleanValue()) {
            return;
        }
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar != null && !zzbgzVar.l()) {
            com.google.android.gms.ads.internal.zzk.zzli();
            zzaxo.p(this.zzdjm);
        } else {
            zzbad.i("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjs);
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStart() {
        if (((Boolean) zzyt.e().c(zzacu.P3)).booleanValue()) {
            zzbgz zzbgzVar = this.zzdjm;
            if (zzbgzVar != null && !zzbgzVar.l()) {
                com.google.android.gms.ads.internal.zzk.zzli();
                zzaxo.p(this.zzdjm);
            } else {
                zzbad.i("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStop() {
        if (((Boolean) zzyt.e().c(zzacu.P3)).booleanValue() && this.zzdjm != null && (!this.mActivity.isFinishing() || this.zzdjn == null)) {
            com.google.android.gms.ads.internal.zzk.zzli();
            zzaxo.l(this.zzdjm);
        }
        zzti();
    }

    public final void setRequestedOrientation(int i2) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) zzyt.e().c(zzacu.N4)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) zzyt.e().c(zzacu.O4)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) zzyt.e().c(zzacu.P4)).intValue()) {
                    if (i3 <= ((Integer) zzyt.e().c(zzacu.Q4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.mActivity.setRequestedOrientation(i2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzk.zzlk().h(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzh zzhVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzh zzhVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzyt.e().c(zzacu.l1)).booleanValue() && (adOverlayInfoParcel2 = this.zzdjl) != null && (zzhVar2 = adOverlayInfoParcel2.zzdkt) != null && zzhVar2.zzbrl;
        boolean z5 = ((Boolean) zzyt.e().c(zzacu.m1)).booleanValue() && (adOverlayInfoParcel = this.zzdjl) != null && (zzhVar = adOverlayInfoParcel.zzdkt) != null && zzhVar.zzbrm;
        if (z && z2 && z4 && !z5) {
            new zzaqb(this.zzdjm, "useCustomClose").e("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzp zzpVar = this.zzdjo;
        if (zzpVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzpVar.zzaf(z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzac(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzdd() {
        this.zzdka = true;
    }

    public final void zzte() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
        if (adOverlayInfoParcel != null && this.zzdjp) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdjq != null) {
            this.mActivity.setContentView(this.zzdju);
            this.zzdka = true;
            this.zzdjq.removeAllViews();
            this.zzdjq = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdjr;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdjr = null;
        }
        this.zzdjp = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zztf() {
        this.zzdjw = 1;
        this.mActivity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final boolean zztg() {
        this.zzdjw = 0;
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar == null) {
            return true;
        }
        boolean t0 = zzbgzVar.t0();
        if (!t0) {
            this.zzdjm.y("onbackblocked", Collections.emptyMap());
        }
        return t0;
    }

    public final void zzth() {
        this.zzdju.removeView(this.zzdjo);
        zzac(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zztj() {
        zzbgz zzbgzVar;
        zzo zzoVar;
        if (this.zzdkc) {
            return;
        }
        this.zzdkc = true;
        zzbgz zzbgzVar2 = this.zzdjm;
        if (zzbgzVar2 != null) {
            this.zzdju.removeView(zzbgzVar2.getView());
            zzj zzjVar = this.zzdjn;
            if (zzjVar != null) {
                this.zzdjm.W(zzjVar.zzlj);
                this.zzdjm.j0(false);
                ViewGroup viewGroup = this.zzdjn.parent;
                View view = this.zzdjm.getView();
                zzj zzjVar2 = this.zzdjn;
                viewGroup.addView(view, zzjVar2.index, zzjVar2.zzdkh);
                this.zzdjn = null;
            } else if (this.mActivity.getApplicationContext() != null) {
                this.zzdjm.W(this.mActivity.getApplicationContext());
            }
            this.zzdjm = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzdkm) != null) {
            zzoVar.zzsz();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
        if (adOverlayInfoParcel2 == null || (zzbgzVar = adOverlayInfoParcel2.zzdbs) == null) {
            return;
        }
        zzb(zzbgzVar.Z(), this.zzdjl.zzdbs.getView());
    }

    public final void zztk() {
        if (this.zzdjv) {
            this.zzdjv = false;
            zztl();
        }
    }

    public final void zztm() {
        this.zzdju.zzdkg = true;
    }

    public final void zztn() {
        synchronized (this.zzdjx) {
            this.zzdjz = true;
            Runnable runnable = this.zzdjy;
            if (runnable != null) {
                Handler handler = zzaxi.a;
                handler.removeCallbacks(runnable);
                handler.post(this.zzdjy);
            }
        }
    }

    private final void zzac(boolean z) {
        int intValue = ((Integer) zzyt.e().c(zzacu.R3)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.size = 50;
        zzqVar.paddingLeft = z ? intValue : 0;
        zzqVar.paddingRight = z ? 0 : intValue;
        zzqVar.paddingTop = 0;
        zzqVar.paddingBottom = intValue;
        this.zzdjo = new zzp(this.mActivity, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdjl.zzdko);
        this.zzdju.addView(this.zzdjo, layoutParams);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.mActivity);
        this.zzdjq = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzdjq.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzdjq);
        this.zzdka = true;
        this.zzdjr = customViewCallback;
        this.zzdjp = true;
    }

    private final void zza(Configuration configuration) {
        com.google.android.gms.ads.internal.zzh zzhVar;
        com.google.android.gms.ads.internal.zzh zzhVar2 = this.zzdjl.zzdkt;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = zzhVar2 != null && zzhVar2.zzbrf;
        boolean j2 = com.google.android.gms.ads.internal.zzk.zzli().j(this.mActivity, configuration);
        if ((this.zzdjt && !z3) || j2) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (zzhVar = this.zzdjl.zzdkt) != null && zzhVar.zzbrk) {
            z2 = true;
        }
        Window window = this.mActivity.getWindow();
        if (((Boolean) zzyt.e().c(zzacu.n1)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i2 = 256;
            if (z) {
                i2 = 5380;
                if (z2) {
                    i2 = 5894;
                }
            }
            decorView.setSystemUiVisibility(i2);
            return;
        }
        if (z) {
            window.addFlags(1024);
            window.clearFlags(RecyclerView.l.FLAG_MOVED);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(4098);
            return;
        }
        window.addFlags(RecyclerView.l.FLAG_MOVED);
        window.clearFlags(1024);
    }
}
