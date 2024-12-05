package n6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3484D {
    public static final AbstractC3483C b(Object obj) {
        if (obj != AbstractC3490d.f36259a) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (AbstractC3483C) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        if (obj == AbstractC3490d.f36259a) {
            return true;
        }
        return false;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
