package O6;

import O6.h;
import S6.C1417e;
import S6.C1420h;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class g implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    private static final ExecutorService f8385u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), J6.c.B("OkHttp Http2Connection", true));

    /* renamed from: a, reason: collision with root package name */
    final boolean f8386a;

    /* renamed from: b, reason: collision with root package name */
    final h f8387b;

    /* renamed from: d, reason: collision with root package name */
    final String f8389d;

    /* renamed from: e, reason: collision with root package name */
    int f8390e;

    /* renamed from: f, reason: collision with root package name */
    int f8391f;

    /* renamed from: g, reason: collision with root package name */
    boolean f8392g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f8393h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f8394i;

    /* renamed from: j, reason: collision with root package name */
    final l f8395j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8396k;

    /* renamed from: m, reason: collision with root package name */
    long f8398m;

    /* renamed from: o, reason: collision with root package name */
    final m f8400o;

    /* renamed from: p, reason: collision with root package name */
    boolean f8401p;

    /* renamed from: q, reason: collision with root package name */
    final Socket f8402q;

    /* renamed from: r, reason: collision with root package name */
    final O6.j f8403r;

    /* renamed from: s, reason: collision with root package name */
    final j f8404s;

    /* renamed from: t, reason: collision with root package name */
    final Set f8405t;

    /* renamed from: c, reason: collision with root package name */
    final Map f8388c = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    long f8397l = 0;

    /* renamed from: n, reason: collision with root package name */
    m f8399n = new m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8406b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O6.b f8407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i8, O6.b bVar) {
            super(str, objArr);
            this.f8406b = i8;
            this.f8407c = bVar;
        }

        @Override // J6.b
        public void e() {
            try {
                g.this.M(this.f8406b, this.f8407c);
            } catch (IOException unused) {
                g.this.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8409b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i8, long j8) {
            super(str, objArr);
            this.f8409b = i8;
            this.f8410c = j8;
        }

        @Override // J6.b
        public void e() {
            try {
                g.this.f8403r.A(this.f8409b, this.f8410c);
            } catch (IOException unused) {
                g.this.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f8413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, int i8, List list) {
            super(str, objArr);
            this.f8412b = i8;
            this.f8413c = list;
        }

        @Override // J6.b
        public void e() {
            if (g.this.f8395j.onRequest(this.f8412b, this.f8413c)) {
                try {
                    g.this.f8403r.v(this.f8412b, O6.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f8405t.remove(Integer.valueOf(this.f8412b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8415b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f8416c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8417d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i8, List list, boolean z8) {
            super(str, objArr);
            this.f8415b = i8;
            this.f8416c = list;
            this.f8417d = z8;
        }

        @Override // J6.b
        public void e() {
            boolean onHeaders = g.this.f8395j.onHeaders(this.f8415b, this.f8416c, this.f8417d);
            if (onHeaders) {
                try {
                    g.this.f8403r.v(this.f8415b, O6.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (onHeaders || this.f8417d) {
                synchronized (g.this) {
                    g.this.f8405t.remove(Integer.valueOf(this.f8415b));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class e extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8419b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1417e f8420c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8421d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8422e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i8, C1417e c1417e, int i9, boolean z8) {
            super(str, objArr);
            this.f8419b = i8;
            this.f8420c = c1417e;
            this.f8421d = i9;
            this.f8422e = z8;
        }

        @Override // J6.b
        public void e() {
            try {
                boolean b8 = g.this.f8395j.b(this.f8419b, this.f8420c, this.f8421d, this.f8422e);
                if (b8) {
                    g.this.f8403r.v(this.f8419b, O6.b.CANCEL);
                }
                if (b8 || this.f8422e) {
                    synchronized (g.this) {
                        g.this.f8405t.remove(Integer.valueOf(this.f8419b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8424b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O6.b f8425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i8, O6.b bVar) {
            super(str, objArr);
            this.f8424b = i8;
            this.f8425c = bVar;
        }

        @Override // J6.b
        public void e() {
            g.this.f8395j.a(this.f8424b, this.f8425c);
            synchronized (g.this) {
                g.this.f8405t.remove(Integer.valueOf(this.f8424b));
            }
        }
    }

    /* renamed from: O6.g$g, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0166g {

        /* renamed from: a, reason: collision with root package name */
        Socket f8427a;

        /* renamed from: b, reason: collision with root package name */
        String f8428b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC1419g f8429c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC1418f f8430d;

        /* renamed from: e, reason: collision with root package name */
        h f8431e = h.f8435a;

        /* renamed from: f, reason: collision with root package name */
        l f8432f = l.f8495a;

        /* renamed from: g, reason: collision with root package name */
        boolean f8433g;

        /* renamed from: h, reason: collision with root package name */
        int f8434h;

        public C0166g(boolean z8) {
            this.f8433g = z8;
        }

        public g a() {
            return new g(this);
        }

        public C0166g b(h hVar) {
            this.f8431e = hVar;
            return this;
        }

        public C0166g c(int i8) {
            this.f8434h = i8;
            return this;
        }

        public C0166g d(Socket socket, String str, InterfaceC1419g interfaceC1419g, InterfaceC1418f interfaceC1418f) {
            this.f8427a = socket;
            this.f8428b = str;
            this.f8429c = interfaceC1419g;
            this.f8430d = interfaceC1418f;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    final class i extends J6.b {

        /* renamed from: b, reason: collision with root package name */
        final boolean f8436b;

        /* renamed from: c, reason: collision with root package name */
        final int f8437c;

        /* renamed from: d, reason: collision with root package name */
        final int f8438d;

        i(boolean z8, int i8, int i9) {
            super("OkHttp %s ping %08x%08x", g.this.f8389d, Integer.valueOf(i8), Integer.valueOf(i9));
            this.f8436b = z8;
            this.f8437c = i8;
            this.f8438d = i9;
        }

        @Override // J6.b
        public void e() {
            g.this.L(this.f8436b, this.f8437c, this.f8438d);
        }
    }

    g(C0166g c0166g) {
        int i8;
        m mVar = new m();
        this.f8400o = mVar;
        this.f8401p = false;
        this.f8405t = new LinkedHashSet();
        this.f8395j = c0166g.f8432f;
        boolean z8 = c0166g.f8433g;
        this.f8386a = z8;
        this.f8387b = c0166g.f8431e;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        this.f8391f = i8;
        if (z8) {
            this.f8391f = i8 + 2;
        }
        if (z8) {
            this.f8399n.i(7, 16777216);
        }
        String str = c0166g.f8428b;
        this.f8389d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, J6.c.B(J6.c.o("OkHttp %s Writer", str), false));
        this.f8393h = scheduledThreadPoolExecutor;
        if (c0166g.f8434h != 0) {
            i iVar = new i(false, 0, 0);
            int i9 = c0166g.f8434h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i9, i9, TimeUnit.MILLISECONDS);
        }
        this.f8394i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), J6.c.B(J6.c.o("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.f8398m = mVar.d();
        this.f8402q = c0166g.f8427a;
        this.f8403r = new O6.j(c0166g.f8430d, z8);
        this.f8404s = new j(new O6.h(c0166g.f8429c, z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            O6.b bVar = O6.b.PROTOCOL_ERROR;
            m(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0016, B:11:0x001a, B:13:0x002d, B:15:0x0035, B:19:0x003f, B:21:0x0045, B:22:0x004e, B:36:0x0073, B:37:0x0078), top: B:5:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private O6.i v(int r11, java.util.List r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            O6.j r7 = r10.f8403r
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L57
            int r0 = r10.f8391f     // Catch: java.lang.Throwable -> L13
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L16
            O6.b r0 = O6.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r10.H(r0)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r11 = move-exception
            goto L79
        L16:
            boolean r0 = r10.f8392g     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L73
            int r8 = r10.f8391f     // Catch: java.lang.Throwable -> L13
            int r0 = r8 + 2
            r10.f8391f = r0     // Catch: java.lang.Throwable -> L13
            O6.i r9 = new O6.i     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            if (r13 == 0) goto L3e
            long r0 = r10.f8398m     // Catch: java.lang.Throwable -> L13
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3e
            long r0 = r9.f8459b     // Catch: java.lang.Throwable -> L13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L3e
        L3c:
            r13 = 0
            goto L3f
        L3e:
            r13 = 1
        L3f:
            boolean r0 = r9.k()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L4e
            java.util.Map r0 = r10.f8388c     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L13
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L13
        L4e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            if (r11 != 0) goto L59
            O6.j r0 = r10.f8403r     // Catch: java.lang.Throwable -> L57
            r0.y(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L57
            goto L62
        L57:
            r11 = move-exception
            goto L7b
        L59:
            boolean r0 = r10.f8386a     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L6b
            O6.j r0 = r10.f8403r     // Catch: java.lang.Throwable -> L57
            r0.u(r11, r8, r12)     // Catch: java.lang.Throwable -> L57
        L62:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            if (r13 == 0) goto L6a
            O6.j r11 = r10.f8403r
            r11.flush()
        L6a:
            return r9
        L6b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L57
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L57
            throw r11     // Catch: java.lang.Throwable -> L57
        L73:
            O6.a r11 = new O6.a     // Catch: java.lang.Throwable -> L13
            r11.<init>()     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L13
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L57
        L7b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.g.v(int, java.util.List, boolean):O6.i");
    }

    void A(int i8, List list, boolean z8) {
        try {
            this.f8394i.execute(new d("OkHttp %s Push Headers[%s]", new Object[]{this.f8389d, Integer.valueOf(i8)}, i8, list, z8));
        } catch (RejectedExecutionException unused) {
        }
    }

    void D(int i8, List list) {
        synchronized (this) {
            try {
                if (this.f8405t.contains(Integer.valueOf(i8))) {
                    N(i8, O6.b.PROTOCOL_ERROR);
                    return;
                }
                this.f8405t.add(Integer.valueOf(i8));
                try {
                    this.f8394i.execute(new c("OkHttp %s Push Request[%s]", new Object[]{this.f8389d, Integer.valueOf(i8)}, i8, list));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void E(int i8, O6.b bVar) {
        this.f8394i.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{this.f8389d, Integer.valueOf(i8)}, i8, bVar));
    }

    boolean F(int i8) {
        if (i8 != 0 && (i8 & 1) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized O6.i G(int i8) {
        O6.i iVar;
        iVar = (O6.i) this.f8388c.remove(Integer.valueOf(i8));
        notifyAll();
        return iVar;
    }

    public void H(O6.b bVar) {
        synchronized (this.f8403r) {
            synchronized (this) {
                if (this.f8392g) {
                    return;
                }
                this.f8392g = true;
                this.f8403r.m(this.f8390e, bVar, J6.c.f4939a);
            }
        }
    }

    public void I() {
        J(true);
    }

    void J(boolean z8) {
        if (z8) {
            this.f8403r.b();
            this.f8403r.x(this.f8399n);
            if (this.f8399n.d() != 65535) {
                this.f8403r.A(0, r5 - 65535);
            }
        }
        new Thread(this.f8404s).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f8403r.o());
        r6 = r3;
        r8.f8398m -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(int r9, boolean r10, S6.C1417e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            O6.j r12 = r8.f8403r
            r12.f(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.f8398m     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L32
            java.util.Map r3 = r8.f8388c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L5e
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L28
            O6.j r3 = r8.f8403r     // Catch: java.lang.Throwable -> L28
            int r3 = r3.o()     // Catch: java.lang.Throwable -> L28
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f8398m     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f8398m = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            O6.j r4 = r8.f8403r
            if (r10 == 0) goto L53
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            r4.f(r5, r9, r11, r3)
            goto Ld
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.g.K(int, boolean, S6.e, long):void");
    }

    void L(boolean z8, int i8, int i9) {
        boolean z9;
        if (!z8) {
            synchronized (this) {
                z9 = this.f8396k;
                this.f8396k = true;
            }
            if (z9) {
                n();
                return;
            }
        }
        try {
            this.f8403r.s(z8, i8, i9);
        } catch (IOException unused) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(int i8, O6.b bVar) {
        this.f8403r.v(i8, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(int i8, O6.b bVar) {
        try {
            this.f8393h.execute(new a("OkHttp %s stream %d", new Object[]{this.f8389d, Integer.valueOf(i8)}, i8, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i8, long j8) {
        try {
            this.f8393h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f8389d, Integer.valueOf(i8)}, i8, j8));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m(O6.b.NO_ERROR, O6.b.CANCEL);
    }

    public void flush() {
        this.f8403r.flush();
    }

    void l(long j8) {
        this.f8398m += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void m(O6.b bVar, O6.b bVar2) {
        O6.i[] iVarArr = null;
        try {
            H(bVar);
            e = null;
        } catch (IOException e8) {
            e = e8;
        }
        synchronized (this) {
            try {
                if (!this.f8388c.isEmpty()) {
                    iVarArr = (O6.i[]) this.f8388c.values().toArray(new O6.i[this.f8388c.size()]);
                    this.f8388c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (O6.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2);
                } catch (IOException e9) {
                    if (e != null) {
                        e = e9;
                    }
                }
            }
        }
        try {
            this.f8403r.close();
        } catch (IOException e10) {
            if (e == null) {
                e = e10;
            }
        }
        try {
            this.f8402q.close();
        } catch (IOException e11) {
            e = e11;
        }
        this.f8393h.shutdown();
        this.f8394i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    synchronized O6.i o(int i8) {
        return (O6.i) this.f8388c.get(Integer.valueOf(i8));
    }

    public synchronized boolean s() {
        return this.f8392g;
    }

    public synchronized int u() {
        return this.f8400o.e(Integer.MAX_VALUE);
    }

    public O6.i x(List list, boolean z8) {
        return v(0, list, z8);
    }

    void y(int i8, InterfaceC1419g interfaceC1419g, int i9, boolean z8) {
        C1417e c1417e = new C1417e();
        long j8 = i9;
        interfaceC1419g.require(j8);
        interfaceC1419g.C(c1417e, j8);
        if (c1417e.E() == j8) {
            this.f8394i.execute(new e("OkHttp %s Push Data[%s]", new Object[]{this.f8389d, Integer.valueOf(i8)}, i8, c1417e, i9, z8));
            return;
        }
        throw new IOException(c1417e.E() + " != " + i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class j extends J6.b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        final O6.h f8440b;

        /* loaded from: classes5.dex */
        class a extends J6.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O6.i f8442b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, O6.i iVar) {
                super(str, objArr);
                this.f8442b = iVar;
            }

            @Override // J6.b
            public void e() {
                try {
                    g.this.f8387b.b(this.f8442b);
                } catch (IOException e8) {
                    Q6.f.i().p(4, "Http2Connection.Listener failure for " + g.this.f8389d, e8);
                    try {
                        this.f8442b.d(O6.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes5.dex */
        class b extends J6.b {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // J6.b
            public void e() {
                g gVar = g.this;
                gVar.f8387b.a(gVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class c extends J6.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f8445b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, m mVar) {
                super(str, objArr);
                this.f8445b = mVar;
            }

            @Override // J6.b
            public void e() {
                try {
                    g.this.f8403r.a(this.f8445b);
                } catch (IOException unused) {
                    g.this.n();
                }
            }
        }

        j(O6.h hVar) {
            super("OkHttp %s", g.this.f8389d);
            this.f8440b = hVar;
        }

        private void f(m mVar) {
            try {
                g.this.f8393h.execute(new c("OkHttp %s ACK Settings", new Object[]{g.this.f8389d}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // O6.h.b
        public void a(int i8, O6.b bVar) {
            if (g.this.F(i8)) {
                g.this.E(i8, bVar);
                return;
            }
            O6.i G8 = g.this.G(i8);
            if (G8 != null) {
                G8.p(bVar);
            }
        }

        @Override // O6.h.b
        public void b(boolean z8, m mVar) {
            O6.i[] iVarArr;
            long j8;
            synchronized (g.this) {
                try {
                    int d8 = g.this.f8400o.d();
                    if (z8) {
                        g.this.f8400o.a();
                    }
                    g.this.f8400o.h(mVar);
                    f(mVar);
                    int d9 = g.this.f8400o.d();
                    iVarArr = null;
                    if (d9 != -1 && d9 != d8) {
                        j8 = d9 - d8;
                        g gVar = g.this;
                        if (!gVar.f8401p) {
                            gVar.l(j8);
                            g.this.f8401p = true;
                        }
                        if (!g.this.f8388c.isEmpty()) {
                            iVarArr = (O6.i[]) g.this.f8388c.values().toArray(new O6.i[g.this.f8388c.size()]);
                        }
                    } else {
                        j8 = 0;
                    }
                    g.f8385u.execute(new b("OkHttp %s settings", g.this.f8389d));
                } finally {
                }
            }
            if (iVarArr != null && j8 != 0) {
                for (O6.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j8);
                    }
                }
            }
        }

        @Override // O6.h.b
        public void c(boolean z8, int i8, InterfaceC1419g interfaceC1419g, int i9) {
            if (g.this.F(i8)) {
                g.this.y(i8, interfaceC1419g, i9, z8);
                return;
            }
            O6.i o8 = g.this.o(i8);
            if (o8 == null) {
                g.this.N(i8, O6.b.PROTOCOL_ERROR);
                interfaceC1419g.skip(i9);
            } else {
                o8.m(interfaceC1419g, i9);
                if (z8) {
                    o8.n();
                }
            }
        }

        @Override // O6.h.b
        public void d(int i8, O6.b bVar, C1420h c1420h) {
            O6.i[] iVarArr;
            c1420h.K();
            synchronized (g.this) {
                iVarArr = (O6.i[]) g.this.f8388c.values().toArray(new O6.i[g.this.f8388c.size()]);
                g.this.f8392g = true;
            }
            for (O6.i iVar : iVarArr) {
                if (iVar.g() > i8 && iVar.j()) {
                    iVar.p(O6.b.REFUSED_STREAM);
                    g.this.G(iVar.g());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // J6.b
        protected void e() {
            O6.b bVar;
            O6.b bVar2 = O6.b.INTERNAL_ERROR;
            try {
                try {
                    try {
                        this.f8440b.f(this);
                        do {
                        } while (this.f8440b.b(false, this));
                        O6.b bVar3 = O6.b.NO_ERROR;
                        try {
                            bVar2 = O6.b.CANCEL;
                            g.this.m(bVar3, bVar2);
                            bVar = bVar3;
                        } catch (IOException unused) {
                            bVar2 = O6.b.PROTOCOL_ERROR;
                            g gVar = g.this;
                            gVar.m(bVar2, bVar2);
                            bVar = gVar;
                            J6.c.d(this.f8440b);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            g.this.m(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        J6.c.d(this.f8440b);
                        throw th;
                    }
                } catch (IOException unused3) {
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    g.this.m(bVar, bVar2);
                    J6.c.d(this.f8440b);
                    throw th;
                }
            } catch (IOException unused4) {
            }
            J6.c.d(this.f8440b);
        }

        @Override // O6.h.b
        public void headers(boolean z8, int i8, int i9, List list) {
            if (g.this.F(i8)) {
                g.this.A(i8, list, z8);
                return;
            }
            synchronized (g.this) {
                try {
                    O6.i o8 = g.this.o(i8);
                    if (o8 == null) {
                        g gVar = g.this;
                        if (gVar.f8392g) {
                            return;
                        }
                        if (i8 <= gVar.f8390e) {
                            return;
                        }
                        if (i8 % 2 == gVar.f8391f % 2) {
                            return;
                        }
                        O6.i iVar = new O6.i(i8, g.this, false, z8, list);
                        g gVar2 = g.this;
                        gVar2.f8390e = i8;
                        gVar2.f8388c.put(Integer.valueOf(i8), iVar);
                        g.f8385u.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f8389d, Integer.valueOf(i8)}, iVar));
                        return;
                    }
                    o8.o(list);
                    if (z8) {
                        o8.n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // O6.h.b
        public void ping(boolean z8, int i8, int i9) {
            if (z8) {
                synchronized (g.this) {
                    g.this.f8396k = false;
                    g.this.notifyAll();
                }
                return;
            }
            try {
                g.this.f8393h.execute(new i(true, i8, i9));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // O6.h.b
        public void pushPromise(int i8, int i9, List list) {
            g.this.D(i9, list);
        }

        @Override // O6.h.b
        public void windowUpdate(int i8, long j8) {
            if (i8 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f8398m += j8;
                    gVar.notifyAll();
                }
                return;
            }
            O6.i o8 = g.this.o(i8);
            if (o8 != null) {
                synchronized (o8) {
                    o8.a(j8);
                }
            }
        }

        @Override // O6.h.b
        public void ackSettings() {
        }

        @Override // O6.h.b
        public void priority(int i8, int i9, int i10, boolean z8) {
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public static final h f8435a = new a();

        /* loaded from: classes5.dex */
        final class a extends h {
            a() {
            }

            @Override // O6.g.h
            public void b(O6.i iVar) {
                iVar.d(O6.b.REFUSED_STREAM);
            }
        }

        public abstract void b(O6.i iVar);

        public void a(g gVar) {
        }
    }
}
