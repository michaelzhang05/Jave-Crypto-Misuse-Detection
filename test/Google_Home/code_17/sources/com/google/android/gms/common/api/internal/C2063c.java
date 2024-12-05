package com.google.android.gms.common.api.internal;

import N.C1331b;
import N.C1336g;
import P.C1357b;
import Q.AbstractC1392h;
import Q.AbstractC1404u;
import Q.C1397m;
import Q.C1401q;
import Q.C1403t;
import Q.G;
import Q.InterfaceC1405v;
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
import d0.HandlerC2730i;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q0.C3826j;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2063c implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f15929p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f15930q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f15931r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C2063c f15932s;

    /* renamed from: c, reason: collision with root package name */
    private C1403t f15935c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1405v f15936d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f15937e;

    /* renamed from: f, reason: collision with root package name */
    private final C1336g f15938f;

    /* renamed from: g, reason: collision with root package name */
    private final G f15939g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f15946n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f15947o;

    /* renamed from: a, reason: collision with root package name */
    private long f15933a = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15934b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f15940h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f15941i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f15942j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private h f15943k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f15944l = new ArraySet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f15945m = new ArraySet();

    private C2063c(Context context, Looper looper, C1336g c1336g) {
        this.f15947o = true;
        this.f15937e = context;
        HandlerC2730i handlerC2730i = new HandlerC2730i(looper, this);
        this.f15946n = handlerC2730i;
        this.f15938f = c1336g;
        this.f15939g = new G(c1336g);
        if (V.h.a(context)) {
            this.f15947o = false;
        }
        handlerC2730i.sendMessage(handlerC2730i.obtainMessage(6));
    }

    public static void a() {
        synchronized (f15931r) {
            try {
                C2063c c2063c = f15932s;
                if (c2063c != null) {
                    c2063c.f15941i.incrementAndGet();
                    Handler handler = c2063c.f15946n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(C1357b c1357b, C1331b c1331b) {
        return new Status(c1331b, "API: " + c1357b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c1331b));
    }

    private final n h(O.e eVar) {
        Map map = this.f15942j;
        C1357b i8 = eVar.i();
        n nVar = (n) map.get(i8);
        if (nVar == null) {
            nVar = new n(this, eVar);
            this.f15942j.put(i8, nVar);
        }
        if (nVar.a()) {
            this.f15945m.add(i8);
        }
        nVar.E();
        return nVar;
    }

    private final InterfaceC1405v i() {
        if (this.f15936d == null) {
            this.f15936d = AbstractC1404u.a(this.f15937e);
        }
        return this.f15936d;
    }

    private final void j() {
        C1403t c1403t = this.f15935c;
        if (c1403t != null) {
            if (c1403t.p() > 0 || e()) {
                i().a(c1403t);
            }
            this.f15935c = null;
        }
    }

    private final void k(C3826j c3826j, int i8, O.e eVar) {
        r b8;
        if (i8 != 0 && (b8 = r.b(this, i8, eVar.i())) != null) {
            Task a8 = c3826j.a();
            final Handler handler = this.f15946n;
            handler.getClass();
            a8.b(new Executor() { // from class: P.o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b8);
        }
    }

    public static C2063c u(Context context) {
        C2063c c2063c;
        synchronized (f15931r) {
            try {
                if (f15932s == null) {
                    f15932s = new C2063c(context.getApplicationContext(), AbstractC1392h.b().getLooper(), C1336g.n());
                }
                c2063c = f15932s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2063c;
    }

    public final void A(O.e eVar, int i8, AbstractC2062b abstractC2062b) {
        this.f15946n.sendMessage(this.f15946n.obtainMessage(4, new P.u(new v(i8, abstractC2062b), this.f15941i.get(), eVar)));
    }

    public final void B(O.e eVar, int i8, AbstractC2064d abstractC2064d, C3826j c3826j, P.k kVar) {
        k(c3826j, abstractC2064d.d(), eVar);
        this.f15946n.sendMessage(this.f15946n.obtainMessage(4, new P.u(new w(i8, abstractC2064d, c3826j, kVar), this.f15941i.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(C1397m c1397m, int i8, long j8, int i9) {
        this.f15946n.sendMessage(this.f15946n.obtainMessage(18, new s(c1397m, i8, j8, i9)));
    }

    public final void D(C1331b c1331b, int i8) {
        if (!f(c1331b, i8)) {
            Handler handler = this.f15946n;
            handler.sendMessage(handler.obtainMessage(5, i8, 0, c1331b));
        }
    }

    public final void E() {
        Handler handler = this.f15946n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(O.e eVar) {
        Handler handler = this.f15946n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(h hVar) {
        synchronized (f15931r) {
            try {
                if (this.f15943k != hVar) {
                    this.f15943k = hVar;
                    this.f15944l.clear();
                }
                this.f15944l.addAll(hVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(h hVar) {
        synchronized (f15931r) {
            try {
                if (this.f15943k == hVar) {
                    this.f15943k = null;
                    this.f15944l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f15934b) {
            return false;
        }
        Q.r a8 = C1401q.b().a();
        if (a8 != null && !a8.v()) {
            return false;
        }
        int a9 = this.f15939g.a(this.f15937e, 203400000);
        if (a9 != -1 && a9 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(C1331b c1331b, int i8) {
        return this.f15938f.x(this.f15937e, c1331b, i8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1357b c1357b;
        C1357b c1357b2;
        C1357b c1357b3;
        C1357b c1357b4;
        int i8 = message.what;
        long j8 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        n nVar = null;
        switch (i8) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j8 = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.f15933a = j8;
                this.f15946n.removeMessages(12);
                for (C1357b c1357b5 : this.f15942j.keySet()) {
                    Handler handler = this.f15946n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1357b5), this.f15933a);
                }
                return true;
            case 2:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 3:
                for (n nVar2 : this.f15942j.values()) {
                    nVar2.D();
                    nVar2.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                P.u uVar = (P.u) message.obj;
                n nVar3 = (n) this.f15942j.get(uVar.f8651c.i());
                if (nVar3 == null) {
                    nVar3 = h(uVar.f8651c);
                }
                if (nVar3.a() && this.f15941i.get() != uVar.f8650b) {
                    uVar.f8649a.a(f15929p);
                    nVar3.K();
                } else {
                    nVar3.F(uVar.f8649a);
                }
                return true;
            case 5:
                int i9 = message.arg1;
                C1331b c1331b = (C1331b) message.obj;
                Iterator it = this.f15942j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        n nVar4 = (n) it.next();
                        if (nVar4.s() == i9) {
                            nVar = nVar4;
                        }
                    }
                }
                if (nVar != null) {
                    if (c1331b.p() == 13) {
                        n.y(nVar, new Status(17, "Error resolution was canceled by the user, original error message: " + this.f15938f.e(c1331b.p()) + ": " + c1331b.u()));
                    } else {
                        n.y(nVar, g(n.w(nVar), c1331b));
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                }
                return true;
            case 6:
                if (this.f15937e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2061a.c((Application) this.f15937e.getApplicationContext());
                    ComponentCallbacks2C2061a.b().a(new i(this));
                    if (!ComponentCallbacks2C2061a.b().e(true)) {
                        this.f15933a = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                    }
                }
                return true;
            case 7:
                h((O.e) message.obj);
                return true;
            case 9:
                if (this.f15942j.containsKey(message.obj)) {
                    ((n) this.f15942j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f15945m.iterator();
                while (it2.hasNext()) {
                    n nVar5 = (n) this.f15942j.remove((C1357b) it2.next());
                    if (nVar5 != null) {
                        nVar5.K();
                    }
                }
                this.f15945m.clear();
                return true;
            case 11:
                if (this.f15942j.containsKey(message.obj)) {
                    ((n) this.f15942j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f15942j.containsKey(message.obj)) {
                    ((n) this.f15942j.get(message.obj)).b();
                }
                return true;
            case 14:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 15:
                o oVar = (o) message.obj;
                Map map = this.f15942j;
                c1357b = oVar.f15982a;
                if (map.containsKey(c1357b)) {
                    Map map2 = this.f15942j;
                    c1357b2 = oVar.f15982a;
                    n.B((n) map2.get(c1357b2), oVar);
                }
                return true;
            case 16:
                o oVar2 = (o) message.obj;
                Map map3 = this.f15942j;
                c1357b3 = oVar2.f15982a;
                if (map3.containsKey(c1357b3)) {
                    Map map4 = this.f15942j;
                    c1357b4 = oVar2.f15982a;
                    n.C((n) map4.get(c1357b4), oVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f15999c == 0) {
                    i().a(new C1403t(sVar.f15998b, Arrays.asList(sVar.f15997a)));
                } else {
                    C1403t c1403t = this.f15935c;
                    if (c1403t != null) {
                        List u8 = c1403t.u();
                        if (c1403t.p() == sVar.f15998b && (u8 == null || u8.size() < sVar.f16000d)) {
                            this.f15935c.v(sVar.f15997a);
                        } else {
                            this.f15946n.removeMessages(17);
                            j();
                        }
                    }
                    if (this.f15935c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sVar.f15997a);
                        this.f15935c = new C1403t(sVar.f15998b, arrayList);
                        Handler handler2 = this.f15946n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), sVar.f15999c);
                    }
                }
                return true;
            case 19:
                this.f15934b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i8);
                return false;
        }
    }

    public final int l() {
        return this.f15940h.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n t(C1357b c1357b) {
        return (n) this.f15942j.get(c1357b);
    }
}
