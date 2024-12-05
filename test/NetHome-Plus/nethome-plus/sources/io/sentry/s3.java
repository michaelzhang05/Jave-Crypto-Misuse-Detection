package io.sentry;

import io.sentry.x4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Scope.java */
/* loaded from: classes2.dex */
public final class s3 {
    private s4 a;

    /* renamed from: b, reason: collision with root package name */
    private e2 f19225b;

    /* renamed from: c, reason: collision with root package name */
    private String f19226c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.a0 f19227d;

    /* renamed from: e, reason: collision with root package name */
    private String f19228e;

    /* renamed from: f, reason: collision with root package name */
    private io.sentry.protocol.l f19229f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f19230g;

    /* renamed from: h, reason: collision with root package name */
    private final Queue<v0> f19231h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, String> f19232i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f19233j;

    /* renamed from: k, reason: collision with root package name */
    private List<k1> f19234k;
    private final x4 l;
    private volatile d5 m;
    private final Object n;
    private final Object o;
    private final Object p;
    private io.sentry.protocol.c q;
    private List<s0> r;
    private o3 s;

    /* compiled from: Scope.java */
    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public interface a {
        void a(o3 o3Var);
    }

    /* compiled from: Scope.java */
    /* loaded from: classes2.dex */
    interface b {
        void a(d5 d5Var);
    }

    /* compiled from: Scope.java */
    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public interface c {
        void a(e2 e2Var);
    }

    /* compiled from: Scope.java */
    /* loaded from: classes2.dex */
    static final class d {
        private final d5 a;

        /* renamed from: b, reason: collision with root package name */
        private final d5 f19235b;

        public d(d5 d5Var, d5 d5Var2) {
            this.f19235b = d5Var;
            this.a = d5Var2;
        }

        public d5 a() {
            return this.f19235b;
        }

        public d5 b() {
            return this.a;
        }
    }

    public s3(x4 x4Var) {
        this.f19230g = new ArrayList();
        this.f19232i = new ConcurrentHashMap();
        this.f19233j = new ConcurrentHashMap();
        this.f19234k = new CopyOnWriteArrayList();
        this.n = new Object();
        this.o = new Object();
        this.p = new Object();
        this.q = new io.sentry.protocol.c();
        this.r = new CopyOnWriteArrayList();
        x4 x4Var2 = (x4) io.sentry.util.q.c(x4Var, "SentryOptions is required.");
        this.l = x4Var2;
        this.f19231h = f(x4Var2.getMaxBreadcrumbs());
        this.s = new o3();
    }

    private Queue<v0> f(int i2) {
        return m5.f(new w0(i2));
    }

    private v0 h(x4.a aVar, v0 v0Var, n1 n1Var) {
        try {
            return aVar.a(v0Var, n1Var);
        } catch (Throwable th) {
            this.l.getLogger().b(s4.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
            if (th.getMessage() == null) {
                return v0Var;
            }
            v0Var.m("sentry:message", th.getMessage());
            return v0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d A() {
        d dVar;
        synchronized (this.n) {
            if (this.m != null) {
                this.m.c();
            }
            d5 d5Var = this.m;
            dVar = null;
            if (this.l.getRelease() != null) {
                this.m = new d5(this.l.getDistinctId(), this.f19227d, this.l.getEnvironment(), this.l.getRelease());
                dVar = new d(this.m.clone(), d5Var != null ? d5Var.clone() : null);
            } else {
                this.l.getLogger().c(s4.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
        }
        return dVar;
    }

    @ApiStatus.Internal
    public o3 B(a aVar) {
        o3 o3Var;
        synchronized (this.p) {
            aVar.a(this.s);
            o3Var = new o3(this.s);
        }
        return o3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5 C(b bVar) {
        d5 clone;
        synchronized (this.n) {
            bVar.a(this.m);
            clone = this.m != null ? this.m.clone() : null;
        }
        return clone;
    }

    @ApiStatus.Internal
    public void D(c cVar) {
        synchronized (this.o) {
            cVar.a(this.f19225b);
        }
    }

    public void a(v0 v0Var, n1 n1Var) {
        if (v0Var == null) {
            return;
        }
        if (n1Var == null) {
            n1Var = new n1();
        }
        x4.a beforeBreadcrumb = this.l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            v0Var = h(beforeBreadcrumb, v0Var, n1Var);
        }
        if (v0Var != null) {
            this.f19231h.add(v0Var);
            for (z1 z1Var : this.l.getScopeObservers()) {
                z1Var.e(v0Var);
                z1Var.a(this.f19231h);
            }
            return;
        }
        this.l.getLogger().c(s4.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
    }

    public void b() {
        this.a = null;
        this.f19227d = null;
        this.f19229f = null;
        this.f19228e = null;
        this.f19230g.clear();
        d();
        this.f19232i.clear();
        this.f19233j.clear();
        this.f19234k.clear();
        e();
        c();
    }

    public void c() {
        this.r.clear();
    }

    public void d() {
        this.f19231h.clear();
        Iterator<z1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().a(this.f19231h);
        }
    }

    public void e() {
        synchronized (this.o) {
            this.f19225b = null;
        }
        this.f19226c = null;
        for (z1 z1Var : this.l.getScopeObservers()) {
            z1Var.d(null);
            z1Var.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5 g() {
        d5 d5Var;
        synchronized (this.n) {
            d5Var = null;
            if (this.m != null) {
                this.m.c();
                d5 clone = this.m.clone();
                this.m = null;
                d5Var = clone;
            }
        }
        return d5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<s0> i() {
        return new CopyOnWriteArrayList(this.r);
    }

    @ApiStatus.Internal
    public Queue<v0> j() {
        return this.f19231h;
    }

    public io.sentry.protocol.c k() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<k1> l() {
        return this.f19234k;
    }

    @ApiStatus.Internal
    public Map<String, Object> m() {
        return this.f19233j;
    }

    @ApiStatus.Internal
    public List<String> n() {
        return this.f19230g;
    }

    public s4 o() {
        return this.a;
    }

    @ApiStatus.Internal
    public o3 p() {
        return this.s;
    }

    public io.sentry.protocol.l q() {
        return this.f19229f;
    }

    @ApiStatus.Internal
    public d5 r() {
        return this.m;
    }

    public d2 s() {
        e5 i2;
        e2 e2Var = this.f19225b;
        return (e2Var == null || (i2 = e2Var.i()) == null) ? e2Var : i2;
    }

    @ApiStatus.Internal
    public Map<String, String> t() {
        return io.sentry.util.i.b(this.f19232i);
    }

    public e2 u() {
        return this.f19225b;
    }

    public String v() {
        e2 e2Var = this.f19225b;
        return e2Var != null ? e2Var.getName() : this.f19226c;
    }

    public io.sentry.protocol.a0 w() {
        return this.f19227d;
    }

    @ApiStatus.Internal
    public void x(o3 o3Var) {
        this.s = o3Var;
    }

    @ApiStatus.Internal
    public void y(String str) {
        this.f19228e = str;
        io.sentry.protocol.c k2 = k();
        io.sentry.protocol.a a2 = k2.a();
        if (a2 == null) {
            a2 = new io.sentry.protocol.a();
            k2.f(a2);
        }
        if (str == null) {
            a2.s(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            a2.s(arrayList);
        }
        Iterator<z1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().b(k2);
        }
    }

    public void z(e2 e2Var) {
        synchronized (this.o) {
            this.f19225b = e2Var;
            for (z1 z1Var : this.l.getScopeObservers()) {
                if (e2Var != null) {
                    z1Var.d(e2Var.getName());
                    z1Var.c(e2Var.m());
                } else {
                    z1Var.d(null);
                    z1Var.c(null);
                }
            }
        }
    }

    @ApiStatus.Internal
    public s3(s3 s3Var) {
        this.f19230g = new ArrayList();
        this.f19232i = new ConcurrentHashMap();
        this.f19233j = new ConcurrentHashMap();
        this.f19234k = new CopyOnWriteArrayList();
        this.n = new Object();
        this.o = new Object();
        this.p = new Object();
        this.q = new io.sentry.protocol.c();
        this.r = new CopyOnWriteArrayList();
        this.f19225b = s3Var.f19225b;
        this.f19226c = s3Var.f19226c;
        this.m = s3Var.m;
        this.l = s3Var.l;
        this.a = s3Var.a;
        io.sentry.protocol.a0 a0Var = s3Var.f19227d;
        this.f19227d = a0Var != null ? new io.sentry.protocol.a0(a0Var) : null;
        this.f19228e = s3Var.f19228e;
        io.sentry.protocol.l lVar = s3Var.f19229f;
        this.f19229f = lVar != null ? new io.sentry.protocol.l(lVar) : null;
        this.f19230g = new ArrayList(s3Var.f19230g);
        this.f19234k = new CopyOnWriteArrayList(s3Var.f19234k);
        v0[] v0VarArr = (v0[]) s3Var.f19231h.toArray(new v0[0]);
        Queue<v0> f2 = f(s3Var.l.getMaxBreadcrumbs());
        for (v0 v0Var : v0VarArr) {
            f2.add(new v0(v0Var));
        }
        this.f19231h = f2;
        Map<String, String> map = s3Var.f19232i;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f19232i = concurrentHashMap;
        Map<String, Object> map2 = s3Var.f19233j;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f19233j = concurrentHashMap2;
        this.q = new io.sentry.protocol.c(s3Var.q);
        this.r = new CopyOnWriteArrayList(s3Var.r);
        this.s = new o3(s3Var.s);
    }
}
