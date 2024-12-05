package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcvo implements zzcva<zzcvn> {
    private final zzawi a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14508b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f14509c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f14510d;

    public zzcvo(zzawi zzawiVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.a = zzawiVar;
        this.f14508b = context;
        this.f14509c = scheduledExecutorService;
        this.f14510d = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void a(zzbbh zzbbhVar, zzbbr zzbbrVar) {
        String str;
        try {
            AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) zzbbhVar.get();
            if (info == null || !TextUtils.isEmpty(info.getId())) {
                str = null;
            } else {
                zzyt.a();
                str = zzazt.m(this.f14508b);
            }
            zzbbrVar.b(new zzcvn(info, this.f14508b, str));
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            zzyt.a();
            zzbbrVar.b(new zzcvn(null, this.f14508b, zzazt.m(this.f14508b)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcvn> b() {
        if (((Boolean) zzyt.e().c(zzacu.g1)).booleanValue()) {
            final zzbbr zzbbrVar = new zzbbr();
            final zzbbh<AdvertisingIdClient.Info> a = this.a.a(this.f14508b);
            a.f(new Runnable(this, a, zzbbrVar) { // from class: com.google.android.gms.internal.ads.fp

                /* renamed from: f, reason: collision with root package name */
                private final zzcvo f11434f;

                /* renamed from: g, reason: collision with root package name */
                private final zzbbh f11435g;

                /* renamed from: h, reason: collision with root package name */
                private final zzbbr f11436h;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11434f = this;
                    this.f11435g = a;
                    this.f11436h = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11434f.a(this.f11435g, this.f11436h);
                }
            }, this.f14510d);
            this.f14509c.schedule(new Runnable(a) { // from class: com.google.android.gms.internal.ads.gp

                /* renamed from: f, reason: collision with root package name */
                private final zzbbh f11494f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11494f = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11494f.cancel(true);
                }
            }, ((Long) zzyt.e().c(zzacu.h1)).longValue(), TimeUnit.MILLISECONDS);
            return zzbbrVar;
        }
        return zzbar.l(new Exception("Did not ad Ad ID into query param."));
    }
}
