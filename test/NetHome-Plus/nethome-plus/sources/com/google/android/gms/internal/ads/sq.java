package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class sq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final zzdba a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdau f12168b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12169c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f12170d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12171e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sq(Context context, Looper looper, zzdau zzdauVar) {
        this.f12168b = zzdauVar;
        this.a = new zzdba(context, looper, this, this);
    }

    private final void a() {
        synchronized (this.f12169c) {
            if (this.a.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        synchronized (this.f12169c) {
            if (this.f12171e) {
                return;
            }
            this.f12171e = true;
            try {
                this.a.f().m3(new zzday(this.f12168b.g()));
                a();
            } catch (Exception unused) {
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        synchronized (this.f12169c) {
            if (!this.f12170d) {
                this.f12170d = true;
                this.a.checkAvailabilityAndConnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void u(int i2) {
    }
}
