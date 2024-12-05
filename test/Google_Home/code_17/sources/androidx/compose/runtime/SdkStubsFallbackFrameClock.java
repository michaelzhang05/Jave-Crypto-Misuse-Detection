package androidx.compose.runtime;

import S5.g;
import a6.InterfaceC1668n;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.jvm.functions.Function1;
import l6.AbstractC3360i;
import l6.C3347b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC1668n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b
    public /* synthetic */ g.c getKey() {
        return h.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, S5.g
    public S5.g plus(S5.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1 function1, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.c(), new SdkStubsFallbackFrameClock$withFrameNanos$2(function1, null), dVar);
    }
}
