package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes2.dex */
public final class i0 {
    public static final h0 a(CoroutineContext coroutineContext) {
        u b2;
        if (coroutineContext.get(l1.f22259e) == null) {
            b2 = p1.b(null, 1, null);
            coroutineContext = coroutineContext.plus(b2);
        }
        return new kotlinx.coroutines.internal.d(coroutineContext);
    }
}
