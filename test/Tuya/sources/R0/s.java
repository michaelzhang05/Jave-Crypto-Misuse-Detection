package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37539a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f37540b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar, Task task) {
        this.f37540b = tVar;
        this.f37539a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i8;
        I i9;
        I i10;
        InterfaceC3671b interfaceC3671b;
        try {
            interfaceC3671b = this.f37540b.f37542b;
            Task task = (Task) interfaceC3671b.a(this.f37539a);
            if (task == null) {
                this.f37540b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            t tVar = this.f37540b;
            Executor executor = k.f37524b;
            task.e(executor, tVar);
            task.d(executor, this.f37540b);
            task.a(executor, this.f37540b);
        } catch (C3677h e8) {
            if (e8.getCause() instanceof Exception) {
                i10 = this.f37540b.f37543c;
                i10.q((Exception) e8.getCause());
            } else {
                i9 = this.f37540b.f37543c;
                i9.q(e8);
            }
        } catch (Exception e9) {
            i8 = this.f37540b.f37543c;
            i8.q(e9);
        }
    }
}
