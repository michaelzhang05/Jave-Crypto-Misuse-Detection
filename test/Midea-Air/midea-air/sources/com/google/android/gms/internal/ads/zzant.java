package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.e;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzant<NETWORK_EXTRAS extends com.google.ads.mediation.e, SERVER_PARAMETERS extends MediationServerParameters> extends zzamt {

    /* renamed from: f, reason: collision with root package name */
    private final com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> f12849f;

    /* renamed from: g, reason: collision with root package name */
    private final NETWORK_EXTRAS f12850g;

    public zzant(com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f12849f = bVar;
        this.f12850g = network_extras;
    }

    private static boolean H7(zzxz zzxzVar) {
        if (zzxzVar.f15796k) {
            return true;
        }
        zzyt.a();
        return zzazt.v();
    }

    private final SERVER_PARAMETERS I7(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f12849f.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
            newInstance.a(hashMap);
            return newInstance;
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzana B7() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzang D1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void G2(zzxz zzxzVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void H6(zzxz zzxzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void K3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void M4(IObjectWrapper iObjectWrapper, zzaiq zzaiqVar, List<zzaiw> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void O4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void Q2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        u6(iObjectWrapper, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void W1(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void X4(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void Z3(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void destroy() throws RemoteException {
        try {
            this.f12849f.destroy();
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void g4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzaar getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final IObjectWrapper l1() throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f12849f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.i0(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void m2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        w4(iObjectWrapper, zzydVar, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean s3() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showInterstitial() throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f12849f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbad.e("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f12849f).showInterstitial();
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzafe t2() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle t4() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void u6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f12849f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbad.e("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f12849f).requestInterstitialAd(new zzanu(zzamvVar), (Activity) ObjectWrapper.R(iObjectWrapper), I7(str), zzaog.b(zzxzVar, H7(zzxzVar)), this.f12850g);
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void w4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        e.e.a.c cVar;
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f12849f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbad.e("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f12849f;
            zzanu zzanuVar = new zzanu(zzamvVar);
            Activity activity = (Activity) ObjectWrapper.R(iObjectWrapper);
            SERVER_PARAMETERS I7 = I7(str);
            int i2 = 0;
            e.e.a.c[] cVarArr = {e.e.a.c.a, e.e.a.c.f17411b, e.e.a.c.f17412c, e.e.a.c.f17413d, e.e.a.c.f17414e, e.e.a.c.f17415f};
            while (true) {
                if (i2 < 6) {
                    if (cVarArr[i2].b() == zzydVar.f15814j && cVarArr[i2].a() == zzydVar.f15811g) {
                        cVar = cVarArr[i2];
                        break;
                    }
                    i2++;
                } else {
                    cVar = new e.e.a.c(com.google.android.gms.ads.zzb.zza(zzydVar.f15814j, zzydVar.f15811g, zzydVar.f15810f));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanuVar, activity, I7, cVar, zzaog.b(zzxzVar, H7(zzxzVar)), this.f12850g);
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzand w6() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle zzsh() {
        return new Bundle();
    }
}
