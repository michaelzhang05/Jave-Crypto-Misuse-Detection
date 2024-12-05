package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class z implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37555a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37556b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3675f f37557c;

    public z(Executor executor, InterfaceC3675f interfaceC3675f) {
        this.f37555a = executor;
        this.f37557c = interfaceC3675f;
    }

    @Override // r0.E
    public final void a(Task task) {
        if (!task.n() && !task.l()) {
            synchronized (this.f37556b) {
                try {
                    if (this.f37557c == null) {
                        return;
                    }
                    this.f37555a.execute(new y(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
