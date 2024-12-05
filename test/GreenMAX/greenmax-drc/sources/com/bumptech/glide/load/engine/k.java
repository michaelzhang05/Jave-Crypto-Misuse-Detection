package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.engine.a0.a;
import com.bumptech.glide.load.engine.a0.h;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.r.l.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes.dex */
public class k implements m, h.a, p.a {
    private static final boolean a = Log.isLoggable("Engine", 2);

    /* renamed from: b, reason: collision with root package name */
    private final r f8551b;

    /* renamed from: c, reason: collision with root package name */
    private final o f8552c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a0.h f8553d;

    /* renamed from: e, reason: collision with root package name */
    private final b f8554e;

    /* renamed from: f, reason: collision with root package name */
    private final x f8555f;

    /* renamed from: g, reason: collision with root package name */
    private final c f8556g;

    /* renamed from: h, reason: collision with root package name */
    private final a f8557h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f8558i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {
        final h.e a;

        /* renamed from: b, reason: collision with root package name */
        final c.h.j.g<h<?>> f8559b = com.bumptech.glide.r.l.a.d(150, new C0114a());

        /* renamed from: c, reason: collision with root package name */
        private int f8560c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0114a implements a.d<h<?>> {
            C0114a() {
            }

            @Override // com.bumptech.glide.r.l.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.a, aVar.f8559b);
            }
        }

        a(h.e eVar) {
            this.a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.f fVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, com.bumptech.glide.load.l<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.i iVar, h.b<R> bVar) {
            h hVar = (h) com.bumptech.glide.r.j.d(this.f8559b.b());
            int i4 = this.f8560c;
            this.f8560c = i4 + 1;
            return hVar.H(eVar, obj, nVar, fVar, i2, i3, cls, cls2, gVar, jVar, map, z, z2, z3, iVar, bVar, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {
        final com.bumptech.glide.load.engine.b0.a a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.engine.b0.a f8561b;

        /* renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.b0.a f8562c;

        /* renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.b0.a f8563d;

        /* renamed from: e, reason: collision with root package name */
        final m f8564e;

        /* renamed from: f, reason: collision with root package name */
        final c.h.j.g<l<?>> f8565f = com.bumptech.glide.r.l.a.d(150, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.r.l.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.a, bVar.f8561b, bVar.f8562c, bVar.f8563d, bVar.f8564e, bVar.f8565f);
            }
        }

        b(com.bumptech.glide.load.engine.b0.a aVar, com.bumptech.glide.load.engine.b0.a aVar2, com.bumptech.glide.load.engine.b0.a aVar3, com.bumptech.glide.load.engine.b0.a aVar4, m mVar) {
            this.a = aVar;
            this.f8561b = aVar2;
            this.f8562c = aVar3;
            this.f8563d = aVar4;
            this.f8564e = mVar;
        }

        <R> l<R> a(com.bumptech.glide.load.f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((l) com.bumptech.glide.r.j.d(this.f8565f.b())).k(fVar, z, z2, z3, z4);
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    private static class c implements h.e {
        private final a.InterfaceC0108a a;

        /* renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.engine.a0.a f8566b;

        c(a.InterfaceC0108a interfaceC0108a) {
            this.a = interfaceC0108a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public com.bumptech.glide.load.engine.a0.a a() {
            if (this.f8566b == null) {
                synchronized (this) {
                    if (this.f8566b == null) {
                        this.f8566b = this.a.a();
                    }
                    if (this.f8566b == null) {
                        this.f8566b = new com.bumptech.glide.load.engine.a0.b();
                    }
                }
            }
            return this.f8566b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {
        private final l<?> a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.p.i f8567b;

        d(com.bumptech.glide.p.i iVar, l<?> lVar) {
            this.f8567b = iVar;
            this.a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.a.r(this.f8567b);
            }
        }
    }

    public k(com.bumptech.glide.load.engine.a0.h hVar, a.InterfaceC0108a interfaceC0108a, com.bumptech.glide.load.engine.b0.a aVar, com.bumptech.glide.load.engine.b0.a aVar2, com.bumptech.glide.load.engine.b0.a aVar3, com.bumptech.glide.load.engine.b0.a aVar4, boolean z) {
        this(hVar, interfaceC0108a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z);
    }

    private p<?> e(com.bumptech.glide.load.f fVar) {
        u<?> d2 = this.f8553d.d(fVar);
        if (d2 == null) {
            return null;
        }
        if (d2 instanceof p) {
            return (p) d2;
        }
        return new p<>(d2, true, true);
    }

    private p<?> g(com.bumptech.glide.load.f fVar, boolean z) {
        if (!z) {
            return null;
        }
        p<?> e2 = this.f8558i.e(fVar);
        if (e2 != null) {
            e2.a();
        }
        return e2;
    }

    private p<?> h(com.bumptech.glide.load.f fVar, boolean z) {
        if (!z) {
            return null;
        }
        p<?> e2 = e(fVar);
        if (e2 != null) {
            e2.a();
            this.f8558i.a(fVar, e2);
        }
        return e2;
    }

    private static void i(String str, long j2, com.bumptech.glide.load.f fVar) {
        Log.v("Engine", str + " in " + com.bumptech.glide.r.f.a(j2) + "ms, key: " + fVar);
    }

    @Override // com.bumptech.glide.load.engine.a0.h.a
    public void a(u<?> uVar) {
        this.f8555f.a(uVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(l<?> lVar, com.bumptech.glide.load.f fVar, p<?> pVar) {
        if (pVar != null) {
            pVar.h(fVar, this);
            if (pVar.f()) {
                this.f8558i.a(fVar, pVar);
            }
        }
        this.f8551b.d(fVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void c(l<?> lVar, com.bumptech.glide.load.f fVar) {
        this.f8551b.d(fVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public synchronized void d(com.bumptech.glide.load.f fVar, p<?> pVar) {
        this.f8558i.d(fVar);
        if (pVar.f()) {
            this.f8553d.c(fVar, pVar);
        } else {
            this.f8555f.a(pVar);
        }
    }

    public synchronized <R> d f(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.f fVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, com.bumptech.glide.load.l<?>> map, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.p.i iVar2, Executor executor) {
        boolean z7 = a;
        long b2 = z7 ? com.bumptech.glide.r.f.b() : 0L;
        n a2 = this.f8552c.a(obj, fVar, i2, i3, map, cls, cls2, iVar);
        p<?> g2 = g(a2, z3);
        if (g2 != null) {
            iVar2.b(g2, com.bumptech.glide.load.a.MEMORY_CACHE);
            if (z7) {
                i("Loaded resource from active resources", b2, a2);
            }
            return null;
        }
        p<?> h2 = h(a2, z3);
        if (h2 != null) {
            iVar2.b(h2, com.bumptech.glide.load.a.MEMORY_CACHE);
            if (z7) {
                i("Loaded resource from cache", b2, a2);
            }
            return null;
        }
        l<?> a3 = this.f8551b.a(a2, z6);
        if (a3 != null) {
            a3.d(iVar2, executor);
            if (z7) {
                i("Added to existing load", b2, a2);
            }
            return new d(iVar2, a3);
        }
        l<R> a4 = this.f8554e.a(a2, z3, z4, z5, z6);
        h<R> a5 = this.f8557h.a(eVar, obj, a2, fVar, i2, i3, cls, cls2, gVar, jVar, map, z, z2, z6, iVar, a4);
        this.f8551b.c(a2, a4);
        a4.d(iVar2, executor);
        a4.s(a5);
        if (z7) {
            i("Started new load", b2, a2);
        }
        return new d(iVar2, a4);
    }

    public void j(u<?> uVar) {
        if (uVar instanceof p) {
            ((p) uVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    k(com.bumptech.glide.load.engine.a0.h hVar, a.InterfaceC0108a interfaceC0108a, com.bumptech.glide.load.engine.b0.a aVar, com.bumptech.glide.load.engine.b0.a aVar2, com.bumptech.glide.load.engine.b0.a aVar3, com.bumptech.glide.load.engine.b0.a aVar4, r rVar, o oVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, x xVar, boolean z) {
        this.f8553d = hVar;
        c cVar = new c(interfaceC0108a);
        this.f8556g = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z) : aVar5;
        this.f8558i = aVar7;
        aVar7.f(this);
        this.f8552c = oVar == null ? new o() : oVar;
        this.f8551b = rVar == null ? new r() : rVar;
        this.f8554e = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this) : bVar;
        this.f8557h = aVar6 == null ? new a(cVar) : aVar6;
        this.f8555f = xVar == null ? new x() : xVar;
        hVar.e(this);
    }
}
