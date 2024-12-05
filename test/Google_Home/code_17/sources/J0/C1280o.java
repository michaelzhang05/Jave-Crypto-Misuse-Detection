package J0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import q0.AbstractC3828l;
import q0.InterfaceC3818b;

/* renamed from: J0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1280o {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4700a;

    /* renamed from: b, reason: collision with root package name */
    private Task f4701b = AbstractC3828l.e(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f4702c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f4703d = new ThreadLocal();

    /* renamed from: J0.o$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1280o.this.f4703d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.o$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC3818b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f4705a;

        b(Callable callable) {
            this.f4705a = callable;
        }

        @Override // q0.InterfaceC3818b
        public Object a(Task task) {
            return this.f4705a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.o$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC3818b {
        c() {
        }

        @Override // q0.InterfaceC3818b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(Task task) {
            return null;
        }
    }

    public C1280o(Executor executor) {
        this.f4700a = executor;
        executor.execute(new a());
    }

    private Task d(Task task) {
        return task.f(this.f4700a, new c());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f4703d.get());
    }

    private InterfaceC3818b f(Callable callable) {
        return new b(callable);
    }

    public void b() {
        if (e()) {
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f4700a;
    }

    public Task g(Callable callable) {
        Task f8;
        synchronized (this.f4702c) {
            f8 = this.f4701b.f(this.f4700a, f(callable));
            this.f4701b = d(f8);
        }
        return f8;
    }

    public Task h(Callable callable) {
        Task h8;
        synchronized (this.f4702c) {
            h8 = this.f4701b.h(this.f4700a, f(callable));
            this.f4701b = d(h8);
        }
        return h8;
    }
}
