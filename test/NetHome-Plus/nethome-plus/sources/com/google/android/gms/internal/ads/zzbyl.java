package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbyl implements zzdti<zzbmy> {
    private final zzdtu<zzty> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f13676b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Context> f13677c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Clock> f13678d;

    public zzbyl(zzdtu<zzty> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<Context> zzdtuVar3, zzdtu<Clock> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13676b = zzdtuVar2;
        this.f13677c = zzdtuVar3;
        this.f13678d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzty zztyVar = this.a.get();
        Executor executor = this.f13676b.get();
        Context context = this.f13677c.get();
        return (zzbmy) zzdto.b(new zzbmy(executor, new zzbml(context, zztyVar), this.f13678d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
