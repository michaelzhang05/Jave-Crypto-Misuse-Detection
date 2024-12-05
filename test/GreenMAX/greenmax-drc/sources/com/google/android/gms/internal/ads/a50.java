package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a50 implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzvv a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzbbr f11056b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzwb f11057c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a50(zzwb zzwbVar, zzvv zzvvVar, zzbbr zzbbrVar) {
        this.f11057c = zzwbVar;
        this.a = zzvvVar;
        this.f11056b = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        Object obj;
        boolean z;
        final zzvu zzvuVar;
        obj = this.f11057c.f15694d;
        synchronized (obj) {
            z = this.f11057c.f15692b;
            if (z) {
                return;
            }
            zzwb.c(this.f11057c, true);
            zzvuVar = this.f11057c.a;
            if (zzvuVar == null) {
                return;
            }
            final zzvv zzvvVar = this.a;
            final zzbbr zzbbrVar = this.f11056b;
            final zzbbh<?> b2 = zzaxg.b(new Runnable(this, zzvuVar, zzvvVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.b50

                /* renamed from: f, reason: collision with root package name */
                private final a50 f11122f;

                /* renamed from: g, reason: collision with root package name */
                private final zzvu f11123g;

                /* renamed from: h, reason: collision with root package name */
                private final zzvv f11124h;

                /* renamed from: i, reason: collision with root package name */
                private final zzbbr f11125i;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11122f = this;
                    this.f11123g = zzvuVar;
                    this.f11124h = zzvvVar;
                    this.f11125i = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a50 a50Var = this.f11122f;
                    zzvu zzvuVar2 = this.f11123g;
                    zzvv zzvvVar2 = this.f11124h;
                    zzbbr zzbbrVar2 = this.f11125i;
                    try {
                        zzvs L4 = zzvuVar2.f().L4(zzvvVar2);
                        if (!L4.w()) {
                            zzbbrVar2.c(new RuntimeException("No entry contents."));
                            a50Var.f11057c.a();
                            return;
                        }
                        d50 d50Var = new d50(a50Var, L4.z(), 1);
                        int read = d50Var.read();
                        if (read != -1) {
                            d50Var.unread(read);
                            zzbbrVar2.b(d50Var);
                            return;
                        }
                        throw new IOException("Unable to read from cache.");
                    } catch (RemoteException | IOException e2) {
                        zzbad.c("Unable to obtain a cache service instance.", e2);
                        zzbbrVar2.c(e2);
                        a50Var.f11057c.a();
                    }
                }
            });
            final zzbbr zzbbrVar2 = this.f11056b;
            zzbbrVar2.f(new Runnable(zzbbrVar2, b2) { // from class: com.google.android.gms.internal.ads.c50

                /* renamed from: f, reason: collision with root package name */
                private final zzbbr f11215f;

                /* renamed from: g, reason: collision with root package name */
                private final Future f11216g;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11215f = zzbbrVar2;
                    this.f11216g = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbbr zzbbrVar3 = this.f11215f;
                    Future future = this.f11216g;
                    if (zzbbrVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbbm.f13155b);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void u(int i2) {
    }
}
