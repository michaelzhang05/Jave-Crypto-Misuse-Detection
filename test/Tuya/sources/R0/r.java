package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class r implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37536a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3671b f37537b;

    /* renamed from: c, reason: collision with root package name */
    private final I f37538c;

    public r(Executor executor, InterfaceC3671b interfaceC3671b, I i8) {
        this.f37536a = executor;
        this.f37537b = interfaceC3671b;
        this.f37538c = i8;
    }

    @Override // r0.E
    public final void a(Task task) {
        this.f37536a.execute(new q(this, task));
    }
}
