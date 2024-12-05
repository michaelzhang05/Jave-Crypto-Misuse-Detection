package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: q0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3809C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f38057a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3810D f38058b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3809C(C3810D c3810d, Task task) {
        this.f38058b = c3810d;
        this.f38057a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3825i interfaceC3825i;
        try {
            interfaceC3825i = this.f38058b.f38060b;
            Task a8 = interfaceC3825i.a(this.f38057a.j());
            if (a8 == null) {
                this.f38058b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            C3810D c3810d = this.f38058b;
            Executor executor = AbstractC3827k.f38076b;
            a8.e(executor, c3810d);
            a8.d(executor, this.f38058b);
            a8.a(executor, this.f38058b);
        } catch (CancellationException unused) {
            this.f38058b.c();
        } catch (C3824h e8) {
            if (e8.getCause() instanceof Exception) {
                this.f38058b.d((Exception) e8.getCause());
            } else {
                this.f38058b.d(e8);
            }
        } catch (Exception e9) {
            this.f38058b.d(e9);
        }
    }
}
