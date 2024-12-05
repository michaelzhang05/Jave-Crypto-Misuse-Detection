package androidx.lifecycle;

import L5.I;
import androidx.annotation.MainThread;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2816d0;
import i6.N;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class EmittedSource implements InterfaceC2816d0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(mediator, "mediator");
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

    @Override // i6.InterfaceC2816d0
    public void dispose() {
        AbstractC2829k.d(N.a(C2812b0.c().G()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    public final Object disposeNow(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c().G(), new EmittedSource$disposeNow$2(this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
