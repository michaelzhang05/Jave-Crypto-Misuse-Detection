package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class vy implements p30 {
    private final Map<String, List<zzr<?>>> a = new HashMap();

    /* renamed from: b */
    private final zzd f12297b;

    public vy(zzd zzdVar) {
        this.f12297b = zzdVar;
    }

    public final synchronized boolean d(zzr<?> zzrVar) {
        String L = zzrVar.L();
        if (this.a.containsKey(L)) {
            List<zzr<?>> list = this.a.get(L);
            if (list == null) {
                list = new ArrayList<>();
            }
            zzrVar.H("waiting-for-response");
            list.add(zzrVar);
            this.a.put(L, list);
            if (zzag.f12695b) {
                zzag.a("Request for cacheKey=%s is in flight, putting on hold.", L);
            }
            return true;
        }
        this.a.put(L, null);
        zzrVar.C(this);
        if (zzag.f12695b) {
            zzag.a("new request, sending to network %s", L);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p30
    public final synchronized void a(zzr<?> zzrVar) {
        BlockingQueue blockingQueue;
        String L = zzrVar.L();
        List<zzr<?>> remove = this.a.remove(L);
        if (remove != null && !remove.isEmpty()) {
            if (zzag.f12695b) {
                zzag.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), L);
            }
            zzr<?> remove2 = remove.remove(0);
            this.a.put(L, remove);
            remove2.C(this);
            try {
                blockingQueue = this.f12297b.f14635h;
                blockingQueue.put(remove2);
            } catch (InterruptedException e2) {
                zzag.b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f12297b.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p30
    public final void b(zzr<?> zzrVar, zzy<?> zzyVar) {
        List<zzr<?>> remove;
        zzab zzabVar;
        zzc zzcVar = zzyVar.f15797b;
        if (zzcVar != null && !zzcVar.a()) {
            String L = zzrVar.L();
            synchronized (this) {
                remove = this.a.remove(L);
            }
            if (remove != null) {
                if (zzag.f12695b) {
                    zzag.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), L);
                }
                for (zzr<?> zzrVar2 : remove) {
                    zzabVar = this.f12297b.f14637j;
                    zzabVar.c(zzrVar2, zzyVar);
                }
                return;
            }
            return;
        }
        a(zzrVar);
    }
}
