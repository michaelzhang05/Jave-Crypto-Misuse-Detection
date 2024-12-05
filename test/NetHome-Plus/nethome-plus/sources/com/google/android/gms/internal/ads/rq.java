package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class rq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    private zzdba a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12119b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12120c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<zzbp.zza> f12121d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f12122e;

    public rq(Context context, String str, String str2) {
        this.f12119b = str;
        this.f12120c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f12122e = handlerThread;
        handlerThread.start();
        this.a = new zzdba(context, handlerThread.getLooper(), this, this);
        this.f12121d = new LinkedBlockingQueue<>();
        this.a.checkAvailabilityAndConnect();
    }

    private final void a() {
        zzdba zzdbaVar = this.a;
        if (zzdbaVar != null) {
            if (zzdbaVar.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    private final zzdbf b() {
        try {
            return this.a.f();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @VisibleForTesting
    private static zzbp.zza c() {
        return (zzbp.zza) ((zzdob) zzbp.zza.n0().Q(32768L).J());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        zzdbf b2 = b();
        if (b2 != null) {
            try {
                try {
                    this.f12121d.put(b2.H4(new zzdbb(this.f12119b, this.f12120c)).w());
                    a();
                    this.f12122e.quit();
                } catch (Throwable unused) {
                    this.f12121d.put(c());
                    a();
                    this.f12122e.quit();
                }
            } catch (InterruptedException unused2) {
                a();
                this.f12122e.quit();
            } catch (Throwable th) {
                a();
                this.f12122e.quit();
                throw th;
            }
        }
    }

    public final zzbp.zza d(int i2) {
        zzbp.zza zzaVar;
        try {
            zzaVar = this.f12121d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaVar = null;
        }
        return zzaVar == null ? c() : zzaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        try {
            this.f12121d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void u(int i2) {
        try {
            this.f12121d.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
