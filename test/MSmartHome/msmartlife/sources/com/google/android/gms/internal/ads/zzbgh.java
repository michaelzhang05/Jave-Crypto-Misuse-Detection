package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbgh extends zzbgl {
    private final String m;

    public zzbgh(zzbdf zzbdfVar, String str) {
        super(zzbdfVar);
        this.m = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    protected final zzhn C(String str) {
        zzjp zzjtVar = new zzjt(this.f13254f, this.f13255g);
        return new zzig(Uri.parse(str), ((Boolean) zzyt.e().c(zzacu.y3)).booleanValue() ? new zzbeh(this.f13254f, zzjtVar, new zzbei(this) { // from class: com.google.android.gms.internal.ads.ha
            private final zzbgh a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbei
            public final void b(boolean z, long j2) {
                this.a.G(z, j2);
            }
        }) : zzjtVar, "video/webm".equals(this.m) ? new zzjg() : new zziv(), 2, ((Integer) zzyt.e().c(zzacu.D)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    protected final int D() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void G(final boolean z, final long j2) {
        final zzbdf zzbdfVar = this.f13256h.get();
        if (zzbdfVar != null) {
            zzbbm.a.execute(new Runnable(zzbdfVar, z, j2) { // from class: com.google.android.gms.internal.ads.ia

                /* renamed from: f, reason: collision with root package name */
                private final zzbdf f11587f;

                /* renamed from: g, reason: collision with root package name */
                private final boolean f11588g;

                /* renamed from: h, reason: collision with root package name */
                private final long f11589h;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11587f = zzbdfVar;
                    this.f11588g = z;
                    this.f11589h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11587f.R(this.f11588g, this.f11589h);
                }
            });
        }
    }
}
