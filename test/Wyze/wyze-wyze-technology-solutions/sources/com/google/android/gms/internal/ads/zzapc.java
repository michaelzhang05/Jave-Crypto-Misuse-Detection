package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzapc extends zzaow {

    /* renamed from: f, reason: collision with root package name */
    private final RtbAdapter f12852f;

    /* renamed from: g, reason: collision with root package name */
    private MediationInterstitialAd f12853g;

    /* renamed from: h, reason: collision with root package name */
    private MediationRewardedAd f12854h;

    public zzapc(RtbAdapter rtbAdapter) {
        this.f12852f = rtbAdapter;
    }

    private static String K7(String str, zzxz zzxzVar) {
        String str2 = zzxzVar.z;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private static boolean L7(zzxz zzxzVar) {
        if (zzxzVar.f15796k) {
            return true;
        }
        zzyt.a();
        return zzazt.v();
    }

    private final Bundle M7(zzxz zzxzVar) {
        Bundle bundle;
        Bundle bundle2 = zzxzVar.r;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f12852f.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static Bundle N7(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbad.i(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final boolean B2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.f12854h;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.R(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void R4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaoj zzaojVar, zzamv zzamvVar, zzyd zzydVar) throws RemoteException {
        try {
            this.f12852f.loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.R(iObjectWrapper), str, N7(str2), M7(zzxzVar), L7(zzxzVar), zzxzVar.p, zzxzVar.l, zzxzVar.y, K7(str2, zzxzVar), com.google.android.gms.ads.zzb.zza(zzydVar.f15814j, zzydVar.f15811g, zzydVar.f15810f)), new z2(this, zzaojVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.c("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void T6(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaom zzaomVar, zzamv zzamvVar) throws RemoteException {
        try {
            this.f12852f.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.R(iObjectWrapper), str, N7(str2), M7(zzxzVar), L7(zzxzVar), zzxzVar.p, zzxzVar.l, zzxzVar.y, K7(str2, zzxzVar)), new a3(this, zzaomVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.c("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void e4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzamv zzamvVar) throws RemoteException {
        try {
            this.f12852f.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.R(iObjectWrapper), str, N7(str2), M7(zzxzVar), L7(zzxzVar), zzxzVar.p, zzxzVar.l, zzxzVar.y, K7(str2, zzxzVar)), new c3(this, zzaopVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzaar getVideoController() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f12852f;
        if (!(mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void k3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final boolean l2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.f12853g;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.R(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void p3(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzydVar, zzaoy zzaoyVar) throws RemoteException {
        AdFormat adFormat;
        try {
            d3 d3Var = new d3(this, zzaoyVar);
            RtbAdapter rtbAdapter = this.f12852f;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c2 == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c2 == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c2 == 3) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.R(iObjectWrapper), new MediationConfiguration(adFormat, bundle2), bundle, com.google.android.gms.ads.zzb.zza(zzydVar.f15814j, zzydVar.f15811g, zzydVar.f15810f)), d3Var);
        } catch (Throwable th) {
            zzbad.c("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void s5(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamv zzamvVar) throws RemoteException {
        try {
            this.f12852f.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.R(iObjectWrapper), str, N7(str2), M7(zzxzVar), L7(zzxzVar), zzxzVar.p, zzxzVar.l, zzxzVar.y, K7(str2, zzxzVar)), new b3(this, zzaosVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzapj s6() throws RemoteException {
        return zzapj.w(this.f12852f.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzapj t5() throws RemoteException {
        return zzapj.w(this.f12852f.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void u5(String[] strArr, Bundle[] bundleArr) {
    }
}
