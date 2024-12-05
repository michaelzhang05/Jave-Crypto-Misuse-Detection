package p6;

import java.util.concurrent.TimeUnit;
import n6.G;
import n6.I;

/* renamed from: p6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3623l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37122a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f37123b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f37124c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f37125d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f37126e;

    /* renamed from: f, reason: collision with root package name */
    public static AbstractC3618g f37127f;

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC3620i f37128g;

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC3620i f37129h;

    static {
        long f8;
        int e8;
        int e9;
        long f9;
        f8 = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f37123b = f8;
        e8 = I.e("kotlinx.coroutines.scheduler.core.pool.size", d6.m.d(G.a(), 2), 1, 0, 8, null);
        f37124c = e8;
        e9 = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f37125d = e9;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9 = I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f37126e = timeUnit.toNanos(f9);
        f37127f = C3616e.f37112a;
        f37128g = new C3621j(0);
        f37129h = new C3621j(1);
    }
}
