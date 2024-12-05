package N;

import R.AbstractC1319p;
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
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import f0.HandlerC2656f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    r f7123c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f7126f;

    /* renamed from: a, reason: collision with root package name */
    int f7121a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f7122b = new Messenger(new HandlerC2656f(Looper.getMainLooper(), new Handler.Callback() { // from class: N.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            q qVar = q.this;
            int i8 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i8);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (qVar) {
                try {
                    t tVar = (t) qVar.f7125e.get(i8);
                    if (tVar == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i8);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    qVar.f7125e.remove(i8);
                    qVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        tVar.c(new u(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    tVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue f7124d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f7125e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(w wVar, p pVar) {
        this.f7126f = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i8, String str) {
        b(i8, str, null);
    }

    final synchronized void b(int i8, String str, Throwable th) {
        String str2;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Disconnected: ".concat(valueOf);
                } else {
                    str2 = new String("Disconnected: ");
                }
                Log.d("MessengerIpcClient", str2);
            }
            int i9 = this.f7121a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 != 3) {
                        return;
                    }
                    this.f7121a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f7121a = 4;
                V.b.b().c(w.a(this.f7126f), this);
                u uVar = new u(i8, str, th);
                Iterator it = this.f7124d.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).c(uVar);
                }
                this.f7124d.clear();
                for (int i10 = 0; i10 < this.f7125e.size(); i10++) {
                    ((t) this.f7125e.valueAt(i10)).c(uVar);
                }
                this.f7125e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        w.e(this.f7126f).execute(new Runnable() { // from class: N.l
            @Override // java.lang.Runnable
            public final void run() {
                final t tVar;
                final q qVar = q.this;
                while (true) {
                    synchronized (qVar) {
                        try {
                            if (qVar.f7121a != 2) {
                                return;
                            }
                            if (qVar.f7124d.isEmpty()) {
                                qVar.f();
                                return;
                            } else {
                                tVar = (t) qVar.f7124d.poll();
                                qVar.f7125e.put(tVar.f7129a, tVar);
                                w.e(qVar.f7126f).schedule(new Runnable() { // from class: N.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        q.this.e(tVar.f7129a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(tVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context a8 = w.a(qVar.f7126f);
                    Messenger messenger = qVar.f7122b;
                    Message obtain = Message.obtain();
                    obtain.what = tVar.f7131c;
                    obtain.arg1 = tVar.f7129a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tVar.b());
                    bundle.putString("pkg", a8.getPackageName());
                    bundle.putBundle(DataSchemeDataSource.SCHEME_DATA, tVar.f7132d);
                    obtain.setData(bundle);
                    try {
                        qVar.f7123c.a(obtain);
                    } catch (RemoteException e8) {
                        qVar.a(2, e8.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f7121a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i8) {
        t tVar = (t) this.f7125e.get(i8);
        if (tVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i8);
            Log.w("MessengerIpcClient", sb.toString());
            this.f7125e.remove(i8);
            tVar.c(new u(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        try {
            if (this.f7121a == 2 && this.f7124d.isEmpty() && this.f7125e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f7121a = 3;
                V.b.b().c(w.a(this.f7126f), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(t tVar) {
        boolean z8;
        int i8 = this.f7121a;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return false;
                }
                this.f7124d.add(tVar);
                c();
                return true;
            }
            this.f7124d.add(tVar);
            return true;
        }
        this.f7124d.add(tVar);
        if (this.f7121a == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.o(z8);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f7121a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!V.b.b().a(w.a(this.f7126f), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                w.e(this.f7126f).schedule(new Runnable() { // from class: N.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e8) {
            b(0, "Unable to bind to service", e8);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        w.e(this.f7126f).execute(new Runnable() { // from class: N.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    if (iBinder2 == null) {
                        qVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        qVar.f7123c = new r(iBinder2);
                        qVar.f7121a = 2;
                        qVar.c();
                    } catch (RemoteException e8) {
                        qVar.a(0, e8.getMessage());
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
        w.e(this.f7126f).execute(new Runnable() { // from class: N.k
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(2, "Service disconnected");
            }
        });
    }
}
