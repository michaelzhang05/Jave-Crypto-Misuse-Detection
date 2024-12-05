package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class r implements InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38088a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3818b f38089b;

    /* renamed from: c, reason: collision with root package name */
    private final C3815I f38090c;

    public r(Executor executor, InterfaceC3818b interfaceC3818b, C3815I c3815i) {
        this.f38088a = executor;
        this.f38089b = interfaceC3818b;
        this.f38090c = c3815i;
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        this.f38088a.execute(new q(this, task));
    }
}
