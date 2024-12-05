package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzchb implements zzdti<zzbbh<String>> {
    private final zzdtu<zzdh> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f14058b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbbl> f14059c;

    private zzchb(zzdtu<zzdh> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbbl> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14058b = zzdtuVar2;
        this.f14059c = zzdtuVar3;
    }

    public static zzchb a(zzdtu<zzdh> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbbl> zzdtuVar3) {
        return new zzchb(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzdh zzdhVar = this.a.get();
        final Context context = this.f14058b.get();
        return (zzbbh) zzdto.b(this.f14059c.get().submit(new Callable(zzdhVar, context) { // from class: com.google.android.gms.internal.ads.yi

            /* renamed from: f, reason: collision with root package name */
            private final zzdh f12468f;

            /* renamed from: g, reason: collision with root package name */
            private final Context f12469g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12468f = zzdhVar;
                this.f12469g = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdh zzdhVar2 = this.f12468f;
                return zzdhVar2.f().zza(this.f12469g);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
