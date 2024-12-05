package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class v implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37545a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37546b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3673d f37547c;

    public v(Executor executor, InterfaceC3673d interfaceC3673d) {
        this.f37545a = executor;
        this.f37547c = interfaceC3673d;
    }

    @Override // r0.E
    public final void a(Task task) {
        if (task.l()) {
            synchronized (this.f37546b) {
                try {
                    if (this.f37547c == null) {
                        return;
                    }
                    this.f37545a.execute(new u(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
