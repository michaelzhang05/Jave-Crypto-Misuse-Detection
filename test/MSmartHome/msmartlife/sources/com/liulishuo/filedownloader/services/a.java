package com.liulishuo.filedownloader.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e.h.a.h0.b;
import e.h.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseFileServiceUIGuard.java */
/* loaded from: classes2.dex */
public abstract class a<CALLBACK extends Binder, INTERFACE extends IInterface> implements u, ServiceConnection {

    /* renamed from: g, reason: collision with root package name */
    private volatile INTERFACE f17201g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f17202h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f17203i = false;

    /* renamed from: j, reason: collision with root package name */
    private final HashMap<String, Object> f17204j = new HashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private final List<Context> f17205k = new ArrayList();
    private final ArrayList<Runnable> l = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final CALLBACK f17200f = c();

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Class<?> cls) {
        this.f17202h = cls;
    }

    private void f(boolean z) {
        if (!z && this.f17201g != null) {
            try {
                g(this.f17201g, this.f17200f);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "release connect resources %s", this.f17201g);
        }
        this.f17201g = null;
        e.h.a.f.e().b(new e.h.a.h0.b(z ? b.a.lost : b.a.disconnected, this.f17202h));
    }

    @Override // e.h.a.u
    public void Y(Context context) {
        b(context, null);
    }

    @Override // e.h.a.u
    public boolean Z() {
        return this.f17203i;
    }

    protected abstract INTERFACE a(IBinder iBinder);

    public void b(Context context, Runnable runnable) {
        if (!e.h.a.k0.f.J(context)) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "bindStartByContext %s", context.getClass().getSimpleName());
            }
            Intent intent = new Intent(context, this.f17202h);
            if (runnable != null && !this.l.contains(runnable)) {
                this.l.add(runnable);
            }
            if (!this.f17205k.contains(context)) {
                this.f17205k.add(context);
            }
            boolean P = e.h.a.k0.f.P(context);
            this.f17203i = P;
            intent.putExtra("is_foreground", P);
            context.bindService(intent, this, 1);
            if (this.f17203i) {
                if (e.h.a.k0.d.a) {
                    e.h.a.k0.d.a(this, "start foreground service", new Object[0]);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                    return;
                }
                return;
            }
            context.startService(intent);
            return;
        }
        throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
    }

    protected abstract CALLBACK c();

    /* JADX INFO: Access modifiers changed from: protected */
    public INTERFACE d() {
        return this.f17201g;
    }

    protected abstract void e(INTERFACE r1, CALLBACK callback) throws RemoteException;

    protected abstract void g(INTERFACE r1, CALLBACK callback) throws RemoteException;

    @Override // e.h.a.u
    public boolean isConnected() {
        return d() != null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f17201g = a(iBinder);
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "onServiceConnected %s %s", componentName, this.f17201g);
        }
        try {
            e(this.f17201g, this.f17200f);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        List list = (List) this.l.clone();
        this.l.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        e.h.a.f.e().b(new e.h.a.h0.b(b.a.connected, this.f17202h));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "onServiceDisconnected %s %s", componentName, this.f17201g);
        }
        f(true);
    }
}
