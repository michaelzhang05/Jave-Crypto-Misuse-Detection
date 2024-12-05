package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class zzchx implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzbbr<InputStream> a = new zzbbr<>();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f14080b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f14081c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f14082d = false;

    /* renamed from: e, reason: collision with root package name */
    protected zzarx f14083e;

    /* renamed from: f, reason: collision with root package name */
    protected zzarf f14084f;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        synchronized (this.f14080b) {
            this.f14082d = true;
            if (this.f14084f.isConnected() || this.f14084f.isConnecting()) {
                this.f14084f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public void i0(ConnectionResult connectionResult) {
        zzbad.e("Disconnected from remote ad request service.");
        this.a.c(new zzcie(0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void u(int i2) {
        zzbad.e("Cannot connect to remote service, fallback to local instance.");
    }
}
