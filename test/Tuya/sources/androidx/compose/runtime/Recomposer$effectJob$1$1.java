package androidx.compose.runtime;

import L5.I;
import L5.s;
import androidx.compose.runtime.Recomposer;
import i6.AbstractC2834m0;
import i6.InterfaceC2837o;
import i6.InterfaceC2855x0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import l6.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$effectJob$1$1 extends AbstractC3160z implements Function1 {
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
        return I.f6487a;
    }

    public final void invoke(Throwable th) {
        InterfaceC2855x0 interfaceC2855x0;
        InterfaceC2837o interfaceC2837o;
        v vVar;
        v vVar2;
        boolean z8;
        InterfaceC2837o interfaceC2837o2;
        InterfaceC2837o interfaceC2837o3;
        CancellationException a8 = AbstractC2834m0.a("Recomposer effect job completed", th);
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                interfaceC2855x0 = recomposer.runnerJob;
                interfaceC2837o = null;
                if (interfaceC2855x0 != null) {
                    vVar2 = recomposer._state;
                    vVar2.setValue(Recomposer.State.ShuttingDown);
                    z8 = recomposer.isClosed;
                    if (z8) {
                        interfaceC2837o2 = recomposer.workContinuation;
                        if (interfaceC2837o2 != null) {
                            interfaceC2837o3 = recomposer.workContinuation;
                            recomposer.workContinuation = null;
                            interfaceC2855x0.u(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                            interfaceC2837o = interfaceC2837o3;
                        }
                    } else {
                        interfaceC2855x0.cancel(a8);
                    }
                    interfaceC2837o3 = null;
                    recomposer.workContinuation = null;
                    interfaceC2855x0.u(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    interfaceC2837o = interfaceC2837o3;
                } else {
                    recomposer.closeCause = a8;
                    vVar = recomposer._state;
                    vVar.setValue(Recomposer.State.ShutDown);
                    I i8 = I.f6487a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC2837o != null) {
            s.a aVar = s.f6511b;
            interfaceC2837o.resumeWith(s.b(I.f6487a));
        }
    }
}
