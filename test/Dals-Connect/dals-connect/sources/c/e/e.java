package c.e;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class e<K, V> {
    private final LinkedHashMap<K, V> a;

    /* renamed from: b, reason: collision with root package name */
    private int f2407b;

    /* renamed from: c, reason: collision with root package name */
    private int f2408c;

    /* renamed from: d, reason: collision with root package name */
    private int f2409d;

    /* renamed from: e, reason: collision with root package name */
    private int f2410e;

    /* renamed from: f, reason: collision with root package name */
    private int f2411f;

    /* renamed from: g, reason: collision with root package name */
    private int f2412g;

    /* renamed from: h, reason: collision with root package name */
    private int f2413h;

    public e(int i2) {
        if (i2 > 0) {
            this.f2408c = i2;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int e(K k2, V v) {
        int f2 = f(k2, v);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean z, K k2, V v, V v2) {
    }

    public final V c(K k2) {
        V v;
        if (k2 != null) {
            synchronized (this) {
                V v2 = this.a.get(k2);
                if (v2 != null) {
                    this.f2412g++;
                    return v2;
                }
                this.f2413h++;
                V a = a(k2);
                if (a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f2410e++;
                    v = (V) this.a.put(k2, a);
                    if (v != null) {
                        this.a.put(k2, v);
                    } else {
                        this.f2407b += e(k2, a);
                    }
                }
                if (v != null) {
                    b(false, k2, a, v);
                    return v;
                }
                g(this.f2408c);
                return a;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V d(K k2, V v) {
        V put;
        if (k2 != null && v != null) {
            synchronized (this) {
                this.f2409d++;
                this.f2407b += e(k2, v);
                put = this.a.put(k2, v);
                if (put != null) {
                    this.f2407b -= e(k2, put);
                }
            }
            if (put != null) {
                b(false, k2, put, v);
            }
            g(this.f2408c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    protected int f(K k2, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f2407b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f2407b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f2407b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f2407b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f2407b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f2411f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f2411f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.e.g(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f2412g;
        i3 = this.f2413h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2408c), Integer.valueOf(this.f2412g), Integer.valueOf(this.f2413h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
