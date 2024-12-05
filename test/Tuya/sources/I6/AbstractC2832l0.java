package i6;

import n6.C3486F;

/* renamed from: i6.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2832l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3486F f31788a = new C3486F("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final C3486F f31789b = new C3486F("CLOSED_EMPTY");

    public static final long c(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        if (j8 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j8;
    }
}
