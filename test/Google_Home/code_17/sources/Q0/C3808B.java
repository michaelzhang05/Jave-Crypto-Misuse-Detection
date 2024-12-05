package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: q0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3808B implements InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38054a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38055b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3823g f38056c;

    public C3808B(Executor executor, InterfaceC3823g interfaceC3823g) {
        this.f38054a = executor;
        this.f38056c = interfaceC3823g;
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        if (task.n()) {
            synchronized (this.f38055b) {
                try {
                    if (this.f38056c == null) {
                        return;
                    }
                    this.f38054a.execute(new RunnableC3807A(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
