package kotlinx.coroutines.i2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.y;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class l {
    public static final long a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22195b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22196c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f22197d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f22198e;

    /* renamed from: f, reason: collision with root package name */
    public static h f22199f;

    static {
        long e2;
        int d2;
        int b2;
        int d3;
        int f2;
        int d4;
        long e3;
        e2 = y.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        a = e2;
        d2 = y.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f22195b = d2;
        b2 = kotlin.ranges.f.b(w.a(), 2);
        d3 = y.d("kotlinx.coroutines.scheduler.core.pool.size", b2, 1, 0, 8, null);
        f22196c = d3;
        f2 = kotlin.ranges.f.f(w.a() * 128, d3, 2097150);
        d4 = y.d("kotlinx.coroutines.scheduler.max.pool.size", f2, 0, 2097150, 4, null);
        f22197d = d4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e3 = y.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f22198e = timeUnit.toNanos(e3);
        f22199f = f.a;
    }
}
