package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b {
    final Executor a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f1781b;

    /* renamed from: c, reason: collision with root package name */
    final a0 f1782c;

    /* renamed from: d, reason: collision with root package name */
    final l f1783d;

    /* renamed from: e, reason: collision with root package name */
    final v f1784e;

    /* renamed from: f, reason: collision with root package name */
    final j f1785f;

    /* renamed from: g, reason: collision with root package name */
    final String f1786g;

    /* renamed from: h, reason: collision with root package name */
    final int f1787h;

    /* renamed from: i, reason: collision with root package name */
    final int f1788i;

    /* renamed from: j, reason: collision with root package name */
    final int f1789j;

    /* renamed from: k, reason: collision with root package name */
    final int f1790k;
    private final boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private final AtomicInteger f1791f = new AtomicInteger(0);

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1792g;

        a(boolean z) {
            this.f1792g = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f1792g ? "WM.task-" : "androidx.work-") + this.f1791f.incrementAndGet());
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0035b {
        Executor a;

        /* renamed from: b, reason: collision with root package name */
        a0 f1794b;

        /* renamed from: c, reason: collision with root package name */
        l f1795c;

        /* renamed from: d, reason: collision with root package name */
        Executor f1796d;

        /* renamed from: e, reason: collision with root package name */
        v f1797e;

        /* renamed from: f, reason: collision with root package name */
        j f1798f;

        /* renamed from: g, reason: collision with root package name */
        String f1799g;

        /* renamed from: h, reason: collision with root package name */
        int f1800h = 4;

        /* renamed from: i, reason: collision with root package name */
        int f1801i = 0;

        /* renamed from: j, reason: collision with root package name */
        int f1802j = Integer.MAX_VALUE;

        /* renamed from: k, reason: collision with root package name */
        int f1803k = 20;

        public b a() {
            return new b(this);
        }

        public C0035b b(int i2) {
            this.f1800h = i2;
            return this;
        }

        public C0035b c(a0 a0Var) {
            this.f1794b = a0Var;
            return this;
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface c {
        b a();
    }

    b(C0035b c0035b) {
        Executor executor = c0035b.a;
        if (executor == null) {
            this.a = a(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = c0035b.f1796d;
        if (executor2 == null) {
            this.l = true;
            this.f1781b = a(true);
        } else {
            this.l = false;
            this.f1781b = executor2;
        }
        a0 a0Var = c0035b.f1794b;
        if (a0Var == null) {
            this.f1782c = a0.getDefaultWorkerFactory();
        } else {
            this.f1782c = a0Var;
        }
        l lVar = c0035b.f1795c;
        if (lVar == null) {
            this.f1783d = l.c();
        } else {
            this.f1783d = lVar;
        }
        v vVar = c0035b.f1797e;
        if (vVar == null) {
            this.f1784e = new androidx.work.impl.a();
        } else {
            this.f1784e = vVar;
        }
        this.f1787h = c0035b.f1800h;
        this.f1788i = c0035b.f1801i;
        this.f1789j = c0035b.f1802j;
        this.f1790k = c0035b.f1803k;
        this.f1785f = c0035b.f1798f;
        this.f1786g = c0035b.f1799g;
    }

    private Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z));
    }

    private ThreadFactory b(boolean z) {
        return new a(z);
    }

    public String c() {
        return this.f1786g;
    }

    public j d() {
        return this.f1785f;
    }

    public Executor e() {
        return this.a;
    }

    public l f() {
        return this.f1783d;
    }

    public int g() {
        return this.f1789j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f1790k / 2;
        }
        return this.f1790k;
    }

    public int i() {
        return this.f1788i;
    }

    public int j() {
        return this.f1787h;
    }

    public v k() {
        return this.f1784e;
    }

    public Executor l() {
        return this.f1781b;
    }

    public a0 m() {
        return this.f1782c;
    }
}
