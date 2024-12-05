package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class D implements InterfaceC3676g, InterfaceC3675f, InterfaceC3673d, E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37507a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3678i f37508b;

    /* renamed from: c, reason: collision with root package name */
    private final I f37509c;

    public D(Executor executor, InterfaceC3678i interfaceC3678i, I i8) {
        this.f37507a = executor;
        this.f37508b = interfaceC3678i;
        this.f37509c = i8;
    }

    @Override // r0.E
    public final void a(Task task) {
        this.f37507a.execute(new C(this, task));
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        this.f37509c.r(obj);
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        this.f37509c.s();
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        this.f37509c.q(exc);
    }
}
