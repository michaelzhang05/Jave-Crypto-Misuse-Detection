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
    private final b f18848e;

    /* renamed from: f, reason: collision with root package name */
    private final j f18849f;

    /* renamed from: g, reason: collision with root package name */
    private final t f18850g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f18851h;

    /* renamed from: i, reason: collision with root package name */
    private c f18852i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f18844a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final Set<p<?>> f18845b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f18846c = new PriorityBlockingQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f18847d = new PriorityBlockingQueue<>();

    /* renamed from: j, reason: collision with root package name */
    private final List<a> f18853j = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(p<?> pVar, int i8);
    }

    public q(j jVar, t tVar, int i8, b bVar) {
        this.f18848e = bVar;
        this.f18849f = jVar;
        this.f18851h = new k[i8];
        this.f18850g = tVar;
    }

    public final <T> p<T> a(p<T> pVar) {
        pVar.a(this);
        synchronized (this.f18845b) {
            this.f18845b.add(pVar);
        }
        pVar.c(this.f18844a.incrementAndGet());
        a(pVar, 0);
        if (!pVar.p()) {
            c(pVar);
        } else {
            this.f18846c.add(pVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void b(p<T> pVar) {
        synchronized (this.f18845b) {
            this.f18845b.remove(pVar);
        }
        a(pVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void c(p<T> pVar) {
        this.f18847d.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p<?> pVar, int i8) {
        synchronized (this.f18853j) {
            try {
                Iterator<a> it = this.f18853j.iterator();
                while (it.hasNext()) {
                    it.next().a(pVar, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        c cVar = this.f18852i;
        if (cVar != null) {
            cVar.a();
        }
        for (k kVar : this.f18851h) {
            if (kVar != null) {
                kVar.a();
            }
        }
        c cVar2 = new c(this.f18846c, this.f18847d, this.f18848e, this.f18850g);
        this.f18852i = cVar2;
        cVar2.start();
        for (int i8 = 0; i8 < this.f18851h.length; i8++) {
            k kVar2 = new k(this.f18847d, this.f18849f, this.f18848e, this.f18850g);
            this.f18851h[i8] = kVar2;
            kVar2.start();
        }
    }
}
