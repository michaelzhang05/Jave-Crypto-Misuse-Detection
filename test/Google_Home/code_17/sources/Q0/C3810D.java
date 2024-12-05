package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: q0.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3810D implements InterfaceC3823g, InterfaceC3822f, InterfaceC3820d, InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38059a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3825i f38060b;

    /* renamed from: c, reason: collision with root package name */
    private final C3815I f38061c;

    public C3810D(Executor executor, InterfaceC3825i interfaceC3825i, C3815I c3815i) {
        this.f38059a = executor;
        this.f38060b = interfaceC3825i;
        this.f38061c = c3815i;
    }

    @Override // q0.InterfaceC3823g
    public final void a(Object obj) {
        this.f38061c.r(obj);
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        this.f38059a.execute(new RunnableC3809C(this, task));
    }

    @Override // q0.InterfaceC3820d
    public final void c() {
        this.f38061c.s();
    }

    @Override // q0.InterfaceC3822f
    public final void d(Exception exc) {
        this.f38061c.q(exc);
    }
}
