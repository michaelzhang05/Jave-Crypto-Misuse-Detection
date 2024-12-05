package com.bumptech.glide.p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.r.l.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class j<R> implements d, com.bumptech.glide.p.l.h, i, a.f {

    /* renamed from: f, reason: collision with root package name */
    private static final c.h.j.g<j<?>> f8906f = com.bumptech.glide.r.l.a.d(150, new a());

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f8907g = Log.isLoggable("Request", 2);
    private k.d A;
    private long B;
    private b C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private int G;
    private int H;
    private RuntimeException I;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8908h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8909i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.r.l.c f8910j;

    /* renamed from: k, reason: collision with root package name */
    private g<R> f8911k;
    private e l;
    private Context m;
    private com.bumptech.glide.e n;
    private Object o;
    private Class<R> p;
    private com.bumptech.glide.p.a<?> q;
    private int r;
    private int s;
    private com.bumptech.glide.g t;
    private com.bumptech.glide.p.l.i<R> u;
    private List<g<R>> v;
    private com.bumptech.glide.load.engine.k w;
    private com.bumptech.glide.p.m.e<? super R> x;
    private Executor y;
    private u<R> z;

    /* compiled from: SingleRequest.java */
    /* loaded from: classes.dex */
    class a implements a.d<j<?>> {
        a() {
        }

        @Override // com.bumptech.glide.r.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j<?> a() {
            return new j<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRequest.java */
    /* loaded from: classes.dex */
    public enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    j() {
        this.f8909i = f8907g ? String.valueOf(super.hashCode()) : null;
        this.f8910j = com.bumptech.glide.r.l.c.a();
    }

    private void A() {
        e eVar = this.l;
        if (eVar != null) {
            eVar.k(this);
        }
    }

    public static <R> j<R> B(Context context, com.bumptech.glide.e eVar, Object obj, Class<R> cls, com.bumptech.glide.p.a<?> aVar, int i2, int i3, com.bumptech.glide.g gVar, com.bumptech.glide.p.l.i<R> iVar, g<R> gVar2, List<g<R>> list, e eVar2, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.p.m.e<? super R> eVar3, Executor executor) {
        j<R> jVar = (j) f8906f.b();
        if (jVar == null) {
            jVar = new j<>();
        }
        jVar.t(context, eVar, obj, cls, aVar, i2, i3, gVar, iVar, gVar2, list, eVar2, kVar, eVar3, executor);
        return jVar;
    }

    private synchronized void C(GlideException glideException, int i2) {
        boolean z;
        this.f8910j.c();
        glideException.k(this.I);
        int g2 = this.n.g();
        if (g2 <= i2) {
            Log.w("Glide", "Load failed for " + this.o + " with size [" + this.G + "x" + this.H + "]", glideException);
            if (g2 <= 4) {
                glideException.g("Glide");
            }
        }
        this.A = null;
        this.C = b.FAILED;
        boolean z2 = true;
        this.f8908h = true;
        try {
            List<g<R>> list = this.v;
            if (list != null) {
                Iterator<g<R>> it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().onLoadFailed(glideException, this.o, this.u, u());
                }
            } else {
                z = false;
            }
            g<R> gVar = this.f8911k;
            if (gVar == null || !gVar.onLoadFailed(glideException, this.o, this.u, u())) {
                z2 = false;
            }
            if (!(z | z2)) {
                F();
            }
            this.f8908h = false;
            z();
        } catch (Throwable th) {
            this.f8908h = false;
            throw th;
        }
    }

    private synchronized void D(u<R> uVar, R r, com.bumptech.glide.load.a aVar) {
        boolean z;
        boolean u = u();
        this.C = b.COMPLETE;
        this.z = uVar;
        if (this.n.g() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.o + " with size [" + this.G + "x" + this.H + "] in " + com.bumptech.glide.r.f.a(this.B) + " ms");
        }
        boolean z2 = true;
        this.f8908h = true;
        try {
            List<g<R>> list = this.v;
            if (list != null) {
                Iterator<g<R>> it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().onResourceReady(r, this.o, this.u, aVar, u);
                }
            } else {
                z = false;
            }
            g<R> gVar = this.f8911k;
            if (gVar == null || !gVar.onResourceReady(r, this.o, this.u, aVar, u)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.u.onResourceReady(r, this.x.a(aVar, u));
            }
            this.f8908h = false;
            A();
        } catch (Throwable th) {
            this.f8908h = false;
            throw th;
        }
    }

    private void E(u<?> uVar) {
        this.w.j(uVar);
        this.z = null;
    }

    private synchronized void F() {
        if (m()) {
            Drawable r = this.o == null ? r() : null;
            if (r == null) {
                r = q();
            }
            if (r == null) {
                r = s();
            }
            this.u.onLoadFailed(r);
        }
    }

    private void j() {
        if (this.f8908h) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        e eVar = this.l;
        return eVar == null || eVar.m(this);
    }

    private boolean m() {
        e eVar = this.l;
        return eVar == null || eVar.g(this);
    }

    private boolean o() {
        e eVar = this.l;
        return eVar == null || eVar.j(this);
    }

    private void p() {
        j();
        this.f8910j.c();
        this.u.removeCallback(this);
        k.d dVar = this.A;
        if (dVar != null) {
            dVar.a();
            this.A = null;
        }
    }

    private Drawable q() {
        if (this.D == null) {
            Drawable n = this.q.n();
            this.D = n;
            if (n == null && this.q.m() > 0) {
                this.D = w(this.q.m());
            }
        }
        return this.D;
    }

    private Drawable r() {
        if (this.F == null) {
            Drawable o = this.q.o();
            this.F = o;
            if (o == null && this.q.p() > 0) {
                this.F = w(this.q.p());
            }
        }
        return this.F;
    }

    private Drawable s() {
        if (this.E == null) {
            Drawable u = this.q.u();
            this.E = u;
            if (u == null && this.q.v() > 0) {
                this.E = w(this.q.v());
            }
        }
        return this.E;
    }

    private synchronized void t(Context context, com.bumptech.glide.e eVar, Object obj, Class<R> cls, com.bumptech.glide.p.a<?> aVar, int i2, int i3, com.bumptech.glide.g gVar, com.bumptech.glide.p.l.i<R> iVar, g<R> gVar2, List<g<R>> list, e eVar2, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.p.m.e<? super R> eVar3, Executor executor) {
        this.m = context;
        this.n = eVar;
        this.o = obj;
        this.p = cls;
        this.q = aVar;
        this.r = i2;
        this.s = i3;
        this.t = gVar;
        this.u = iVar;
        this.f8911k = gVar2;
        this.v = list;
        this.l = eVar2;
        this.w = kVar;
        this.x = eVar3;
        this.y = executor;
        this.C = b.PENDING;
        if (this.I == null && eVar.i()) {
            this.I = new RuntimeException("Glide request origin trace");
        }
    }

    private boolean u() {
        e eVar = this.l;
        return eVar == null || !eVar.b();
    }

    private synchronized boolean v(j<?> jVar) {
        boolean z;
        synchronized (jVar) {
            List<g<R>> list = this.v;
            int size = list == null ? 0 : list.size();
            List<g<?>> list2 = jVar.v;
            z = size == (list2 == null ? 0 : list2.size());
        }
        return z;
    }

    private Drawable w(int i2) {
        return com.bumptech.glide.load.o.e.a.a(this.n, i2, this.q.C() != null ? this.q.C() : this.m.getTheme());
    }

    private void x(String str) {
        Log.v("Request", str + " this: " + this.f8909i);
    }

    private static int y(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * i2);
    }

    private void z() {
        e eVar = this.l;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    @Override // com.bumptech.glide.p.i
    public synchronized void a(GlideException glideException) {
        C(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.p.i
    public synchronized void b(u<?> uVar, com.bumptech.glide.load.a aVar) {
        this.f8910j.c();
        this.A = null;
        if (uVar == null) {
            a(new GlideException("Expected to receive a Resource<R> with an object of " + this.p + " inside, but instead got null."));
            return;
        }
        Object obj = uVar.get();
        if (obj != null && this.p.isAssignableFrom(obj.getClass())) {
            if (!o()) {
                E(uVar);
                this.C = b.COMPLETE;
                return;
            } else {
                D(uVar, obj, aVar);
                return;
            }
        }
        E(uVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.p);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(uVar);
        sb.append("}.");
        sb.append(obj != null ? HttpUrl.FRAGMENT_ENCODE_SET : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        a(new GlideException(sb.toString()));
    }

    @Override // com.bumptech.glide.p.d
    public synchronized void c() {
        j();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = -1;
        this.s = -1;
        this.u = null;
        this.v = null;
        this.f8911k = null;
        this.l = null;
        this.x = null;
        this.A = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = -1;
        this.H = -1;
        this.I = null;
        f8906f.a(this);
    }

    @Override // com.bumptech.glide.p.d
    public synchronized void clear() {
        j();
        this.f8910j.c();
        b bVar = this.C;
        b bVar2 = b.CLEARED;
        if (bVar == bVar2) {
            return;
        }
        p();
        u<R> uVar = this.z;
        if (uVar != null) {
            E(uVar);
        }
        if (k()) {
            this.u.onLoadCleared(s());
        }
        this.C = bVar2;
    }

    @Override // com.bumptech.glide.p.d
    public synchronized void d() {
        j();
        this.f8910j.c();
        this.B = com.bumptech.glide.r.f.b();
        if (this.o == null) {
            if (com.bumptech.glide.r.k.t(this.r, this.s)) {
                this.G = this.r;
                this.H = this.s;
            }
            C(new GlideException("Received null model"), r() == null ? 5 : 3);
            return;
        }
        b bVar = this.C;
        b bVar2 = b.RUNNING;
        if (bVar != bVar2) {
            if (bVar == b.COMPLETE) {
                b(this.z, com.bumptech.glide.load.a.MEMORY_CACHE);
                return;
            }
            b bVar3 = b.WAITING_FOR_SIZE;
            this.C = bVar3;
            if (com.bumptech.glide.r.k.t(this.r, this.s)) {
                g(this.r, this.s);
            } else {
                this.u.getSize(this);
            }
            b bVar4 = this.C;
            if ((bVar4 == bVar2 || bVar4 == bVar3) && m()) {
                this.u.onLoadStarted(s());
            }
            if (f8907g) {
                x("finished run method in " + com.bumptech.glide.r.f.a(this.B));
            }
            return;
        }
        throw new IllegalArgumentException("Cannot restart a running request");
    }

    @Override // com.bumptech.glide.p.d
    public synchronized boolean e(d dVar) {
        boolean z = false;
        if (!(dVar instanceof j)) {
            return false;
        }
        j<?> jVar = (j) dVar;
        synchronized (jVar) {
            if (this.r == jVar.r && this.s == jVar.s && com.bumptech.glide.r.k.c(this.o, jVar.o) && this.p.equals(jVar.p) && this.q.equals(jVar.q) && this.t == jVar.t && v(jVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.p.d
    public synchronized boolean f() {
        return l();
    }

    @Override // com.bumptech.glide.p.l.h
    public synchronized void g(int i2, int i3) {
        try {
            this.f8910j.c();
            boolean z = f8907g;
            if (z) {
                x("Got onSizeReady in " + com.bumptech.glide.r.f.a(this.B));
            }
            if (this.C != b.WAITING_FOR_SIZE) {
                return;
            }
            b bVar = b.RUNNING;
            this.C = bVar;
            float B = this.q.B();
            this.G = y(i2, B);
            this.H = y(i3, B);
            if (z) {
                x("finished setup for calling load in " + com.bumptech.glide.r.f.a(this.B));
            }
            try {
                try {
                    this.A = this.w.f(this.n, this.o, this.q.A(), this.G, this.H, this.q.y(), this.p, this.t, this.q.l(), this.q.E(), this.q.Q(), this.q.K(), this.q.r(), this.q.H(), this.q.G(), this.q.F(), this.q.q(), this, this.y);
                    if (this.C != bVar) {
                        this.A = null;
                    }
                    if (z) {
                        x("finished onSizeReady in " + com.bumptech.glide.r.f.a(this.B));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.p.d
    public synchronized boolean h() {
        return this.C == b.FAILED;
    }

    @Override // com.bumptech.glide.p.d
    public synchronized boolean i() {
        return this.C == b.CLEARED;
    }

    @Override // com.bumptech.glide.p.d
    public synchronized boolean isRunning() {
        boolean z;
        b bVar = this.C;
        if (bVar != b.RUNNING) {
            z = bVar == b.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // com.bumptech.glide.p.d
    public synchronized boolean l() {
        return this.C == b.COMPLETE;
    }

    @Override // com.bumptech.glide.r.l.a.f
    public com.bumptech.glide.r.l.c n() {
        return this.f8910j;
    }
}
