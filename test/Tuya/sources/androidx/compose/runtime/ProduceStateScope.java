package androidx.compose.runtime;

import i6.M;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, M {
    Object awaitDispose(Function0 function0, P5.d dVar);

    @Override // i6.M
    /* synthetic */ P5.g getCoroutineContext();
}
