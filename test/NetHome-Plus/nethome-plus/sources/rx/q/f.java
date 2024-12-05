package rx.q;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxJavaPlugins.java */
/* loaded from: classes3.dex */
public class f {
    private static final f a = new f();

    /* renamed from: b, reason: collision with root package name */
    static final rx.q.b f23217b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<rx.q.b> f23218c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<d> f23219d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<h> f23220e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<rx.q.a> f23221f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<g> f23222g = new AtomicReference<>();

    /* compiled from: RxJavaPlugins.java */
    /* loaded from: classes3.dex */
    static class a extends rx.q.b {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaPlugins.java */
    /* loaded from: classes3.dex */
    public class b extends rx.q.a {
        b() {
        }
    }

    f() {
    }

    @Deprecated
    public static f c() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = "rxjava.plugin." + r7.substring(0, r7.length() - 6).substring(14) + ".impl";
        r1 = r10.getProperty(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        throw new java.lang.IllegalStateException("Implementing class declaration for " + r0 + " missing: " + r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object e(java.lang.Class<?> r9, java.util.Properties r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.q.f.e(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    static Properties h() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    public rx.q.a a() {
        if (this.f23221f.get() == null) {
            Object e2 = e(rx.q.a.class, h());
            if (e2 == null) {
                this.f23221f.compareAndSet(null, new b());
            } else {
                this.f23221f.compareAndSet(null, (rx.q.a) e2);
            }
        }
        return this.f23221f.get();
    }

    public rx.q.b b() {
        if (this.f23218c.get() == null) {
            Object e2 = e(rx.q.b.class, h());
            if (e2 == null) {
                this.f23218c.compareAndSet(null, f23217b);
            } else {
                this.f23218c.compareAndSet(null, (rx.q.b) e2);
            }
        }
        return this.f23218c.get();
    }

    public d d() {
        if (this.f23219d.get() == null) {
            Object e2 = e(d.class, h());
            if (e2 == null) {
                this.f23219d.compareAndSet(null, e.a());
            } else {
                this.f23219d.compareAndSet(null, (d) e2);
            }
        }
        return this.f23219d.get();
    }

    public g f() {
        if (this.f23222g.get() == null) {
            Object e2 = e(g.class, h());
            if (e2 == null) {
                this.f23222g.compareAndSet(null, g.h());
            } else {
                this.f23222g.compareAndSet(null, (g) e2);
            }
        }
        return this.f23222g.get();
    }

    public h g() {
        if (this.f23220e.get() == null) {
            Object e2 = e(h.class, h());
            if (e2 == null) {
                this.f23220e.compareAndSet(null, i.f());
            } else {
                this.f23220e.compareAndSet(null, (h) e2);
            }
        }
        return this.f23220e.get();
    }
}
