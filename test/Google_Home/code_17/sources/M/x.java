package M;

import Q.AbstractC1400p;
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
import e0.HandlerC2769f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    y f6386c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ D f6389f;

    /* renamed from: a, reason: collision with root package name */
    int f6384a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f6385b = new Messenger(new HandlerC2769f(Looper.getMainLooper(), new Handler.Callback() { // from class: M.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i8 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i8);
            }
            x xVar = x.this;
            synchronized (xVar) {
                try {
                    A a8 = (A) xVar.f6388e.get(i8);
                    if (a8 == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i8);
                        return true;
                    }
                    xVar.f6388e.remove(i8);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        a8.c(new B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    a8.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue f6387d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f6388e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x(D d8, w wVar) {
        this.f6389f = d8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i8, String str) {
        b(i8, str, null);
    }

    final synchronized void b(int i8, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i9 = this.f6384a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 != 3) {
                        return;
                    }
                    this.f6384a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f6384a = 4;
                U.b.b().c(D.a(this.f6389f), this);
                B b8 = new B(i8, str, th);
                Iterator it = this.f6387d.iterator();
                while (it.hasNext()) {
                    ((A) it.next()).c(b8);
                }
                this.f6387d.clear();
                for (int i10 = 0; i10 < this.f6388e.size(); i10++) {
                    ((A) this.f6388e.valueAt(i10)).c(b8);
                }
                this.f6388e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        D.e(this.f6389f).execute(new Runnable() { // from class: M.r
            @Override // java.lang.Runnable
            public final void run() {
                final A a8;
                while (true) {
                    final x xVar = x.this;
                    synchronized (xVar) {
                        try {
                            if (xVar.f6384a != 2) {
                                return;
                            }
                            if (xVar.f6387d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                a8 = (A) xVar.f6387d.poll();
                                xVar.f6388e.put(a8.f6328a, a8);
                                D.e(xVar.f6389f).schedule(new Runnable() { // from class: M.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        x.this.e(a8.f6328a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a8)));
                    }
                    D d8 = xVar.f6389f;
                    Messenger messenger = xVar.f6385b;
                    int i8 = a8.f6330c;
                    Context a9 = D.a(d8);
                    Message obtain = Message.obtain();
                    obtain.what = i8;
                    obtain.arg1 = a8.f6328a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a8.b());
                    bundle.putString("pkg", a9.getPackageName());
                    bundle.putBundle(DataSchemeDataSource.SCHEME_DATA, a8.f6331d);
                    obtain.setData(bundle);
                    try {
                        xVar.f6386c.a(obtain);
                    } catch (RemoteException e8) {
                        xVar.a(2, e8.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f6384a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i8) {
        A a8 = (A) this.f6388e.get(i8);
        if (a8 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i8);
            this.f6388e.remove(i8);
            a8.c(new B(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        try {
            if (this.f6384a == 2 && this.f6387d.isEmpty() && this.f6388e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f6384a = 3;
                U.b.b().c(D.a(this.f6389f), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(A a8) {
        boolean z8;
        int i8 = this.f6384a;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return false;
                }
                this.f6387d.add(a8);
                c();
                return true;
            }
            this.f6387d.add(a8);
            return true;
        }
        this.f6387d.add(a8);
        if (this.f6384a == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1400p.o(z8);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f6384a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!U.b.b().a(D.a(this.f6389f), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                D.e(this.f6389f).schedule(new Runnable() { // from class: M.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.d();
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
        D.e(this.f6389f).execute(new Runnable() { // from class: M.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f6386c = new y(iBinder2);
                        xVar.f6384a = 2;
                        xVar.c();
                    } catch (RemoteException e8) {
                        xVar.a(0, e8.getMessage());
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
        D.e(this.f6389f).execute(new Runnable() { // from class: M.t
            @Override // java.lang.Runnable
            public final void run() {
                x.this.a(2, "Service disconnected");
            }
        });
    }
}
