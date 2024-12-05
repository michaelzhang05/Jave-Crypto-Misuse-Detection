package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.android.core.internal.util.t;
import io.sentry.b2;
import io.sentry.k3;
import io.sentry.s4;
import io.sentry.w1;
import io.sentry.w2;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidProfiler.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: b, reason: collision with root package name */
    private final File f18740b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18741c;

    /* renamed from: f, reason: collision with root package name */
    private String f18744f;

    /* renamed from: h, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.t f18746h;
    private final s0 m;
    private final b2 n;
    private final w1 o;
    private long a = 0;

    /* renamed from: d, reason: collision with root package name */
    private Future<?> f18742d = null;

    /* renamed from: e, reason: collision with root package name */
    private File f18743e = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile b f18745g = null;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f18747i = new ArrayDeque<>();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f18748j = new ArrayDeque<>();

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f18749k = new ArrayDeque<>();
    private final Map<String, io.sentry.profilemeasurements.a> l = new HashMap();
    private boolean p = false;

    /* compiled from: AndroidProfiler.java */
    /* loaded from: classes2.dex */
    class a implements t.b {
        final long a = TimeUnit.SECONDS.toNanos(1);

        /* renamed from: b, reason: collision with root package name */
        final long f18750b = TimeUnit.MILLISECONDS.toNanos(700);

        /* renamed from: c, reason: collision with root package name */
        float f18751c = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.t.b
        public void a(long j2, long j3, float f2) {
            long nanoTime = ((j2 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - l0.this.a;
            if (nanoTime < 0) {
                return;
            }
            boolean z = ((float) j3) > ((float) this.a) / (f2 - 1.0f);
            float f3 = ((int) (f2 * 100.0f)) / 100.0f;
            if (j3 > this.f18750b) {
                l0.this.f18749k.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Long.valueOf(j3)));
            } else if (z) {
                l0.this.f18748j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Long.valueOf(j3)));
            }
            if (f3 != this.f18751c) {
                this.f18751c = f3;
                l0.this.f18747i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Float.valueOf(f3)));
            }
        }
    }

    /* compiled from: AndroidProfiler.java */
    /* loaded from: classes2.dex */
    public static class b {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18753b;

        /* renamed from: c, reason: collision with root package name */
        public final File f18754c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<String, io.sentry.profilemeasurements.a> f18755d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f18756e;

        public b(long j2, long j3, boolean z, File file, Map<String, io.sentry.profilemeasurements.a> map) {
            this.a = j2;
            this.f18754c = file;
            this.f18753b = j3;
            this.f18755d = map;
            this.f18756e = z;
        }
    }

    /* compiled from: AndroidProfiler.java */
    /* loaded from: classes2.dex */
    public static class c {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18757b;

        public c(long j2, long j3) {
            this.a = j2;
            this.f18757b = j3;
        }
    }

    public l0(String str, int i2, io.sentry.android.core.internal.util.t tVar, b2 b2Var, w1 w1Var, s0 s0Var) {
        this.f18740b = new File((String) io.sentry.util.q.c(str, "TracesFilesDirPath is required"));
        this.f18741c = i2;
        this.o = (w1) io.sentry.util.q.c(w1Var, "Logger is required");
        this.n = (b2) io.sentry.util.q.c(b2Var, "ExecutorService is required.");
        this.f18746h = (io.sentry.android.core.internal.util.t) io.sentry.util.q.c(tVar, "SentryFrameMetricsCollector is required");
        this.m = (s0) io.sentry.util.q.c(s0Var, "The BuildInfoProvider is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h() {
        this.f18745g = f(true, null);
    }

    @SuppressLint({"NewApi"})
    private void i(List<k3> list) {
        if (this.m.d() < 21) {
            return;
        }
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            for (k3 k3Var : list) {
                io.sentry.x0 c2 = k3Var.c();
                w2 d2 = k3Var.d();
                if (c2 != null) {
                    arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c2.b()) + elapsedRealtimeNanos), Double.valueOf(c2.a())));
                }
                if (d2 != null && d2.b() > -1) {
                    arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(d2.a()) + elapsedRealtimeNanos), Long.valueOf(d2.b())));
                }
                if (d2 != null && d2.c() > -1) {
                    arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(d2.a()) + elapsedRealtimeNanos), Long.valueOf(d2.c())));
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.l.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.l.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.l.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public synchronized void e() {
        Future<?> future = this.f18742d;
        if (future != null) {
            future.cancel(true);
            this.f18742d = null;
        }
        if (this.p) {
            f(true, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:11:0x000f, B:14:0x001c, B:21:0x002b, B:22:0x0039, B:24:0x004c, B:27:0x0059, B:29:0x0061, B:30:0x0071, B:32:0x0079, B:33:0x0089, B:35:0x0091, B:36:0x00a1, B:38:0x00a8, B:39:0x00ae, B:48:0x00bc, B:49:0x00be, B:45:0x002f, B:20:0x0028), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:11:0x000f, B:14:0x001c, B:21:0x002b, B:22:0x0039, B:24:0x004c, B:27:0x0059, B:29:0x0061, B:30:0x0071, B:32:0x0079, B:33:0x0089, B:35:0x0091, B:36:0x00a1, B:38:0x00a8, B:39:0x00ae, B:48:0x00bc, B:49:0x00be, B:45:0x002f, B:20:0x0028), top: B:2:0x0001, inners: #0, #1 }] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized io.sentry.android.core.l0.b f(boolean r13, java.util.List<io.sentry.k3> r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            io.sentry.android.core.l0$b r0 = r12.f18745g     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L9
            io.sentry.android.core.l0$b r13 = r12.f18745g     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r13
        L9:
            boolean r0 = r12.p     // Catch: java.lang.Throwable -> Lbf
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L1c
            io.sentry.w1 r13 = r12.o     // Catch: java.lang.Throwable -> Lbf
            io.sentry.s4 r14 = io.sentry.s4.WARNING     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "Profiler not running"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lbf
            r13.c(r14, r0, r2)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r1
        L1c:
            io.sentry.android.core.s0 r0 = r12.m     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.d()     // Catch: java.lang.Throwable -> Lbf
            r3 = 21
            if (r0 >= r3) goto L28
            monitor-exit(r12)
            return r1
        L28:
            android.os.Debug.stopMethodTracing()     // Catch: java.lang.Throwable -> L2e
        L2b:
            r12.p = r2     // Catch: java.lang.Throwable -> Lbf
            goto L39
        L2e:
            r0 = move-exception
            io.sentry.w1 r3 = r12.o     // Catch: java.lang.Throwable -> Lbb
            io.sentry.s4 r4 = io.sentry.s4.ERROR     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = "Error while stopping profiling: "
            r3.b(r4, r5, r0)     // Catch: java.lang.Throwable -> Lbb
            goto L2b
        L39:
            io.sentry.android.core.internal.util.t r0 = r12.f18746h     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r12.f18744f     // Catch: java.lang.Throwable -> Lbf
            r0.j(r3)     // Catch: java.lang.Throwable -> Lbf
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lbf
            long r7 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> Lbf
            java.io.File r0 = r12.f18743e     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L59
            io.sentry.w1 r13 = r12.o     // Catch: java.lang.Throwable -> Lbf
            io.sentry.s4 r14 = io.sentry.s4.ERROR     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "Trace file does not exists"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lbf
            r13.c(r14, r0, r2)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r1
        L59:
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r0 = r12.f18748j     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L71
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r0 = r12.l     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "slow_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r9 = r12.f18748j     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> Lbf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
        L71:
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r0 = r12.f18749k     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L89
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r0 = r12.l     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "frozen_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r9 = r12.f18749k     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> Lbf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
        L89:
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r0 = r12.f18747i     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto La1
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r0 = r12.l     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "screen_frame_rates"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "hz"
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r9 = r12.f18747i     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> Lbf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
        La1:
            r12.i(r14)     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.Future<?> r14 = r12.f18742d     // Catch: java.lang.Throwable -> Lbf
            if (r14 == 0) goto Lae
            r0 = 1
            r14.cancel(r0)     // Catch: java.lang.Throwable -> Lbf
            r12.f18742d = r1     // Catch: java.lang.Throwable -> Lbf
        Lae:
            io.sentry.android.core.l0$b r14 = new io.sentry.android.core.l0$b     // Catch: java.lang.Throwable -> Lbf
            java.io.File r10 = r12.f18743e     // Catch: java.lang.Throwable -> Lbf
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r11 = r12.l     // Catch: java.lang.Throwable -> Lbf
            r4 = r14
            r9 = r13
            r4.<init>(r5, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r14
        Lbb:
            r13 = move-exception
            r12.p = r2     // Catch: java.lang.Throwable -> Lbf
            throw r13     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r13 = move-exception
            monitor-exit(r12)
            goto Lc3
        Lc2:
            throw r13
        Lc3:
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.l0.f(boolean, java.util.List):io.sentry.android.core.l0$b");
    }

    @SuppressLint({"NewApi"})
    public synchronized c j() {
        int i2 = this.f18741c;
        if (i2 == 0) {
            this.o.c(s4.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i2));
            return null;
        }
        if (this.p) {
            this.o.c(s4.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        if (this.m.d() < 21) {
            return null;
        }
        this.f18743e = new File(this.f18740b, UUID.randomUUID() + ".trace");
        this.l.clear();
        this.f18747i.clear();
        this.f18748j.clear();
        this.f18749k.clear();
        this.f18744f = this.f18746h.i(new a());
        try {
            this.f18742d = this.n.b(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    l0.this.h();
                }
            }, 30000L);
        } catch (RejectedExecutionException e2) {
            this.o.b(s4.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e2);
        }
        this.a = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.f18743e.getPath(), 3000000, this.f18741c);
            this.p = true;
            return new c(this.a, elapsedCpuTime);
        } catch (Throwable th) {
            f(false, null);
            this.o.b(s4.ERROR, "Unable to start a profile: ", th);
            this.p = false;
            return null;
        }
    }
}
