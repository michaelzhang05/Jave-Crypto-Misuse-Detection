package androidx.lifecycle;

import O5.I;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3351d0;
import l6.N;

/* loaded from: classes3.dex */
public final class EmittedSource implements InterfaceC3351d0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (!this.disposed) {
            this.mediator.removeSource(this.source);
            this.disposed = true;
        }
    }

    @Override // l6.InterfaceC3351d0
    public void dispose() {
        AbstractC3364k.d(N.a(C3347b0.c().G()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    public final Object disposeNow(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c().G(), new EmittedSource$disposeNow$2(this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
