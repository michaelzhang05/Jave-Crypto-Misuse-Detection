package androidx.work;

import O5.s;
import O5.t;
import java.util.concurrent.CancellationException;
import l6.InterfaceC3372o;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ InterfaceC3372o $cancellableContinuation;
    final /* synthetic */ InterfaceFutureC4218d $this_await;

    public ListenableFutureKt$await$2$1(InterfaceC3372o interfaceC3372o, InterfaceFutureC4218d interfaceFutureC4218d) {
        this.$cancellableContinuation = interfaceC3372o;
        this.$this_await = interfaceFutureC4218d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC3372o interfaceC3372o = this.$cancellableContinuation;
            s.a aVar = s.f8302b;
            interfaceC3372o.resumeWith(s.b(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.t(cause);
                return;
            }
            InterfaceC3372o interfaceC3372o2 = this.$cancellableContinuation;
            s.a aVar2 = s.f8302b;
            interfaceC3372o2.resumeWith(s.b(t.a(cause)));
        }
    }
}
