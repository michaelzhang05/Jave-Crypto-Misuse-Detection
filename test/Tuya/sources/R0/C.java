package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37505a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f37506b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d8, Task task) {
        this.f37506b = d8;
        this.f37505a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3678i interfaceC3678i;
        try {
            interfaceC3678i = this.f37506b.f37508b;
            Task a8 = interfaceC3678i.a(this.f37505a.j());
            if (a8 == null) {
                this.f37506b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            D d8 = this.f37506b;
            Executor executor = k.f37524b;
            a8.e(executor, d8);
            a8.d(executor, this.f37506b);
            a8.a(executor, this.f37506b);
        } catch (CancellationException unused) {
            this.f37506b.c();
        } catch (C3677h e8) {
            if (e8.getCause() instanceof Exception) {
                this.f37506b.d((Exception) e8.getCause());
            } else {
                this.f37506b.d(e8);
            }
        } catch (Exception e9) {
            this.f37506b.d(e9);
        }
    }
}
