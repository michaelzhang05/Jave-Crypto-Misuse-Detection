package androidx.compose.runtime;

import P5.g;
import X5.n;
import androidx.compose.runtime.MonotonicFrameClock;
import i6.AbstractC2825i;
import i6.C2812b0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public <R> R fold(R r8, n nVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, nVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b
    public /* synthetic */ g.c getKey() {
        return h.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, P5.g
    public P5.g plus(P5.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1 function1, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.c(), new SdkStubsFallbackFrameClock$withFrameNanos$2(function1, null), dVar);
    }
}
