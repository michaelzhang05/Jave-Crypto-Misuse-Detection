package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f38091a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f38092b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar, Task task) {
        this.f38092b = tVar;
        this.f38091a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3815I c3815i;
        C3815I c3815i2;
        C3815I c3815i3;
        InterfaceC3818b interfaceC3818b;
        try {
            interfaceC3818b = this.f38092b.f38094b;
            Task task = (Task) interfaceC3818b.a(this.f38091a);
            if (task == null) {
                this.f38092b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            t tVar = this.f38092b;
            Executor executor = AbstractC3827k.f38076b;
            task.e(executor, tVar);
            task.d(executor, this.f38092b);
            task.a(executor, this.f38092b);
        } catch (C3824h e8) {
            if (e8.getCause() instanceof Exception) {
                c3815i3 = this.f38092b.f38095c;
                c3815i3.q((Exception) e8.getCause());
            } else {
                c3815i2 = this.f38092b.f38095c;
                c3815i2.q(e8);
            }
        } catch (Exception e9) {
            c3815i = this.f38092b.f38095c;
            c3815i.q(e9);
        }
    }
}
