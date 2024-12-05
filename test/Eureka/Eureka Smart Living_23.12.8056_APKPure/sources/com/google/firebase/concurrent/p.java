package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledFuture f5767h;

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.o(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.n(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    /* loaded from: classes.dex */
    interface c {
        ScheduledFuture a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(c cVar) {
        this.f5767h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void b() {
        this.f5767h.cancel(q());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f5767h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f5767h.compareTo(delayed);
    }
}
