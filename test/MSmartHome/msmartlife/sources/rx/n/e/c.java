package rx.n.e;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BackpressureDrainManager.java */
/* loaded from: classes3.dex */
public final class c extends AtomicLong implements rx.g {

    /* renamed from: f, reason: collision with root package name */
    boolean f23094f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f23095g;

    /* renamed from: h, reason: collision with root package name */
    Throwable f23096h;

    /* renamed from: i, reason: collision with root package name */
    final a f23097i;

    /* compiled from: BackpressureDrainManager.java */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(Object obj);

        void b(Throwable th);

        Object peek();

        Object poll();
    }

    public c(a aVar) {
        this.f23097i = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r1 = r13.f23095g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r5.peek() == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (get() != Long.MAX_VALUE) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r1 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        r13.f23094f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        r2 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        r9 = addAndGet(-r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        if (r9 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (r2 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        if (r1 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006f, code lost:
    
        r13.f23094f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0043, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0073, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0076, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002f, code lost:
    
        if (r2 == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.f23094f     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L7
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L93
            return
        L7:
            r0 = 1
            r13.f23094f = r0     // Catch: java.lang.Throwable -> L93
            boolean r1 = r13.f23095g     // Catch: java.lang.Throwable -> L93
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L93
            long r2 = r13.get()
            r4 = 0
            rx.n.e.c$a r5 = r13.f23097i     // Catch: java.lang.Throwable -> L86
        L14:
            r6 = 0
        L15:
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 > 0) goto L1d
            if (r1 == 0) goto L38
        L1d:
            if (r1 == 0) goto L32
            java.lang.Object r9 = r5.peek()     // Catch: java.lang.Throwable -> L86
            if (r9 != 0) goto L2d
            java.lang.Throwable r1 = r13.f23096h     // Catch: java.lang.Throwable -> L2b
            r5.b(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r1 = move-exception
            goto L88
        L2d:
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L32
            goto L38
        L32:
            java.lang.Object r9 = r5.poll()     // Catch: java.lang.Throwable -> L86
            if (r9 != 0) goto L79
        L38:
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L86
            boolean r1 = r13.f23095g     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r5.peek()     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            long r9 = r13.get()     // Catch: java.lang.Throwable -> L73
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L5b
            if (r2 != 0) goto L59
            if (r1 != 0) goto L59
            r13.f23094f = r4     // Catch: java.lang.Throwable -> L77
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L77
            return
        L59:
            r2 = r11
            goto L6d
        L5b:
            int r3 = -r6
            long r9 = (long) r3
            long r9 = r13.addAndGet(r9)     // Catch: java.lang.Throwable -> L73
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L67
            if (r2 != 0) goto L6c
        L67:
            if (r1 == 0) goto L6f
            if (r2 == 0) goto L6c
            goto L6f
        L6c:
            r2 = r9
        L6d:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L73
            goto L14
        L6f:
            r13.f23094f = r4     // Catch: java.lang.Throwable -> L77
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L77
            return
        L73:
            r1 = move-exception
            r0 = 0
        L75:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L2b
        L77:
            r1 = move-exception
            goto L75
        L79:
            boolean r7 = r5.a(r9)     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto L80
            return
        L80:
            r7 = 1
            long r2 = r2 - r7
            int r6 = r6 + 1
            goto L15
        L86:
            r1 = move-exception
            r0 = 0
        L88:
            if (r0 != 0) goto L92
            monitor-enter(r13)
            r13.f23094f = r4     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8f
            goto L92
        L8f:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8f
            throw r0
        L92:
            throw r1
        L93:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L93
            goto L97
        L96:
            throw r0
        L97:
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.n.e.c.a():void");
    }

    public void b() {
        this.f23095g = true;
        a();
    }

    public void c(Throwable th) {
        if (this.f23095g) {
            return;
        }
        this.f23096h = th;
        this.f23095g = true;
        a();
    }

    @Override // rx.g
    public void request(long j2) {
        boolean z;
        long j3;
        if (j2 == 0) {
            return;
        }
        while (true) {
            long j4 = get();
            boolean z2 = true;
            z = j4 == 0;
            if (j4 == Long.MAX_VALUE) {
                break;
            }
            if (j2 == Long.MAX_VALUE) {
                j3 = j2;
            } else {
                j3 = j4 <= Long.MAX_VALUE - j2 ? j4 + j2 : Long.MAX_VALUE;
                z2 = z;
            }
            if (compareAndSet(j4, j3)) {
                z = z2;
                break;
            }
        }
        if (z) {
            a();
        }
    }
}
