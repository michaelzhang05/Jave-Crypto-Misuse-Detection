package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public class g implements Executor {

    /* renamed from: g, reason: collision with root package name */
    private final Executor f2059g;

    /* renamed from: i, reason: collision with root package name */
    private volatile Runnable f2061i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<a> f2058f = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private final Object f2060h = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final g f2062f;

        /* renamed from: g, reason: collision with root package name */
        final Runnable f2063g;

        a(g gVar, Runnable runnable) {
            this.f2062f = gVar;
            this.f2063g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2063g.run();
            } finally {
                this.f2062f.b();
            }
        }
    }

    public g(Executor executor) {
        this.f2059g = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f2060h) {
            z = !this.f2058f.isEmpty();
        }
        return z;
    }

    void b() {
        synchronized (this.f2060h) {
            a poll = this.f2058f.poll();
            this.f2061i = poll;
            if (poll != null) {
                this.f2059g.execute(this.f2061i);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f2060h) {
            this.f2058f.add(new a(this, runnable));
            if (this.f2061i == null) {
                b();
            }
        }
    }
}
