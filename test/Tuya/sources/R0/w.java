package r0;

import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37548a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f37549b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar, Task task) {
        this.f37549b = xVar;
        this.f37548a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3674e interfaceC3674e;
        InterfaceC3674e interfaceC3674e2;
        obj = this.f37549b.f37551b;
        synchronized (obj) {
            try {
                x xVar = this.f37549b;
                interfaceC3674e = xVar.f37552c;
                if (interfaceC3674e != null) {
                    interfaceC3674e2 = xVar.f37552c;
                    interfaceC3674e2.a(this.f37548a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
