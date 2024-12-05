package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzchl extends zzchj {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f14063b = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: c, reason: collision with root package name */
    private final zzcgn f14064c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbbl f14065d;

    /* renamed from: e, reason: collision with root package name */
    private final zzcxv f14066e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f14067f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcji f14068g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchl(zzbtg zzbtgVar, zzcxv zzcxvVar, zzcgn zzcgnVar, zzbbl zzbblVar, ScheduledExecutorService scheduledExecutorService, zzcji zzcjiVar) {
        super(zzbtgVar);
        this.f14066e = zzcxvVar;
        this.f14064c = zzcgnVar;
        this.f14065d = zzbblVar;
        this.f14067f = scheduledExecutorService;
        this.f14068g = zzcjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final zzbbh<zzcxu> c(zzarx zzarxVar) throws zzcgm {
        zzbbh<zzcxu> c2 = zzbar.c(this.f14064c.b(zzarxVar), new zzbal(this) { // from class: com.google.android.gms.internal.ads.bj
            private final zzchl a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.f((InputStream) obj);
            }
        }, this.f14065d);
        if (((Boolean) zzyt.e().c(zzacu.t4)).booleanValue()) {
            c2 = zzbar.e(zzbar.b(c2, ((Integer) zzyt.e().c(zzacu.u4)).intValue(), TimeUnit.SECONDS, this.f14067f), TimeoutException.class, cj.a, zzbbm.f13155b);
        }
        zzbar.f(c2, new dj(this), zzbbm.f13155b);
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh f(InputStream inputStream) throws Exception {
        return zzbar.o(new zzcxu(new zzcxr(this.f14066e), zzcxs.a(new InputStreamReader(inputStream))));
    }
}
