package h.a.z.g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ScheduledRunnable.java */
/* loaded from: classes2.dex */
public final class j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, h.a.x.c {

    /* renamed from: f, reason: collision with root package name */
    static final Object f18229f = new Object();

    /* renamed from: g, reason: collision with root package name */
    static final Object f18230g = new Object();

    /* renamed from: h, reason: collision with root package name */
    static final Object f18231h = new Object();

    /* renamed from: i, reason: collision with root package name */
    static final Object f18232i = new Object();

    /* renamed from: j, reason: collision with root package name */
    final Runnable f18233j;

    public j(Runnable runnable, h.a.z.a.b bVar) {
        super(3);
        this.f18233j = runnable;
        lazySet(0, bVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f18232i) {
                return;
            }
            if (obj == f18230g) {
                future.cancel(false);
                return;
            } else if (obj == f18231h) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // h.a.x.c
    public void d() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f18232i || obj5 == (obj3 = f18230g) || obj5 == (obj4 = f18231h)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f18232i || obj == (obj2 = f18229f) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((h.a.z.a.b) obj).c(this);
    }

    @Override // h.a.x.c
    public boolean f() {
        Object obj = get(0);
        return obj == f18229f || obj == f18232i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f18233j.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f18229f) {
                    ((h.a.z.a.b) obj4).c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f18230g) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f18232i));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f18229f && compareAndSet(0, obj4, f18232i) && obj4 != null) {
            ((h.a.z.a.b) obj4).c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f18230g || obj5 == f18231h) {
                return;
            }
        } while (!compareAndSet(1, obj5, f18232i));
    }
}
