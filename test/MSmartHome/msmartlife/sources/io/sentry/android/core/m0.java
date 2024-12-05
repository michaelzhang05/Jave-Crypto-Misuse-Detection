package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.android.core.l0;
import io.sentry.e2;
import io.sentry.f2;
import io.sentry.k3;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.q1;
import io.sentry.s4;
import io.sentry.v1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidTransactionProfiler.java */
/* loaded from: classes2.dex */
public final class m0 implements f2 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f18758b;

    /* renamed from: c, reason: collision with root package name */
    private final v1 f18759c;

    /* renamed from: d, reason: collision with root package name */
    private final s0 f18760d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18761e;

    /* renamed from: f, reason: collision with root package name */
    private int f18762f;

    /* renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.t f18763g;

    /* renamed from: h, reason: collision with root package name */
    private n3 f18764h;

    /* renamed from: i, reason: collision with root package name */
    private e2 f18765i;

    /* renamed from: j, reason: collision with root package name */
    private l0 f18766j;

    /* renamed from: k, reason: collision with root package name */
    private long f18767k;
    private long l;

    public m0(Context context, SentryAndroidOptions sentryAndroidOptions, s0 s0Var, io.sentry.android.core.internal.util.t tVar) {
        this(context, sentryAndroidOptions, s0Var, tVar, q1.a());
    }

    private ActivityManager.MemoryInfo c() {
        try {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f18758b.getLogger().c(s4.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            this.f18758b.getLogger().b(s4.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    private void d() {
        if (this.f18761e) {
            return;
        }
        this.f18761e = true;
        String profilingTracesDirPath = this.f18758b.getProfilingTracesDirPath();
        if (!this.f18758b.isProfilingEnabled()) {
            this.f18758b.getLogger().c(s4.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        if (profilingTracesDirPath == null) {
            this.f18758b.getLogger().c(s4.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int profilingTracesHz = this.f18758b.getProfilingTracesHz();
        if (profilingTracesHz <= 0) {
            this.f18758b.getLogger().c(s4.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(profilingTracesHz));
        } else {
            this.f18766j = new l0(profilingTracesDirPath, ((int) TimeUnit.SECONDS.toMicros(1L)) / profilingTracesHz, this.f18763g, this.f18758b.getExecutorService(), this.f18758b.getLogger(), this.f18760d);
        }
    }

    @SuppressLint({"NewApi"})
    private boolean f(e2 e2Var) {
        l0.c j2;
        l0 l0Var = this.f18766j;
        if (l0Var == null || (j2 = l0Var.j()) == null) {
            return false;
        }
        long j3 = j2.a;
        this.f18767k = j3;
        this.l = j2.f18757b;
        this.f18765i = e2Var;
        this.f18764h = new n3(e2Var, Long.valueOf(j3), Long.valueOf(this.l));
        return true;
    }

    @SuppressLint({"NewApi"})
    private synchronized m3 g(e2 e2Var, boolean z, List<k3> list) {
        String str;
        if (this.f18766j == null) {
            return null;
        }
        if (this.f18760d.d() < 21) {
            return null;
        }
        n3 n3Var = this.f18764h;
        if (n3Var != null && n3Var.h().equals(e2Var.k().toString())) {
            int i2 = this.f18762f;
            if (i2 > 0) {
                this.f18762f = i2 - 1;
            }
            this.f18758b.getLogger().c(s4.DEBUG, "Transaction %s (%s) finished.", e2Var.getName(), e2Var.m().k().toString());
            if (this.f18762f != 0) {
                n3 n3Var2 = this.f18764h;
                if (n3Var2 != null) {
                    n3Var2.i(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f18767k), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.l));
                }
                return null;
            }
            l0.b f2 = this.f18766j.f(false, list);
            if (f2 == null) {
                return null;
            }
            long j2 = f2.a - this.f18767k;
            ArrayList arrayList = new ArrayList(1);
            n3 n3Var3 = this.f18764h;
            if (n3Var3 != null) {
                arrayList.add(n3Var3);
            }
            this.f18764h = null;
            this.f18762f = 0;
            this.f18765i = null;
            ActivityManager.MemoryInfo c2 = c();
            String l = c2 != null ? Long.toString(c2.totalMem) : "0";
            String[] strArr = Build.SUPPORTED_ABIS;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n3) it.next()).i(Long.valueOf(f2.a), Long.valueOf(this.f18767k), Long.valueOf(f2.f18753b), Long.valueOf(this.l));
            }
            File file = f2.f18754c;
            String l2 = Long.toString(j2);
            int d2 = this.f18760d.d();
            String str2 = (strArr == null || strArr.length <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : strArr[0];
            u uVar = new Callable() { // from class: io.sentry.android.core.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List c3;
                    c3 = io.sentry.android.core.internal.util.m.a().c();
                    return c3;
                }
            };
            String b2 = this.f18760d.b();
            String c3 = this.f18760d.c();
            String e2 = this.f18760d.e();
            Boolean f3 = this.f18760d.f();
            String proguardUuid = this.f18758b.getProguardUuid();
            String release = this.f18758b.getRelease();
            String environment = this.f18758b.getEnvironment();
            if (!f2.f18756e && !z) {
                str = "normal";
                return new m3(file, arrayList, e2Var, l2, d2, str2, uVar, b2, c3, e2, f3, l, proguardUuid, release, environment, str, f2.f18755d);
            }
            str = "timeout";
            return new m3(file, arrayList, e2Var, l2, d2, str2, uVar, b2, c3, e2, f3, l, proguardUuid, release, environment, str, f2.f18755d);
        }
        this.f18758b.getLogger().c(s4.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", e2Var.getName(), e2Var.m().k().toString());
        return null;
    }

    @Override // io.sentry.f2
    public synchronized m3 a(e2 e2Var, List<k3> list) {
        return g(e2Var, false, list);
    }

    @Override // io.sentry.f2
    public synchronized void b(e2 e2Var) {
        if (this.f18760d.d() < 21) {
            return;
        }
        d();
        int i2 = this.f18762f + 1;
        this.f18762f = i2;
        if (i2 == 1) {
            if (f(e2Var)) {
                this.f18758b.getLogger().c(s4.DEBUG, "Transaction %s (%s) started and being profiled.", e2Var.getName(), e2Var.m().k().toString());
            }
        } else {
            this.f18762f = i2 - 1;
            this.f18758b.getLogger().c(s4.WARNING, "A transaction is already being profiled. Transaction %s (%s) will be ignored.", e2Var.getName(), e2Var.m().k().toString());
        }
    }

    @Override // io.sentry.f2
    public void close() {
        e2 e2Var = this.f18765i;
        if (e2Var != null) {
            g(e2Var, true, null);
        }
        l0 l0Var = this.f18766j;
        if (l0Var != null) {
            l0Var.e();
        }
    }

    public m0(Context context, SentryAndroidOptions sentryAndroidOptions, s0 s0Var, io.sentry.android.core.internal.util.t tVar, v1 v1Var) {
        this.f18761e = false;
        this.f18762f = 0;
        this.f18765i = null;
        this.f18766j = null;
        this.a = (Context) io.sentry.util.q.c(context, "The application context is required");
        this.f18758b = (SentryAndroidOptions) io.sentry.util.q.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f18759c = (v1) io.sentry.util.q.c(v1Var, "Hub is required");
        this.f18763g = (io.sentry.android.core.internal.util.t) io.sentry.util.q.c(tVar, "SentryFrameMetricsCollector is required");
        this.f18760d = (s0) io.sentry.util.q.c(s0Var, "The BuildInfoProvider is required.");
    }
}
