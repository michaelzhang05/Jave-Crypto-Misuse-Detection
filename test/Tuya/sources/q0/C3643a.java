package q0;

import R.AbstractC1319p;
import W.g;
import W.n;
import W.p;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import h0.AbstractC2741h;
import h0.C2735b;
import h0.C2742i;
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

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3643a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f37191r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f37192s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f37193t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f37194u = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f37195a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f37196b;

    /* renamed from: c, reason: collision with root package name */
    private int f37197c;

    /* renamed from: d, reason: collision with root package name */
    private Future f37198d;

    /* renamed from: e, reason: collision with root package name */
    private long f37199e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f37200f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37201g;

    /* renamed from: h, reason: collision with root package name */
    private int f37202h;

    /* renamed from: i, reason: collision with root package name */
    C2735b f37203i;

    /* renamed from: j, reason: collision with root package name */
    private W.d f37204j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f37205k;

    /* renamed from: l, reason: collision with root package name */
    private final String f37206l;

    /* renamed from: m, reason: collision with root package name */
    private final String f37207m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f37208n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f37209o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f37210p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f37211q;

    public C3643a(Context context, int i8, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f37195a = new Object();
        this.f37197c = 0;
        this.f37200f = new HashSet();
        this.f37201g = true;
        this.f37204j = g.b();
        this.f37209o = new HashMap();
        this.f37210p = new AtomicInteger(0);
        AbstractC1319p.m(context, "WakeLock: context must not be null");
        AbstractC1319p.g(str, "WakeLock: wakeLockName must not be empty");
        this.f37208n = context.getApplicationContext();
        this.f37207m = str;
        this.f37203i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f37206l = str2;
        } else {
            this.f37206l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i8, str);
            this.f37196b = newWakeLock;
            if (p.c(context)) {
                WorkSource b8 = p.b(context, n.a(packageName) ? context.getPackageName() : packageName);
                this.f37205k = b8;
                if (b8 != null) {
                    i(newWakeLock, b8);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f37192s;
            if (scheduledExecutorService == null) {
                synchronized (f37193t) {
                    try {
                        scheduledExecutorService = f37192s;
                        if (scheduledExecutorService == null) {
                            AbstractC2741h.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f37192s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f37211q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C2742i(sb.toString());
    }

    public static /* synthetic */ void e(C3643a c3643a) {
        synchronized (c3643a.f37195a) {
            try {
                if (!c3643a.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(c3643a.f37206l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c3643a.g();
                if (!c3643a.b()) {
                    return;
                }
                c3643a.f37197c = 1;
                c3643a.h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f37201g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f37200f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f37200f);
        this.f37200f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i8) {
        synchronized (this.f37195a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f37201g) {
                    int i9 = this.f37197c - 1;
                    this.f37197c = i9;
                    if (i9 > 0) {
                        return;
                    }
                } else {
                    this.f37197c = 0;
                }
                g();
                Iterator it = this.f37209o.values().iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f37213a = 0;
                }
                this.f37209o.clear();
                Future future = this.f37198d;
                if (future != null) {
                    future.cancel(false);
                    this.f37198d = null;
                    this.f37199e = 0L;
                }
                this.f37202h = 0;
                if (this.f37196b.isHeld()) {
                    try {
                        try {
                            this.f37196b.release();
                            if (this.f37203i != null) {
                                this.f37203i = null;
                            }
                        } catch (RuntimeException e8) {
                            if (e8.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.f37206l).concat(" failed to release!"), e8);
                                if (this.f37203i != null) {
                                    this.f37203i = null;
                                }
                            } else {
                                throw e8;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f37203i != null) {
                            this.f37203i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f37206l).concat(" should be held!"));
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
        this.f37210p.incrementAndGet();
        long j9 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f37191r), 1L);
        if (j8 > 0) {
            max = Math.min(j8, max);
        }
        synchronized (this.f37195a) {
            try {
                if (!b()) {
                    this.f37203i = C2735b.a(false, null);
                    this.f37196b.acquire();
                    this.f37204j.elapsedRealtime();
                }
                this.f37197c++;
                this.f37202h++;
                f(null);
                d dVar = (d) this.f37209o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f37209o.put(null, dVar);
                }
                dVar.f37213a++;
                long elapsedRealtime = this.f37204j.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j9 = elapsedRealtime + max;
                }
                if (j9 > this.f37199e) {
                    this.f37199e = j9;
                    Future future = this.f37198d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f37198d = this.f37211q.schedule(new Runnable() { // from class: q0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3643a.e(C3643a.this);
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
        synchronized (this.f37195a) {
            if (this.f37197c > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public void c() {
        if (this.f37210p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f37206l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f37195a) {
            try {
                f(null);
                if (this.f37209o.containsKey(null)) {
                    d dVar = (d) this.f37209o.get(null);
                    if (dVar != null) {
                        int i8 = dVar.f37213a - 1;
                        dVar.f37213a = i8;
                        if (i8 == 0) {
                            this.f37209o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f37206l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z8) {
        synchronized (this.f37195a) {
            this.f37201g = z8;
        }
    }
}
