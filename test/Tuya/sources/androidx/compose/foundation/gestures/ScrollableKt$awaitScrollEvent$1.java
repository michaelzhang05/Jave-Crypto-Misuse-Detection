package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {371}, m = "awaitScrollEvent")
/* loaded from: classes.dex */
public final class ScrollableKt$awaitScrollEvent$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollableKt$awaitScrollEvent$1(P5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object awaitScrollEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitScrollEvent = ScrollableKt.awaitScrollEvent(null, this);
        return awaitScrollEvent;
    }
}
