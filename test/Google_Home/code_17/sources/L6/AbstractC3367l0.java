package l6;

import q6.C3865F;

/* renamed from: l6.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3367l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3865F f34640a = new C3865F("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final C3865F f34641b = new C3865F("CLOSED_EMPTY");

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
