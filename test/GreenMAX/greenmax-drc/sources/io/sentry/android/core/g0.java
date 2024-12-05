package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.k3;
import io.sentry.r1;
import io.sentry.s4;
import io.sentry.w1;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidCpuCollector.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class g0 implements r1 {
    private long a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f18654b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f18655c = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f18656d = 1;

    /* renamed from: e, reason: collision with root package name */
    private final long f18657e = 1000000000;

    /* renamed from: f, reason: collision with root package name */
    private double f18658f;

    /* renamed from: g, reason: collision with root package name */
    private final File f18659g;

    /* renamed from: h, reason: collision with root package name */
    private final w1 f18660h;

    /* renamed from: i, reason: collision with root package name */
    private final s0 f18661i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18662j;

    public g0(w1 w1Var, s0 s0Var) {
        double d2 = 1L;
        Double.isNaN(d2);
        this.f18658f = 1.0E9d / d2;
        this.f18659g = new File("/proc/self/stat");
        this.f18662j = false;
        this.f18660h = (w1) io.sentry.util.q.c(w1Var, "Logger is required.");
        this.f18661i = (s0) io.sentry.util.q.c(s0Var, "BuildInfoProvider is required.");
    }

    private long b() {
        String str;
        try {
            str = io.sentry.util.l.c(this.f18659g);
        } catch (IOException e2) {
            this.f18662j = false;
            this.f18660h.b(s4.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e2);
            str = null;
        }
        if (str != null) {
            String[] split = str.trim().split("[\n\t\r ]");
            try {
                double parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                double d2 = this.f18658f;
                Double.isNaN(parseLong);
                return (long) (parseLong * d2);
            } catch (NumberFormatException e3) {
                this.f18660h.b(s4.ERROR, "Error parsing /proc/self/stat file.", e3);
            }
        }
        return 0L;
    }

    @Override // io.sentry.r1
    @SuppressLint({"NewApi"})
    public void a(k3 k3Var) {
        if (this.f18661i.d() < 21 || !this.f18662j) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j2 = elapsedRealtimeNanos - this.a;
        this.a = elapsedRealtimeNanos;
        long b2 = b();
        long j3 = b2 - this.f18654b;
        this.f18654b = b2;
        double d2 = j3;
        double d3 = j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        long currentTimeMillis = System.currentTimeMillis();
        double d4 = this.f18656d;
        Double.isNaN(d4);
        k3Var.a(new io.sentry.x0(currentTimeMillis, ((d2 / d3) / d4) * 100.0d));
    }

    @Override // io.sentry.r1
    @SuppressLint({"NewApi"})
    public void setup() {
        if (this.f18661i.d() < 21) {
            this.f18662j = false;
            return;
        }
        this.f18662j = true;
        this.f18655c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f18656d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        double d2 = this.f18655c;
        Double.isNaN(d2);
        this.f18658f = 1.0E9d / d2;
        this.f18654b = b();
    }
}
