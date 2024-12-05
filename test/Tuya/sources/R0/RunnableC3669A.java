package r0;

import com.google.android.gms.tasks.Task;

/* renamed from: r0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3669A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f37501b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3669A(B b8, Task task) {
        this.f37501b = b8;
        this.f37500a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3676g interfaceC3676g;
        InterfaceC3676g interfaceC3676g2;
        obj = this.f37501b.f37503b;
        synchronized (obj) {
            try {
                B b8 = this.f37501b;
                interfaceC3676g = b8.f37504c;
                if (interfaceC3676g != null) {
                    interfaceC3676g2 = b8.f37504c;
                    interfaceC3676g2.b(this.f37500a.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
