package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import l6.M;

/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, M {
    Object awaitDispose(Function0 function0, S5.d dVar);

    @Override // l6.M
    /* synthetic */ S5.g getCoroutineContext();
}
