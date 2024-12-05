package com.mbridge.msdk.e.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    private final b f19903e;

    /* renamed from: f, reason: collision with root package name */
    private final j f19904f;

    /* renamed from: g, reason: collision with root package name */
    private final t f19905g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f19906h;

    /* renamed from: i, reason: collision with root package name */
    private c f19907i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f19899a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final Set<p<?>> f19900b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f19901c = new PriorityBlockingQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f19902d = new PriorityBlockingQueue<>();

    /* renamed from: j, reason: collision with root package name */
    private final List<a> f19908j = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(p<?> pVar, int i8);
    }

    public q(j jVar, t tVar, int i8, b bVar) {
        this.f19903e = bVar;
        this.f19904f = jVar;
        this.f19906h = new k[i8];
        this.f19905g = tVar;
    }

    public final <T> p<T> a(p<T> pVar) {
        pVar.a(this);
        synchronized (this.f19900b) {
            this.f19900b.add(pVar);
        }
        pVar.c(this.f19899a.incrementAndGet());
        a(pVar, 0);
        if (!pVar.p()) {
            c(pVar);
        } else {
            this.f19901c.add(pVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void b(p<T> pVar) {
        synchronized (this.f19900b) {
            this.f19900b.remove(pVar);
        }
        a(pVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void c(p<T> pVar) {
        this.f19902d.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p<?> pVar, int i8) {
        synchronized (this.f19908j) {
            try {
                Iterator<a> it = this.f19908j.iterator();
                while (it.hasNext()) {
                    it.next().a(pVar, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        c cVar = this.f19907i;
        if (cVar != null) {
            cVar.a();
        }
        for (k kVar : this.f19906h) {
            if (kVar != null) {
                kVar.a();
            }
        }
        c cVar2 = new c(this.f19901c, this.f19902d, this.f19903e, this.f19905g);
        this.f19907i = cVar2;
        cVar2.start();
        for (int i8 = 0; i8 < this.f19906h.length; i8++) {
            k kVar2 = new k(this.f19902d, this.f19904f, this.f19903e, this.f19905g);
            this.f19906h[i8] = kVar2;
            kVar2.start();
        }
    }
}
