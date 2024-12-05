package h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends f {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f6804c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f6805d = new Executor() { // from class: h.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f6806e = new Executor() { // from class: h.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private f f6807a;

    /* renamed from: b, reason: collision with root package name */
    private final f f6808b;

    private c() {
        d dVar = new d();
        this.f6808b = dVar;
        this.f6807a = dVar;
    }

    public static c f() {
        if (f6804c != null) {
            return f6804c;
        }
        synchronized (c.class) {
            if (f6804c == null) {
                f6804c = new c();
            }
        }
        return f6804c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Runnable runnable) {
        f().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        f().a(runnable);
    }

    @Override // h.f
    public void a(Runnable runnable) {
        this.f6807a.a(runnable);
    }

    @Override // h.f
    public boolean b() {
        return this.f6807a.b();
    }

    @Override // h.f
    public void c(Runnable runnable) {
        this.f6807a.c(runnable);
    }
}
