package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbwn implements zzdti<zzbuz<zzbto>> {
    private final zzbvz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f13603b;

    private zzbwn(zzbvz zzbvzVar, zzdtu<Executor> zzdtuVar) {
        this.a = zzbvzVar;
        this.f13603b = zzdtuVar;
    }

    public static zzbwn a(zzbvz zzbvzVar, zzdtu<Executor> zzdtuVar) {
        return new zzbwn(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzbvz zzbvzVar = this.a;
        return (zzbuz) zzdto.b(new zzbuz(new zzbto(zzbvzVar) { // from class: com.google.android.gms.internal.ads.lf

            /* renamed from: f, reason: collision with root package name */
            private final zzbvz f11771f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11771f = zzbvzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbto
            public final void u() {
                this.f11771f.e();
            }
        }, this.f13603b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
