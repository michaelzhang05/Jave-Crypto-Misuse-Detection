package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzahr implements zzaho<zzbgz> {
    private static final Map<String, Integer> a = CollectionUtils.b(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.zzb f12722b;

    /* renamed from: c, reason: collision with root package name */
    private final zzapr f12723c;

    /* renamed from: d, reason: collision with root package name */
    private final zzaqc f12724d;

    public zzahr(com.google.android.gms.ads.internal.zzb zzbVar, zzapr zzaprVar, zzaqc zzaqcVar) {
        this.f12722b = zzbVar;
        this.f12723c = zzaprVar;
        this.f12724d = zzaqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final /* synthetic */ void a(zzbgz zzbgzVar, Map map) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzbgz zzbgzVar2 = zzbgzVar;
        int intValue = a.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzbVar = this.f12722b) != null && !zzbVar.zzkx()) {
            this.f12722b.zzbk(null);
            return;
        }
        if (intValue == 1) {
            this.f12723c.i(map);
            return;
        }
        if (intValue == 3) {
            new zzapu(zzbgzVar2, map).h();
            return;
        }
        if (intValue == 4) {
            new zzapo(zzbgzVar2, map).i();
            return;
        }
        if (intValue == 5) {
            new zzapt(zzbgzVar2, map).a();
            return;
        }
        if (intValue == 6) {
            this.f12723c.l(true);
        } else if (intValue != 7) {
            zzbad.h("Unknown MRAID command called.");
        } else if (((Boolean) zzyt.e().c(zzacu.d0)).booleanValue()) {
            this.f12724d.a();
        }
    }
}
