package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.r.l.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
class l<R> implements h.b<R>, a.f {

    /* renamed from: f, reason: collision with root package name */
    private static final c f8569f = new c();
    p<?> A;
    private h<R> B;
    private volatile boolean C;

    /* renamed from: g, reason: collision with root package name */
    final e f8570g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.r.l.c f8571h;

    /* renamed from: i, reason: collision with root package name */
    private final c.h.j.g<l<?>> f8572i;

    /* renamed from: j, reason: collision with root package name */
    private final c f8573j;

    /* renamed from: k, reason: collision with root package name */
    private final m f8574k;
    private final com.bumptech.glide.load.engine.b0.a l;
    private final com.bumptech.glide.load.engine.b0.a m;
    private final com.bumptech.glide.load.engine.b0.a n;
    private final com.bumptech.glide.load.engine.b0.a o;
    private final AtomicInteger p;
    private com.bumptech.glide.load.f q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private u<?> v;
    com.bumptech.glide.load.a w;
    private boolean x;
    GlideException y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final com.bumptech.glide.p.i f8575f;

        a(com.bumptech.glide.p.i iVar) {
            this.f8575f = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (l.this) {
                if (l.this.f8570g.b(this.f8575f)) {
                    l.this.e(this.f8575f);
                }
                l.this.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final com.bumptech.glide.p.i f8577f;

        b(com.bumptech.glide.p.i iVar) {
            this.f8577f = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (l.this) {
                if (l.this.f8570g.b(this.f8577f)) {
                    l.this.A.a();
                    l.this.f(this.f8577f);
                    l.this.r(this.f8577f);
                }
                l.this.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        public <R> p<R> a(u<R> uVar, boolean z) {
            return new p<>(uVar, z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {
        final com.bumptech.glide.p.i a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f8579b;

        d(com.bumptech.glide.p.i iVar, Executor executor) {
            this.a = iVar;
            this.f8579b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: f, reason: collision with root package name */
        private final List<d> f8580f;

        e() {
            this(new ArrayList(2));
        }

        private static d o(com.bumptech.glide.p.i iVar) {
            return new d(iVar, com.bumptech.glide.r.e.a());
        }

        void a(com.bumptech.glide.p.i iVar, Executor executor) {
            this.f8580f.add(new d(iVar, executor));
        }

        boolean b(com.bumptech.glide.p.i iVar) {
            return this.f8580f.contains(o(iVar));
        }

        void clear() {
            this.f8580f.clear();
        }

        e f() {
            return new e(new ArrayList(this.f8580f));
        }

        boolean isEmpty() {
            return this.f8580f.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f8580f.iterator();
        }

        int size() {
            return this.f8580f.size();
        }

        void w(com.bumptech.glide.p.i iVar) {
            this.f8580f.remove(o(iVar));
        }

        e(List<d> list) {
            this.f8580f = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(com.bumptech.glide.load.engine.b0.a aVar, com.bumptech.glide.load.engine.b0.a aVar2, com.bumptech.glide.load.engine.b0.a aVar3, com.bumptech.glide.load.engine.b0.a aVar4, m mVar, c.h.j.g<l<?>> gVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, gVar, f8569f);
    }

    private com.bumptech.glide.load.engine.b0.a i() {
        if (this.s) {
            return this.n;
        }
        return this.t ? this.o : this.m;
    }

    private boolean l() {
        return this.z || this.x || this.C;
    }

    private synchronized void q() {
        if (this.q != null) {
            this.f8570g.clear();
            this.q = null;
            this.A = null;
            this.v = null;
            this.z = false;
            this.C = false;
            this.x = false;
            this.B.Q(false);
            this.B = null;
            this.y = null;
            this.w = null;
            this.f8572i.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.y = glideException;
        }
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void b(u<R> uVar, com.bumptech.glide.load.a aVar) {
        synchronized (this) {
            this.v = uVar;
            this.w = aVar;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(h<?> hVar) {
        i().execute(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(com.bumptech.glide.p.i iVar, Executor executor) {
        this.f8571h.c();
        this.f8570g.a(iVar, executor);
        boolean z = true;
        if (this.x) {
            j(1);
            executor.execute(new b(iVar));
        } else if (this.z) {
            j(1);
            executor.execute(new a(iVar));
        } else {
            if (this.C) {
                z = false;
            }
            com.bumptech.glide.r.j.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    synchronized void e(com.bumptech.glide.p.i iVar) {
        try {
            iVar.a(this.y);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    synchronized void f(com.bumptech.glide.p.i iVar) {
        try {
            iVar.b(this.A, this.w);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void g() {
        if (l()) {
            return;
        }
        this.C = true;
        this.B.o();
        this.f8574k.c(this, this.q);
    }

    synchronized void h() {
        this.f8571h.c();
        com.bumptech.glide.r.j.a(l(), "Not yet complete!");
        int decrementAndGet = this.p.decrementAndGet();
        com.bumptech.glide.r.j.a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            p<?> pVar = this.A;
            if (pVar != null) {
                pVar.g();
            }
            q();
        }
    }

    synchronized void j(int i2) {
        p<?> pVar;
        com.bumptech.glide.r.j.a(l(), "Not yet complete!");
        if (this.p.getAndAdd(i2) == 0 && (pVar = this.A) != null) {
            pVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized l<R> k(com.bumptech.glide.load.f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.q = fVar;
        this.r = z;
        this.s = z2;
        this.t = z3;
        this.u = z4;
        return this;
    }

    void m() {
        synchronized (this) {
            this.f8571h.c();
            if (this.C) {
                q();
                return;
            }
            if (!this.f8570g.isEmpty()) {
                if (!this.z) {
                    this.z = true;
                    com.bumptech.glide.load.f fVar = this.q;
                    e f2 = this.f8570g.f();
                    j(f2.size() + 1);
                    this.f8574k.b(this, fVar, null);
                    Iterator<d> it = f2.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.f8579b.execute(new a(next.a));
                    }
                    h();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            }
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
    }

    @Override // com.bumptech.glide.r.l.a.f
    public com.bumptech.glide.r.l.c n() {
        return this.f8571h;
    }

    void o() {
        synchronized (this) {
            this.f8571h.c();
            if (this.C) {
                this.v.c();
                q();
                return;
            }
            if (!this.f8570g.isEmpty()) {
                if (!this.x) {
                    this.A = this.f8573j.a(this.v, this.r);
                    this.x = true;
                    e f2 = this.f8570g.f();
                    j(f2.size() + 1);
                    this.f8574k.b(this, this.q, this.A);
                    Iterator<d> it = f2.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.f8579b.execute(new b(next.a));
                    }
                    h();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            }
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r(com.bumptech.glide.p.i iVar) {
        boolean z;
        this.f8571h.c();
        this.f8570g.w(iVar);
        if (this.f8570g.isEmpty()) {
            g();
            if (!this.x && !this.z) {
                z = false;
                if (z && this.p.get() == 0) {
                    q();
                }
            }
            z = true;
            if (z) {
                q();
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        com.bumptech.glide.load.engine.b0.a i2;
        this.B = hVar;
        if (hVar.W()) {
            i2 = this.l;
        } else {
            i2 = i();
        }
        i2.execute(hVar);
    }

    l(com.bumptech.glide.load.engine.b0.a aVar, com.bumptech.glide.load.engine.b0.a aVar2, com.bumptech.glide.load.engine.b0.a aVar3, com.bumptech.glide.load.engine.b0.a aVar4, m mVar, c.h.j.g<l<?>> gVar, c cVar) {
        this.f8570g = new e();
        this.f8571h = com.bumptech.glide.r.l.c.a();
        this.p = new AtomicInteger();
        this.l = aVar;
        this.m = aVar2;
        this.n = aVar3;
        this.o = aVar4;
        this.f8574k = mVar;
        this.f8572i = gVar;
        this.f8573j = cVar;
    }
}
