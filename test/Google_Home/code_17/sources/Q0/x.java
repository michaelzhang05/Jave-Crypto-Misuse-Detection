package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class x implements InterfaceC3811E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38102a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38103b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3821e f38104c;

    public x(Executor executor, InterfaceC3821e interfaceC3821e) {
        this.f38102a = executor;
        this.f38104c = interfaceC3821e;
    }

    @Override // q0.InterfaceC3811E
    public final void b(Task task) {
        synchronized (this.f38103b) {
            try {
                if (this.f38104c == null) {
                    return;
                }
                this.f38102a.execute(new w(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
