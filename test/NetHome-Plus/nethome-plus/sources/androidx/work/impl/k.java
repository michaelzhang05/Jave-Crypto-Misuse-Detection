package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.n.p;
import androidx.work.impl.n.q;
import androidx.work.impl.n.t;
import androidx.work.impl.utils.l;
import androidx.work.impl.utils.m;
import androidx.work.n;
import androidx.work.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final String f1942f = n.f("WorkerWrapper");

    /* renamed from: g, reason: collision with root package name */
    Context f1943g;

    /* renamed from: h, reason: collision with root package name */
    private String f1944h;

    /* renamed from: i, reason: collision with root package name */
    private List<e> f1945i;

    /* renamed from: j, reason: collision with root package name */
    private WorkerParameters.a f1946j;

    /* renamed from: k, reason: collision with root package name */
    p f1947k;
    ListenableWorker l;
    androidx.work.impl.utils.p.a m;
    private androidx.work.b o;
    private androidx.work.impl.foreground.a p;
    private WorkDatabase q;
    private q r;
    private androidx.work.impl.n.b s;
    private t t;
    private List<String> u;
    private String v;
    private volatile boolean y;
    ListenableWorker.a n = ListenableWorker.a.a();
    androidx.work.impl.utils.o.c<Boolean> w = androidx.work.impl.utils.o.c.u();
    e.e.c.a.a.a<ListenableWorker.a> x = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.e.c.a.a.a f1948f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.o.c f1949g;

        a(e.e.c.a.a.a aVar, androidx.work.impl.utils.o.c cVar) {
            this.f1948f = aVar;
            this.f1949g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1948f.get();
                n.c().a(k.f1942f, String.format("Starting work for %s", k.this.f1947k.f2020e), new Throwable[0]);
                k kVar = k.this;
                kVar.x = kVar.l.startWork();
                this.f1949g.s(k.this.x);
            } catch (Throwable th) {
                this.f1949g.r(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.o.c f1951f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f1952g;

        b(androidx.work.impl.utils.o.c cVar, String str) {
            this.f1951f = cVar;
            this.f1952g = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f1951f.get();
                    if (aVar == null) {
                        n.c().b(k.f1942f, String.format("%s returned a null result. Treating it as a failure.", k.this.f1947k.f2020e), new Throwable[0]);
                    } else {
                        n.c().a(k.f1942f, String.format("%s returned a %s result.", k.this.f1947k.f2020e, aVar), new Throwable[0]);
                        k.this.n = aVar;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    n.c().b(k.f1942f, String.format("%s failed because it threw an exception/error", this.f1952g), e);
                } catch (CancellationException e3) {
                    n.c().d(k.f1942f, String.format("%s was cancelled", this.f1952g), e3);
                } catch (ExecutionException e4) {
                    e = e4;
                    n.c().b(k.f1942f, String.format("%s failed because it threw an exception/error", this.f1952g), e);
                }
            } finally {
                k.this.f();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class c {
        Context a;

        /* renamed from: b, reason: collision with root package name */
        ListenableWorker f1954b;

        /* renamed from: c, reason: collision with root package name */
        androidx.work.impl.foreground.a f1955c;

        /* renamed from: d, reason: collision with root package name */
        androidx.work.impl.utils.p.a f1956d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.b f1957e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f1958f;

        /* renamed from: g, reason: collision with root package name */
        String f1959g;

        /* renamed from: h, reason: collision with root package name */
        List<e> f1960h;

        /* renamed from: i, reason: collision with root package name */
        WorkerParameters.a f1961i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.f1956d = aVar;
            this.f1955c = aVar2;
            this.f1957e = bVar;
            this.f1958f = workDatabase;
            this.f1959g = str;
        }

        public k a() {
            return new k(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f1961i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f1960h = list;
            return this;
        }
    }

    k(c cVar) {
        this.f1943g = cVar.a;
        this.m = cVar.f1956d;
        this.p = cVar.f1955c;
        this.f1944h = cVar.f1959g;
        this.f1945i = cVar.f1960h;
        this.f1946j = cVar.f1961i;
        this.l = cVar.f1954b;
        this.o = cVar.f1957e;
        WorkDatabase workDatabase = cVar.f1958f;
        this.q = workDatabase;
        this.r = workDatabase.j();
        this.s = this.q.b();
        this.t = this.q.k();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f1944h);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            n.c().d(f1942f, String.format("Worker result SUCCESS for %s", this.v), new Throwable[0]);
            if (this.f1947k.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            n.c().d(f1942f, String.format("Worker result RETRY for %s", this.v), new Throwable[0]);
            g();
            return;
        }
        n.c().d(f1942f, String.format("Worker result FAILURE for %s", this.v), new Throwable[0]);
        if (this.f1947k.d()) {
            h();
        } else {
            l();
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.r.l(str2) != x.CANCELLED) {
                this.r.a(x.FAILED, str2);
            }
            linkedList.addAll(this.s.b(str2));
        }
    }

    private void g() {
        this.q.beginTransaction();
        try {
            this.r.a(x.ENQUEUED, this.f1944h);
            this.r.r(this.f1944h, System.currentTimeMillis());
            this.r.b(this.f1944h, -1L);
            this.q.setTransactionSuccessful();
        } finally {
            this.q.endTransaction();
            i(true);
        }
    }

    private void h() {
        this.q.beginTransaction();
        try {
            this.r.r(this.f1944h, System.currentTimeMillis());
            this.r.a(x.ENQUEUED, this.f1944h);
            this.r.n(this.f1944h);
            this.r.b(this.f1944h, -1L);
            this.q.setTransactionSuccessful();
        } finally {
            this.q.endTransaction();
            i(false);
        }
    }

    private void i(boolean z) {
        ListenableWorker listenableWorker;
        this.q.beginTransaction();
        try {
            if (!this.q.j().j()) {
                androidx.work.impl.utils.d.a(this.f1943g, RescheduleReceiver.class, false);
            }
            if (z) {
                this.r.a(x.ENQUEUED, this.f1944h);
                this.r.b(this.f1944h, -1L);
            }
            if (this.f1947k != null && (listenableWorker = this.l) != null && listenableWorker.isRunInForeground()) {
                this.p.b(this.f1944h);
            }
            this.q.setTransactionSuccessful();
            this.q.endTransaction();
            this.w.q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.q.endTransaction();
            throw th;
        }
    }

    private void j() {
        x l = this.r.l(this.f1944h);
        if (l == x.RUNNING) {
            n.c().a(f1942f, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f1944h), new Throwable[0]);
            i(true);
        } else {
            n.c().a(f1942f, String.format("Status for %s is %s; not doing any work", this.f1944h, l), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.e b2;
        if (n()) {
            return;
        }
        this.q.beginTransaction();
        try {
            p m = this.r.m(this.f1944h);
            this.f1947k = m;
            if (m == null) {
                n.c().b(f1942f, String.format("Didn't find WorkSpec for id %s", this.f1944h), new Throwable[0]);
                i(false);
                this.q.setTransactionSuccessful();
                return;
            }
            if (m.f2019d != x.ENQUEUED) {
                j();
                this.q.setTransactionSuccessful();
                n.c().a(f1942f, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f1947k.f2020e), new Throwable[0]);
                return;
            }
            if (m.d() || this.f1947k.c()) {
                long currentTimeMillis = System.currentTimeMillis();
                p pVar = this.f1947k;
                if (!(pVar.p == 0) && currentTimeMillis < pVar.a()) {
                    n.c().a(f1942f, String.format("Delaying execution for %s because it is being executed before schedule.", this.f1947k.f2020e), new Throwable[0]);
                    i(true);
                    this.q.setTransactionSuccessful();
                    return;
                }
            }
            this.q.setTransactionSuccessful();
            this.q.endTransaction();
            if (this.f1947k.d()) {
                b2 = this.f1947k.f2022g;
            } else {
                androidx.work.k b3 = this.o.f().b(this.f1947k.f2021f);
                if (b3 == null) {
                    n.c().b(f1942f, String.format("Could not create Input Merger %s", this.f1947k.f2021f), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f1947k.f2022g);
                    arrayList.addAll(this.r.p(this.f1944h));
                    b2 = b3.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f1944h), b2, this.u, this.f1946j, this.f1947k.m, this.o.e(), this.m, this.o.m(), new m(this.q, this.m), new l(this.q, this.p, this.m));
            if (this.l == null) {
                this.l = this.o.m().createWorkerWithDefaultFallback(this.f1943g, this.f1947k.f2020e, workerParameters);
            }
            ListenableWorker listenableWorker = this.l;
            if (listenableWorker == null) {
                n.c().b(f1942f, String.format("Could not create Worker %s", this.f1947k.f2020e), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                n.c().b(f1942f, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f1947k.f2020e), new Throwable[0]);
                l();
                return;
            }
            this.l.setUsed();
            if (o()) {
                if (n()) {
                    return;
                }
                androidx.work.impl.utils.o.c u = androidx.work.impl.utils.o.c.u();
                androidx.work.impl.utils.k kVar = new androidx.work.impl.utils.k(this.f1943g, this.f1947k, this.l, workerParameters.b(), this.m);
                this.m.a().execute(kVar);
                e.e.c.a.a.a<Void> a2 = kVar.a();
                a2.d(new a(a2, u), this.m.a());
                u.d(new b(u, this.v), this.m.c());
                return;
            }
            j();
        } finally {
            this.q.endTransaction();
        }
    }

    private void m() {
        this.q.beginTransaction();
        try {
            this.r.a(x.SUCCEEDED, this.f1944h);
            this.r.h(this.f1944h, ((ListenableWorker.a.c) this.n).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.s.b(this.f1944h)) {
                if (this.r.l(str) == x.BLOCKED && this.s.c(str)) {
                    n.c().d(f1942f, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.r.a(x.ENQUEUED, str);
                    this.r.r(str, currentTimeMillis);
                }
            }
            this.q.setTransactionSuccessful();
        } finally {
            this.q.endTransaction();
            i(false);
        }
    }

    private boolean n() {
        if (!this.y) {
            return false;
        }
        n.c().a(f1942f, String.format("Work interrupted for %s", this.v), new Throwable[0]);
        if (this.r.l(this.f1944h) == null) {
            i(false);
        } else {
            i(!r0.d());
        }
        return true;
    }

    private boolean o() {
        this.q.beginTransaction();
        try {
            boolean z = true;
            if (this.r.l(this.f1944h) == x.ENQUEUED) {
                this.r.a(x.RUNNING, this.f1944h);
                this.r.q(this.f1944h);
            } else {
                z = false;
            }
            this.q.setTransactionSuccessful();
            return z;
        } finally {
            this.q.endTransaction();
        }
    }

    public e.e.c.a.a.a<Boolean> b() {
        return this.w;
    }

    public void d() {
        boolean z;
        this.y = true;
        n();
        e.e.c.a.a.a<ListenableWorker.a> aVar = this.x;
        if (aVar != null) {
            z = aVar.isDone();
            this.x.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.l;
        if (listenableWorker != null && !z) {
            listenableWorker.stop();
        } else {
            n.c().a(f1942f, String.format("WorkSpec %s is already done. Not interrupting.", this.f1947k), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.q.beginTransaction();
            try {
                x l = this.r.l(this.f1944h);
                this.q.i().delete(this.f1944h);
                if (l == null) {
                    i(false);
                } else if (l == x.RUNNING) {
                    c(this.n);
                } else if (!l.d()) {
                    g();
                }
                this.q.setTransactionSuccessful();
            } finally {
                this.q.endTransaction();
            }
        }
        List<e> list = this.f1945i;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(this.f1944h);
            }
            f.b(this.o, this.q, this.f1945i);
        }
    }

    void l() {
        this.q.beginTransaction();
        try {
            e(this.f1944h);
            this.r.h(this.f1944h, ((ListenableWorker.a.C0034a) this.n).e());
            this.q.setTransactionSuccessful();
        } finally {
            this.q.endTransaction();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> b2 = this.t.b(this.f1944h);
        this.u = b2;
        this.v = a(b2);
        k();
    }
}
