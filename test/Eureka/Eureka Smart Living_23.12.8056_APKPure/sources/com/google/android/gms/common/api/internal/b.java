package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.f0;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t3.b0;
import v1.e0;

/* loaded from: classes.dex */
public class b implements Handler.Callback {

    /* renamed from: r, reason: collision with root package name */
    public static final Status f4562r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: s, reason: collision with root package name */
    private static final Status f4563s = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: t, reason: collision with root package name */
    private static final Object f4564t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static b f4565u;

    /* renamed from: e, reason: collision with root package name */
    private v1.r f4570e;

    /* renamed from: f, reason: collision with root package name */
    private v1.t f4571f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f4572g;

    /* renamed from: h, reason: collision with root package name */
    private final s1.f f4573h;

    /* renamed from: i, reason: collision with root package name */
    private final e0 f4574i;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f4581p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f4582q;

    /* renamed from: a, reason: collision with root package name */
    private long f4566a = 5000;

    /* renamed from: b, reason: collision with root package name */
    private long f4567b = 120000;

    /* renamed from: c, reason: collision with root package name */
    private long f4568c = 10000;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4569d = false;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f4575j = new AtomicInteger(1);

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f4576k = new AtomicInteger(0);

    /* renamed from: l, reason: collision with root package name */
    private final Map f4577l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m, reason: collision with root package name */
    private f f4578m = null;

    /* renamed from: n, reason: collision with root package name */
    private final Set f4579n = new l.b();

    /* renamed from: o, reason: collision with root package name */
    private final Set f4580o = new l.b();

    private b(Context context, Looper looper, s1.f fVar) {
        this.f4582q = true;
        this.f4572g = context;
        d2.f fVar2 = new d2.f(looper, this);
        this.f4581p = fVar2;
        this.f4573h = fVar;
        this.f4574i = new e0(fVar);
        if (z1.f.a(context)) {
            this.f4582q = false;
        }
        fVar2.sendMessage(fVar2.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(u1.b bVar, s1.a aVar) {
        String b6 = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b6).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b6);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(aVar, sb.toString());
    }

    private final l i(t1.d dVar) {
        u1.b d6 = dVar.d();
        l lVar = (l) this.f4577l.get(d6);
        if (lVar == null) {
            lVar = new l(this, dVar);
            this.f4577l.put(d6, lVar);
        }
        if (lVar.L()) {
            this.f4580o.add(d6);
        }
        lVar.D();
        return lVar;
    }

    private final v1.t j() {
        if (this.f4571f == null) {
            this.f4571f = v1.s.a(this.f4572g);
        }
        return this.f4571f;
    }

    private final void k() {
        v1.r rVar = this.f4570e;
        if (rVar != null) {
            if (rVar.a() > 0 || f()) {
                j().a(rVar);
            }
            this.f4570e = null;
        }
    }

    private final void l(l2.j jVar, int i6, t1.d dVar) {
        p b6;
        if (i6 == 0 || (b6 = p.b(this, i6, dVar.d())) == null) {
            return;
        }
        l2.i a6 = jVar.a();
        final Handler handler = this.f4581p;
        handler.getClass();
        a6.b(new Executor() { // from class: u1.l
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b6);
    }

    public static b x(Context context) {
        b bVar;
        synchronized (f4564t) {
            if (f4565u == null) {
                f4565u = new b(context.getApplicationContext(), v1.h.c().getLooper(), s1.f.k());
            }
            bVar = f4565u;
        }
        return bVar;
    }

    public final void D(t1.d dVar, int i6, c cVar, l2.j jVar, u1.j jVar2) {
        l(jVar, cVar.d(), dVar);
        t tVar = new t(i6, cVar, jVar, jVar2);
        Handler handler = this.f4581p;
        handler.sendMessage(handler.obtainMessage(4, new u1.r(tVar, this.f4576k.get(), dVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(v1.l lVar, int i6, long j6, int i7) {
        Handler handler = this.f4581p;
        handler.sendMessage(handler.obtainMessage(18, new q(lVar, i6, j6, i7)));
    }

    public final void F(s1.a aVar, int i6) {
        if (g(aVar, i6)) {
            return;
        }
        Handler handler = this.f4581p;
        handler.sendMessage(handler.obtainMessage(5, i6, 0, aVar));
    }

    public final void a() {
        Handler handler = this.f4581p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(t1.d dVar) {
        Handler handler = this.f4581p;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void c(f fVar) {
        synchronized (f4564t) {
            if (this.f4578m != fVar) {
                this.f4578m = fVar;
                this.f4579n.clear();
            }
            this.f4579n.addAll(fVar.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(f fVar) {
        synchronized (f4564t) {
            if (this.f4578m == fVar) {
                this.f4578m = null;
                this.f4579n.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f4569d) {
            return false;
        }
        v1.p a6 = v1.o.b().a();
        if (a6 != null && !a6.c()) {
            return false;
        }
        int a7 = this.f4574i.a(this.f4572g, 203400000);
        return a7 == -1 || a7 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(s1.a aVar, int i6) {
        return this.f4573h.u(this.f4572g, aVar, i6);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        u1.b bVar;
        u1.b bVar2;
        u1.b bVar3;
        u1.b bVar4;
        int i6 = message.what;
        l lVar = null;
        switch (i6) {
            case 1:
                this.f4568c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f4581p.removeMessages(12);
                for (u1.b bVar5 : this.f4577l.keySet()) {
                    Handler handler = this.f4581p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar5), this.f4568c);
                }
                return true;
            case 2:
                f0.a(message.obj);
                throw null;
            case 3:
                for (l lVar2 : this.f4577l.values()) {
                    lVar2.C();
                    lVar2.D();
                }
                return true;
            case 4:
            case 8:
            case 13:
                u1.r rVar = (u1.r) message.obj;
                l lVar3 = (l) this.f4577l.get(rVar.f9394c.d());
                if (lVar3 == null) {
                    lVar3 = i(rVar.f9394c);
                }
                if (!lVar3.L() || this.f4576k.get() == rVar.f9393b) {
                    lVar3.E(rVar.f9392a);
                } else {
                    rVar.f9392a.a(f4562r);
                    lVar3.J();
                }
                return true;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                int i7 = message.arg1;
                s1.a aVar = (s1.a) message.obj;
                Iterator it = this.f4577l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        l lVar4 = (l) it.next();
                        if (lVar4.r() == i7) {
                            lVar = lVar4;
                        }
                    }
                }
                if (lVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i7);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (aVar.a() == 13) {
                    String d6 = this.f4573h.d(aVar.a());
                    String b6 = aVar.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d6).length() + 69 + String.valueOf(b6).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(d6);
                    sb2.append(": ");
                    sb2.append(b6);
                    l.x(lVar, new Status(17, sb2.toString()));
                } else {
                    l.x(lVar, h(l.v(lVar), aVar));
                }
                return true;
            case 6:
                if (this.f4572g.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f4572g.getApplicationContext());
                    a.b().a(new g(this));
                    if (!a.b().e(true)) {
                        this.f4568c = 300000L;
                    }
                }
                return true;
            case 7:
                i((t1.d) message.obj);
                return true;
            case 9:
                if (this.f4577l.containsKey(message.obj)) {
                    ((l) this.f4577l.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it2 = this.f4580o.iterator();
                while (it2.hasNext()) {
                    l lVar5 = (l) this.f4577l.remove((u1.b) it2.next());
                    if (lVar5 != null) {
                        lVar5.J();
                    }
                }
                this.f4580o.clear();
                return true;
            case 11:
                if (this.f4577l.containsKey(message.obj)) {
                    ((l) this.f4577l.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f4577l.containsKey(message.obj)) {
                    ((l) this.f4577l.get(message.obj)).d();
                }
                return true;
            case 14:
                f0.a(message.obj);
                throw null;
            case 15:
                m mVar = (m) message.obj;
                Map map = this.f4577l;
                bVar = mVar.f4615a;
                if (map.containsKey(bVar)) {
                    Map map2 = this.f4577l;
                    bVar2 = mVar.f4615a;
                    l.A((l) map2.get(bVar2), mVar);
                }
                return true;
            case 16:
                m mVar2 = (m) message.obj;
                Map map3 = this.f4577l;
                bVar3 = mVar2.f4615a;
                if (map3.containsKey(bVar3)) {
                    Map map4 = this.f4577l;
                    bVar4 = mVar2.f4615a;
                    l.B((l) map4.get(bVar4), mVar2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                q qVar = (q) message.obj;
                if (qVar.f4632c == 0) {
                    j().a(new v1.r(qVar.f4631b, Arrays.asList(qVar.f4630a)));
                } else {
                    v1.r rVar2 = this.f4570e;
                    if (rVar2 != null) {
                        List b7 = rVar2.b();
                        if (rVar2.a() != qVar.f4631b || (b7 != null && b7.size() >= qVar.f4633d)) {
                            this.f4581p.removeMessages(17);
                            k();
                        } else {
                            this.f4570e.c(qVar.f4630a);
                        }
                    }
                    if (this.f4570e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(qVar.f4630a);
                        this.f4570e = new v1.r(qVar.f4631b, arrayList);
                        Handler handler2 = this.f4581p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), qVar.f4632c);
                    }
                }
                return true;
            case 19:
                this.f4569d = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i6);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final int m() {
        return this.f4575j.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l w(u1.b bVar) {
        return (l) this.f4577l.get(bVar);
    }
}
