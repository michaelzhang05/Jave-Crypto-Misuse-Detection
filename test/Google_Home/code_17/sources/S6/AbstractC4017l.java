package s6;

import java.util.concurrent.TimeUnit;
import q6.G;
import q6.I;

/* renamed from: s6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4017l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39321a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f39322b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f39323c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39324d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f39325e;

    /* renamed from: f, reason: collision with root package name */
    public static AbstractC4012g f39326f;

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC4014i f39327g;

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC4014i f39328h;

    static {
        long f8;
        int e8;
        int e9;
        long f9;
        f8 = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f39322b = f8;
        e8 = I.e("kotlinx.coroutines.scheduler.core.pool.size", g6.m.d(G.a(), 2), 1, 0, 8, null);
        f39323c = e8;
        e9 = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f39324d = e9;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9 = I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f39325e = timeUnit.toNanos(f9);
        f39326f = C4010e.f39311a;
        f39327g = new C4015j(0);
        f39328h = new C4015j(1);
    }
}
