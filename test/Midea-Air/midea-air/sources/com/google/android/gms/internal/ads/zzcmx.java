package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcmx<AdT> implements zzbal<zzcxu, AdT> {
    private final zzczt a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbrm f14238b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdae f14239c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f14240d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f14241e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbpe<AdT> f14242f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcmu f14243g;

    public zzcmx(zzczt zzcztVar, zzcmu zzcmuVar, zzbrm zzbrmVar, zzdae zzdaeVar, zzbpe<AdT> zzbpeVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzcztVar;
        this.f14243g = zzcmuVar;
        this.f14238b = zzbrmVar;
        this.f14239c = zzdaeVar;
        this.f14242f = zzbpeVar;
        this.f14240d = executor;
        this.f14241e = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh b(zzcxm zzcxmVar, zzcjv zzcjvVar, zzcxu zzcxuVar, Throwable th) throws Exception {
        return this.f14243g.b(zzcxmVar, zzbar.b(zzcjvVar.a(zzcxuVar, zzcxmVar), zzcxmVar.I, TimeUnit.MILLISECONDS, this.f14241e));
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh zzf(zzcxu zzcxuVar) throws Exception {
        final zzcxu zzcxuVar2 = zzcxuVar;
        zzcze f2 = this.a.g(zzczs.RENDER_CONFIG_INIT).c(zzbar.l(new zzcmw("No ad configs", 3))).f();
        this.f14238b.V(new zzbmd(zzcxuVar2, this.f14239c), this.f14240d);
        int i2 = 0;
        for (final zzcxm zzcxmVar : zzcxuVar2.f14570b.a) {
            Iterator<String> it = zzcxmVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                final zzcjv<AdT> a = this.f14242f.a(zzcxmVar.f14547b, next);
                if (a != null && a.b(zzcxuVar2, zzcxmVar)) {
                    zzczl<I> c2 = this.a.c(zzczs.RENDER_CONFIG_WATERFALL, f2);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(next);
                    f2 = c2.i(sb.toString()).d(Throwable.class, new zzbal(this, zzcxmVar, a, zzcxuVar2) { // from class: com.google.android.gms.internal.ads.ol
                        private final zzcmx a;

                        /* renamed from: b, reason: collision with root package name */
                        private final zzcxm f11942b;

                        /* renamed from: c, reason: collision with root package name */
                        private final zzcjv f11943c;

                        /* renamed from: d, reason: collision with root package name */
                        private final zzcxu f11944d;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.a = this;
                            this.f11942b = zzcxmVar;
                            this.f11943c = a;
                            this.f11944d = zzcxuVar2;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbal
                        public final zzbbh zzf(Object obj) {
                            return this.a.b(this.f11942b, this.f11943c, this.f11944d, (Throwable) obj);
                        }
                    }).f();
                    break;
                }
            }
            i2++;
        }
        return f2;
    }
}
