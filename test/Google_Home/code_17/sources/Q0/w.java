package q0;

import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f38100a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f38101b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar, Task task) {
        this.f38101b = xVar;
        this.f38100a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3821e interfaceC3821e;
        InterfaceC3821e interfaceC3821e2;
        obj = this.f38101b.f38103b;
        synchronized (obj) {
            try {
                x xVar = this.f38101b;
                interfaceC3821e = xVar.f38104c;
                if (interfaceC3821e != null) {
                    interfaceC3821e2 = xVar.f38104c;
                    interfaceC3821e2.a(this.f38100a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
