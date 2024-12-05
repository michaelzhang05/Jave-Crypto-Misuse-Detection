package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzcjm {
    private static final SparseArray<zzwt.zzi.zzc> a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14122b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbbh<Bundle> f14123c;

    /* renamed from: d, reason: collision with root package name */
    private final TelephonyManager f14124d;

    /* renamed from: e, reason: collision with root package name */
    private final zzcji f14125e;

    /* renamed from: f, reason: collision with root package name */
    private final zzcjc f14126f;

    /* renamed from: g, reason: collision with root package name */
    private zzwx f14127g;

    static {
        SparseArray<zzwt.zzi.zzc> sparseArray = new SparseArray<>();
        a = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzwt.zzi.zzc.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzwt.zzi.zzc zzcVar = zzwt.zzi.zzc.CONNECTING;
        sparseArray.put(ordinal, zzcVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzcVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzcVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzwt.zzi.zzc.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzwt.zzi.zzc zzcVar2 = zzwt.zzi.zzc.DISCONNECTED;
        sparseArray.put(ordinal2, zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzwt.zzi.zzc.SUSPENDED);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzcVar);
        }
        if (i2 >= 16) {
            sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjm(Context context, zzbbh<Bundle> zzbbhVar, zzcji zzcjiVar, zzcjc zzcjcVar) {
        this.f14122b = context;
        this.f14123c = zzbbhVar;
        this.f14125e = zzcjiVar;
        this.f14126f = zzcjcVar;
        this.f14124d = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] d(boolean z, ArrayList<zzwt.zza.EnumC0184zza> arrayList, zzwt.zzg zzgVar, zzwt.zzi.zzc zzcVar) {
        return ((zzwt.zzi.zza) ((zzdob) zzwt.zzi.zza.Z().x(arrayList).G(e(zzk.zzli().o(this.f14122b.getContentResolver()) != 0)).H(zzk.zzli().h(this.f14122b, this.f14124d)).B(this.f14125e.b()).C(this.f14125e.d()).y(this.f14125e.a()).v(zzcVar).u(zzgVar).I(this.f14127g).E(e(z)).A(zzk.zzln().a()).F(e(zzk.zzli().d(this.f14122b.getContentResolver()) != 0)).J())).g();
    }

    private static zzwx e(boolean z) {
        return z ? zzwx.ENUM_TRUE : zzwx.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzwt.zzg i(Bundle bundle) {
        zzwt.zzg.zzb zzbVar;
        zzwt.zzg.zza C = zzwt.zzg.C();
        int i2 = bundle.getInt("cnt", -2);
        int i3 = bundle.getInt("gnt", 0);
        if (i2 == -1) {
            this.f14127g = zzwx.ENUM_TRUE;
        } else {
            this.f14127g = zzwx.ENUM_FALSE;
            if (i2 == 0) {
                C.v(zzwt.zzg.zzc.CELL);
            } else if (i2 != 1) {
                C.v(zzwt.zzg.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                C.v(zzwt.zzg.zzc.WIFI);
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzwt.zzg.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzwt.zzg.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzwt.zzg.zzb.LTE;
                    break;
                default:
                    zzbVar = zzwt.zzg.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            C.u(zzbVar);
        }
        return (zzwt.zzg) ((zzdob) C.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzwt.zzi.zzc j(Bundle bundle) {
        return a.get(zzcxz.a(zzcxz.a(bundle, "device"), "network").getInt("active_network_state", -1), zzwt.zzi.zzc.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zzwt.zza.EnumC0184zza> k(android.os.Bundle r4) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r4 = r4.get(r0)
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto Ld
            java.util.List r4 = (java.util.List) r4
            goto L17
        Ld:
            boolean r0 = r4 instanceof java.lang.String[]
            if (r0 == 0) goto L3d
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.List r4 = java.util.Arrays.asList(r4)
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L24
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L24
        L38:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            goto L41
        L3d:
            java.util.List r4 = java.util.Collections.emptyList()
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1396342996: goto L83;
                case -1052618729: goto L78;
                case -239580146: goto L6d;
                case 604727084: goto L62;
                default: goto L61;
            }
        L61:
            goto L8d
        L62:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6b
            goto L8d
        L6b:
            r2 = 3
            goto L8d
        L6d:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L76
            goto L8d
        L76:
            r2 = 2
            goto L8d
        L78:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L81
            goto L8d
        L81:
            r2 = 1
            goto L8d
        L83:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8c
            goto L8d
        L8c:
            r2 = 0
        L8d:
            switch(r2) {
                case 0: goto L9c;
                case 1: goto L99;
                case 2: goto L96;
                case 3: goto L93;
                default: goto L90;
            }
        L90:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC0184zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L9e
        L93:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC0184zza.INTERSTITIAL
            goto L9e
        L96:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC0184zza.REWARD_BASED_VIDEO_AD
            goto L9e
        L99:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC0184zza.NATIVE_APP_INSTALL
            goto L9e
        L9c:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC0184zza.BANNER
        L9e:
            r0.add(r1)
            goto L4a
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjm.k(android.os.Bundle):java.util.ArrayList");
    }

    public final void g(boolean z) {
        zzbar.f(this.f14123c, new zj(this, z), zzbbm.f13155b);
    }
}
