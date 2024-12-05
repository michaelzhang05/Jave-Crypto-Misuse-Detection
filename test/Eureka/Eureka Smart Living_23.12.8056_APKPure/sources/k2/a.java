package k2;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.f0;
import g2.h;
import g2.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v1.n;
import z1.k;
import z1.l;

/* loaded from: classes.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f7168r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f7169s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f7170t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f7171u = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f7172a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f7173b;

    /* renamed from: c, reason: collision with root package name */
    private int f7174c;

    /* renamed from: d, reason: collision with root package name */
    private Future f7175d;

    /* renamed from: e, reason: collision with root package name */
    private long f7176e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f7177f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7178g;

    /* renamed from: h, reason: collision with root package name */
    private int f7179h;

    /* renamed from: i, reason: collision with root package name */
    g2.b f7180i;

    /* renamed from: j, reason: collision with root package name */
    private z1.d f7181j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f7182k;

    /* renamed from: l, reason: collision with root package name */
    private final String f7183l;

    /* renamed from: m, reason: collision with root package name */
    private final String f7184m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f7185n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f7186o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f7187p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f7188q;

    public a(Context context, int i6, String str) {
        String packageName = context.getPackageName();
        this.f7172a = new Object();
        this.f7174c = 0;
        this.f7177f = new HashSet();
        this.f7178g = true;
        this.f7181j = z1.e.b();
        this.f7186o = new HashMap();
        this.f7187p = new AtomicInteger(0);
        n.i(context, "WakeLock: context must not be null");
        n.e(str, "WakeLock: wakeLockName must not be empty");
        this.f7185n = context.getApplicationContext();
        this.f7184m = str;
        this.f7180i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7183l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f7183l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i6, str);
        this.f7173b = newWakeLock;
        if (l.c(context)) {
            WorkSource b6 = l.b(context, k.a(packageName) ? context.getPackageName() : packageName);
            this.f7182k = b6;
            if (b6 != null) {
                i(newWakeLock, b6);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f7169s;
        if (scheduledExecutorService == null) {
            synchronized (f7170t) {
                scheduledExecutorService = f7169s;
                if (scheduledExecutorService == null) {
                    h.a();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f7169s = scheduledExecutorService;
                }
            }
        }
        this.f7188q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f7172a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f7183l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.f7174c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (this.f7178g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f7177f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f7177f);
        this.f7177f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        f0.a(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r5.f7180i != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f7172a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        Lb:
            boolean r0 = r5.f7178g     // Catch: java.lang.Throwable -> La2
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r5.f7174c     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + (-1)
            r5.f7174c = r0     // Catch: java.lang.Throwable -> La2
            if (r0 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        L1b:
            r5.f7174c = r1     // Catch: java.lang.Throwable -> La2
        L1d:
            r5.g()     // Catch: java.lang.Throwable -> La2
            java.util.Map r0 = r5.f7186o     // Catch: java.lang.Throwable -> La2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La2
        L2a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La2
            k2.d r2 = (k2.d) r2     // Catch: java.lang.Throwable -> La2
            r2.f7190a = r1     // Catch: java.lang.Throwable -> La2
            goto L2a
        L39:
            java.util.Map r0 = r5.f7186o     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.Future r0 = r5.f7175d     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r0 == 0) goto L4c
            r0.cancel(r1)     // Catch: java.lang.Throwable -> La2
            r5.f7175d = r2     // Catch: java.lang.Throwable -> La2
            r3 = 0
            r5.f7176e = r3     // Catch: java.lang.Throwable -> La2
        L4c:
            r5.f7179h = r1     // Catch: java.lang.Throwable -> La2
            android.os.PowerManager$WakeLock r0 = r5.f7173b     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L8f
            android.os.PowerManager$WakeLock r0 = r5.f7173b     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r0.release()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            g2.b r0 = r5.f7180i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
        L5f:
            r5.f7180i = r2     // Catch: java.lang.Throwable -> La2
            goto La0
        L62:
            r0 = move-exception
            goto L88
        L64:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L87
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f7183l     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L62
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L62
            g2.b r0 = r5.f7180i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
            goto L5f
        L87:
            throw r0     // Catch: java.lang.Throwable -> L62
        L88:
            g2.b r1 = r5.f7180i     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L8e
            r5.f7180i = r2     // Catch: java.lang.Throwable -> La2
        L8e:
            throw r0     // Catch: java.lang.Throwable -> La2
        L8f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f7183l     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> La2
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        La2:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e6) {
            Log.wtf("WakeLock", e6.toString());
        }
    }

    public void a(long j6) {
        this.f7187p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f7168r), 1L);
        if (j6 > 0) {
            max = Math.min(j6, max);
        }
        synchronized (this.f7172a) {
            if (!b()) {
                this.f7180i = g2.b.g(false, null);
                this.f7173b.acquire();
                this.f7181j.a();
            }
            this.f7174c++;
            this.f7179h++;
            f(null);
            d dVar = (d) this.f7186o.get(null);
            if (dVar == null) {
                dVar = new d(null);
                this.f7186o.put(null, dVar);
            }
            dVar.f7190a++;
            long a6 = this.f7181j.a();
            long j7 = Long.MAX_VALUE - a6 > max ? a6 + max : Long.MAX_VALUE;
            if (j7 > this.f7176e) {
                this.f7176e = j7;
                Future future = this.f7175d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f7175d = this.f7188q.schedule(new Runnable() { // from class: k2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.e(a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z5;
        synchronized (this.f7172a) {
            z5 = this.f7174c > 0;
        }
        return z5;
    }

    public void c() {
        if (this.f7187p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f7183l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f7172a) {
            f(null);
            if (this.f7186o.containsKey(null)) {
                d dVar = (d) this.f7186o.get(null);
                if (dVar != null) {
                    int i6 = dVar.f7190a - 1;
                    dVar.f7190a = i6;
                    if (i6 == 0) {
                        this.f7186o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f7183l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z5) {
        synchronized (this.f7172a) {
            this.f7178g = z5;
        }
    }
}
