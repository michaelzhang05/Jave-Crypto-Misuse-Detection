package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import cm.aptoide.pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zze;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends GmsClientSupervisor implements Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    private final Context f10900i;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f10901j;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<GmsClientSupervisor.zza, k> f10899h = new HashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private final ConnectionTracker f10902k = ConnectionTracker.b();
    private final long l = 5000;
    private final long m = LocalNotificationSyncManager.FIVE_MINUTES;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context) {
        this.f10900i = context.getApplicationContext();
        this.f10901j = new zze(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean c(GmsClientSupervisor.zza zzaVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        Preconditions.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10899h) {
            k kVar = this.f10899h.get(zzaVar);
            if (kVar == null) {
                kVar = new k(this, zzaVar);
                kVar.e(serviceConnection, str);
                kVar.h(str);
                this.f10899h.put(zzaVar, kVar);
            } else {
                this.f10901j.removeMessages(0, zzaVar);
                if (!kVar.f(serviceConnection)) {
                    kVar.e(serviceConnection, str);
                    int c2 = kVar.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(kVar.b(), kVar.a());
                    } else if (c2 == 2) {
                        kVar.h(str);
                    }
                } else {
                    String valueOf = String.valueOf(zzaVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = kVar.d();
        }
        return d2;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void d(GmsClientSupervisor.zza zzaVar, ServiceConnection serviceConnection, String str) {
        Preconditions.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10899h) {
            k kVar = this.f10899h.get(zzaVar);
            if (kVar != null) {
                if (kVar.f(serviceConnection)) {
                    kVar.g(serviceConnection, str);
                    if (kVar.j()) {
                        this.f10901j.sendMessageDelayed(this.f10901j.obtainMessage(0, zzaVar), this.l);
                    }
                } else {
                    String valueOf = String.valueOf(zzaVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String valueOf2 = String.valueOf(zzaVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f10899h) {
                GmsClientSupervisor.zza zzaVar = (GmsClientSupervisor.zza) message.obj;
                k kVar = this.f10899h.get(zzaVar);
                if (kVar != null && kVar.j()) {
                    if (kVar.d()) {
                        kVar.i("GmsClientSupervisor");
                    }
                    this.f10899h.remove(zzaVar);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f10899h) {
            GmsClientSupervisor.zza zzaVar2 = (GmsClientSupervisor.zza) message.obj;
            k kVar2 = this.f10899h.get(zzaVar2);
            if (kVar2 != null && kVar2.c() == 3) {
                String valueOf = String.valueOf(zzaVar2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName b2 = kVar2.b();
                if (b2 == null) {
                    b2 = zzaVar2.a();
                }
                if (b2 == null) {
                    b2 = new ComponentName(zzaVar2.b(), "unknown");
                }
                kVar2.onServiceDisconnected(b2);
            }
        }
        return true;
    }
}
