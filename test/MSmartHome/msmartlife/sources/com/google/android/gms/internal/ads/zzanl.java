package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzanl extends zzamt {

    /* renamed from: f, reason: collision with root package name */
    private final Object f12827f;

    /* renamed from: g, reason: collision with root package name */
    private zzano f12828g;

    /* renamed from: h, reason: collision with root package name */
    private zzatk f12829h;

    /* renamed from: i, reason: collision with root package name */
    private IObjectWrapper f12830i;

    /* renamed from: j, reason: collision with root package name */
    private MediationRewardedAd f12831j;

    public zzanl(MediationAdapter mediationAdapter) {
        this.f12827f = mediationAdapter;
    }

    private final Bundle H7(String str, zzxz zzxzVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbad.e(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f12827f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzxzVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzxzVar.l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    private static String J7(String str, zzxz zzxzVar) {
        String str2 = zzxzVar.z;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private static boolean K7(zzxz zzxzVar) {
        if (zzxzVar.f15796k) {
            return true;
        }
        zzyt.a();
        return zzazt.v();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzana B7() {
        NativeAdMapper b2 = this.f12828g.b();
        if (b2 instanceof NativeAppInstallAdMapper) {
            return new zzanq((NativeAppInstallAdMapper) b2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzang D1() {
        UnifiedNativeAdMapper c2 = this.f12828g.c();
        if (c2 != null) {
            return new zzaoi(c2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void G2(zzxz zzxzVar, String str, String str2) throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.e("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f12827f;
                zzank zzankVar = new zzank(zzxzVar.f15792g == -1 ? null : new Date(zzxzVar.f15792g), zzxzVar.f15794i, zzxzVar.f15795j != null ? new HashSet(zzxzVar.f15795j) : null, zzxzVar.p, K7(zzxzVar), zzxzVar.l, zzxzVar.w, zzxzVar.y, J7(str, zzxzVar));
                Bundle bundle = zzxzVar.r;
                mediationRewardedVideoAdAdapter.loadAd(zzankVar, H7(str, zzxzVar, str2), bundle != null ? bundle.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            W1(this.f12830i, zzxzVar, str, new zzanp((Adapter) obj, this.f12829h));
            return;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void H6(zzxz zzxzVar, String str) throws RemoteException {
        G2(zzxzVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void K3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                zzans zzansVar = new zzans(zzxzVar.f15792g == -1 ? null : new Date(zzxzVar.f15792g), zzxzVar.f15794i, zzxzVar.f15795j != null ? new HashSet(zzxzVar.f15795j) : null, zzxzVar.p, K7(zzxzVar), zzxzVar.l, zzadyVar, list, zzxzVar.w, zzxzVar.y, J7(str, zzxzVar));
                Bundle bundle = zzxzVar.r;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f12828g = new zzano(zzamvVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.R(iObjectWrapper), this.f12828g, H7(str, zzxzVar, str2), zzansVar, bundle2);
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationNativeAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M4(com.google.android.gms.dynamic.IObjectWrapper r7, com.google.android.gms.internal.ads.zzaiq r8, java.util.List<com.google.android.gms.internal.ads.zzaiw> r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12827f
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L86
            com.google.android.gms.internal.ads.t2 r0 = new com.google.android.gms.internal.ads.t2
            r0.<init>(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L14:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r9.next()
            com.google.android.gms.internal.ads.zzaiw r1 = (com.google.android.gms.internal.ads.zzaiw) r1
            com.google.android.gms.ads.mediation.MediationConfiguration r2 = new com.google.android.gms.ads.mediation.MediationConfiguration
            java.lang.String r3 = r1.f12743f
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1396342996: goto L51;
                case -1052618729: goto L46;
                case -239580146: goto L3b;
                case 604727084: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L5b
        L30:
            java.lang.String r5 = "interstitial"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L39
            goto L5b
        L39:
            r4 = 3
            goto L5b
        L3b:
            java.lang.String r5 = "rewarded"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L44
            goto L5b
        L44:
            r4 = 2
            goto L5b
        L46:
            java.lang.String r5 = "native"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4f
            goto L5b
        L4f:
            r4 = 1
            goto L5b
        L51:
            java.lang.String r5 = "banner"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L5a
            goto L5b
        L5a:
            r4 = 0
        L5b:
            switch(r4) {
                case 0: goto L6d;
                case 1: goto L6a;
                case 2: goto L67;
                case 3: goto L64;
                default: goto L5e;
            }
        L5e:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        L64:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L6f
        L67:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L6f
        L6a:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L6f
        L6d:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.BANNER
        L6f:
            android.os.Bundle r1 = r1.f12744g
            r2.<init>(r3, r1)
            r8.add(r2)
            goto L14
        L78:
            java.lang.Object r9 = r6.f12827f
            com.google.android.gms.ads.mediation.Adapter r9 = (com.google.android.gms.ads.mediation.Adapter) r9
            java.lang.Object r7 = com.google.android.gms.dynamic.ObjectWrapper.R(r7)
            android.content.Context r7 = (android.content.Context) r7
            r9.initialize(r7, r0, r8)
            return
        L86:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            goto L8d
        L8c:
            throw r7
        L8d:
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanl.M4(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzaiq, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void O4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) throws RemoteException {
        if (this.f12827f instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzbad.e("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f12827f;
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(H7(it.next(), null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.R(iObjectWrapper), new zzatn(zzatkVar), arrayList);
                return;
            } catch (Throwable th) {
                zzbad.d("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        }
        String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void Q2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        u6(iObjectWrapper, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void W1(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Bundle bundle;
        if (this.f12827f instanceof Adapter) {
            zzbad.e("Requesting rewarded ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f12827f;
                s2 s2Var = new s2(this, zzamvVar, adapter);
                Context context = (Context) ObjectWrapper.R(iObjectWrapper);
                Bundle H7 = H7(str, zzxzVar, null);
                Bundle bundle2 = zzxzVar.r;
                if (bundle2 == null || (bundle = bundle2.getBundle(this.f12827f.getClass().getName())) == null) {
                    bundle = new Bundle();
                }
                adapter.loadRewardedAd(new MediationRewardedAdConfiguration(context, HttpUrl.FRAGMENT_ENCODE_SET, H7, bundle, K7(zzxzVar), zzxzVar.p, zzxzVar.l, zzxzVar.y, J7(str, zzxzVar)), s2Var);
                return;
            } catch (Exception e2) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void X4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.R(iObjectWrapper);
        Object obj = this.f12827f;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void Z3(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f12827f instanceof Adapter) {
            zzbad.e("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f12831j;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.R(iObjectWrapper));
                return;
            } else {
                zzbad.g("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void destroy() throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void g4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException {
        zzank zzankVar;
        Bundle bundle;
        Object obj = this.f12827f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.e("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f12827f;
                Bundle H7 = H7(str2, zzxzVar, null);
                if (zzxzVar != null) {
                    zzank zzankVar2 = new zzank(zzxzVar.f15792g == -1 ? null : new Date(zzxzVar.f15792g), zzxzVar.f15794i, zzxzVar.f15795j != null ? new HashSet(zzxzVar.f15795j) : null, zzxzVar.p, K7(zzxzVar), zzxzVar.l, zzxzVar.w, zzxzVar.y, J7(str2, zzxzVar));
                    Bundle bundle2 = zzxzVar.r;
                    bundle = bundle2 != null ? bundle2.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzankVar = zzankVar2;
                } else {
                    zzankVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.R(iObjectWrapper), zzankVar, str, new zzatn(zzatkVar), H7, bundle);
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            this.f12830i = iObjectWrapper;
            this.f12829h = zzatkVar;
            zzatkVar.V2(ObjectWrapper.i0(obj));
            return;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f12827f;
        if (!(obj instanceof zzbjl)) {
            String canonicalName = zzbjl.class.getCanonicalName();
            String canonicalName2 = this.f12827f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.i(sb.toString());
            return new Bundle();
        }
        return ((zzbjl) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzaar getVideoController() {
        Object obj = this.f12827f;
        if (!(obj instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean isInitialized() throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.e("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f12827f).isInitialized();
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return this.f12829h != null;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final IObjectWrapper l1() throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.i0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void m2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        w4(iObjectWrapper, zzydVar, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void pause() throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void resume() throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean s3() {
        return this.f12827f instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.f12827f;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.f12827f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.i(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showInterstitial() throws RemoteException {
        if (this.f12827f instanceof MediationInterstitialAdapter) {
            zzbad.e("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f12827f).showInterstitial();
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showVideo() throws RemoteException {
        Object obj = this.f12827f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.e("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f12827f).showVideo();
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f12831j;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.R(this.f12830i));
                return;
            } else {
                zzbad.g("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzafe t2() {
        NativeCustomTemplateAd d2 = this.f12828g.d();
        if (d2 instanceof zzafh) {
            return ((zzafh) d2).b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle t4() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void u6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        if (this.f12827f instanceof MediationInterstitialAdapter) {
            zzbad.e("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f12827f;
                zzank zzankVar = new zzank(zzxzVar.f15792g == -1 ? null : new Date(zzxzVar.f15792g), zzxzVar.f15794i, zzxzVar.f15795j != null ? new HashSet(zzxzVar.f15795j) : null, zzxzVar.p, K7(zzxzVar), zzxzVar.l, zzxzVar.w, zzxzVar.y, J7(str, zzxzVar));
                Bundle bundle = zzxzVar.r;
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.R(iObjectWrapper), new zzano(zzamvVar), H7(str, zzxzVar, str2), zzankVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void w4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        if (this.f12827f instanceof MediationBannerAdapter) {
            zzbad.e("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f12827f;
                zzank zzankVar = new zzank(zzxzVar.f15792g == -1 ? null : new Date(zzxzVar.f15792g), zzxzVar.f15794i, zzxzVar.f15795j != null ? new HashSet(zzxzVar.f15795j) : null, zzxzVar.p, K7(zzxzVar), zzxzVar.l, zzxzVar.w, zzxzVar.y, J7(str, zzxzVar));
                Bundle bundle = zzxzVar.r;
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.R(iObjectWrapper), new zzano(zzamvVar), H7(str, zzxzVar, str2), com.google.android.gms.ads.zzb.zza(zzydVar.f15814j, zzydVar.f15811g, zzydVar.f15810f), zzankVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12827f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzand w6() {
        NativeAdMapper b2 = this.f12828g.b();
        if (b2 instanceof NativeContentAdMapper) {
            return new zzanr((NativeContentAdMapper) b2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle zzsh() {
        Object obj = this.f12827f;
        if (!(obj instanceof zzbjk)) {
            String canonicalName = zzbjk.class.getCanonicalName();
            String canonicalName2 = this.f12827f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.i(sb.toString());
            return new Bundle();
        }
        return ((zzbjk) obj).zzsh();
    }

    public zzanl(Adapter adapter) {
        this.f12827f = adapter;
    }
}
