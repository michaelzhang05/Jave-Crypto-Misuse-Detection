package r0;

import R.AbstractC1319p;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37553a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f37554b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, Task task) {
        this.f37554b = zVar;
        this.f37553a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3675f interfaceC3675f;
        InterfaceC3675f interfaceC3675f2;
        obj = this.f37554b.f37556b;
        synchronized (obj) {
            try {
                z zVar = this.f37554b;
                interfaceC3675f = zVar.f37557c;
                if (interfaceC3675f != null) {
                    interfaceC3675f2 = zVar.f37557c;
                    interfaceC3675f2.d((Exception) AbstractC1319p.l(this.f37553a.i()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
