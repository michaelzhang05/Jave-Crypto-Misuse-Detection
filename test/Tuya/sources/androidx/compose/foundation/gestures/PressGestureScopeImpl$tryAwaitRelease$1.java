package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
/* loaded from: classes.dex */
public final class PressGestureScopeImpl$tryAwaitRelease$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PressGestureScopeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, P5.d dVar) {
        super(dVar);
        this.this$0 = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.tryAwaitRelease(this);
    }
}
