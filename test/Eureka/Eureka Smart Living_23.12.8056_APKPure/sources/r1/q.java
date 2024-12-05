package r1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    r f9091c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f9094f;

    /* renamed from: a, reason: collision with root package name */
    int f9089a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f9090b = new Messenger(new e2.f(Looper.getMainLooper(), new Handler.Callback() { // from class: r1.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            q qVar = q.this;
            int i6 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i6);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (qVar) {
                t tVar = (t) qVar.f9093e.get(i6);
                if (tVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i6);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                qVar.f9093e.remove(i6);
                qVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    tVar.c(new u(4, "Not supported by GmsCore", null));
                    return true;
                }
                tVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue f9092d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f9093e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(w wVar, p pVar) {
        this.f9094f = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i6, String str) {
        b(i6, str, null);
    }

    final synchronized void b(int i6, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i7 = this.f9089a;
        if (i7 == 0) {
            throw new IllegalStateException();
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            this.f9089a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f9089a = 4;
        y1.b.b().c(w.a(this.f9094f), this);
        u uVar = new u(i6, str, th);
        Iterator it = this.f9092d.iterator();
        while (it.hasNext()) {
            ((t) it.next()).c(uVar);
        }
        this.f9092d.clear();
        for (int i8 = 0; i8 < this.f9093e.size(); i8++) {
            ((t) this.f9093e.valueAt(i8)).c(uVar);
        }
        this.f9093e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        w.e(this.f9094f).execute(new Runnable() { // from class: r1.l
            @Override // java.lang.Runnable
            public final void run() {
                final t tVar;
                final q qVar = q.this;
                while (true) {
                    synchronized (qVar) {
                        if (qVar.f9089a != 2) {
                            return;
                        }
                        if (qVar.f9092d.isEmpty()) {
                            qVar.f();
                            return;
                        } else {
                            tVar = (t) qVar.f9092d.poll();
                            qVar.f9093e.put(tVar.f9097a, tVar);
                            w.e(qVar.f9094f).schedule(new Runnable() { // from class: r1.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.this.e(tVar.f9097a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(tVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context a6 = w.a(qVar.f9094f);
                    Messenger messenger = qVar.f9090b;
                    Message obtain = Message.obtain();
                    obtain.what = tVar.f9099c;
                    obtain.arg1 = tVar.f9097a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tVar.b());
                    bundle.putString("pkg", a6.getPackageName());
                    bundle.putBundle("data", tVar.f9100d);
                    obtain.setData(bundle);
                    try {
                        qVar.f9091c.a(obtain);
                    } catch (RemoteException e6) {
                        qVar.a(2, e6.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f9089a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i6) {
        t tVar = (t) this.f9093e.get(i6);
        if (tVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i6);
            Log.w("MessengerIpcClient", sb.toString());
            this.f9093e.remove(i6);
            tVar.c(new u(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.f9089a == 2 && this.f9092d.isEmpty() && this.f9093e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f9089a = 3;
            y1.b.b().c(w.a(this.f9094f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(t tVar) {
        int i6 = this.f9089a;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f9092d.add(tVar);
                return true;
            }
            if (i6 != 2) {
                return false;
            }
            this.f9092d.add(tVar);
            c();
            return true;
        }
        this.f9092d.add(tVar);
        v1.n.j(this.f9089a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f9089a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (y1.b.b().a(w.a(this.f9094f), intent, this, 1)) {
                w.e(this.f9094f).schedule(new Runnable() { // from class: r1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e6) {
            b(0, "Unable to bind to service", e6);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        w.e(this.f9094f).execute(new Runnable() { // from class: r1.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    try {
                        if (iBinder2 == null) {
                            qVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            qVar.f9091c = new r(iBinder2);
                            qVar.f9089a = 2;
                            qVar.c();
                        } catch (RemoteException e6) {
                            qVar.a(0, e6.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        w.e(this.f9094f).execute(new Runnable() { // from class: r1.k
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(2, "Service disconnected");
            }
        });
    }
}
