package androidx.work.impl.utils.o;

import cm.aptoide.pt.account.AdultContentAnalytics;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements e.e.c.a.a.a<V> {

    /* renamed from: f, reason: collision with root package name */
    static final boolean f2105f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", AdultContentAnalytics.UNLOCK));

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f2106g = Logger.getLogger(a.class.getName());

    /* renamed from: h, reason: collision with root package name */
    static final b f2107h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f2108i;

    /* renamed from: j, reason: collision with root package name */
    volatile Object f2109j;

    /* renamed from: k, reason: collision with root package name */
    volatile e f2110k;
    volatile i l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        static final c a;

        /* renamed from: b, reason: collision with root package name */
        static final c f2111b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f2112c;

        /* renamed from: d, reason: collision with root package name */
        final Throwable f2113d;

        static {
            if (a.f2105f) {
                f2111b = null;
                a = null;
            } else {
                f2111b = new c(false, null);
                a = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.f2112c = z;
            this.f2113d = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {
        static final d a = new d(new C0042a("Failure occurred while trying to finish a future."));

        /* renamed from: b, reason: collision with root package name */
        final Throwable f2114b;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.o.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0042a extends Throwable {
            C0042a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f2114b = (Throwable) a.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e {
        static final e a = new e(null, null);

        /* renamed from: b, reason: collision with root package name */
        final Runnable f2115b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f2116c;

        /* renamed from: d, reason: collision with root package name */
        e f2117d;

        e(Runnable runnable, Executor executor) {
            this.f2115b = runnable;
            this.f2116c = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    private static final class f extends b {
        final AtomicReferenceFieldUpdater<i, Thread> a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f2118b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f2119c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f2120d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f2121e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.f2118b = atomicReferenceFieldUpdater2;
            this.f2119c = atomicReferenceFieldUpdater3;
            this.f2120d = atomicReferenceFieldUpdater4;
            this.f2121e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.o.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f2120d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.o.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f2121e.compareAndSet(aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.o.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.f2119c.compareAndSet(aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.o.a.b
        void d(i iVar, i iVar2) {
            this.f2118b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.o.a.b
        void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final a<V> f2122f;

        /* renamed from: g, reason: collision with root package name */
        final e.e.c.a.a.a<? extends V> f2123g;

        g(a<V> aVar, e.e.c.a.a.a<? extends V> aVar2) {
            this.f2122f = aVar;
            this.f2123g = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2122f.f2109j != this) {
                return;
            }
            if (a.f2107h.b(this.f2122f, this, a.k(this.f2123g))) {
                a.h(this.f2122f);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.o.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2110k != eVar) {
                    return false;
                }
                aVar.f2110k = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.o.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2109j != obj) {
                    return false;
                }
                aVar.f2109j = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.o.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.l != iVar) {
                    return false;
                }
                aVar.l = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.o.a.b
        void d(i iVar, i iVar2) {
            iVar.f2125c = iVar2;
        }

        @Override // androidx.work.impl.utils.o.a.b
        void e(i iVar, Thread thread) {
            iVar.f2124b = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class i {
        static final i a = new i(false);

        /* renamed from: b, reason: collision with root package name */
        volatile Thread f2124b;

        /* renamed from: c, reason: collision with root package name */
        volatile i f2125c;

        i(boolean z) {
        }

        void a(i iVar) {
            a.f2107h.d(this, iVar);
        }

        void b() {
            Thread thread = this.f2124b;
            if (thread != null) {
                this.f2124b = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f2107h.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f2107h = hVar;
        if (th != null) {
            f2106g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2108i = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object l = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(l));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t) {
        t.getClass();
        return t;
    }

    private e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2110k;
        } while (!f2107h.a(this, eVar2, e.a));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2117d;
            eVar4.f2117d = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void h(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            e g2 = aVar.g(eVar);
            while (g2 != null) {
                eVar = g2.f2117d;
                Runnable runnable = g2.f2115b;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f2122f;
                    if (aVar.f2109j == gVar) {
                        if (f2107h.b(aVar, gVar, k(gVar.f2123g))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, g2.f2116c);
                }
                g2 = eVar;
            }
            return;
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f2106g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V j(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f2108i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f2114b);
        }
        throw c("Task was cancelled.", ((c) obj).f2113d);
    }

    static Object k(e.e.c.a.a.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f2109j;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f2112c ? cVar.f2113d != null ? new c(false, cVar.f2113d) : c.f2111b : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f2105f) & isCancelled) {
            return c.f2111b;
        }
        try {
            Object l = l(aVar);
            return l == null ? f2108i : l;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
            }
            return new c(false, e2);
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V l(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void o() {
        i iVar;
        do {
            iVar = this.l;
        } while (!f2107h.c(this, iVar, i.a));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f2125c;
        }
    }

    private void p(i iVar) {
        iVar.f2124b = null;
        while (true) {
            i iVar2 = this.l;
            if (iVar2 == i.a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2125c;
                if (iVar2.f2124b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2125c = iVar4;
                    if (iVar3.f2124b == null) {
                        break;
                    }
                } else if (!f2107h.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        c cVar;
        Object obj = this.f2109j;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f2105f) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = c.a;
        } else {
            cVar = c.f2111b;
        }
        boolean z2 = false;
        a<V> aVar = this;
        while (true) {
            if (f2107h.b(aVar, obj, cVar)) {
                if (z) {
                    aVar.m();
                }
                h(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                e.e.c.a.a.a<? extends V> aVar2 = ((g) obj).f2123g;
                if (aVar2 instanceof a) {
                    aVar = (a) aVar2;
                    obj = aVar.f2109j;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    aVar2.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f2109j;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // e.e.c.a.a.a
    public final void d(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f2110k;
        if (eVar != e.a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f2117d = eVar;
                if (f2107h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f2110k;
                }
            } while (eVar != e.a);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f2109j;
            if ((obj != null) & (!(obj instanceof g))) {
                return j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.l;
                if (iVar != i.a) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f2107h.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2109j;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(iVar2);
                        } else {
                            iVar = this.l;
                        }
                    } while (iVar != i.a);
                }
                return j(this.f2109j);
            }
            while (nanos > 0) {
                Object obj3 = this.f2109j;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return j(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2109j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f2109j != null);
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        Object obj = this.f2109j;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f2123g) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(V v) {
        if (v == null) {
            v = (V) f2108i;
        }
        if (!f2107h.b(this, null, v)) {
            return false;
        }
        h(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(Throwable th) {
        if (!f2107h.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(e.e.c.a.a.a<? extends V> aVar) {
        d dVar;
        e(aVar);
        Object obj = this.f2109j;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f2107h.b(this, null, k(aVar))) {
                    return false;
                }
                h(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (f2107h.b(this, null, gVar)) {
                try {
                    aVar.d(gVar, androidx.work.impl.utils.o.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.a;
                    }
                    f2107h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f2109j;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f2112c);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = n();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2109j;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return j(obj2);
            }
            i iVar = this.l;
            if (iVar != i.a) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f2107h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2109j;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return j(obj);
                    }
                    iVar = this.l;
                } while (iVar != i.a);
            }
            return j(this.f2109j);
        }
        throw new InterruptedException();
    }
}
