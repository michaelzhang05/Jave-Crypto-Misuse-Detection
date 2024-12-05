package H0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import r0.InterfaceC3671b;

/* renamed from: H0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1178l {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f3318a;

    /* renamed from: b, reason: collision with root package name */
    private Task f3319b = r0.l.e(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f3320c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f3321d = new ThreadLocal();

    /* renamed from: H0.l$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1178l.this.f3321d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.l$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC3671b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f3323a;

        b(Callable callable) {
            this.f3323a = callable;
        }

        @Override // r0.InterfaceC3671b
        public Object a(Task task) {
            return this.f3323a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.l$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC3671b {
        c() {
        }

        @Override // r0.InterfaceC3671b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(Task task) {
            return null;
        }
    }

    public C1178l(Executor executor) {
        this.f3318a = executor;
        executor.execute(new a());
    }

    private Task d(Task task) {
        return task.f(this.f3318a, new c());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f3321d.get());
    }

    private InterfaceC3671b f(Callable callable) {
        return new b(callable);
    }

    public void b() {
        if (e()) {
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f3318a;
    }

    public Task g(Callable callable) {
        Task f8;
        synchronized (this.f3320c) {
            f8 = this.f3319b.f(this.f3318a, f(callable));
            this.f3319b = d(f8);
        }
        return f8;
    }

    public Task h(Callable callable) {
        Task h8;
        synchronized (this.f3320c) {
            h8 = this.f3319b.h(this.f3318a, f(callable));
            this.f3319b = d(h8);
        }
        return h8;
    }
}
