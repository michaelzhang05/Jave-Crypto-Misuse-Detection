package androidx.concurrent.futures;

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

/* loaded from: classes.dex */
public abstract class a implements Future {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f1471d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f1472e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f1473f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f1474g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f1475a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f1476b;

    /* renamed from: c, reason: collision with root package name */
    volatile h f1477c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f1478c;

        /* renamed from: d, reason: collision with root package name */
        static final c f1479d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f1480a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f1481b;

        static {
            if (a.f1471d) {
                f1479d = null;
                f1478c = null;
            } else {
                f1479d = new c(false, null);
                f1478c = new c(true, null);
            }
        }

        c(boolean z5, Throwable th) {
            this.f1480a = z5;
            this.f1481b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f1482b = new d(new C0020a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f1483a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0020a extends Throwable {
            C0020a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1483a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f1484d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f1485a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f1486b;

        /* renamed from: c, reason: collision with root package name */
        e f1487c;

        e(Runnable runnable, Executor executor) {
            this.f1485a = runnable;
            this.f1486b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1488a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1489b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1490c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1491d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1492e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f1488a = atomicReferenceFieldUpdater;
            this.f1489b = atomicReferenceFieldUpdater2;
            this.f1490c = atomicReferenceFieldUpdater3;
            this.f1491d = atomicReferenceFieldUpdater4;
            this.f1492e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1491d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1492e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f1490c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f1489b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f1488a.lazySet(hVar, thread);
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1476b != eVar) {
                    return false;
                }
                aVar.f1476b = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1475a != obj) {
                    return false;
                }
                aVar.f1475a = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f1477c != hVar) {
                    return false;
                }
                aVar.f1477c = hVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f1495b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f1494a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f1493c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f1494a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f1495b;

        h() {
            a.f1473f.e(this, Thread.currentThread());
        }

        h(boolean z5) {
        }

        void a(h hVar) {
            a.f1473f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f1494a;
            if (thread != null) {
                this.f1494a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f1473f = gVar;
        if (th != null) {
            f1472e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1474g = new Object();
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object i6 = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(p(i6));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append(str);
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1476b;
        } while (!f1473f.a(this, eVar2, e.f1484d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1487c;
            eVar4.f1487c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(a aVar) {
        aVar.l();
        aVar.b();
        e e6 = aVar.e(null);
        while (e6 != null) {
            e eVar = e6.f1487c;
            g(e6.f1485a, e6.f1486b);
            e6 = eVar;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f1472e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    private Object h(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f1481b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1483a);
        }
        if (obj == f1474g) {
            return null;
        }
        return obj;
    }

    static Object i(Future future) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void l() {
        h hVar;
        do {
            hVar = this.f1477c;
        } while (!f1473f.c(this, hVar, h.f1493c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f1495b;
        }
    }

    private void m(h hVar) {
        hVar.f1494a = null;
        while (true) {
            h hVar2 = this.f1477c;
            if (hVar2 == h.f1493c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f1495b;
                if (hVar2.f1494a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f1495b = hVar4;
                    if (hVar3.f1494a == null) {
                        break;
                    }
                } else if (!f1473f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String p(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f1475a;
        if ((obj == null) | false) {
            if (f1473f.b(this, obj, f1471d ? new c(z5, new CancellationException("Future.cancel() was called.")) : z5 ? c.f1478c : c.f1479d)) {
                if (z5) {
                    j();
                }
                f(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1475a;
        if ((obj2 != null) && true) {
            return h(obj2);
        }
        h hVar = this.f1477c;
        if (hVar != h.f1493c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f1473f.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1475a;
                    } while (!((obj != null) & true));
                    return h(obj);
                }
                hVar = this.f1477c;
            } while (hVar != h.f1493c);
        }
        return h(this.f1475a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1475a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f1475a != null) & true;
    }

    protected void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean n(Object obj) {
        if (obj == null) {
            obj = f1474g;
        }
        if (!f1473f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(Throwable th) {
        if (!f1473f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean q() {
        Object obj = this.f1475a;
        return (obj instanceof c) && ((c) obj).f1480a;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = k();
                } catch (RuntimeException e6) {
                    str = "Exception thrown from implementation: " + e6.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1475a;
        if ((obj != null) && true) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f1477c;
            if (hVar != h.f1493c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1473f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (!Thread.interrupted()) {
                                Object obj2 = this.f1475a;
                                if ((obj2 != null) && true) {
                                    return h(obj2);
                                }
                                nanos = nanoTime - System.nanoTime();
                            } else {
                                m(hVar2);
                                throw new InterruptedException();
                            }
                        } while (nanos >= 1000);
                        m(hVar2);
                    } else {
                        hVar = this.f1477c;
                    }
                } while (hVar != h.f1493c);
            }
            return h(this.f1475a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1475a;
            if ((obj3 != null) && true) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j7 = -nanos;
            long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(convert);
            boolean z5 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z5) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z5) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }
}
