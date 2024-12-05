package com.google.android.gms.internal.ads;

import android.location.Location;
import cm.aptoide.pt.account.AdultContentAnalytics;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzans implements NativeMediationAdRequest {
    private final Date a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12839b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f12840c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12841d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f12842e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12843f;

    /* renamed from: g, reason: collision with root package name */
    private final zzady f12844g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f12846i;

    /* renamed from: k, reason: collision with root package name */
    private final int f12848k;
    private final String l;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f12845h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Boolean> f12847j = new HashMap();

    public zzans(Date date, int i2, Set<String> set, Location location, boolean z, int i3, zzady zzadyVar, List<String> list, boolean z2, int i4, String str) {
        this.a = date;
        this.f12839b = i2;
        this.f12840c = set;
        this.f12842e = location;
        this.f12841d = z;
        this.f12843f = i3;
        this.f12844g = zzadyVar;
        this.f12846i = z2;
        this.f12848k = i4;
        this.l = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f12847j.put(split[1], Boolean.TRUE);
                        } else if (AdultContentAnalytics.UNLOCK.equals(split[2])) {
                            this.f12847j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f12845h.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzabe.j().h();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f12839b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f12840c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f12842e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzacd zzacdVar;
        if (this.f12844g == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.f12844g.f12670g).setImageOrientation(this.f12844g.f12671h).setRequestMultipleImages(this.f12844g.f12672i);
        zzady zzadyVar = this.f12844g;
        if (zzadyVar.f12669f >= 2) {
            requestMultipleImages.setAdChoicesPlacement(zzadyVar.f12673j);
        }
        zzady zzadyVar2 = this.f12844g;
        if (zzadyVar2.f12669f >= 3 && (zzacdVar = zzadyVar2.f12674k) != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(zzacdVar));
        }
        return requestMultipleImages.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzabe.j().i();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAppInstallAdRequested() {
        List<String> list = this.f12845h;
        if (list != null) {
            return list.contains("2") || this.f12845h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isContentAdRequested() {
        List<String> list = this.f12845h;
        if (list != null) {
            return list.contains("1") || this.f12845h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f12846i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f12841d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.f12845h;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f12843f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzsu() {
        List<String> list = this.f12845h;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map<String, Boolean> zzsv() {
        return this.f12847j;
    }
}
