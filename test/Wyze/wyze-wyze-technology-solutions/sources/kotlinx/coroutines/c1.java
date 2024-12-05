package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public final class c1 {
    private static final kotlinx.coroutines.internal.v a = new kotlinx.coroutines.internal.v("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.v f22141b = new kotlinx.coroutines.internal.v("CLOSED_EMPTY");

    public static final long c(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j2;
    }
}
