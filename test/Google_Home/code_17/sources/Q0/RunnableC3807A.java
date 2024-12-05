package q0;

import com.google.android.gms.tasks.Task;

/* renamed from: q0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3807A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f38052a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3808B f38053b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3807A(C3808B c3808b, Task task) {
        this.f38053b = c3808b;
        this.f38052a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3823g interfaceC3823g;
        InterfaceC3823g interfaceC3823g2;
        obj = this.f38053b.f38055b;
        synchronized (obj) {
            try {
                C3808B c3808b = this.f38053b;
                interfaceC3823g = c3808b.f38056c;
                if (interfaceC3823g != null) {
                    interfaceC3823g2 = c3808b.f38056c;
                    interfaceC3823g2.a(this.f38052a.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
