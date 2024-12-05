package p0;

import Q.AbstractC1400p;
import V.g;
import V.n;
import V.p;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import g0.AbstractC2858h;
import g0.C2852b;
import g0.C2859i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3732a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f36896r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f36897s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f36898t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile InterfaceC3736e f36899u = new C3734c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f36900a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f36901b;

    /* renamed from: c, reason: collision with root package name */
    private int f36902c;

    /* renamed from: d, reason: collision with root package name */
    private Future f36903d;

    /* renamed from: e, reason: collision with root package name */
    private long f36904e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f36905f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36906g;

    /* renamed from: h, reason: collision with root package name */
    private int f36907h;

    /* renamed from: i, reason: collision with root package name */
    C2852b f36908i;

    /* renamed from: j, reason: collision with root package name */
    private V.d f36909j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f36910k;

    /* renamed from: l, reason: collision with root package name */
    private final String f36911l;

    /* renamed from: m, reason: collision with root package name */
    private final String f36912m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f36913n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f36914o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f36915p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f36916q;

    public C3732a(Context context, int i8, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f36900a = new Object();
        this.f36902c = 0;
        this.f36905f = new HashSet();
        this.f36906g = true;
        this.f36909j = g.b();
        this.f36914o = new HashMap();
        this.f36915p = new AtomicInteger(0);
        AbstractC1400p.m(context, "WakeLock: context must not be null");
        AbstractC1400p.g(str, "WakeLock: wakeLockName must not be empty");
        this.f36913n = context.getApplicationContext();
        this.f36912m = str;
        this.f36908i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f36911l = str2;
        } else {
            this.f36911l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i8, str);
            this.f36901b = newWakeLock;
            if (p.c(context)) {
                WorkSource b8 = p.b(context, n.a(packageName) ? context.getPackageName() : packageName);
                this.f36910k = b8;
                if (b8 != null) {
                    i(newWakeLock, b8);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f36897s;
            if (scheduledExecutorService == null) {
                synchronized (f36898t) {
                    try {
                        scheduledExecutorService = f36897s;
                        if (scheduledExecutorService == null) {
                            AbstractC2858h.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f36897s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f36916q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C2859i(sb.toString());
    }

    public static /* synthetic */ void e(C3732a c3732a) {
        synchronized (c3732a.f36900a) {
            try {
                if (!c3732a.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(c3732a.f36911l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c3732a.g();
                if (!c3732a.b()) {
                    return;
                }
                c3732a.f36902c = 1;
                c3732a.h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f36906g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f36905f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f36905f);
        this.f36905f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i8) {
        synchronized (this.f36900a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f36906g) {
                    int i9 = this.f36902c - 1;
                    this.f36902c = i9;
                    if (i9 > 0) {
                        return;
                    }
                } else {
                    this.f36902c = 0;
                }
                g();
                Iterator it = this.f36914o.values().iterator();
                while (it.hasNext()) {
                    ((C3735d) it.next()).f36918a = 0;
                }
                this.f36914o.clear();
                Future future = this.f36903d;
                if (future != null) {
                    future.cancel(false);
                    this.f36903d = null;
                    this.f36904e = 0L;
                }
                this.f36907h = 0;
                if (this.f36901b.isHeld()) {
                    try {
                        try {
                            this.f36901b.release();
                            if (this.f36908i != null) {
                                this.f36908i = null;
                            }
                        } catch (RuntimeException e8) {
                            if (e8.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.f36911l).concat(" failed to release!"), e8);
                                if (this.f36908i != null) {
                                    this.f36908i = null;
                                }
                            } else {
                                throw e8;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f36908i != null) {
                            this.f36908i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f36911l).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
            Log.wtf("WakeLock", e8.toString());
        }
    }

    public void a(long j8) {
        this.f36915p.incrementAndGet();
        long j9 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f36896r), 1L);
        if (j8 > 0) {
            max = Math.min(j8, max);
        }
        synchronized (this.f36900a) {
            try {
                if (!b()) {
                    this.f36908i = C2852b.a(false, null);
                    this.f36901b.acquire();
                    this.f36909j.elapsedRealtime();
                }
                this.f36902c++;
                this.f36907h++;
                f(null);
                C3735d c3735d = (C3735d) this.f36914o.get(null);
                if (c3735d == null) {
                    c3735d = new C3735d(null);
                    this.f36914o.put(null, c3735d);
                }
                c3735d.f36918a++;
                long elapsedRealtime = this.f36909j.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j9 = elapsedRealtime + max;
                }
                if (j9 > this.f36904e) {
                    this.f36904e = j9;
                    Future future = this.f36903d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f36903d = this.f36916q.schedule(new Runnable() { // from class: p0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3732a.e(C3732a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z8;
        synchronized (this.f36900a) {
            if (this.f36902c > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public void c() {
        if (this.f36915p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f36911l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f36900a) {
            try {
                f(null);
                if (this.f36914o.containsKey(null)) {
                    C3735d c3735d = (C3735d) this.f36914o.get(null);
                    if (c3735d != null) {
                        int i8 = c3735d.f36918a - 1;
                        c3735d.f36918a = i8;
                        if (i8 == 0) {
                            this.f36914o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f36911l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z8) {
        synchronized (this.f36900a) {
            this.f36906g = z8;
        }
    }
}
