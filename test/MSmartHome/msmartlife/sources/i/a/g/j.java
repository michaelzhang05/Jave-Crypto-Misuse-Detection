package i.a.g;

import java.net.InetAddress;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DNSTaskStarter.java */
/* loaded from: classes2.dex */
public interface j {

    /* compiled from: DNSTaskStarter.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private static volatile b a;

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicReference<a> f18321b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        private final ConcurrentMap<l, j> f18322c = new ConcurrentHashMap(20);

        /* compiled from: DNSTaskStarter.java */
        /* loaded from: classes2.dex */
        public interface a {
            j a(l lVar);
        }

        private b() {
        }

        public static b b() {
            if (a == null) {
                synchronized (b.class) {
                    if (a == null) {
                        a = new b();
                    }
                }
            }
            return a;
        }

        protected static j d(l lVar) {
            a aVar = f18321b.get();
            j a2 = aVar != null ? aVar.a(lVar) : null;
            return a2 != null ? a2 : new a(lVar);
        }

        public void a(l lVar) {
            this.f18322c.remove(lVar);
        }

        public j c(l lVar) {
            j jVar = this.f18322c.get(lVar);
            if (jVar != null) {
                return jVar;
            }
            this.f18322c.putIfAbsent(lVar, d(lVar));
            return this.f18322c.get(lVar);
        }
    }

    void D();

    void J();

    void L();

    void P(c cVar, InetAddress inetAddress, int i2);

    void T();

    void Y();

    void a();

    void b();

    void c0(q qVar);

    void f(String str);

    void w();

    void z();

    /* compiled from: DNSTaskStarter.java */
    /* loaded from: classes2.dex */
    public static final class a implements j {

        /* renamed from: f, reason: collision with root package name */
        private final l f18318f;

        /* renamed from: g, reason: collision with root package name */
        private final Timer f18319g;

        /* renamed from: h, reason: collision with root package name */
        private final Timer f18320h;

        public a(l lVar) {
            this.f18318f = lVar;
            this.f18319g = new C0264a("JmDNS(" + lVar.I0() + ").Timer", true);
            this.f18320h = new C0264a("JmDNS(" + lVar.I0() + ").State.Timer", true);
        }

        @Override // i.a.g.j
        public void D() {
            new i.a.g.t.b(this.f18318f).g(this.f18319g);
        }

        @Override // i.a.g.j
        public void J() {
            new i.a.g.t.e.d(this.f18318f).u(this.f18320h);
        }

        @Override // i.a.g.j
        public void L() {
            new i.a.g.t.e.a(this.f18318f).u(this.f18320h);
        }

        @Override // i.a.g.j
        public void P(c cVar, InetAddress inetAddress, int i2) {
            new i.a.g.t.c(this.f18318f, cVar, inetAddress, i2).g(this.f18319g);
        }

        @Override // i.a.g.j
        public void T() {
            this.f18320h.purge();
        }

        @Override // i.a.g.j
        public void Y() {
            new i.a.g.t.e.e(this.f18318f).u(this.f18320h);
        }

        @Override // i.a.g.j
        public void a() {
            this.f18319g.purge();
        }

        @Override // i.a.g.j
        public void b() {
            this.f18320h.cancel();
        }

        @Override // i.a.g.j
        public void c0(q qVar) {
            new i.a.g.t.d.b(this.f18318f, qVar).j(this.f18319g);
        }

        @Override // i.a.g.j
        public void f(String str) {
            new i.a.g.t.d.c(this.f18318f, str).j(this.f18319g);
        }

        @Override // i.a.g.j
        public void w() {
            this.f18319g.cancel();
        }

        @Override // i.a.g.j
        public void z() {
            new i.a.g.t.e.b(this.f18318f).u(this.f18320h);
        }

        /* compiled from: DNSTaskStarter.java */
        /* renamed from: i.a.g.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0264a extends Timer {
            private volatile boolean a;

            public C0264a(String str, boolean z) {
                super(str, z);
                this.a = false;
            }

            @Override // java.util.Timer
            public synchronized void cancel() {
                if (this.a) {
                    return;
                }
                this.a = true;
                super.cancel();
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j2) {
                if (this.a) {
                    return;
                }
                super.schedule(timerTask, j2);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j2, long j3) {
                if (this.a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, j2, j3);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (this.a) {
                    return;
                }
                super.schedule(timerTask, date);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j2) {
                if (this.a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, date, j2);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j2, long j3) {
                if (this.a) {
                    return;
                }
                super.schedule(timerTask, j2, j3);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date, long j2) {
                if (this.a) {
                    return;
                }
                super.schedule(timerTask, date, j2);
            }
        }
    }
}
