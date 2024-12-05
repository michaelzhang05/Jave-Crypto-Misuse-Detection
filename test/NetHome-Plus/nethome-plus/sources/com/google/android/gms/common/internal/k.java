package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements ServiceConnection {

    /* renamed from: f, reason: collision with root package name */
    private final Set<ServiceConnection> f10903f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private int f10904g = 2;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10905h;

    /* renamed from: i, reason: collision with root package name */
    private IBinder f10906i;

    /* renamed from: j, reason: collision with root package name */
    private final GmsClientSupervisor.zza f10907j;

    /* renamed from: k, reason: collision with root package name */
    private ComponentName f10908k;
    private final /* synthetic */ j l;

    public k(j jVar, GmsClientSupervisor.zza zzaVar) {
        this.l = jVar;
        this.f10907j = zzaVar;
    }

    public final IBinder a() {
        return this.f10906i;
    }

    public final ComponentName b() {
        return this.f10908k;
    }

    public final int c() {
        return this.f10904g;
    }

    public final boolean d() {
        return this.f10905h;
    }

    public final void e(ServiceConnection serviceConnection, String str) {
        Context context;
        ConnectionTracker unused;
        Context unused2;
        unused = this.l.f10902k;
        unused2 = this.l.f10900i;
        GmsClientSupervisor.zza zzaVar = this.f10907j;
        context = this.l.f10900i;
        zzaVar.c(context);
        this.f10903f.add(serviceConnection);
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f10903f.contains(serviceConnection);
    }

    public final void g(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused;
        Context unused2;
        unused = this.l.f10902k;
        unused2 = this.l.f10900i;
        this.f10903f.remove(serviceConnection);
    }

    public final void h(String str) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j2;
        this.f10904g = 3;
        connectionTracker = this.l.f10902k;
        context = this.l.f10900i;
        GmsClientSupervisor.zza zzaVar = this.f10907j;
        context2 = this.l.f10900i;
        boolean d2 = connectionTracker.d(context, str, zzaVar.c(context2), this, this.f10907j.d());
        this.f10905h = d2;
        if (d2) {
            handler = this.l.f10901j;
            Message obtainMessage = handler.obtainMessage(1, this.f10907j);
            handler2 = this.l.f10901j;
            j2 = this.l.m;
            handler2.sendMessageDelayed(obtainMessage, j2);
            return;
        }
        this.f10904g = 2;
        try {
            connectionTracker2 = this.l.f10902k;
            context3 = this.l.f10900i;
            connectionTracker2.c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void i(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        handler = this.l.f10901j;
        handler.removeMessages(1, this.f10907j);
        connectionTracker = this.l.f10902k;
        context = this.l.f10900i;
        connectionTracker.c(context, this);
        this.f10905h = false;
        this.f10904g = 2;
    }

    public final boolean j() {
        return this.f10903f.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.l.f10899h;
        synchronized (hashMap) {
            handler = this.l.f10901j;
            handler.removeMessages(1, this.f10907j);
            this.f10906i = iBinder;
            this.f10908k = componentName;
            Iterator<ServiceConnection> it = this.f10903f.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f10904g = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.l.f10899h;
        synchronized (hashMap) {
            handler = this.l.f10901j;
            handler.removeMessages(1, this.f10907j);
            this.f10906i = null;
            this.f10908k = componentName;
            Iterator<ServiceConnection> it = this.f10903f.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f10904g = 2;
        }
    }
}
