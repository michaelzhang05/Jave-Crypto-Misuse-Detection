package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzvn {
    private final Runnable a = new v40(this);

    /* renamed from: b, reason: collision with root package name */
    private final Object f15681b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private zzvu f15682c;

    /* renamed from: d, reason: collision with root package name */
    private Context f15683d;

    /* renamed from: e, reason: collision with root package name */
    private zzvy f15684e;

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        synchronized (this.f15681b) {
            if (this.f15683d != null && this.f15682c == null) {
                zzvu e2 = e(new x40(this), new y40(this));
                this.f15682c = e2;
                e2.checkAvailabilityAndConnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        synchronized (this.f15681b) {
            zzvu zzvuVar = this.f15682c;
            if (zzvuVar == null) {
                return;
            }
            if (zzvuVar.isConnected() || this.f15682c.isConnecting()) {
                this.f15682c.disconnect();
            }
            this.f15682c = null;
            this.f15684e = null;
            Binder.flushPendingCommands();
        }
    }

    @VisibleForTesting
    private final synchronized zzvu e(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzvu(this.f15683d, zzk.zzlu().b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzvu f(zzvn zzvnVar, zzvu zzvuVar) {
        zzvnVar.f15682c = null;
        return null;
    }

    public final void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f15681b) {
            if (this.f15683d != null) {
                return;
            }
            this.f15683d = context.getApplicationContext();
            if (((Boolean) zzyt.e().c(zzacu.v3)).booleanValue()) {
                a();
            } else {
                if (((Boolean) zzyt.e().c(zzacu.u3)).booleanValue()) {
                    zzk.zzlj().d(new w40(this));
                }
            }
        }
    }

    public final zzvs d(zzvv zzvvVar) {
        synchronized (this.f15681b) {
            zzvy zzvyVar = this.f15684e;
            if (zzvyVar == null) {
                return new zzvs();
            }
            try {
                return zzvyVar.L4(zzvvVar);
            } catch (RemoteException e2) {
                zzbad.c("Unable to call into cache service.", e2);
                return new zzvs();
            }
        }
    }

    public final void l() {
        if (((Boolean) zzyt.e().c(zzacu.w3)).booleanValue()) {
            synchronized (this.f15681b) {
                a();
                zzk.zzlg();
                Handler handler = zzaxi.a;
                handler.removeCallbacks(this.a);
                zzk.zzlg();
                handler.postDelayed(this.a, ((Long) zzyt.e().c(zzacu.x3)).longValue());
            }
        }
    }
}
