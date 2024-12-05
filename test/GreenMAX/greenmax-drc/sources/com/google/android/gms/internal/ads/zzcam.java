package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcam implements zzdti<zzbuz<VideoController.VideoLifecycleCallbacks>> {
    private final zzcag a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzccw> f13805b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13806c;

    public zzcam(zzcag zzcagVar, zzdtu<zzccw> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.a = zzcagVar;
        this.f13805b = zzdtuVar;
        this.f13806c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.b(new zzbuz(this.f13805b.get(), this.f13806c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
