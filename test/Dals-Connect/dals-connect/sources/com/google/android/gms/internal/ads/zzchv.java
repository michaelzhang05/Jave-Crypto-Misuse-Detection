package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzchv extends zzchx {
    public zzchv(Context context) {
        this.f14084f = new zzarf(context, zzk.zzlu().b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        synchronized (this.f14080b) {
            if (!this.f14082d) {
                this.f14082d = true;
                try {
                    this.f14084f.f().Y5(this.f14083e, new zzchy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.a.c(new zzcie(0));
                } catch (Throwable th) {
                    zzk.zzlk().e(th, "RemoteAdRequestClientTask.onConnected");
                    this.a.c(new zzcie(0));
                }
            }
        }
    }

    public final zzbbh<InputStream> b(zzarx zzarxVar) {
        synchronized (this.f14080b) {
            if (this.f14081c) {
                return this.a;
            }
            this.f14081c = true;
            this.f14083e = zzarxVar;
            this.f14084f.checkAvailabilityAndConnect();
            this.a.f(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hj

                /* renamed from: f, reason: collision with root package name */
                private final zzchv f11534f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11534f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11534f.a();
                }
            }, zzbbm.f13155b);
            return this.a;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchx, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        zzbad.e("Cannot connect to remote service, fallback to local instance.");
        this.a.c(new zzcie(0));
    }
}
