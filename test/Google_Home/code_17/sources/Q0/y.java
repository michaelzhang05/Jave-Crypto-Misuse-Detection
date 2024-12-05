package q0;

import Q.AbstractC1400p;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f38105a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f38106b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, Task task) {
        this.f38106b = zVar;
        this.f38105a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3822f interfaceC3822f;
        InterfaceC3822f interfaceC3822f2;
        obj = this.f38106b.f38108b;
        synchronized (obj) {
            try {
                z zVar = this.f38106b;
                interfaceC3822f = zVar.f38109c;
                if (interfaceC3822f != null) {
                    interfaceC3822f2 = zVar.f38109c;
                    interfaceC3822f2.d((Exception) AbstractC1400p.l(this.f38105a.i()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
