package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: PlatformServiceClient.java */
/* loaded from: classes.dex */
public abstract class t implements ServiceConnection {

    /* renamed from: f, reason: collision with root package name */
    private final Context f9219f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f9220g;

    /* renamed from: h, reason: collision with root package name */
    private b f9221h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9222i;

    /* renamed from: j, reason: collision with root package name */
    private Messenger f9223j;

    /* renamed from: k, reason: collision with root package name */
    private int f9224k;
    private int l;
    private final String m;
    private final int n;

    /* compiled from: PlatformServiceClient.java */
    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                t.this.c(message);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* compiled from: PlatformServiceClient.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Bundle bundle);
    }

    public t(Context context, int i2, int i3, int i4, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f9219f = applicationContext != null ? applicationContext : context;
        this.f9224k = i2;
        this.l = i3;
        this.m = str;
        this.n = i4;
        this.f9220g = new a();
    }

    private void a(Bundle bundle) {
        if (this.f9222i) {
            this.f9222i = false;
            b bVar = this.f9221h;
            if (bVar != null) {
                bVar.a(bundle);
            }
        }
    }

    private void e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.m);
        d(bundle);
        Message obtain = Message.obtain((Handler) null, this.f9224k);
        obtain.arg1 = this.n;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f9220g);
        try {
            this.f9223j.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public void b() {
        this.f9222i = false;
    }

    protected void c(Message message) {
        if (message.what == this.l) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.f9219f.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void d(Bundle bundle);

    public void f(b bVar) {
        this.f9221h = bVar;
    }

    public boolean g() {
        Intent l;
        if (this.f9222i || s.s(this.n) == -1 || (l = s.l(this.f9219f)) == null) {
            return false;
        }
        this.f9222i = true;
        this.f9219f.bindService(l, this, 1);
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9223j = new Messenger(iBinder);
        e();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f9223j = null;
        try {
            this.f9219f.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
