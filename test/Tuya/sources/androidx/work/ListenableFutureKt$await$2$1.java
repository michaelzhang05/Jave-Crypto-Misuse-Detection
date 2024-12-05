package androidx.work;

import L5.s;
import L5.t;
import i6.InterfaceC2837o;
import java.util.concurrent.CancellationException;
import x0.InterfaceFutureC3857a;

/* loaded from: classes3.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ InterfaceC2837o $cancellableContinuation;
    final /* synthetic */ InterfaceFutureC3857a $this_await;

    public ListenableFutureKt$await$2$1(InterfaceC2837o interfaceC2837o, InterfaceFutureC3857a interfaceFutureC3857a) {
        this.$cancellableContinuation = interfaceC2837o;
        this.$this_await = interfaceFutureC3857a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC2837o interfaceC2837o = this.$cancellableContinuation;
            s.a aVar = s.f6511b;
            interfaceC2837o.resumeWith(s.b(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.v(cause);
                return;
            }
            InterfaceC2837o interfaceC2837o2 = this.$cancellableContinuation;
            s.a aVar2 = s.f6511b;
            interfaceC2837o2.resumeWith(s.b(t.a(cause)));
        }
    }
}
