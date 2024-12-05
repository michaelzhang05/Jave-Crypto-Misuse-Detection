package i.a.g;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DNSStatefulObject.java */
/* loaded from: classes2.dex */
public interface i {

    /* compiled from: DNSStatefulObject.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static k.b.b a = k.b.c.i(a.class.getName());

        /* renamed from: b, reason: collision with root package name */
        private final String f18310b;

        /* renamed from: c, reason: collision with root package name */
        private final ConcurrentMap<Thread, Semaphore> f18311c = new ConcurrentHashMap(50);

        public a(String str) {
            this.f18310b = str;
        }

        public void a() {
            Collection<Semaphore> values = this.f18311c.values();
            for (Semaphore semaphore : values) {
                semaphore.release();
                values.remove(semaphore);
            }
        }

        public void b(long j2) {
            Thread currentThread = Thread.currentThread();
            if (this.f18311c.get(currentThread) == null) {
                Semaphore semaphore = new Semaphore(1, true);
                semaphore.drainPermits();
                this.f18311c.putIfAbsent(currentThread, semaphore);
            }
            try {
                this.f18311c.get(currentThread).tryAcquire(j2, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                a.g("Exception ", e2);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("Semaphore: ");
            sb.append(this.f18310b);
            if (this.f18311c.size() == 0) {
                sb.append(" no semaphores.");
            } else {
                sb.append(" semaphores:\n");
                for (Thread thread : this.f18311c.keySet()) {
                    sb.append("\tThread: ");
                    sb.append(thread.getName());
                    sb.append(' ');
                    sb.append(this.f18311c.get(thread));
                    sb.append('\n');
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: DNSStatefulObject.java */
    /* loaded from: classes2.dex */
    public static class b extends ReentrantLock implements i {

        /* renamed from: f, reason: collision with root package name */
        private static k.b.b f18312f = k.b.c.i(b.class.getName());

        /* renamed from: g, reason: collision with root package name */
        private volatile l f18313g = null;

        /* renamed from: h, reason: collision with root package name */
        protected volatile i.a.g.t.a f18314h = null;

        /* renamed from: i, reason: collision with root package name */
        protected volatile i.a.g.s.g f18315i = i.a.g.s.g.f18411f;

        /* renamed from: j, reason: collision with root package name */
        private final a f18316j = new a("Announce");

        /* renamed from: k, reason: collision with root package name */
        private final a f18317k = new a("Cancel");

        private boolean v() {
            return this.f18315i.n() || this.f18315i.o();
        }

        private boolean w() {
            return this.f18315i.r() || this.f18315i.B();
        }

        public void a(i.a.g.t.a aVar, i.a.g.s.g gVar) {
            if (this.f18314h == null && this.f18315i == gVar) {
                lock();
                try {
                    if (this.f18314h == null && this.f18315i == gVar) {
                        s(aVar);
                    }
                } finally {
                    unlock();
                }
            }
        }

        public boolean b() {
            boolean z = false;
            if (!v()) {
                lock();
                try {
                    if (!v()) {
                        r(i.a.g.s.g.l);
                        s(null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        public boolean c() {
            boolean z = false;
            if (!w()) {
                lock();
                try {
                    if (!w()) {
                        r(i.a.g.s.g.p);
                        s(null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        public l d() {
            return this.f18313g;
        }

        public boolean e() {
            return this.f18315i.f();
        }

        public boolean f() {
            return this.f18315i.i();
        }

        public boolean g(i.a.g.t.a aVar, i.a.g.s.g gVar) {
            boolean z;
            lock();
            try {
                if (this.f18314h == aVar) {
                    if (this.f18315i == gVar) {
                        z = true;
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                unlock();
            }
        }

        public boolean h() {
            return this.f18315i.n();
        }

        public boolean i() {
            return this.f18315i.o();
        }

        public boolean j() {
            return this.f18315i.r();
        }

        public boolean k() {
            return this.f18315i.B();
        }

        public boolean l() {
            return this.f18315i.C();
        }

        public boolean m() {
            lock();
            try {
                r(i.a.g.s.g.f18411f);
                s(null);
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        public void n(i.a.g.t.a aVar) {
            if (this.f18314h == aVar) {
                lock();
                try {
                    if (this.f18314h == aVar) {
                        s(null);
                    }
                } finally {
                    unlock();
                }
            }
        }

        @Override // i.a.g.i
        public boolean o(i.a.g.t.a aVar) {
            if (this.f18314h != aVar) {
                return true;
            }
            lock();
            try {
                if (this.f18314h == aVar) {
                    r(this.f18315i.d());
                } else {
                    f18312f.h("Trying to advance state whhen not the owner. owner: " + this.f18314h + " perpetrator: " + aVar);
                }
                return true;
            } finally {
                unlock();
            }
        }

        public boolean p() {
            if (v()) {
                return true;
            }
            lock();
            try {
                if (!v()) {
                    r(this.f18315i.D());
                    s(null);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void q(l lVar) {
            this.f18313g = lVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void r(i.a.g.s.g gVar) {
            lock();
            try {
                this.f18315i = gVar;
                if (e()) {
                    this.f18316j.a();
                }
                if (h()) {
                    this.f18317k.a();
                    this.f18316j.a();
                }
            } finally {
                unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void s(i.a.g.t.a aVar) {
            this.f18314h = aVar;
        }

        public boolean t(long j2) {
            if (!e() && !v()) {
                this.f18316j.b(j2 + 10);
            }
            if (!e()) {
                this.f18316j.b(10L);
                if (!e()) {
                    if (!v() && !w()) {
                        f18312f.h("Wait for announced timed out: " + this);
                    } else {
                        f18312f.c("Wait for announced cancelled: " + this);
                    }
                }
            }
            return e();
        }

        @Override // java.util.concurrent.locks.ReentrantLock
        public String toString() {
            String str;
            String str2 = "NO DNS";
            try {
                StringBuilder sb = new StringBuilder();
                if (this.f18313g != null) {
                    str = "DNS: " + this.f18313g.I0() + " [" + this.f18313g.F0() + "]";
                } else {
                    str = "NO DNS";
                }
                sb.append(str);
                sb.append(" state: ");
                sb.append(this.f18315i);
                sb.append(" task: ");
                sb.append(this.f18314h);
                return sb.toString();
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                if (this.f18313g != null) {
                    str2 = "DNS: " + this.f18313g.I0();
                }
                sb2.append(str2);
                sb2.append(" state: ");
                sb2.append(this.f18315i);
                sb2.append(" task: ");
                sb2.append(this.f18314h);
                return sb2.toString();
            }
        }

        public boolean u(long j2) {
            if (!h()) {
                this.f18317k.b(j2);
            }
            if (!h()) {
                this.f18317k.b(10L);
                if (!h() && !w()) {
                    f18312f.h("Wait for canceled timed out: " + this);
                }
            }
            return h();
        }
    }

    boolean o(i.a.g.t.a aVar);
}
