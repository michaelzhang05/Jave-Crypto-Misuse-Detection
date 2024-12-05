package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tc implements zzaho<Object> {
    final /* synthetic */ zzbmg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tc(zzbmg zzbmgVar) {
        this.a = zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void a(Object obj, Map<String, String> map) {
        boolean h2;
        zzbmn zzbmnVar;
        Executor executor;
        h2 = this.a.h(map);
        if (h2) {
            if (((Boolean) zzyt.e().c(zzacu.z4)).booleanValue()) {
                executor = this.a.f13362c;
                executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uc

                    /* renamed from: f, reason: collision with root package name */
                    private final tc f12222f;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f12222f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmn zzbmnVar2;
                        zzbmnVar2 = this.f12222f.a.f13363d;
                        zzbmnVar2.y();
                    }
                });
            } else {
                zzbmnVar = this.a.f13363d;
                zzbmnVar.y();
            }
        }
    }
}
