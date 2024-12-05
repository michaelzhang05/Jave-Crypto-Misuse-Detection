package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.d;
import androidx.room.e;
import androidx.room.g;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient.java */
/* loaded from: classes.dex */
class h {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    final String f1642b;

    /* renamed from: c, reason: collision with root package name */
    int f1643c;

    /* renamed from: d, reason: collision with root package name */
    final g f1644d;

    /* renamed from: e, reason: collision with root package name */
    final g.c f1645e;

    /* renamed from: f, reason: collision with root package name */
    androidx.room.e f1646f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f1647g;

    /* renamed from: h, reason: collision with root package name */
    final androidx.room.d f1648h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f1649i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f1650j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f1651k;
    final Runnable l;
    private final Runnable m;

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class a extends d.a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: androidx.room.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0032a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String[] f1653f;

            RunnableC0032a(String[] strArr) {
                this.f1653f = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f1644d.e(this.f1653f);
            }
        }

        a() {
        }

        @Override // androidx.room.d
        public void y1(String[] strArr) {
            h.this.f1647g.execute(new RunnableC0032a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.this.f1646f = e.a.u(iBinder);
            h hVar = h.this;
            hVar.f1647g.execute(hVar.f1651k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h hVar = h.this;
            hVar.f1647g.execute(hVar.l);
            h.this.f1646f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h hVar = h.this;
                androidx.room.e eVar = hVar.f1646f;
                if (eVar != null) {
                    hVar.f1643c = eVar.b2(hVar.f1648h, hVar.f1642b);
                    h hVar2 = h.this;
                    hVar2.f1644d.a(hVar2.f1645e);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f1644d.g(hVar.f1645e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f1644d.g(hVar.f1645e);
            try {
                h hVar2 = h.this;
                androidx.room.e eVar = hVar2.f1646f;
                if (eVar != null) {
                    eVar.s7(hVar2.f1648h, hVar2.f1643c);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
            }
            h hVar3 = h.this;
            hVar3.a.unbindService(hVar3.f1650j);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class f extends g.c {
        f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.g.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.g.c
        public void b(Set<String> set) {
            if (h.this.f1649i.get()) {
                return;
            }
            try {
                h hVar = h.this;
                androidx.room.e eVar = hVar.f1646f;
                if (eVar != null) {
                    eVar.U6(hVar.f1643c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot broadcast invalidation", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, String str, g gVar, Executor executor) {
        b bVar = new b();
        this.f1650j = bVar;
        this.f1651k = new c();
        this.l = new d();
        this.m = new e();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f1642b = str;
        this.f1644d = gVar;
        this.f1647g = executor;
        this.f1645e = new f((String[]) gVar.f1624b.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f1649i.compareAndSet(false, true)) {
            this.f1647g.execute(this.m);
        }
    }
}
