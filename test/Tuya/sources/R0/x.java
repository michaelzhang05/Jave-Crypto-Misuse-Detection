package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class x implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37550a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37551b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3674e f37552c;

    public x(Executor executor, InterfaceC3674e interfaceC3674e) {
        this.f37550a = executor;
        this.f37552c = interfaceC3674e;
    }

    @Override // r0.E
    public final void a(Task task) {
        synchronized (this.f37551b) {
            try {
                if (this.f37552c == null) {
                    return;
                }
                this.f37550a.execute(new w(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
