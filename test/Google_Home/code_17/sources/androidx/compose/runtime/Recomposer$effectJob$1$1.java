package androidx.compose.runtime;

import O5.I;
import O5.s;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3369m0;
import l6.InterfaceC3372o;
import l6.InterfaceC3390x0;
import o6.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$effectJob$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8278a;
    }

    public final void invoke(Throwable th) {
        InterfaceC3390x0 interfaceC3390x0;
        InterfaceC3372o interfaceC3372o;
        w wVar;
        w wVar2;
        boolean z8;
        InterfaceC3372o interfaceC3372o2;
        InterfaceC3372o interfaceC3372o3;
        CancellationException a8 = AbstractC3369m0.a("Recomposer effect job completed", th);
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                interfaceC3390x0 = recomposer.runnerJob;
                interfaceC3372o = null;
                if (interfaceC3390x0 != null) {
                    wVar2 = recomposer._state;
                    wVar2.setValue(Recomposer.State.ShuttingDown);
                    z8 = recomposer.isClosed;
                    if (z8) {
                        interfaceC3372o2 = recomposer.workContinuation;
                        if (interfaceC3372o2 != null) {
                            interfaceC3372o3 = recomposer.workContinuation;
                            recomposer.workContinuation = null;
                            interfaceC3390x0.s(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                            interfaceC3372o = interfaceC3372o3;
                        }
                    } else {
                        interfaceC3390x0.cancel(a8);
                    }
                    interfaceC3372o3 = null;
                    recomposer.workContinuation = null;
                    interfaceC3390x0.s(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    interfaceC3372o = interfaceC3372o3;
                } else {
                    recomposer.closeCause = a8;
                    wVar = recomposer._state;
                    wVar.setValue(Recomposer.State.ShutDown);
                    I i8 = I.f8278a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC3372o != null) {
            s.a aVar = s.f8302b;
            interfaceC3372o.resumeWith(s.b(I.f8278a));
        }
    }
}
