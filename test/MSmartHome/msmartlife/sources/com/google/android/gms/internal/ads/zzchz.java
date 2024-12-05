package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzchz extends zzchx {
    public zzchz(Context context) {
        this.f14084f = new zzarf(context, zzk.zzlu().b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        synchronized (this.f14080b) {
            if (!this.f14082d) {
                this.f14082d = true;
                try {
                    this.f14084f.f().y7(this.f14083e, new zzchy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.a.c(new zzcie(0));
                } catch (Throwable th) {
                    zzk.zzlk().e(th, "RemoteSignalsClientTask.onConnected");
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
            this.a.f(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jj

                /* renamed from: f, reason: collision with root package name */
                private final zzchz f11653f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11653f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11653f.a();
                }
            }, zzbbm.f13155b);
            return this.a;
        }
    }
}
