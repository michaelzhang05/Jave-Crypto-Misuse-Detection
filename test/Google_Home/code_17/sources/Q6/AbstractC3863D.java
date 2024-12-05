package q6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3863D {
    public static final AbstractC3862C b(Object obj) {
        if (obj != AbstractC3869d.f38387a) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (AbstractC3862C) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        if (obj == AbstractC3869d.f38387a) {
            return true;
        }
        return false;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
