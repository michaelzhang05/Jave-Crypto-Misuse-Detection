package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class v implements InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38097a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38098b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3820d f38099c;

    public v(Executor executor, InterfaceC3820d interfaceC3820d) {
        this.f38097a = executor;
        this.f38099c = interfaceC3820d;
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        if (task.l()) {
            synchronized (this.f38098b) {
                try {
                    if (this.f38099c == null) {
                        return;
                    }
                    this.f38097a.execute(new u(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
