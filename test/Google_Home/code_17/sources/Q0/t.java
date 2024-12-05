package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class t implements InterfaceC3823g, InterfaceC3822f, InterfaceC3820d, InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38093a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3818b f38094b;

    /* renamed from: c, reason: collision with root package name */
    private final C3815I f38095c;

    public t(Executor executor, InterfaceC3818b interfaceC3818b, C3815I c3815i) {
        this.f38093a = executor;
        this.f38094b = interfaceC3818b;
        this.f38095c = c3815i;
    }

    @Override // q0.InterfaceC3823g
    public final void a(Object obj) {
        this.f38095c.r(obj);
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        this.f38093a.execute(new s(this, task));
    }

    @Override // q0.InterfaceC3820d
    public final void c() {
        this.f38095c.s();
    }

    @Override // q0.InterfaceC3822f
    public final void d(Exception exc) {
        this.f38095c.q(exc);
    }
}
