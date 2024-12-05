package com.google.android.gms.common.api.internal;

import O.C1258b;
import O.C1263g;
import Q.C1301b;
import R.AbstractC1311h;
import R.AbstractC1323u;
import R.C1316m;
import R.C1320q;
import R.C1322t;
import R.G;
import R.InterfaceC1324v;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import r0.C3679j;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1939c implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f15128p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f15129q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f15130r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C1939c f15131s;

    /* renamed from: c, reason: collision with root package name */
    private C1322t f15134c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1324v f15135d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f15136e;

    /* renamed from: f, reason: collision with root package name */
    private final C1263g f15137f;

    /* renamed from: g, reason: collision with root package name */
    private final G f15138g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f15145n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f15146o;

    /* renamed from: a, reason: collision with root package name */
    private long f15132a = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15133b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f15139h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f15140i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f15141j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private h f15142k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f15143l = new ArraySet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f15144m = new ArraySet();

    private C1939c(Context context, Looper looper, C1263g c1263g) {
        this.f15146o = true;
        this.f15136e = context;
        e0.i iVar = new e0.i(looper, this);
        this.f15145n = iVar;
        this.f15137f = c1263g;
        this.f15138g = new G(c1263g);
        if (W.h.a(context)) {
            this.f15146o = false;
        }
        iVar.sendMessage(iVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f15130r) {
            try {
                C1939c c1939c = f15131s;
                if (c1939c != null) {
                    c1939c.f15140i.incrementAndGet();
                    Handler handler = c1939c.f15145n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(C1301b c1301b, C1258b c1258b) {
        return new Status(c1258b, "API: " + c1301b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c1258b));
    }

    private final n h(P.e eVar) {
        Map map = this.f15141j;
        C1301b i8 = eVar.i();
        n nVar = (n) map.get(i8);
        if (nVar == null) {
            nVar = new n(this, eVar);
            this.f15141j.put(i8, nVar);
        }
        if (nVar.a()) {
            this.f15144m.add(i8);
        }
        nVar.E();
        return nVar;
    }

    private final InterfaceC1324v i() {
        if (this.f15135d == null) {
            this.f15135d = AbstractC1323u.a(this.f15136e);
        }
        return this.f15135d;
    }

    private final void j() {
        C1322t c1322t = this.f15134c;
        if (c1322t != null) {
            if (c1322t.s() > 0 || e()) {
                i().a(c1322t);
            }
            this.f15134c = null;
        }
    }

    private final void k(C3679j c3679j, int i8, P.e eVar) {
        r b8;
        if (i8 != 0 && (b8 = r.b(this, i8, eVar.i())) != null) {
            Task a8 = c3679j.a();
            final Handler handler = this.f15145n;
            handler.getClass();
            a8.b(new Executor() { // from class: Q.o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b8);
        }
    }

    public static C1939c u(Context context) {
        C1939c c1939c;
        synchronized (f15130r) {
            try {
                if (f15131s == null) {
                    f15131s = new C1939c(context.getApplicationContext(), AbstractC1311h.b().getLooper(), C1263g.n());
                }
                c1939c = f15131s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1939c;
    }

    public final void A(P.e eVar, int i8, AbstractC1938b abstractC1938b) {
        this.f15145n.sendMessage(this.f15145n.obtainMessage(4, new Q.u(new v(i8, abstractC1938b), this.f15140i.get(), eVar)));
    }

    public final void B(P.e eVar, int i8, AbstractC1940d abstractC1940d, C3679j c3679j, Q.k kVar) {
        k(c3679j, abstractC1940d.d(), eVar);
        this.f15145n.sendMessage(this.f15145n.obtainMessage(4, new Q.u(new w(i8, abstractC1940d, c3679j, kVar), this.f15140i.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(C1316m c1316m, int i8, long j8, int i9) {
        this.f15145n.sendMessage(this.f15145n.obtainMessage(18, new s(c1316m, i8, j8, i9)));
    }

    public final void D(C1258b c1258b, int i8) {
        if (!f(c1258b, i8)) {
            Handler handler = this.f15145n;
            handler.sendMessage(handler.obtainMessage(5, i8, 0, c1258b));
        }
    }

    public final void E() {
        Handler handler = this.f15145n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(P.e eVar) {
        Handler handler = this.f15145n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(h hVar) {
        synchronized (f15130r) {
            try {
                if (this.f15142k != hVar) {
                    this.f15142k = hVar;
                    this.f15143l.clear();
                }
                this.f15143l.addAll(hVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(h hVar) {
        synchronized (f15130r) {
            try {
                if (this.f15142k == hVar) {
                    this.f15142k = null;
                    this.f15143l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f15133b) {
            return false;
        }
        R.r a8 = C1320q.b().a();
        if (a8 != null && !a8.z()) {
            return false;
        }
        int a9 = this.f15138g.a(this.f15136e, 203400000);
        if (a9 != -1 && a9 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(C1258b c1258b, int i8) {
        return this.f15137f.x(this.f15136e, c1258b, i8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1301b c1301b;
        C1301b c1301b2;
        C1301b c1301b3;
        C1301b c1301b4;
        int i8 = message.what;
        long j8 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        n nVar = null;
        switch (i8) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j8 = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.f15132a = j8;
                this.f15145n.removeMessages(12);
                for (C1301b c1301b5 : this.f15141j.keySet()) {
                    Handler handler = this.f15145n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1301b5), this.f15132a);
                }
                return true;
            case 2:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 3:
                for (n nVar2 : this.f15141j.values()) {
                    nVar2.D();
                    nVar2.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                Q.u uVar = (Q.u) message.obj;
                n nVar3 = (n) this.f15141j.get(uVar.f8160c.i());
                if (nVar3 == null) {
                    nVar3 = h(uVar.f8160c);
                }
                if (nVar3.a() && this.f15140i.get() != uVar.f8159b) {
                    uVar.f8158a.a(f15128p);
                    nVar3.K();
                } else {
                    nVar3.F(uVar.f8158a);
                }
                return true;
            case 5:
                int i9 = message.arg1;
                C1258b c1258b = (C1258b) message.obj;
                Iterator it = this.f15141j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        n nVar4 = (n) it.next();
                        if (nVar4.s() == i9) {
                            nVar = nVar4;
                        }
                    }
                }
                if (nVar != null) {
                    if (c1258b.s() == 13) {
                        n.y(nVar, new Status(17, "Error resolution was canceled by the user, original error message: " + this.f15137f.e(c1258b.s()) + ": " + c1258b.u()));
                    } else {
                        n.y(nVar, g(n.w(nVar), c1258b));
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                }
                return true;
            case 6:
                if (this.f15136e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1937a.c((Application) this.f15136e.getApplicationContext());
                    ComponentCallbacks2C1937a.b().a(new i(this));
                    if (!ComponentCallbacks2C1937a.b().e(true)) {
                        this.f15132a = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                    }
                }
                return true;
            case 7:
                h((P.e) message.obj);
                return true;
            case 9:
                if (this.f15141j.containsKey(message.obj)) {
                    ((n) this.f15141j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f15144m.iterator();
                while (it2.hasNext()) {
                    n nVar5 = (n) this.f15141j.remove((C1301b) it2.next());
                    if (nVar5 != null) {
                        nVar5.K();
                    }
                }
                this.f15144m.clear();
                return true;
            case 11:
                if (this.f15141j.containsKey(message.obj)) {
                    ((n) this.f15141j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f15141j.containsKey(message.obj)) {
                    ((n) this.f15141j.get(message.obj)).b();
                }
                return true;
            case 14:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 15:
                o oVar = (o) message.obj;
                Map map = this.f15141j;
                c1301b = oVar.f15181a;
                if (map.containsKey(c1301b)) {
                    Map map2 = this.f15141j;
                    c1301b2 = oVar.f15181a;
                    n.B((n) map2.get(c1301b2), oVar);
                }
                return true;
            case 16:
                o oVar2 = (o) message.obj;
                Map map3 = this.f15141j;
                c1301b3 = oVar2.f15181a;
                if (map3.containsKey(c1301b3)) {
                    Map map4 = this.f15141j;
                    c1301b4 = oVar2.f15181a;
                    n.C((n) map4.get(c1301b4), oVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f15198c == 0) {
                    i().a(new C1322t(sVar.f15197b, Arrays.asList(sVar.f15196a)));
                } else {
                    C1322t c1322t = this.f15134c;
                    if (c1322t != null) {
                        List u8 = c1322t.u();
                        if (c1322t.s() == sVar.f15197b && (u8 == null || u8.size() < sVar.f15199d)) {
                            this.f15134c.z(sVar.f15196a);
                        } else {
                            this.f15145n.removeMessages(17);
                            j();
                        }
                    }
                    if (this.f15134c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sVar.f15196a);
                        this.f15134c = new C1322t(sVar.f15197b, arrayList);
                        Handler handler2 = this.f15145n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), sVar.f15198c);
                    }
                }
                return true;
            case 19:
                this.f15133b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i8);
                return false;
        }
    }

    public final int l() {
        return this.f15139h.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n t(C1301b c1301b) {
        return (n) this.f15141j.get(c1301b);
    }
}
