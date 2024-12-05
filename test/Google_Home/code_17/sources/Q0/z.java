package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class z implements InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38107a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38108b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3822f f38109c;

    public z(Executor executor, InterfaceC3822f interfaceC3822f) {
        this.f38107a = executor;
        this.f38109c = interfaceC3822f;
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        if (!task.n() && !task.l()) {
            synchronized (this.f38108b) {
                try {
                    if (this.f38109c == null) {
                        return;
                    }
                    this.f38107a.execute(new y(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
